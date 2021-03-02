package com.jhmarryme.demo.web.service.system.log;

import com.jhmarryme.demo.mapper.system.log.ExceptionLogMapper;
import com.jhmarryme.demo.pojo.model.system.log.ExceptionLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JiaHao Wang
 * @date 2021/3/2 10:37
 */
@Service
public class ExceptionLogService {

    @Autowired
    private ExceptionLogMapper exceptionLogMapper;

    public int insertDemo() {
        ExceptionLog exceptionLog = new ExceptionLog();
        exceptionLog.setExcId("1111");
        return exceptionLogMapper.insert(exceptionLog);
    }
}
