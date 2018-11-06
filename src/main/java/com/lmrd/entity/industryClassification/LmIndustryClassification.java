/*
*
* LmIndustryClassification.java
* @author LiuSiGuang
* @date 2018-11-05
*/
package com.lmrd.entity.industryClassification;

public class LmIndustryClassification {
    /**
     * 主键ID
     * 表字段 : lm_industry_classification.Industry_classification_id
     */
    private Long industryClassificationId;

    /**
     * 行业名称
     * 表字段 : lm_industry_classification.Industry_classification_name
     */
    private String industryClassificationName;

    /**
     * 行业代码
     * 表字段 : lm_industry_classification.Industry_classification_code
     */
    private String industryClassificationCode;

    /**
     * 级别
     * 表字段 : lm_industry_classification.level
     */
    private Integer level;

    /**
     * 父级ID
     * 表字段 : lm_industry_classification.parent_id
     */
    private Long parentId;

    /**
     * 是否最后一级
     * 表字段 : lm_industry_classification.last_level
     */
    private Integer lastLevel;

    /**
     * 创建时间
     * 表字段 : lm_industry_classification.create_time
     */
    private Long createTime;

    /**
     * 修改时间
     * 表字段 : lm_industry_classification.update_time
     */
    private Long updateTime;

    /**
     * 删除时间
     * 表字段 : lm_industry_classification.delete_time
     */
    private Long deleteTime;

    /**
     * 删除标记
     * 表字段 : lm_industry_classification.is_delete
     */
    private Integer isDelete;

    /**
     * 获取 主键ID 字段:lm_industry_classification.Industry_classification_id
     *
     * @return lm_industry_classification.Industry_classification_id, 主键ID
     */
    public Long getIndustryClassificationId() {
        return industryClassificationId;
    }

    /**
     * 设置 主键ID 字段:lm_industry_classification.Industry_classification_id
     *
     * @param industryClassificationId the value for lm_industry_classification.Industry_classification_id, 主键ID
     */
    public void setIndustryClassificationId(Long industryClassificationId) {
        this.industryClassificationId = industryClassificationId;
    }

    /**
     * 获取 行业名称 字段:lm_industry_classification.Industry_classification_name
     *
     * @return lm_industry_classification.Industry_classification_name, 行业名称
     */
    public String getIndustryClassificationName() {
        return industryClassificationName;
    }

    /**
     * 设置 行业名称 字段:lm_industry_classification.Industry_classification_name
     *
     * @param industryClassificationName the value for lm_industry_classification.Industry_classification_name, 行业名称
     */
    public void setIndustryClassificationName(String industryClassificationName) {
        this.industryClassificationName = industryClassificationName == null ? null : industryClassificationName.trim();
    }

    /**
     * 获取 行业代码 字段:lm_industry_classification.Industry_classification_code
     *
     * @return lm_industry_classification.Industry_classification_code, 行业代码
     */
    public String getIndustryClassificationCode() {
        return industryClassificationCode;
    }

    /**
     * 设置 行业代码 字段:lm_industry_classification.Industry_classification_code
     *
     * @param industryClassificationCode the value for lm_industry_classification.Industry_classification_code, 行业代码
     */
    public void setIndustryClassificationCode(String industryClassificationCode) {
        this.industryClassificationCode = industryClassificationCode == null ? null : industryClassificationCode.trim();
    }

    /**
     * 获取 级别 字段:lm_industry_classification.level
     *
     * @return lm_industry_classification.level, 级别
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置 级别 字段:lm_industry_classification.level
     *
     * @param level the value for lm_industry_classification.level, 级别
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取 父级ID 字段:lm_industry_classification.parent_id
     *
     * @return lm_industry_classification.parent_id, 父级ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置 父级ID 字段:lm_industry_classification.parent_id
     *
     * @param parentId the value for lm_industry_classification.parent_id, 父级ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取 是否最后一级 字段:lm_industry_classification.last_level
     *
     * @return lm_industry_classification.last_level, 是否最后一级
     */
    public Integer getLastLevel() {
        return lastLevel;
    }

    /**
     * 设置 是否最后一级 字段:lm_industry_classification.last_level
     *
     * @param lastLevel the value for lm_industry_classification.last_level, 是否最后一级
     */
    public void setLastLevel(Integer lastLevel) {
        this.lastLevel = lastLevel;
    }

    /**
     * 获取 创建时间 字段:lm_industry_classification.create_time
     *
     * @return lm_industry_classification.create_time, 创建时间
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:lm_industry_classification.create_time
     *
     * @param createTime the value for lm_industry_classification.create_time, 创建时间
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 修改时间 字段:lm_industry_classification.update_time
     *
     * @return lm_industry_classification.update_time, 修改时间
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 修改时间 字段:lm_industry_classification.update_time
     *
     * @param updateTime the value for lm_industry_classification.update_time, 修改时间
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 删除时间 字段:lm_industry_classification.delete_time
     *
     * @return lm_industry_classification.delete_time, 删除时间
     */
    public Long getDeleteTime() {
        return deleteTime;
    }

    /**
     * 设置 删除时间 字段:lm_industry_classification.delete_time
     *
     * @param deleteTime the value for lm_industry_classification.delete_time, 删除时间
     */
    public void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * 获取 删除标记 字段:lm_industry_classification.is_delete
     *
     * @return lm_industry_classification.is_delete, 删除标记
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置 删除标记 字段:lm_industry_classification.is_delete
     *
     * @param isDelete the value for lm_industry_classification.is_delete, 删除标记
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}