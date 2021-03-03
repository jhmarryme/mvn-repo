package com.jhmarryme.demo.common.base.enums;


import org.springframework.http.HttpStatus;

/**
 * 异常code
 * @author Jiahao Wang
 * @date 2021/3/3 11:01
 */
public enum ResultStatus {

    /** 成功 */
    SUCCESS(HttpStatus.OK.value(), "OK"),
    /** 处理错误 */
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR.value(), "OK"),
    /** 失败 */
    BAD_REQUEST(HttpStatus.BAD_REQUEST.value(), "Bad Request"),
    /** 未登录 */
    NO_AUTHORITY(HttpStatus.FORBIDDEN.value(), "Login first！"),
    ;

    /** 业务异常码 */
    private final Integer code;

    /** 业务异常信息描述 */
    private final String msg;

    ResultStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 获取 业务异常码
     *
     * @return code 业务异常码
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * 获取 业务异常信息描述
     *
     * @return message 业务异常信息描述
     */
    public String getMsg() {
        return this.msg;
    }

}