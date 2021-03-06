/*
*
* BackUserRoleExample.java
* @author LiuSiGuang
* @date 2018-11-01
*/
package com.lmrd.entity.user;

import java.util.ArrayList;
import java.util.List;

public class BackUserRoleExample {
    /**
     * back_user_role
     */
    protected String orderByClause;

    /**
     * back_user_role
     */
    protected boolean distinct;

    /**
     * back_user_role
     */
    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,back_user_role
     */
    public BackUserRoleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,back_user_role
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,back_user_role
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,back_user_role
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,back_user_role
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,back_user_role
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,back_user_role
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,back_user_role
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,back_user_role
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,back_user_role
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,back_user_role
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * back_user_role
     * GeneratedCriteria
     * 数据库表：back_user_role
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

        public Criteria andBackUserRoleIdIsNull() {
            addCriterion("back_user_role_id is null");
            return (Criteria) this;
        }

        public Criteria andBackUserRoleIdIsNotNull() {
            addCriterion("back_user_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andBackUserRoleIdEqualTo(Long value) {
            addCriterion("back_user_role_id =", value, "backUserRoleId");
            return (Criteria) this;
        }

        public Criteria andBackUserRoleIdNotEqualTo(Long value) {
            addCriterion("back_user_role_id <>", value, "backUserRoleId");
            return (Criteria) this;
        }

        public Criteria andBackUserRoleIdGreaterThan(Long value) {
            addCriterion("back_user_role_id >", value, "backUserRoleId");
            return (Criteria) this;
        }

        public Criteria andBackUserRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("back_user_role_id >=", value, "backUserRoleId");
            return (Criteria) this;
        }

        public Criteria andBackUserRoleIdLessThan(Long value) {
            addCriterion("back_user_role_id <", value, "backUserRoleId");
            return (Criteria) this;
        }

        public Criteria andBackUserRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("back_user_role_id <=", value, "backUserRoleId");
            return (Criteria) this;
        }

        public Criteria andBackUserRoleIdIn(List<Long> values) {
            addCriterion("back_user_role_id in", values, "backUserRoleId");
            return (Criteria) this;
        }

        public Criteria andBackUserRoleIdNotIn(List<Long> values) {
            addCriterion("back_user_role_id not in", values, "backUserRoleId");
            return (Criteria) this;
        }

        public Criteria andBackUserRoleIdBetween(Long value1, Long value2) {
            addCriterion("back_user_role_id between", value1, value2, "backUserRoleId");
            return (Criteria) this;
        }

        public Criteria andBackUserRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("back_user_role_id not between", value1, value2, "backUserRoleId");
            return (Criteria) this;
        }

        public Criteria andBackRoleIdIsNull() {
            addCriterion("back_role_id is null");
            return (Criteria) this;
        }

        public Criteria andBackRoleIdIsNotNull() {
            addCriterion("back_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andBackRoleIdEqualTo(Long value) {
            addCriterion("back_role_id =", value, "backRoleId");
            return (Criteria) this;
        }

        public Criteria andBackRoleIdNotEqualTo(Long value) {
            addCriterion("back_role_id <>", value, "backRoleId");
            return (Criteria) this;
        }

        public Criteria andBackRoleIdGreaterThan(Long value) {
            addCriterion("back_role_id >", value, "backRoleId");
            return (Criteria) this;
        }

        public Criteria andBackRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("back_role_id >=", value, "backRoleId");
            return (Criteria) this;
        }

        public Criteria andBackRoleIdLessThan(Long value) {
            addCriterion("back_role_id <", value, "backRoleId");
            return (Criteria) this;
        }

        public Criteria andBackRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("back_role_id <=", value, "backRoleId");
            return (Criteria) this;
        }

        public Criteria andBackRoleIdIn(List<Long> values) {
            addCriterion("back_role_id in", values, "backRoleId");
            return (Criteria) this;
        }

        public Criteria andBackRoleIdNotIn(List<Long> values) {
            addCriterion("back_role_id not in", values, "backRoleId");
            return (Criteria) this;
        }

        public Criteria andBackRoleIdBetween(Long value1, Long value2) {
            addCriterion("back_role_id between", value1, value2, "backRoleId");
            return (Criteria) this;
        }

        public Criteria andBackRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("back_role_id not between", value1, value2, "backRoleId");
            return (Criteria) this;
        }

        public Criteria andBackUserIdIsNull() {
            addCriterion("back_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBackUserIdIsNotNull() {
            addCriterion("back_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBackUserIdEqualTo(Long value) {
            addCriterion("back_user_id =", value, "backUserId");
            return (Criteria) this;
        }

        public Criteria andBackUserIdNotEqualTo(Long value) {
            addCriterion("back_user_id <>", value, "backUserId");
            return (Criteria) this;
        }

        public Criteria andBackUserIdGreaterThan(Long value) {
            addCriterion("back_user_id >", value, "backUserId");
            return (Criteria) this;
        }

        public Criteria andBackUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("back_user_id >=", value, "backUserId");
            return (Criteria) this;
        }

        public Criteria andBackUserIdLessThan(Long value) {
            addCriterion("back_user_id <", value, "backUserId");
            return (Criteria) this;
        }

        public Criteria andBackUserIdLessThanOrEqualTo(Long value) {
            addCriterion("back_user_id <=", value, "backUserId");
            return (Criteria) this;
        }

        public Criteria andBackUserIdIn(List<Long> values) {
            addCriterion("back_user_id in", values, "backUserId");
            return (Criteria) this;
        }

        public Criteria andBackUserIdNotIn(List<Long> values) {
            addCriterion("back_user_id not in", values, "backUserId");
            return (Criteria) this;
        }

        public Criteria andBackUserIdBetween(Long value1, Long value2) {
            addCriterion("back_user_id between", value1, value2, "backUserId");
            return (Criteria) this;
        }

        public Criteria andBackUserIdNotBetween(Long value1, Long value2) {
            addCriterion("back_user_id not between", value1, value2, "backUserId");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：back_user_role
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * back_user_role
     * Criterion
     * 数据库表：back_user_role
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