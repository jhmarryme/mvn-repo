package com.jhmarryme.demo.config;

import com.jhmarryme.demo.common.base.CommonResult;
import com.jhmarryme.demo.common.base.exception.CommonException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Locale;

/**
 * description: 统一异常处理切面
 * @author JiaHao Wang
 * @date 2021/3/8 16:19
 */
@Slf4j
@RestControllerAdvice
public class UnifiedExceptionAdvice {

    @Autowired
    MessageSource messageSource;

    @Autowired
    LocaleResolver localeResolver;

    @ExceptionHandler(Exception.class)
    public Object error(Exception e) {
        log.error("统一异常处理(业务异常):" + e);
        return CommonResult.failure();
    }

    @ExceptionHandler(CommonException.class)
    public Object handleCommonException(CommonException e, HttpServletRequest request) {
        log.error("统一异常处理(业务异常):" + e);
        Locale locale = localeResolver.resolveLocale(request);
        String message = messageSource.getMessage(e.getResultStatus().name(), e.getParams(), locale);
        CommonResult<Object> result = CommonResult.failure(e.getResultStatus(), e.getData());
        result.setMsg(message);
        return result;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Object handleMethodArgumentNotValidException(MethodArgumentNotValidException e,
                                                        HttpServletRequest request) {
        log.error("参数校验异常:" + e);
        Locale locale = localeResolver.resolveLocale(request);

        List<ObjectError> errors =e.getBindingResult().getAllErrors();
        StringBuffer errorMsg = new StringBuffer();
        errors.forEach(x -> errorMsg.append(x.getDefaultMessage()).append(";"));
        System.out.println(errorMsg.toString());
        return CommonResult.failure();
    }
}
