package com.jhmarryme.demo.common.base;

import com.jhmarryme.demo.common.base.enums.ResultStatus;
import lombok.Data;

/**
 * 通用返回结果
 * @author Jiahao Wang
 * @date 2021/3/3 11:01
 */
@Data
public class CommonResult<T> {

    /** 业务错误码 */
    private Integer code;

    /** 信息描述 */
    private String msg;

    /** 返回参数 */
    private T data;

    private CommonResult(IResultStatus resultStatus, T data) {
        this.code = resultStatus.getHttpStatus().value();
        this.msg = resultStatus.getCode();
        this.data = data;
    }

    /**
     * 业务成功返回业务代码和描述信息
     */
    public static CommonResult<Void> success() {
        return new CommonResult<>(ResultStatus.SUCCESS, null);
    }

    /**
     * 业务成功返回业务代码,描述和返回的参数
     */
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<>(ResultStatus.SUCCESS, data);
    }

    /**
     * 业务成功返回业务代码,描述和返回的参数
     */
    public static <T> CommonResult<T> success(IResultStatus resultStatus, T data) {
        if (resultStatus == null) {
            return success(data);
        }
        return new CommonResult<>(resultStatus, data);
    }

    /**
     * 业务异常返回业务代码和描述信息
     */
    public static <T> CommonResult<T> failure() {
        return new CommonResult<>(ResultStatus.INTERNAL_SERVER_ERROR, null);
    }

    /**
     * 业务异常返回业务代码,描述和返回的参数
     */
    public static <T> CommonResult<T> failure(IResultStatus resultStatus) {
        return failure(resultStatus, null);
    }

    /**
     * 业务异常返回业务代码,描述和返回的参数
     */
    public static <T> CommonResult<T> failure(IResultStatus resultStatus, T data) {
        if (resultStatus == null) {
            return new CommonResult<>(ResultStatus.INTERNAL_SERVER_ERROR, null);
        }
        return new CommonResult<>(resultStatus, data);
    }
}