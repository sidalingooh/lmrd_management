/*
*
* ImSensitiveWordExample.java
* @author LiuSiGuang
* @date 2018-11-05
*/
package com.lmrd.entity.sensitiveWord;

import java.util.ArrayList;
import java.util.List;

public class ImSensitiveWordExample {
    /**
     * lm_sensitive_word
     */
    protected String orderByClause;

    /**
     * lm_sensitive_word
     */
    protected boolean distinct;

    /**
     * lm_sensitive_word
     */
    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,lm_sensitive_word
     */
    public ImSensitiveWordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,lm_sensitive_word
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,lm_sensitive_word
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,lm_sensitive_word
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,lm_sensitive_word
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,lm_sensitive_word
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,lm_sensitive_word
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,lm_sensitive_word
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,lm_sensitive_word
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,lm_sensitive_word
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,lm_sensitive_word
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * lm_sensitive_word
     * GeneratedCriteria
     * 数据库表：lm_sensitive_word
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

        public Criteria andSensitiveWordIdIsNull() {
            addCriterion("sensitive_word_id is null");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordIdIsNotNull() {
            addCriterion("sensitive_word_id is not null");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordIdEqualTo(Long value) {
            addCriterion("sensitive_word_id =", value, "sensitiveWordId");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordIdNotEqualTo(Long value) {
            addCriterion("sensitive_word_id <>", value, "sensitiveWordId");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordIdGreaterThan(Long value) {
            addCriterion("sensitive_word_id >", value, "sensitiveWordId");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sensitive_word_id >=", value, "sensitiveWordId");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordIdLessThan(Long value) {
            addCriterion("sensitive_word_id <", value, "sensitiveWordId");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordIdLessThanOrEqualTo(Long value) {
            addCriterion("sensitive_word_id <=", value, "sensitiveWordId");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordIdIn(List<Long> values) {
            addCriterion("sensitive_word_id in", values, "sensitiveWordId");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordIdNotIn(List<Long> values) {
            addCriterion("sensitive_word_id not in", values, "sensitiveWordId");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordIdBetween(Long value1, Long value2) {
            addCriterion("sensitive_word_id between", value1, value2, "sensitiveWordId");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordIdNotBetween(Long value1, Long value2) {
            addCriterion("sensitive_word_id not between", value1, value2, "sensitiveWordId");
            return (Criteria) this;
        }

        public Criteria andSensitiveTypeIsNull() {
            addCriterion("sensitive_type is null");
            return (Criteria) this;
        }

        public Criteria andSensitiveTypeIsNotNull() {
            addCriterion("sensitive_type is not null");
            return (Criteria) this;
        }

        public Criteria andSensitiveTypeEqualTo(String value) {
            addCriterion("sensitive_type =", value, "sensitiveType");
            return (Criteria) this;
        }

        public Criteria andSensitiveTypeNotEqualTo(String value) {
            addCriterion("sensitive_type <>", value, "sensitiveType");
            return (Criteria) this;
        }

        public Criteria andSensitiveTypeGreaterThan(String value) {
            addCriterion("sensitive_type >", value, "sensitiveType");
            return (Criteria) this;
        }

        public Criteria andSensitiveTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sensitive_type >=", value, "sensitiveType");
            return (Criteria) this;
        }

        public Criteria andSensitiveTypeLessThan(String value) {
            addCriterion("sensitive_type <", value, "sensitiveType");
            return (Criteria) this;
        }

        public Criteria andSensitiveTypeLessThanOrEqualTo(String value) {
            addCriterion("sensitive_type <=", value, "sensitiveType");
            return (Criteria) this;
        }

        public Criteria andSensitiveTypeLike(String value) {
            addCriterion("sensitive_type like", value, "sensitiveType");
            return (Criteria) this;
        }

        public Criteria andSensitiveTypeNotLike(String value) {
            addCriterion("sensitive_type not like", value, "sensitiveType");
            return (Criteria) this;
        }

        public Criteria andSensitiveTypeIn(List<String> values) {
            addCriterion("sensitive_type in", values, "sensitiveType");
            return (Criteria) this;
        }

        public Criteria andSensitiveTypeNotIn(List<String> values) {
            addCriterion("sensitive_type not in", values, "sensitiveType");
            return (Criteria) this;
        }

        public Criteria andSensitiveTypeBetween(String value1, String value2) {
            addCriterion("sensitive_type between", value1, value2, "sensitiveType");
            return (Criteria) this;
        }

        public Criteria andSensitiveTypeNotBetween(String value1, String value2) {
            addCriterion("sensitive_type not between", value1, value2, "sensitiveType");
            return (Criteria) this;
        }

        public Criteria andSensitiveTopicIsNull() {
            addCriterion("sensitive_topic is null");
            return (Criteria) this;
        }

        public Criteria andSensitiveTopicIsNotNull() {
            addCriterion("sensitive_topic is not null");
            return (Criteria) this;
        }

        public Criteria andSensitiveTopicEqualTo(String value) {
            addCriterion("sensitive_topic =", value, "sensitiveTopic");
            return (Criteria) this;
        }

        public Criteria andSensitiveTopicNotEqualTo(String value) {
            addCriterion("sensitive_topic <>", value, "sensitiveTopic");
            return (Criteria) this;
        }

        public Criteria andSensitiveTopicGreaterThan(String value) {
            addCriterion("sensitive_topic >", value, "sensitiveTopic");
            return (Criteria) this;
        }

        public Criteria andSensitiveTopicGreaterThanOrEqualTo(String value) {
            addCriterion("sensitive_topic >=", value, "sensitiveTopic");
            return (Criteria) this;
        }

        public Criteria andSensitiveTopicLessThan(String value) {
            addCriterion("sensitive_topic <", value, "sensitiveTopic");
            return (Criteria) this;
        }

        public Criteria andSensitiveTopicLessThanOrEqualTo(String value) {
            addCriterion("sensitive_topic <=", value, "sensitiveTopic");
            return (Criteria) this;
        }

        public Criteria andSensitiveTopicLike(String value) {
            addCriterion("sensitive_topic like", value, "sensitiveTopic");
            return (Criteria) this;
        }

        public Criteria andSensitiveTopicNotLike(String value) {
            addCriterion("sensitive_topic not like", value, "sensitiveTopic");
            return (Criteria) this;
        }

        public Criteria andSensitiveTopicIn(List<String> values) {
            addCriterion("sensitive_topic in", values, "sensitiveTopic");
            return (Criteria) this;
        }

        public Criteria andSensitiveTopicNotIn(List<String> values) {
            addCriterion("sensitive_topic not in", values, "sensitiveTopic");
            return (Criteria) this;
        }

        public Criteria andSensitiveTopicBetween(String value1, String value2) {
            addCriterion("sensitive_topic between", value1, value2, "sensitiveTopic");
            return (Criteria) this;
        }

        public Criteria andSensitiveTopicNotBetween(String value1, String value2) {
            addCriterion("sensitive_topic not between", value1, value2, "sensitiveTopic");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordIsNull() {
            addCriterion("sensitive_word is null");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordIsNotNull() {
            addCriterion("sensitive_word is not null");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordEqualTo(String value) {
            addCriterion("sensitive_word =", value, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordNotEqualTo(String value) {
            addCriterion("sensitive_word <>", value, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordGreaterThan(String value) {
            addCriterion("sensitive_word >", value, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordGreaterThanOrEqualTo(String value) {
            addCriterion("sensitive_word >=", value, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordLessThan(String value) {
            addCriterion("sensitive_word <", value, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordLessThanOrEqualTo(String value) {
            addCriterion("sensitive_word <=", value, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordLike(String value) {
            addCriterion("sensitive_word like", value, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordNotLike(String value) {
            addCriterion("sensitive_word not like", value, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordIn(List<String> values) {
            addCriterion("sensitive_word in", values, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordNotIn(List<String> values) {
            addCriterion("sensitive_word not in", values, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordBetween(String value1, String value2) {
            addCriterion("sensitive_word between", value1, value2, "sensitiveWord");
            return (Criteria) this;
        }

        public Criteria andSensitiveWordNotBetween(String value1, String value2) {
            addCriterion("sensitive_word not between", value1, value2, "sensitiveWord");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：lm_sensitive_word
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * lm_sensitive_word
     * Criterion
     * 数据库表：lm_sensitive_word
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