package com.jhmarryme.demo.pojo.model.system.log;

import java.util.Date;
import javax.persistence.*;

@Table(name = "exception_log")
public class ExceptionLog {
    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 异常名称
     */
    private String name;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 请求uri
     */
    private String uri;

    /**
     * 请求ip
     */
    private String ip;

    /**
     * 操作时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 操作版本号
     */
    private String ver;

    /**
     * 操作方法
     */
    private String method;

    /**
     * 请求类型
     */
    @Column(name = "req_type")
    private String reqType;

    /**
     * 异常信息
     */
    private String msg;

    /**
     * 请求参数
     */
    @Column(name = "req_param")
    private String reqParam;

    /**
     * 请求体
     */
    @Column(name = "req_body")
    private String reqBody;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取异常名称
     *
     * @return name - 异常名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置异常名称
     *
     * @param name 异常名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取请求uri
     *
     * @return uri - 请求uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * 设置请求uri
     *
     * @param uri 请求uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * 获取请求ip
     *
     * @return ip - 请求ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置请求ip
     *
     * @param ip 请求ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取操作时间
     *
     * @return create_time - 操作时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置操作时间
     *
     * @param createTime 操作时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取操作版本号
     *
     * @return ver - 操作版本号
     */
    public String getVer() {
        return ver;
    }

    /**
     * 设置操作版本号
     *
     * @param ver 操作版本号
     */
    public void setVer(String ver) {
        this.ver = ver;
    }

    /**
     * 获取操作方法
     *
     * @return method - 操作方法
     */
    public String getMethod() {
        return method;
    }

    /**
     * 设置操作方法
     *
     * @param method 操作方法
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * 获取请求类型
     *
     * @return req_type - 请求类型
     */
    public String getReqType() {
        return reqType;
    }

    /**
     * 设置请求类型
     *
     * @param reqType 请求类型
     */
    public void setReqType(String reqType) {
        this.reqType = reqType;
    }

    /**
     * 获取异常信息
     *
     * @return msg - 异常信息
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置异常信息
     *
     * @param msg 异常信息
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 获取请求参数
     *
     * @return req_param - 请求参数
     */
    public String getReqParam() {
        return reqParam;
    }

    /**
     * 设置请求参数
     *
     * @param reqParam 请求参数
     */
    public void setReqParam(String reqParam) {
        this.reqParam = reqParam;
    }

    /**
     * 获取请求体
     *
     * @return req_body - 请求体
     */
    public String getReqBody() {
        return reqBody;
    }

    /**
     * 设置请求体
     *
     * @param reqBody 请求体
     */
    public void setReqBody(String reqBody) {
        this.reqBody = reqBody;
    }
}