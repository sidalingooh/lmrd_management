/*
*
* BackRole.java
* @author LiuSiGuang
* @date 2018-11-01
*/
package com.lmrd.entity.user;

public class BackRole {
    /**
     * 
     * 表字段 : back_role.back_role_id
     */
    private Long backRoleId;

    /**
     * 
     * 表字段 : back_role.description
     */
    private String description;

    /**
     * 名称
     * 表字段 : back_role.name
     */
    private String name;

    /**
     * 
     * 表字段 : back_role.role_set
     */
    private String roleSet;

    /**
     * 
     * 表字段 : back_role.version
     */
    private Long version;

    /**
     * 获取  字段:back_role.back_role_id
     *
     * @return back_role.back_role_id, 
     */
    public Long getBackRoleId() {
        return backRoleId;
    }

    /**
     * 设置  字段:back_role.back_role_id
     *
     * @param backRoleId the value for back_role.back_role_id, 
     */
    public void setBackRoleId(Long backRoleId) {
        this.backRoleId = backRoleId;
    }

    /**
     * 获取  字段:back_role.description
     *
     * @return back_role.description, 
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置  字段:back_role.description
     *
     * @param description the value for back_role.description, 
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取 名称 字段:back_role.name
     *
     * @return back_role.name, 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 名称 字段:back_role.name
     *
     * @param name the value for back_role.name, 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取  字段:back_role.role_set
     *
     * @return back_role.role_set, 
     */
    public String getRoleSet() {
        return roleSet;
    }

    /**
     * 设置  字段:back_role.role_set
     *
     * @param roleSet the value for back_role.role_set, 
     */
    public void setRoleSet(String roleSet) {
        this.roleSet = roleSet == null ? null : roleSet.trim();
    }

    /**
     * 获取  字段:back_role.version
     *
     * @return back_role.version, 
     */
    public Long getVersion() {
        return version;
    }

    /**
     * 设置  字段:back_role.version
     *
     * @param version the value for back_role.version, 
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}