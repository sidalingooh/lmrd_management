/*
*
* BackMenu.java
* @author LiuSiGuang
* @date 2018-11-01
*/
package com.lmrd.entity.user;

public class BackMenu {
    /**
     * 权限ID
     * 表字段 : back_menu.back_menu_id
     */
    private Long backMenuId;

    /**
     * 描述
     * 表字段 : back_menu.description
     */
    private String description;

    /**
     * 级别
     * 表字段 : back_menu.level
     */
    private Integer level;

    /**
     * 名称
     * 表字段 : back_menu.name
     */
    private String name;

    /**
     * 排序方式
     * 表字段 : back_menu.order_num
     */
    private Integer orderNum;

    /**
     * 父级ID
     * 表字段 : back_menu.parent_id
     */
    private Long parentId;

    /**
     * 地址
     * 表字段 : back_menu.url
     */
    private String url;

    /**
     * 权限类型
     * 表字段 : back_menu.menu_type
     */
    private Integer menuType;

    /**
     * 图标
     * 表字段 : back_menu.icon
     */
    private String icon;

    /**
     * 版本号
     * 表字段 : back_menu.version
     */
    private Long version;

    /**
     * 获取 权限ID 字段:back_menu.back_menu_id
     *
     * @return back_menu.back_menu_id, 权限ID
     */
    public Long getBackMenuId() {
        return backMenuId;
    }

    /**
     * 设置 权限ID 字段:back_menu.back_menu_id
     *
     * @param backMenuId the value for back_menu.back_menu_id, 权限ID
     */
    public void setBackMenuId(Long backMenuId) {
        this.backMenuId = backMenuId;
    }

    /**
     * 获取 描述 字段:back_menu.description
     *
     * @return back_menu.description, 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置 描述 字段:back_menu.description
     *
     * @param description the value for back_menu.description, 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取 级别 字段:back_menu.level
     *
     * @return back_menu.level, 级别
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置 级别 字段:back_menu.level
     *
     * @param level the value for back_menu.level, 级别
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取 名称 字段:back_menu.name
     *
     * @return back_menu.name, 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 名称 字段:back_menu.name
     *
     * @param name the value for back_menu.name, 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取 排序方式 字段:back_menu.order_num
     *
     * @return back_menu.order_num, 排序方式
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * 设置 排序方式 字段:back_menu.order_num
     *
     * @param orderNum the value for back_menu.order_num, 排序方式
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 获取 父级ID 字段:back_menu.parent_id
     *
     * @return back_menu.parent_id, 父级ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置 父级ID 字段:back_menu.parent_id
     *
     * @param parentId the value for back_menu.parent_id, 父级ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取 地址 字段:back_menu.url
     *
     * @return back_menu.url, 地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置 地址 字段:back_menu.url
     *
     * @param url the value for back_menu.url, 地址
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取 权限类型 字段:back_menu.menu_type
     *
     * @return back_menu.menu_type, 权限类型
     */
    public Integer getMenuType() {
        return menuType;
    }

    /**
     * 设置 权限类型 字段:back_menu.menu_type
     *
     * @param menuType the value for back_menu.menu_type, 权限类型
     */
    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    /**
     * 获取 图标 字段:back_menu.icon
     *
     * @return back_menu.icon, 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置 图标 字段:back_menu.icon
     *
     * @param icon the value for back_menu.icon, 图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 获取 版本号 字段:back_menu.version
     *
     * @return back_menu.version, 版本号
     */
    public Long getVersion() {
        return version;
    }

    /**
     * 设置 版本号 字段:back_menu.version
     *
     * @param version the value for back_menu.version, 版本号
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}