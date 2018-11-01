/*
*
* LmRegion.java
* @author LiuSiGuang
* @date 2018-11-01
*/
package com.lmrd.entity.region;

public class LmRegion {
    /**
     * 键主ID
     * 表字段 : lm_region.region_id
     */
    private String regionId;

    /**
     * 父级ID
     * 表字段 : lm_region.parent_id
     */
    private String parentId;

    /**
     * 名称
     * 表字段 : lm_region.name
     */
    private String name;

    /**
     * 并合后的名称
     * 表字段 : lm_region.merger_name
     */
    private String mergerName;

    /**
     * 短名称
     * 表字段 : lm_region.short_name
     */
    private String shortName;

    /**
     * 并合后的短名称
     * 表字段 : lm_region.merger_short_name
     */
    private String mergerShortName;

    /**
     * 级别
     * 表字段 : lm_region.level_type
     */
    private String levelType;

    /**
     * 城市编码
     * 表字段 : lm_region.city_code
     */
    private String cityCode;

    /**
     * 邮编
     * 表字段 : lm_region.zip_code
     */
    private String zipCode;

    /**
     * 拼音
     * 表字段 : lm_region.pin_yin
     */
    private String pinYin;

    /**
     * 简拼
     * 表字段 : lm_region.jian_pin
     */
    private String jianPin;

    /**
     * 第一个字符
     * 表字段 : lm_region.first_char
     */
    private String firstChar;

    /**
     * 经度
     * 表字段 : lm_region.lng
     */
    private String lng;

    /**
     * 纬度
     * 表字段 : lm_region.lat
     */
    private String lat;

    /**
     * 描述
     * 表字段 : lm_region.remarks
     */
    private String remarks;

    /**
     * 获取 键主ID 字段:lm_region.region_id
     *
     * @return lm_region.region_id, 键主ID
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * 设置 键主ID 字段:lm_region.region_id
     *
     * @param regionId the value for lm_region.region_id, 键主ID
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId == null ? null : regionId.trim();
    }

    /**
     * 获取 父级ID 字段:lm_region.parent_id
     *
     * @return lm_region.parent_id, 父级ID
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置 父级ID 字段:lm_region.parent_id
     *
     * @param parentId the value for lm_region.parent_id, 父级ID
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * 获取 名称 字段:lm_region.name
     *
     * @return lm_region.name, 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 名称 字段:lm_region.name
     *
     * @param name the value for lm_region.name, 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取 并合后的名称 字段:lm_region.merger_name
     *
     * @return lm_region.merger_name, 并合后的名称
     */
    public String getMergerName() {
        return mergerName;
    }

    /**
     * 设置 并合后的名称 字段:lm_region.merger_name
     *
     * @param mergerName the value for lm_region.merger_name, 并合后的名称
     */
    public void setMergerName(String mergerName) {
        this.mergerName = mergerName == null ? null : mergerName.trim();
    }

    /**
     * 获取 短名称 字段:lm_region.short_name
     *
     * @return lm_region.short_name, 短名称
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * 设置 短名称 字段:lm_region.short_name
     *
     * @param shortName the value for lm_region.short_name, 短名称
     */
    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    /**
     * 获取 并合后的短名称 字段:lm_region.merger_short_name
     *
     * @return lm_region.merger_short_name, 并合后的短名称
     */
    public String getMergerShortName() {
        return mergerShortName;
    }

    /**
     * 设置 并合后的短名称 字段:lm_region.merger_short_name
     *
     * @param mergerShortName the value for lm_region.merger_short_name, 并合后的短名称
     */
    public void setMergerShortName(String mergerShortName) {
        this.mergerShortName = mergerShortName == null ? null : mergerShortName.trim();
    }

    /**
     * 获取 级别 字段:lm_region.level_type
     *
     * @return lm_region.level_type, 级别
     */
    public String getLevelType() {
        return levelType;
    }

    /**
     * 设置 级别 字段:lm_region.level_type
     *
     * @param levelType the value for lm_region.level_type, 级别
     */
    public void setLevelType(String levelType) {
        this.levelType = levelType == null ? null : levelType.trim();
    }

    /**
     * 获取 城市编码 字段:lm_region.city_code
     *
     * @return lm_region.city_code, 城市编码
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 设置 城市编码 字段:lm_region.city_code
     *
     * @param cityCode the value for lm_region.city_code, 城市编码
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * 获取 邮编 字段:lm_region.zip_code
     *
     * @return lm_region.zip_code, 邮编
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * 设置 邮编 字段:lm_region.zip_code
     *
     * @param zipCode the value for lm_region.zip_code, 邮编
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    /**
     * 获取 拼音 字段:lm_region.pin_yin
     *
     * @return lm_region.pin_yin, 拼音
     */
    public String getPinYin() {
        return pinYin;
    }

    /**
     * 设置 拼音 字段:lm_region.pin_yin
     *
     * @param pinYin the value for lm_region.pin_yin, 拼音
     */
    public void setPinYin(String pinYin) {
        this.pinYin = pinYin == null ? null : pinYin.trim();
    }

    /**
     * 获取 简拼 字段:lm_region.jian_pin
     *
     * @return lm_region.jian_pin, 简拼
     */
    public String getJianPin() {
        return jianPin;
    }

    /**
     * 设置 简拼 字段:lm_region.jian_pin
     *
     * @param jianPin the value for lm_region.jian_pin, 简拼
     */
    public void setJianPin(String jianPin) {
        this.jianPin = jianPin == null ? null : jianPin.trim();
    }

    /**
     * 获取 第一个字符 字段:lm_region.first_char
     *
     * @return lm_region.first_char, 第一个字符
     */
    public String getFirstChar() {
        return firstChar;
    }

    /**
     * 设置 第一个字符 字段:lm_region.first_char
     *
     * @param firstChar the value for lm_region.first_char, 第一个字符
     */
    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar == null ? null : firstChar.trim();
    }

    /**
     * 获取 经度 字段:lm_region.lng
     *
     * @return lm_region.lng, 经度
     */
    public String getLng() {
        return lng;
    }

    /**
     * 设置 经度 字段:lm_region.lng
     *
     * @param lng the value for lm_region.lng, 经度
     */
    public void setLng(String lng) {
        this.lng = lng == null ? null : lng.trim();
    }

    /**
     * 获取 纬度 字段:lm_region.lat
     *
     * @return lm_region.lat, 纬度
     */
    public String getLat() {
        return lat;
    }

    /**
     * 设置 纬度 字段:lm_region.lat
     *
     * @param lat the value for lm_region.lat, 纬度
     */
    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    /**
     * 获取 描述 字段:lm_region.remarks
     *
     * @return lm_region.remarks, 描述
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置 描述 字段:lm_region.remarks
     *
     * @param remarks the value for lm_region.remarks, 描述
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}