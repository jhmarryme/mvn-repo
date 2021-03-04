package com.jhmarryme.demo.config;

import com.jhmarryme.demo.common.annotation.ResponseResultBody;
import com.jhmarryme.demo.common.base.CommonResult;
import com.jhmarryme.demo.common.base.exception.CommonException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;
import java.lang.annotation.Annotation;
import java.util.Locale;

/**
 * 全局处理 包装返回结果
 *      使用@ResponseBody注解会把返回Object序列化成JSON字符串,
 *      所以 在序列化前把Object赋值给CommonResult<Object>
 * @author JiaHao Wang
 * @date 2021/3/3 10:40
 */
@Slf4j
@RestControllerAdvice
public class ResponseResultBodyAdvice implements ResponseBodyAdvice<Object> {

    @Autowired
    MessageSource messageSource;

    @Autowired
    LocaleResolver localeResolver;

    private static final Class<? extends Annotation> ANNOTATION_TYPE = ResponseResultBody.class;

    /**
     * 判断类或者方法是否使用了 @ResponseResultBody
     */
    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return AnnotatedElementUtils.hasAnnotation(returnType.getContainingClass(), ANNOTATION_TYPE) ||
                returnType.hasMethodAnnotation(ANNOTATION_TYPE);
    }

    /**
     * 当类或者方法使用了 @ResponseResultBody 就会调用这个方法
     */
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType,
                                  MediaType selectedContentType,
                                  Class<? extends HttpMessageConverter<?>> selectedConverterType,
                                  ServerHttpRequest request, ServerHttpResponse response) {
        // 防止重复包裹的问题出现
        if (body instanceof CommonResult) {
            return body;
        }
        return CommonResult.success(body);
    }

    @ExceptionHandler(Exception.class)
    public Object error(Exception e) {
        log.error("统一异常处理(业务异常):" + e);
        return CommonResult.failure();
    }

    @ExceptionHandler(CommonException.class)
    public Object handleGenericException(CommonException e, HttpServletRequest request) {
        log.error("统一异常处理(业务异常):" + e);
        Locale locale = localeResolver.resolveLocale(request);
        String message = messageSource.getMessage(e.getResultStatus().name(), e.getParams(), locale);
        CommonResult<Object> result = CommonResult.failure(e.getResultStatus(), e.getData());
        result.setMsg(message);
        return result;
    }

}