package com.jhmarryme.demo.pojo.model.system.log;

import java.util.Date;
import javax.persistence.*;

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

    /**
     * 获取主键
     *
     * @return exc_id - 主键
     */
    public String getExcId() {
        return excId;
    }

    /**
     * 设置主键
     *
     * @param excId 主键
     */
    public void setExcId(String excId) {
        this.excId = excId;
    }

    /**
     * 获取操作模块
     *
     * @return exc_name - 操作模块
     */
    public String getExcName() {
        return excName;
    }

    /**
     * 设置操作模块
     *
     * @param excName 操作模块
     */
    public void setExcName(String excName) {
        this.excName = excName;
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
     * @return oper_method
     */
    public String getOperMethod() {
        return operMethod;
    }

    /**
     * @param operMethod
     */
    public void setOperMethod(String operMethod) {
        this.operMethod = operMethod;
    }

    /**
     * 获取操作类型
     *
     * @return exc_msg - 操作类型
     */
    public String getExcMsg() {
        return excMsg;
    }

    /**
     * 设置操作类型
     *
     * @param excMsg 操作类型
     */
    public void setExcMsg(String excMsg) {
        this.excMsg = excMsg;
    }

    /**
     * 获取请求参数
     *
     * @return exc_req_param - 请求参数
     */
    public String getExcReqParam() {
        return excReqParam;
    }

    /**
     * 设置请求参数
     *
     * @param excReqParam 请求参数
     */
    public void setExcReqParam(String excReqParam) {
        this.excReqParam = excReqParam;
    }
}