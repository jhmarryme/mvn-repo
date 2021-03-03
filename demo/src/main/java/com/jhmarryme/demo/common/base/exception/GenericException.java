package com.jhmarryme.demo.common.base.exception;

import com.jhmarryme.demo.common.base.enums.ResultStatus;
import lombok.Data;

/**
 * 通用异常类
 * @author Jiahao Wang
 * @date 2021/3/3 11:03
 */
@Data
public class GenericException extends RuntimeException {

    private static final long serialVersionUID = 0L;

    /**
     * 错误信息
     */
    private ResultStatus resultStatus;

    /**
     * 参数用来补充说明异常消息，如需提示用户在某IP处登录可以设置消息
     */
    private String[] params;

    /**
     * 实际数据
     */
    private Object data;

    public GenericException(ResultStatus resultStatus) {
        this(resultStatus, null);
    }

    public GenericException(ResultStatus resultStatus, Object data) {
        if (resultStatus == null) {
            resultStatus = ResultStatus.INTERNAL_SERVER_ERROR;
        }
        this.resultStatus = resultStatus;
        this.data = data;
    }

    public GenericException(ResultStatus resultStatus, Object data, String... params) {
        this(resultStatus, data);
        this.params = params;
    }

}
