/*
*
* LmRegionExample.java
* @author LiuSiGuang
* @date 2018-11-01
*/
package com.lmrd.entity.region;

import java.util.ArrayList;
import java.util.List;

public class LmRegionExample {
    /**
     * lm_region
     */
    protected String orderByClause;

    /**
     * lm_region
     */
    protected boolean distinct;

    /**
     * lm_region
     */
    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,lm_region
     */
    public LmRegionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,lm_region
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,lm_region
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,lm_region
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,lm_region
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,lm_region
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,lm_region
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,lm_region
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,lm_region
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,lm_region
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,lm_region
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * lm_region
     * GeneratedCriteria
     * 数据库表：lm_region
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRegionIdIsNull() {
            addCriterion("region_id is null");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNotNull() {
            addCriterion("region_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIdEqualTo(String value) {
            addCriterion("region_id =", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotEqualTo(String value) {
            addCriterion("region_id <>", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThan(String value) {
            addCriterion("region_id >", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThanOrEqualTo(String value) {
            addCriterion("region_id >=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThan(String value) {
            addCriterion("region_id <", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThanOrEqualTo(String value) {
            addCriterion("region_id <=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLike(String value) {
            addCriterion("region_id like", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotLike(String value) {
            addCriterion("region_id not like", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIn(List<String> values) {
            addCriterion("region_id in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotIn(List<String> values) {
            addCriterion("region_id not in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdBetween(String value1, String value2) {
            addCriterion("region_id between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotBetween(String value1, String value2) {
            addCriterion("region_id not between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("parent_id like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("parent_id not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMergerNameIsNull() {
            addCriterion("merger_name is null");
            return (Criteria) this;
        }

        public Criteria andMergerNameIsNotNull() {
            addCriterion("merger_name is not null");
            return (Criteria) this;
        }

        public Criteria andMergerNameEqualTo(String value) {
            addCriterion("merger_name =", value, "mergerName");
            return (Criteria) this;
        }

        public Criteria andMergerNameNotEqualTo(String value) {
            addCriterion("merger_name <>", value, "mergerName");
            return (Criteria) this;
        }

        public Criteria andMergerNameGreaterThan(String value) {
            addCriterion("merger_name >", value, "mergerName");
            return (Criteria) this;
        }

        public Criteria andMergerNameGreaterThanOrEqualTo(String value) {
            addCriterion("merger_name >=", value, "mergerName");
            return (Criteria) this;
        }

        public Criteria andMergerNameLessThan(String value) {
            addCriterion("merger_name <", value, "mergerName");
            return (Criteria) this;
        }

        public Criteria andMergerNameLessThanOrEqualTo(String value) {
            addCriterion("merger_name <=", value, "mergerName");
            return (Criteria) this;
        }

        public Criteria andMergerNameLike(String value) {
            addCriterion("merger_name like", value, "mergerName");
            return (Criteria) this;
        }

        public Criteria andMergerNameNotLike(String value) {
            addCriterion("merger_name not like", value, "mergerName");
            return (Criteria) this;
        }

        public Criteria andMergerNameIn(List<String> values) {
            addCriterion("merger_name in", values, "mergerName");
            return (Criteria) this;
        }

        public Criteria andMergerNameNotIn(List<String> values) {
            addCriterion("merger_name not in", values, "mergerName");
            return (Criteria) this;
        }

        public Criteria andMergerNameBetween(String value1, String value2) {
            addCriterion("merger_name between", value1, value2, "mergerName");
            return (Criteria) this;
        }

        public Criteria andMergerNameNotBetween(String value1, String value2) {
            addCriterion("merger_name not between", value1, value2, "mergerName");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNull() {
            addCriterion("short_name is null");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNotNull() {
            addCriterion("short_name is not null");
            return (Criteria) this;
        }

        public Criteria andShortNameEqualTo(String value) {
            addCriterion("short_name =", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotEqualTo(String value) {
            addCriterion("short_name <>", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThan(String value) {
            addCriterion("short_name >", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("short_name >=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThan(String value) {
            addCriterion("short_name <", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThanOrEqualTo(String value) {
            addCriterion("short_name <=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLike(String value) {
            addCriterion("short_name like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotLike(String value) {
            addCriterion("short_name not like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameIn(List<String> values) {
            addCriterion("short_name in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotIn(List<String> values) {
            addCriterion("short_name not in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameBetween(String value1, String value2) {
            addCriterion("short_name between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotBetween(String value1, String value2) {
            addCriterion("short_name not between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andMergerShortNameIsNull() {
            addCriterion("merger_short_name is null");
            return (Criteria) this;
        }

        public Criteria andMergerShortNameIsNotNull() {
            addCriterion("merger_short_name is not null");
            return (Criteria) this;
        }

        public Criteria andMergerShortNameEqualTo(String value) {
            addCriterion("merger_short_name =", value, "mergerShortName");
            return (Criteria) this;
        }

        public Criteria andMergerShortNameNotEqualTo(String value) {
            addCriterion("merger_short_name <>", value, "mergerShortName");
            return (Criteria) this;
        }

        public Criteria andMergerShortNameGreaterThan(String value) {
            addCriterion("merger_short_name >", value, "mergerShortName");
            return (Criteria) this;
        }

        public Criteria andMergerShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("merger_short_name >=", value, "mergerShortName");
            return (Criteria) this;
        }

        public Criteria andMergerShortNameLessThan(String value) {
            addCriterion("merger_short_name <", value, "mergerShortName");
            return (Criteria) this;
        }

        public Criteria andMergerShortNameLessThanOrEqualTo(String value) {
            addCriterion("merger_short_name <=", value, "mergerShortName");
            return (Criteria) this;
        }

        public Criteria andMergerShortNameLike(String value) {
            addCriterion("merger_short_name like", value, "mergerShortName");
            return (Criteria) this;
        }

        public Criteria andMergerShortNameNotLike(String value) {
            addCriterion("merger_short_name not like", value, "mergerShortName");
            return (Criteria) this;
        }

        public Criteria andMergerShortNameIn(List<String> values) {
            addCriterion("merger_short_name in", values, "mergerShortName");
            return (Criteria) this;
        }

        public Criteria andMergerShortNameNotIn(List<String> values) {
            addCriterion("merger_short_name not in", values, "mergerShortName");
            return (Criteria) this;
        }

        public Criteria andMergerShortNameBetween(String value1, String value2) {
            addCriterion("merger_short_name between", value1, value2, "mergerShortName");
            return (Criteria) this;
        }

        public Criteria andMergerShortNameNotBetween(String value1, String value2) {
            addCriterion("merger_short_name not between", value1, value2, "mergerShortName");
            return (Criteria) this;
        }

        public Criteria andLevelTypeIsNull() {
            addCriterion("level_type is null");
            return (Criteria) this;
        }

        public Criteria andLevelTypeIsNotNull() {
            addCriterion("level_type is not null");
            return (Criteria) this;
        }

        public Criteria andLevelTypeEqualTo(String value) {
            addCriterion("level_type =", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeNotEqualTo(String value) {
            addCriterion("level_type <>", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeGreaterThan(String value) {
            addCriterion("level_type >", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("level_type >=", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeLessThan(String value) {
            addCriterion("level_type <", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeLessThanOrEqualTo(String value) {
            addCriterion("level_type <=", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeLike(String value) {
            addCriterion("level_type like", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeNotLike(String value) {
            addCriterion("level_type not like", value, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeIn(List<String> values) {
            addCriterion("level_type in", values, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeNotIn(List<String> values) {
            addCriterion("level_type not in", values, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeBetween(String value1, String value2) {
            addCriterion("level_type between", value1, value2, "levelType");
            return (Criteria) this;
        }

        public Criteria andLevelTypeNotBetween(String value1, String value2) {
            addCriterion("level_type not between", value1, value2, "levelType");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("zip_code is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("zip_code =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("zip_code <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("zip_code >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("zip_code >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("zip_code <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("zip_code <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("zip_code like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("zip_code not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("zip_code in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("zip_code not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("zip_code between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("zip_code not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andPinYinIsNull() {
            addCriterion("pin_yin is null");
            return (Criteria) this;
        }

        public Criteria andPinYinIsNotNull() {
            addCriterion("pin_yin is not null");
            return (Criteria) this;
        }

        public Criteria andPinYinEqualTo(String value) {
            addCriterion("pin_yin =", value, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinNotEqualTo(String value) {
            addCriterion("pin_yin <>", value, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinGreaterThan(String value) {
            addCriterion("pin_yin >", value, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinGreaterThanOrEqualTo(String value) {
            addCriterion("pin_yin >=", value, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinLessThan(String value) {
            addCriterion("pin_yin <", value, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinLessThanOrEqualTo(String value) {
            addCriterion("pin_yin <=", value, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinLike(String value) {
            addCriterion("pin_yin like", value, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinNotLike(String value) {
            addCriterion("pin_yin not like", value, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinIn(List<String> values) {
            addCriterion("pin_yin in", values, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinNotIn(List<String> values) {
            addCriterion("pin_yin not in", values, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinBetween(String value1, String value2) {
            addCriterion("pin_yin between", value1, value2, "pinYin");
            return (Criteria) this;
        }

        public Criteria andPinYinNotBetween(String value1, String value2) {
            addCriterion("pin_yin not between", value1, value2, "pinYin");
            return (Criteria) this;
        }

        public Criteria andJianPinIsNull() {
            addCriterion("jian_pin is null");
            return (Criteria) this;
        }

        public Criteria andJianPinIsNotNull() {
            addCriterion("jian_pin is not null");
            return (Criteria) this;
        }

        public Criteria andJianPinEqualTo(String value) {
            addCriterion("jian_pin =", value, "jianPin");
            return (Criteria) this;
        }

        public Criteria andJianPinNotEqualTo(String value) {
            addCriterion("jian_pin <>", value, "jianPin");
            return (Criteria) this;
        }

        public Criteria andJianPinGreaterThan(String value) {
            addCriterion("jian_pin >", value, "jianPin");
            return (Criteria) this;
        }

        public Criteria andJianPinGreaterThanOrEqualTo(String value) {
            addCriterion("jian_pin >=", value, "jianPin");
            return (Criteria) this;
        }

        public Criteria andJianPinLessThan(String value) {
            addCriterion("jian_pin <", value, "jianPin");
            return (Criteria) this;
        }

        public Criteria andJianPinLessThanOrEqualTo(String value) {
            addCriterion("jian_pin <=", value, "jianPin");
            return (Criteria) this;
        }

        public Criteria andJianPinLike(String value) {
            addCriterion("jian_pin like", value, "jianPin");
            return (Criteria) this;
        }

        public Criteria andJianPinNotLike(String value) {
            addCriterion("jian_pin not like", value, "jianPin");
            return (Criteria) this;
        }

        public Criteria andJianPinIn(List<String> values) {
            addCriterion("jian_pin in", values, "jianPin");
            return (Criteria) this;
        }

        public Criteria andJianPinNotIn(List<String> values) {
            addCriterion("jian_pin not in", values, "jianPin");
            return (Criteria) this;
        }

        public Criteria andJianPinBetween(String value1, String value2) {
            addCriterion("jian_pin between", value1, value2, "jianPin");
            return (Criteria) this;
        }

        public Criteria andJianPinNotBetween(String value1, String value2) {
            addCriterion("jian_pin not between", value1, value2, "jianPin");
            return (Criteria) this;
        }

        public Criteria andFirstCharIsNull() {
            addCriterion("first_char is null");
            return (Criteria) this;
        }

        public Criteria andFirstCharIsNotNull() {
            addCriterion("first_char is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCharEqualTo(String value) {
            addCriterion("first_char =", value, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharNotEqualTo(String value) {
            addCriterion("first_char <>", value, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharGreaterThan(String value) {
            addCriterion("first_char >", value, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharGreaterThanOrEqualTo(String value) {
            addCriterion("first_char >=", value, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharLessThan(String value) {
            addCriterion("first_char <", value, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharLessThanOrEqualTo(String value) {
            addCriterion("first_char <=", value, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharLike(String value) {
            addCriterion("first_char like", value, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharNotLike(String value) {
            addCriterion("first_char not like", value, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharIn(List<String> values) {
            addCriterion("first_char in", values, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharNotIn(List<String> values) {
            addCriterion("first_char not in", values, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharBetween(String value1, String value2) {
            addCriterion("first_char between", value1, value2, "firstChar");
            return (Criteria) this;
        }

        public Criteria andFirstCharNotBetween(String value1, String value2) {
            addCriterion("first_char not between", value1, value2, "firstChar");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(String value) {
            addCriterion("lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(String value) {
            addCriterion("lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(String value) {
            addCriterion("lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(String value) {
            addCriterion("lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(String value) {
            addCriterion("lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(String value) {
            addCriterion("lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLike(String value) {
            addCriterion("lng like", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotLike(String value) {
            addCriterion("lng not like", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<String> values) {
            addCriterion("lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<String> values) {
            addCriterion("lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(String value1, String value2) {
            addCriterion("lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(String value1, String value2) {
            addCriterion("lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(String value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(String value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(String value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(String value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(String value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(String value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLike(String value) {
            addCriterion("lat like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotLike(String value) {
            addCriterion("lat not like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<String> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<String> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(String value1, String value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(String value1, String value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：lm_region
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * lm_region
     * Criterion
     * 数据库表：lm_region
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}