package com.jhmarryme.demo.pojo.model.system.log;

import java.util.Date;
import javax.persistence.*;

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

    /**
     * 获取主键
     *
     * @return oper_id - 主键
     */
    public String getOperId() {
        return operId;
    }

    /**
     * 设置主键
     *
     * @param operId 主键
     */
    public void setOperId(String operId) {
        this.operId = operId;
    }

    /**
     * 获取操作模块
     *
     * @return oper_module - 操作模块
     */
    public String getOperModule() {
        return operModule;
    }

    /**
     * 设置操作模块
     *
     * @param operModule 操作模块
     */
    public void setOperModule(String operModule) {
        this.operModule = operModule;
    }

    /**
     * 获取操作类型
     *
     * @return oper_type - 操作类型
     */
    public String getOperType() {
        return operType;
    }

    /**
     * 设置操作类型
     *
     * @param operType 操作类型
     */
    public void setOperType(String operType) {
        this.operType = operType;
    }

    /**
     * 获取操作描述
     *
     * @return oper_desc - 操作描述
     */
    public String getOperDesc() {
        return operDesc;
    }

    /**
     * 设置操作描述
     *
     * @param operDesc 操作描述
     */
    public void setOperDesc(String operDesc) {
        this.operDesc = operDesc;
    }

    /**
     * 获取用户id
     *
     * @return oper_user_id - 用户id
     */
    public String getOperUserId() {
        return operUserId;
    }

    /**
     * 设置用户id
     *
     * @param operUserId 用户id
     */
    public void setOperUserId(String operUserId) {
        this.operUserId = operUserId;
    }

    /**
     * 获取用户名
     *
     * @return oper_username - 用户名
     */
    public String getOperUsername() {
        return operUsername;
    }

    /**
     * 设置用户名
     *
     * @param operUsername 用户名
     */
    public void setOperUsername(String operUsername) {
        this.operUsername = operUsername;
    }

    /**
     * 获取操作方法
     *
     * @return oper_method - 操作方法
     */
    public String getOperMethod() {
        return operMethod;
    }

    /**
     * 设置操作方法
     *
     * @param operMethod 操作方法
     */
    public void setOperMethod(String operMethod) {
        this.operMethod = operMethod;
    }

    /**
     * 获取请求uri
     *
     * @return oper_uri - 请求uri
     */
    public String getOperUri() {
        return operUri;
    }

    /**
     * 设置请求uri
     *
     * @param operUri 请求uri
     */
    public void setOperUri(String operUri) {
        this.operUri = operUri;
    }

    /**
     * 获取请求ip
     *
     * @return oper_ip - 请求ip
     */
    public String getOperIp() {
        return operIp;
    }

    /**
     * 设置请求ip
     *
     * @param operIp 请求ip
     */
    public void setOperIp(String operIp) {
        this.operIp = operIp;
    }

    /**
     * 获取操作时间
     *
     * @return oper_create_time - 操作时间
     */
    public Date getOperCreateTime() {
        return operCreateTime;
    }

    /**
     * 设置操作时间
     *
     * @param operCreateTime 操作时间
     */
    public void setOperCreateTime(Date operCreateTime) {
        this.operCreateTime = operCreateTime;
    }

    /**
     * 获取操作版本号
     *
     * @return oper_ver - 操作版本号
     */
    public String getOperVer() {
        return operVer;
    }

    /**
     * 设置操作版本号
     *
     * @param operVer 操作版本号
     */
    public void setOperVer(String operVer) {
        this.operVer = operVer;
    }

    /**
     * 获取请求参数
     *
     * @return oper_req_param - 请求参数
     */
    public String getOperReqParam() {
        return operReqParam;
    }

    /**
     * 设置请求参数
     *
     * @param operReqParam 请求参数
     */
    public void setOperReqParam(String operReqParam) {
        this.operReqParam = operReqParam;
    }

    /**
     * 获取返回参数
     *
     * @return oper_res_param - 返回参数
     */
    public String getOperResParam() {
        return operResParam;
    }

    /**
     * 设置返回参数
     *
     * @param operResParam 返回参数
     */
    public void setOperResParam(String operResParam) {
        this.operResParam = operResParam;
    }
}