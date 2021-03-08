package com.jhmarryme.demo.common.base.asserts;

import com.jhmarryme.demo.common.base.IResultStatus;
import com.jhmarryme.demo.common.base.exception.CommonException;

import java.text.MessageFormat;

/**
 * description: 
 * @author JiaHao Wang
 * @date 2021/3/8 17:18
 */
public interface CommonExceptionAssert extends IResultStatus, Assert {

    @Override
    default CommonException newException(String... args) {

        return new CommonException(this, null, args);
    }

    @Override
    default CommonException newException(Object data, String... args) {
        return new CommonException(this, data, args);
    }
}
