/*
*
* LmIndustryClassificationExample.java
* @author LiuSiGuang
* @date 2018-11-05
*/
package com.lmrd.entity.industryClassification;

import java.util.ArrayList;
import java.util.List;

public class LmIndustryClassificationExample {
    /**
     * lm_industry_classification
     */
    protected String orderByClause;

    /**
     * lm_industry_classification
     */
    protected boolean distinct;

    /**
     * lm_industry_classification
     */
    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,lm_industry_classification
     */
    public LmIndustryClassificationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,lm_industry_classification
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,lm_industry_classification
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,lm_industry_classification
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,lm_industry_classification
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,lm_industry_classification
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,lm_industry_classification
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,lm_industry_classification
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,lm_industry_classification
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,lm_industry_classification
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,lm_industry_classification
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * lm_industry_classification
     * GeneratedCriteria
     * 数据库表：lm_industry_classification
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

        public Criteria andIndustryClassificationIdIsNull() {
            addCriterion("Industry_classification_id is null");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationIdIsNotNull() {
            addCriterion("Industry_classification_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationIdEqualTo(Long value) {
            addCriterion("Industry_classification_id =", value, "industryClassificationId");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationIdNotEqualTo(Long value) {
            addCriterion("Industry_classification_id <>", value, "industryClassificationId");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationIdGreaterThan(Long value) {
            addCriterion("Industry_classification_id >", value, "industryClassificationId");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Industry_classification_id >=", value, "industryClassificationId");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationIdLessThan(Long value) {
            addCriterion("Industry_classification_id <", value, "industryClassificationId");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationIdLessThanOrEqualTo(Long value) {
            addCriterion("Industry_classification_id <=", value, "industryClassificationId");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationIdIn(List<Long> values) {
            addCriterion("Industry_classification_id in", values, "industryClassificationId");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationIdNotIn(List<Long> values) {
            addCriterion("Industry_classification_id not in", values, "industryClassificationId");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationIdBetween(Long value1, Long value2) {
            addCriterion("Industry_classification_id between", value1, value2, "industryClassificationId");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationIdNotBetween(Long value1, Long value2) {
            addCriterion("Industry_classification_id not between", value1, value2, "industryClassificationId");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationNameIsNull() {
            addCriterion("Industry_classification_name is null");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationNameIsNotNull() {
            addCriterion("Industry_classification_name is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationNameEqualTo(String value) {
            addCriterion("Industry_classification_name =", value, "industryClassificationName");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationNameNotEqualTo(String value) {
            addCriterion("Industry_classification_name <>", value, "industryClassificationName");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationNameGreaterThan(String value) {
            addCriterion("Industry_classification_name >", value, "industryClassificationName");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationNameGreaterThanOrEqualTo(String value) {
            addCriterion("Industry_classification_name >=", value, "industryClassificationName");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationNameLessThan(String value) {
            addCriterion("Industry_classification_name <", value, "industryClassificationName");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationNameLessThanOrEqualTo(String value) {
            addCriterion("Industry_classification_name <=", value, "industryClassificationName");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationNameLike(String value) {
            addCriterion("Industry_classification_name like", value, "industryClassificationName");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationNameNotLike(String value) {
            addCriterion("Industry_classification_name not like", value, "industryClassificationName");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationNameIn(List<String> values) {
            addCriterion("Industry_classification_name in", values, "industryClassificationName");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationNameNotIn(List<String> values) {
            addCriterion("Industry_classification_name not in", values, "industryClassificationName");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationNameBetween(String value1, String value2) {
            addCriterion("Industry_classification_name between", value1, value2, "industryClassificationName");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationNameNotBetween(String value1, String value2) {
            addCriterion("Industry_classification_name not between", value1, value2, "industryClassificationName");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationCodeIsNull() {
            addCriterion("Industry_classification_code is null");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationCodeIsNotNull() {
            addCriterion("Industry_classification_code is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationCodeEqualTo(String value) {
            addCriterion("Industry_classification_code =", value, "industryClassificationCode");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationCodeNotEqualTo(String value) {
            addCriterion("Industry_classification_code <>", value, "industryClassificationCode");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationCodeGreaterThan(String value) {
            addCriterion("Industry_classification_code >", value, "industryClassificationCode");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Industry_classification_code >=", value, "industryClassificationCode");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationCodeLessThan(String value) {
            addCriterion("Industry_classification_code <", value, "industryClassificationCode");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationCodeLessThanOrEqualTo(String value) {
            addCriterion("Industry_classification_code <=", value, "industryClassificationCode");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationCodeLike(String value) {
            addCriterion("Industry_classification_code like", value, "industryClassificationCode");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationCodeNotLike(String value) {
            addCriterion("Industry_classification_code not like", value, "industryClassificationCode");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationCodeIn(List<String> values) {
            addCriterion("Industry_classification_code in", values, "industryClassificationCode");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationCodeNotIn(List<String> values) {
            addCriterion("Industry_classification_code not in", values, "industryClassificationCode");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationCodeBetween(String value1, String value2) {
            addCriterion("Industry_classification_code between", value1, value2, "industryClassificationCode");
            return (Criteria) this;
        }

        public Criteria andIndustryClassificationCodeNotBetween(String value1, String value2) {
            addCriterion("Industry_classification_code not between", value1, value2, "industryClassificationCode");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
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

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andLastLevelIsNull() {
            addCriterion("last_level is null");
            return (Criteria) this;
        }

        public Criteria andLastLevelIsNotNull() {
            addCriterion("last_level is not null");
            return (Criteria) this;
        }

        public Criteria andLastLevelEqualTo(Integer value) {
            addCriterion("last_level =", value, "lastLevel");
            return (Criteria) this;
        }

        public Criteria andLastLevelNotEqualTo(Integer value) {
            addCriterion("last_level <>", value, "lastLevel");
            return (Criteria) this;
        }

        public Criteria andLastLevelGreaterThan(Integer value) {
            addCriterion("last_level >", value, "lastLevel");
            return (Criteria) this;
        }

        public Criteria andLastLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_level >=", value, "lastLevel");
            return (Criteria) this;
        }

        public Criteria andLastLevelLessThan(Integer value) {
            addCriterion("last_level <", value, "lastLevel");
            return (Criteria) this;
        }

        public Criteria andLastLevelLessThanOrEqualTo(Integer value) {
            addCriterion("last_level <=", value, "lastLevel");
            return (Criteria) this;
        }

        public Criteria andLastLevelIn(List<Integer> values) {
            addCriterion("last_level in", values, "lastLevel");
            return (Criteria) this;
        }

        public Criteria andLastLevelNotIn(List<Integer> values) {
            addCriterion("last_level not in", values, "lastLevel");
            return (Criteria) this;
        }

        public Criteria andLastLevelBetween(Integer value1, Integer value2) {
            addCriterion("last_level between", value1, value2, "lastLevel");
            return (Criteria) this;
        }

        public Criteria andLastLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("last_level not between", value1, value2, "lastLevel");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Long value) {
            addCriterion("delete_time =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Long value) {
            addCriterion("delete_time <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Long value) {
            addCriterion("delete_time >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("delete_time >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Long value) {
            addCriterion("delete_time <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Long value) {
            addCriterion("delete_time <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Long> values) {
            addCriterion("delete_time in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Long> values) {
            addCriterion("delete_time not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Long value1, Long value2) {
            addCriterion("delete_time between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Long value1, Long value2) {
            addCriterion("delete_time not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：lm_industry_classification
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * lm_industry_classification
     * Criterion
     * 数据库表：lm_industry_classification
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