package com.jhmarryme.demo.pojo.model.system.log;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "exception_log")
public class ExceptionLog {
    /**
     * 主键
     */
    @Id
    @Column(name = "exc_id")
    private String excId;

    /**
     * 操作模块
     */
    @Column(name = "exc_name")
    private String excName;

    /**
     * 用户id
     */
    @Column(name = "oper_user_id")
    private String operUserId;

    /**
     * 用户名
     */
    @Column(name = "oper_username")
    private String operUsername;

    /**
     * 请求uri
     */
    @Column(name = "oper_uri")
    private String operUri;

    /**
     * 请求ip
     */
    @Column(name = "oper_ip")
    private String operIp;

    /**
     * 操作时间
     */
    @Column(name = "oper_create_time")
    private Date operCreateTime;

    /**
     * 操作版本号
     */
    @Column(name = "oper_ver")
    private String operVer;

    @Column(name = "oper_method")
    private String operMethod;

    /**
     * 操作类型
     */
    @Column(name = "exc_msg")
    private String excMsg;

    /**
     * 请求参数
     */
    @Column(name = "exc_req_param")
    private String excReqParam;

}