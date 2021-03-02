package com.jhmarryme.demo.pojo.model.system.log;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "operation_log")
public class OperationLog {
    /**
     * 主键
     */
    @Id
    @Column(name = "oper_id")
    private String operId;

    /**
     * 操作模块
     */
    @Column(name = "oper_module")
    private String operModule;

    /**
     * 操作类型
     */
    @Column(name = "oper_type")
    private String operType;

    /**
     * 操作描述
     */
    @Column(name = "oper_desc")
    private String operDesc;

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
     * 操作方法
     */
    @Column(name = "oper_method")
    private String operMethod;

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

    /**
     * 请求参数
     */
    @Column(name = "oper_req_param")
    private String operReqParam;

    /**
     * 返回参数
     */
    @Column(name = "oper_res_param")
    private String operResParam;

}