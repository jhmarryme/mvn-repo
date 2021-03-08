package com.jhmarryme.demo.common.base.exception;

import com.jhmarryme.demo.common.base.IResultStatus;
import com.jhmarryme.demo.common.base.enums.ResultStatus;
import lombok.Data;

import java.io.Serial;

/**
 * 通用异常类
 * @author Jiahao Wang
 * @date 2021/3/3 11:03
 */
@Data
public class CommonException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 0L;

    /**
     * 错误信息
     */
    private IResultStatus resultStatus;

    /**
     * 参数用来补充说明异常消息，如需提示用户在某IP处登录可以设置消息
     */
    private String[] params;

    /**
     * 实际数据
     */
    private Object data;

    public CommonException() {
        this(null, null, (String[]) null);
    }

    public CommonException(IResultStatus resultStatus) {
        this(resultStatus, null, (String[]) null);
    }

    public CommonException(IResultStatus resultStatus, Object data) {
        this(resultStatus, data, (String[]) null);
    }

    public CommonException(IResultStatus resultStatus, String... params) {
        this(resultStatus, null, params);
    }

    public CommonException(IResultStatus resultStatus, Object data, String... params) {
        if (resultStatus == null) {
            resultStatus = ResultStatus.INTERNAL_SERVER_ERROR;
        }
        this.resultStatus = resultStatus;
        this.data = data;
        this.params = params;
    }

}
