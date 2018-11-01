/*
*
* BackUserRole.java
* @author LiuSiGuang
* @date 2018-11-01
*/
package com.lmrd.entity.user;

public class BackUserRole {
    /**
     * 
     * 表字段 : back_user_role.back_user_role_id
     */
    private Long backUserRoleId;

    /**
     * 
     * 表字段 : back_user_role.back_role_id
     */
    private Long backRoleId;

    /**
     * 
     * 表字段 : back_user_role.back_user_id
     */
    private Long backUserId;

    /**
     * 获取  字段:back_user_role.back_user_role_id
     *
     * @return back_user_role.back_user_role_id, 
     */
    public Long getBackUserRoleId() {
        return backUserRoleId;
    }

    /**
     * 设置  字段:back_user_role.back_user_role_id
     *
     * @param backUserRoleId the value for back_user_role.back_user_role_id, 
     */
    public void setBackUserRoleId(Long backUserRoleId) {
        this.backUserRoleId = backUserRoleId;
    }

    /**
     * 获取  字段:back_user_role.back_role_id
     *
     * @return back_user_role.back_role_id, 
     */
    public Long getBackRoleId() {
        return backRoleId;
    }

    /**
     * 设置  字段:back_user_role.back_role_id
     *
     * @param backRoleId the value for back_user_role.back_role_id, 
     */
    public void setBackRoleId(Long backRoleId) {
        this.backRoleId = backRoleId;
    }

    /**
     * 获取  字段:back_user_role.back_user_id
     *
     * @return back_user_role.back_user_id, 
     */
    public Long getBackUserId() {
        return backUserId;
    }

    /**
     * 设置  字段:back_user_role.back_user_id
     *
     * @param backUserId the value for back_user_role.back_user_id, 
     */
    public void setBackUserId(Long backUserId) {
        this.backUserId = backUserId;
    }
}