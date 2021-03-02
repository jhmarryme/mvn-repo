package com.jhmarryme.demo.web.controller.system.log;

import com.jhmarryme.demo.common.annotation.OperLog;
import com.jhmarryme.demo.pojo.model.system.log.ExceptionLog;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author JiaHao Wang
 * @date 2021/3/2 10:40
 */
@RestController
@RequestMapping("system/log")
public class SystemLogAspectTestController {

    @RequestMapping(path = "operation", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    @OperLog(operModule = "测试日志记录模块", operType = "测试type", operDesc = "测试Desc")
    public String operationLog(@RequestBody ExceptionLog exceptionLog, String param) {
        if (exceptionLog.getExcId() == null) {
            throw new RuntimeException("test");
        }
        return "success";
    }

}
