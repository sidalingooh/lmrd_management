/*
*
* BackUser.java
* @author LiuSiGuang
* @date 2018-11-06
*/
package com.lmrd.entity.user;

public class BackUser {
    /**
     * 用户ID
     * 表字段 : back_user.back_user_id
     */
    private Long backUserId;

    /**
     * 邮箱
     * 表字段 : back_user.email
     */
    private String email;

    /**
     * 是否启用
     * 表字段 : back_user.enable
     */
    private Integer enable;

    /**
     * 电话
     * 表字段 : back_user.mobile
     */
    private String mobile;

    /**
     * 密码
     * 表字段 : back_user.password
     */
    private String password;

    /**
     * 真实姓名
     * 表字段 : back_user.real_name
     */
    private String realName;

    /**
     * 用户类型（0：超管，1：管理员，2：普通管理，3：代理商管理员）
     * 表字段 : back_user.user_type
     */
    private Integer userType;

    /**
     * 用户名
     * 表字段 : back_user.user_name
     */
    private String userName;

    /**
     * 代理商ID
     * 表字段 : back_user.agent_id
     */
    private Long agentId;

    /**
     * 创建时间
     * 表字段 : back_user.create_time
     */
    private Long createTime;

    /**
     * 修改时间
     * 表字段 : back_user.update_time
     */
    private Long updateTime;

    /**
     * 删除时间
     * 表字段 : back_user.delete_time
     */
    private Long deleteTime;

    /**
     * 删除标记
     * 表字段 : back_user.is_delete
     */
    private Integer isDelete;

    /**
     * 本版号
     * 表字段 : back_user.version
     */
    private Long version;

    /**
     * 获取 用户ID 字段:back_user.back_user_id
     *
     * @return back_user.back_user_id, 用户ID
     */
    public Long getBackUserId() {
        return backUserId;
    }

    /**
     * 设置 用户ID 字段:back_user.back_user_id
     *
     * @param backUserId the value for back_user.back_user_id, 用户ID
     */
    public void setBackUserId(Long backUserId) {
        this.backUserId = backUserId;
    }

    /**
     * 获取 邮箱 字段:back_user.email
     *
     * @return back_user.email, 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置 邮箱 字段:back_user.email
     *
     * @param email the value for back_user.email, 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取 是否启用 字段:back_user.enable
     *
     * @return back_user.enable, 是否启用
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * 设置 是否启用 字段:back_user.enable
     *
     * @param enable the value for back_user.enable, 是否启用
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * 获取 电话 字段:back_user.mobile
     *
     * @return back_user.mobile, 电话
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置 电话 字段:back_user.mobile
     *
     * @param mobile the value for back_user.mobile, 电话
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取 密码 字段:back_user.password
     *
     * @return back_user.password, 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置 密码 字段:back_user.password
     *
     * @param password the value for back_user.password, 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取 真实姓名 字段:back_user.real_name
     *
     * @return back_user.real_name, 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置 真实姓名 字段:back_user.real_name
     *
     * @param realName the value for back_user.real_name, 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 获取 用户类型（0：超管，1：管理员，2：普通管理，3：代理商管理员） 字段:back_user.user_type
     *
     * @return back_user.user_type, 用户类型（0：超管，1：管理员，2：普通管理，3：代理商管理员）
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置 用户类型（0：超管，1：管理员，2：普通管理，3：代理商管理员） 字段:back_user.user_type
     *
     * @param userType the value for back_user.user_type, 用户类型（0：超管，1：管理员，2：普通管理，3：代理商管理员）
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 获取 用户名 字段:back_user.user_name
     *
     * @return back_user.user_name, 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置 用户名 字段:back_user.user_name
     *
     * @param userName the value for back_user.user_name, 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取 代理商ID 字段:back_user.agent_id
     *
     * @return back_user.agent_id, 代理商ID
     */
    public Long getAgentId() {
        return agentId;
    }

    /**
     * 设置 代理商ID 字段:back_user.agent_id
     *
     * @param agentId the value for back_user.agent_id, 代理商ID
     */
    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    /**
     * 获取 创建时间 字段:back_user.create_time
     *
     * @return back_user.create_time, 创建时间
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:back_user.create_time
     *
     * @param createTime the value for back_user.create_time, 创建时间
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 修改时间 字段:back_user.update_time
     *
     * @return back_user.update_time, 修改时间
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 修改时间 字段:back_user.update_time
     *
     * @param updateTime the value for back_user.update_time, 修改时间
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 删除时间 字段:back_user.delete_time
     *
     * @return back_user.delete_time, 删除时间
     */
    public Long getDeleteTime() {
        return deleteTime;
    }

    /**
     * 设置 删除时间 字段:back_user.delete_time
     *
     * @param deleteTime the value for back_user.delete_time, 删除时间
     */
    public void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * 获取 删除标记 字段:back_user.is_delete
     *
     * @return back_user.is_delete, 删除标记
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置 删除标记 字段:back_user.is_delete
     *
     * @param isDelete the value for back_user.is_delete, 删除标记
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取 本版号 字段:back_user.version
     *
     * @return back_user.version, 本版号
     */
    public Long getVersion() {
        return version;
    }

    /**
     * 设置 本版号 字段:back_user.version
     *
     * @param version the value for back_user.version, 本版号
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}