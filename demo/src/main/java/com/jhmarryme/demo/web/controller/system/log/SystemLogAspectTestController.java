package com.jhmarryme.demo.web.controller.system.log;

import com.jhmarryme.demo.common.annotation.ResponseResultBody;
import com.jhmarryme.demo.common.base.enums.ResponseEnum;
import com.jhmarryme.demo.pojo.model.system.log.ExceptionLog;
import com.jhmarryme.demo.pojo.model.system.log.OperationLog;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

/**
 *
 * @author JiaHao Wang
 * @date 2021/3/2 10:40
 */
@RestController
@RequestMapping("system/log")
public class SystemLogAspectTestController {

    @RequestMapping(path = "postJson", method = {RequestMethod.POST, RequestMethod.GET})
//    @ResponseResultBody
//    @OperLog(operModule = "测试日志记录模块", operType = "测试type", operDesc = "测试Desc")
    public OperationLog postJson(@RequestBody ExceptionLog exceptionLog, @RequestParam String param) {
        Locale locale = LocaleContextHolder.getLocale();
        ResponseEnum.TEST_ERROR.assertNotNull(exceptionLog.getId(), "test");
        return new OperationLog();
    }


}
