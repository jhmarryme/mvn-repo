package com.jhmarryme.demo.web.controller.system.log;

import com.jhmarryme.demo.web.service.system.log.ExceptionLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JiaHao Wang
 * @date 2021/3/2 10:40
 */
@RestController
@RequestMapping("system/log")
public class ExceptionLogController {

    @Autowired
    private ExceptionLogService exceptionLogService;

    @GetMapping("get")
    @ResponseBody
    public int insertDemo() {
        return exceptionLogService.insertDemo();
    }
}
