package com.jhmarryme.demo.common.base.asserts;

import com.jhmarryme.demo.common.base.IResponseEnum;
import com.jhmarryme.demo.common.base.exception.BaseException;
import com.jhmarryme.demo.common.base.exception.CommonException;

/**
 * description: 
 * @author JiaHao Wang
 * @date 2021/3/8 17:18
 */
public interface CommonExceptionAssert extends IResponseEnum, Assert {

    @Override
    default BaseException newException(String... args) {

        return new CommonException(this, args);
    }

    @Override
    default BaseException newException(Object data, String... args) {
        return new CommonException(this, data, args);
    }
}
