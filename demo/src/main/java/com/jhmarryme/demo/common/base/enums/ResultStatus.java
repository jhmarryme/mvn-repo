package com.jhmarryme.demo.common.base.enums;


import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * 异常code
 * @author Jiahao Wang
 * @date 2021/3/3 11:01
 */
@Getter
public enum ResultStatus {

    /** 成功 */
    SUCCESS(HttpStatus.OK),
    /** 处理错误 */
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR),
    /** 失败 */
    BAD_REQUEST(HttpStatus.BAD_REQUEST),
    /** 未登录 */
    NO_AUTHORITY(HttpStatus.FORBIDDEN),
    /** 未知错误 */
    UNKNOWN_ERROR(HttpStatus.BAD_REQUEST),
    TEST_ERROR(HttpStatus.BAD_REQUEST),
    ;

    /** 业务异常码 */
    private final HttpStatus httpStatus;

    ResultStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

}