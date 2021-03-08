package com.jhmarryme.demo.common.base.asserts;

import com.jhmarryme.demo.common.base.exception.CommonException;

import java.text.MessageFormat;

/**
 * description: 
 * @author JiaHao Wang
 * @date 2021/3/8 17:18
 */
public interface CommonExceptionAssert extends Assert, {

    @Override
    default CommonException newException(Object... args) {

        return new CommonException(this, null, args);
    }

    @Override
    default CommonException newException(Throwable t, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new CommonException(this, args, msg, t);
    }
}
