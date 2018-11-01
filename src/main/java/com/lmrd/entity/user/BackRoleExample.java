/*
*
* BackRoleExample.java
* @author LiuSiGuang
* @date 2018-11-01
*/
package com.lmrd.entity.user;

import java.util.ArrayList;
import java.util.List;

public class BackRoleExample {
    /**
     * back_role
     */
    protected String orderByClause;

    /**
     * back_role
     */
    protected boolean distinct;

    /**
     * back_role
     */
    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,back_role
     */
    public BackRoleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,back_role
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,back_role
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,back_role
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,back_role
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,back_role
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,back_role
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,back_role
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,back_role
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,back_role
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,back_role
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * back_role
     * GeneratedCriteria
     * 数据库表：back_role
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

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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

        public Criteria andRoleSetIsNull() {
            addCriterion("role_set is null");
            return (Criteria) this;
        }

        public Criteria andRoleSetIsNotNull() {
            addCriterion("role_set is not null");
            return (Criteria) this;
        }

        public Criteria andRoleSetEqualTo(String value) {
            addCriterion("role_set =", value, "roleSet");
            return (Criteria) this;
        }

        public Criteria andRoleSetNotEqualTo(String value) {
            addCriterion("role_set <>", value, "roleSet");
            return (Criteria) this;
        }

        public Criteria andRoleSetGreaterThan(String value) {
            addCriterion("role_set >", value, "roleSet");
            return (Criteria) this;
        }

        public Criteria andRoleSetGreaterThanOrEqualTo(String value) {
            addCriterion("role_set >=", value, "roleSet");
            return (Criteria) this;
        }

        public Criteria andRoleSetLessThan(String value) {
            addCriterion("role_set <", value, "roleSet");
            return (Criteria) this;
        }

        public Criteria andRoleSetLessThanOrEqualTo(String value) {
            addCriterion("role_set <=", value, "roleSet");
            return (Criteria) this;
        }

        public Criteria andRoleSetLike(String value) {
            addCriterion("role_set like", value, "roleSet");
            return (Criteria) this;
        }

        public Criteria andRoleSetNotLike(String value) {
            addCriterion("role_set not like", value, "roleSet");
            return (Criteria) this;
        }

        public Criteria andRoleSetIn(List<String> values) {
            addCriterion("role_set in", values, "roleSet");
            return (Criteria) this;
        }

        public Criteria andRoleSetNotIn(List<String> values) {
            addCriterion("role_set not in", values, "roleSet");
            return (Criteria) this;
        }

        public Criteria andRoleSetBetween(String value1, String value2) {
            addCriterion("role_set between", value1, value2, "roleSet");
            return (Criteria) this;
        }

        public Criteria andRoleSetNotBetween(String value1, String value2) {
            addCriterion("role_set not between", value1, value2, "roleSet");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：back_role
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * back_role
     * Criterion
     * 数据库表：back_role
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