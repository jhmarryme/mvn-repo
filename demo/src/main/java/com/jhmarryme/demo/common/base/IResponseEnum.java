package com.jhmarryme.demo.common.base;

import org.springframework.http.HttpStatus;

/**
 * description: 
 * @author JiaHao Wang
 * @date 2021/3/8 17:23
 */
public interface IResponseEnum {
    String getCode();

    HttpStatus getHttpStatus();
}
