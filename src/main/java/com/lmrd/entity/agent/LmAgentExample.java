/*
*
* LmAgentExample.java
* @author LiuSiGuang
* @date 2018-11-06
*/
package com.lmrd.entity.agent;

import java.util.ArrayList;
import java.util.List;

public class LmAgentExample {
    /**
     * lm_agent
     */
    protected String orderByClause;

    /**
     * lm_agent
     */
    protected boolean distinct;

    /**
     * lm_agent
     */
    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,lm_agent
     */
    public LmAgentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,lm_agent
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,lm_agent
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,lm_agent
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,lm_agent
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,lm_agent
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,lm_agent
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,lm_agent
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,lm_agent
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,lm_agent
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,lm_agent
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * lm_agent
     * GeneratedCriteria
     * 数据库表：lm_agent
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

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Long value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Long value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Long value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Long value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Long value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Long> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Long> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Long value1, Long value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Long value1, Long value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNull() {
            addCriterion("agent_name is null");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNotNull() {
            addCriterion("agent_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgentNameEqualTo(String value) {
            addCriterion("agent_name =", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotEqualTo(String value) {
            addCriterion("agent_name <>", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThan(String value) {
            addCriterion("agent_name >", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThanOrEqualTo(String value) {
            addCriterion("agent_name >=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThan(String value) {
            addCriterion("agent_name <", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThanOrEqualTo(String value) {
            addCriterion("agent_name <=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLike(String value) {
            addCriterion("agent_name like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotLike(String value) {
            addCriterion("agent_name not like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameIn(List<String> values) {
            addCriterion("agent_name in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotIn(List<String> values) {
            addCriterion("agent_name not in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameBetween(String value1, String value2) {
            addCriterion("agent_name between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotBetween(String value1, String value2) {
            addCriterion("agent_name not between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameIsNull() {
            addCriterion("legal_person_name is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameIsNotNull() {
            addCriterion("legal_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameEqualTo(String value) {
            addCriterion("legal_person_name =", value, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameNotEqualTo(String value) {
            addCriterion("legal_person_name <>", value, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameGreaterThan(String value) {
            addCriterion("legal_person_name >", value, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person_name >=", value, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameLessThan(String value) {
            addCriterion("legal_person_name <", value, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameLessThanOrEqualTo(String value) {
            addCriterion("legal_person_name <=", value, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameLike(String value) {
            addCriterion("legal_person_name like", value, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameNotLike(String value) {
            addCriterion("legal_person_name not like", value, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameIn(List<String> values) {
            addCriterion("legal_person_name in", values, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameNotIn(List<String> values) {
            addCriterion("legal_person_name not in", values, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameBetween(String value1, String value2) {
            addCriterion("legal_person_name between", value1, value2, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNameNotBetween(String value1, String value2) {
            addCriterion("legal_person_name not between", value1, value2, "legalPersonName");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneIsNull() {
            addCriterion("legal_person_phone is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneIsNotNull() {
            addCriterion("legal_person_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneEqualTo(String value) {
            addCriterion("legal_person_phone =", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneNotEqualTo(String value) {
            addCriterion("legal_person_phone <>", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneGreaterThan(String value) {
            addCriterion("legal_person_phone >", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person_phone >=", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneLessThan(String value) {
            addCriterion("legal_person_phone <", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneLessThanOrEqualTo(String value) {
            addCriterion("legal_person_phone <=", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneLike(String value) {
            addCriterion("legal_person_phone like", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneNotLike(String value) {
            addCriterion("legal_person_phone not like", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneIn(List<String> values) {
            addCriterion("legal_person_phone in", values, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneNotIn(List<String> values) {
            addCriterion("legal_person_phone not in", values, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneBetween(String value1, String value2) {
            addCriterion("legal_person_phone between", value1, value2, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneNotBetween(String value1, String value2) {
            addCriterion("legal_person_phone not between", value1, value2, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardIsNull() {
            addCriterion("legal_person_idcard is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardIsNotNull() {
            addCriterion("legal_person_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardEqualTo(String value) {
            addCriterion("legal_person_idcard =", value, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardNotEqualTo(String value) {
            addCriterion("legal_person_idcard <>", value, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardGreaterThan(String value) {
            addCriterion("legal_person_idcard >", value, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person_idcard >=", value, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardLessThan(String value) {
            addCriterion("legal_person_idcard <", value, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardLessThanOrEqualTo(String value) {
            addCriterion("legal_person_idcard <=", value, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardLike(String value) {
            addCriterion("legal_person_idcard like", value, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardNotLike(String value) {
            addCriterion("legal_person_idcard not like", value, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardIn(List<String> values) {
            addCriterion("legal_person_idcard in", values, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardNotIn(List<String> values) {
            addCriterion("legal_person_idcard not in", values, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardBetween(String value1, String value2) {
            addCriterion("legal_person_idcard between", value1, value2, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdcardNotBetween(String value1, String value2) {
            addCriterion("legal_person_idcard not between", value1, value2, "legalPersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificateTypeIsNull() {
            addCriterion("legal_person_certificate_type is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificateTypeIsNotNull() {
            addCriterion("legal_person_certificate_type is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificateTypeEqualTo(Integer value) {
            addCriterion("legal_person_certificate_type =", value, "legalPersonCertificateType");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificateTypeNotEqualTo(Integer value) {
            addCriterion("legal_person_certificate_type <>", value, "legalPersonCertificateType");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificateTypeGreaterThan(Integer value) {
            addCriterion("legal_person_certificate_type >", value, "legalPersonCertificateType");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificateTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("legal_person_certificate_type >=", value, "legalPersonCertificateType");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificateTypeLessThan(Integer value) {
            addCriterion("legal_person_certificate_type <", value, "legalPersonCertificateType");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificateTypeLessThanOrEqualTo(Integer value) {
            addCriterion("legal_person_certificate_type <=", value, "legalPersonCertificateType");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificateTypeIn(List<Integer> values) {
            addCriterion("legal_person_certificate_type in", values, "legalPersonCertificateType");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificateTypeNotIn(List<Integer> values) {
            addCriterion("legal_person_certificate_type not in", values, "legalPersonCertificateType");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificateTypeBetween(Integer value1, Integer value2) {
            addCriterion("legal_person_certificate_type between", value1, value2, "legalPersonCertificateType");
            return (Criteria) this;
        }

        public Criteria andLegalPersonCertificateTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("legal_person_certificate_type not between", value1, value2, "legalPersonCertificateType");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("contact_name is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("contact_name =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("contact_name <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("contact_name >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_name >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("contact_name <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("contact_name <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("contact_name like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("contact_name not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("contact_name in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("contact_name not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("contact_name between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("contact_name not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRobotNumIsNull() {
            addCriterion("robot_num is null");
            return (Criteria) this;
        }

        public Criteria andRobotNumIsNotNull() {
            addCriterion("robot_num is not null");
            return (Criteria) this;
        }

        public Criteria andRobotNumEqualTo(Integer value) {
            addCriterion("robot_num =", value, "robotNum");
            return (Criteria) this;
        }

        public Criteria andRobotNumNotEqualTo(Integer value) {
            addCriterion("robot_num <>", value, "robotNum");
            return (Criteria) this;
        }

        public Criteria andRobotNumGreaterThan(Integer value) {
            addCriterion("robot_num >", value, "robotNum");
            return (Criteria) this;
        }

        public Criteria andRobotNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("robot_num >=", value, "robotNum");
            return (Criteria) this;
        }

        public Criteria andRobotNumLessThan(Integer value) {
            addCriterion("robot_num <", value, "robotNum");
            return (Criteria) this;
        }

        public Criteria andRobotNumLessThanOrEqualTo(Integer value) {
            addCriterion("robot_num <=", value, "robotNum");
            return (Criteria) this;
        }

        public Criteria andRobotNumIn(List<Integer> values) {
            addCriterion("robot_num in", values, "robotNum");
            return (Criteria) this;
        }

        public Criteria andRobotNumNotIn(List<Integer> values) {
            addCriterion("robot_num not in", values, "robotNum");
            return (Criteria) this;
        }

        public Criteria andRobotNumBetween(Integer value1, Integer value2) {
            addCriterion("robot_num between", value1, value2, "robotNum");
            return (Criteria) this;
        }

        public Criteria andRobotNumNotBetween(Integer value1, Integer value2) {
            addCriterion("robot_num not between", value1, value2, "robotNum");
            return (Criteria) this;
        }

        public Criteria andOperateEndIsNull() {
            addCriterion("operate_end is null");
            return (Criteria) this;
        }

        public Criteria andOperateEndIsNotNull() {
            addCriterion("operate_end is not null");
            return (Criteria) this;
        }

        public Criteria andOperateEndEqualTo(Long value) {
            addCriterion("operate_end =", value, "operateEnd");
            return (Criteria) this;
        }

        public Criteria andOperateEndNotEqualTo(Long value) {
            addCriterion("operate_end <>", value, "operateEnd");
            return (Criteria) this;
        }

        public Criteria andOperateEndGreaterThan(Long value) {
            addCriterion("operate_end >", value, "operateEnd");
            return (Criteria) this;
        }

        public Criteria andOperateEndGreaterThanOrEqualTo(Long value) {
            addCriterion("operate_end >=", value, "operateEnd");
            return (Criteria) this;
        }

        public Criteria andOperateEndLessThan(Long value) {
            addCriterion("operate_end <", value, "operateEnd");
            return (Criteria) this;
        }

        public Criteria andOperateEndLessThanOrEqualTo(Long value) {
            addCriterion("operate_end <=", value, "operateEnd");
            return (Criteria) this;
        }

        public Criteria andOperateEndIn(List<Long> values) {
            addCriterion("operate_end in", values, "operateEnd");
            return (Criteria) this;
        }

        public Criteria andOperateEndNotIn(List<Long> values) {
            addCriterion("operate_end not in", values, "operateEnd");
            return (Criteria) this;
        }

        public Criteria andOperateEndBetween(Long value1, Long value2) {
            addCriterion("operate_end between", value1, value2, "operateEnd");
            return (Criteria) this;
        }

        public Criteria andOperateEndNotBetween(Long value1, Long value2) {
            addCriterion("operate_end not between", value1, value2, "operateEnd");
            return (Criteria) this;
        }

        public Criteria andBizLicenseNoIsNull() {
            addCriterion("biz_license_no is null");
            return (Criteria) this;
        }

        public Criteria andBizLicenseNoIsNotNull() {
            addCriterion("biz_license_no is not null");
            return (Criteria) this;
        }

        public Criteria andBizLicenseNoEqualTo(String value) {
            addCriterion("biz_license_no =", value, "bizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBizLicenseNoNotEqualTo(String value) {
            addCriterion("biz_license_no <>", value, "bizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBizLicenseNoGreaterThan(String value) {
            addCriterion("biz_license_no >", value, "bizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBizLicenseNoGreaterThanOrEqualTo(String value) {
            addCriterion("biz_license_no >=", value, "bizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBizLicenseNoLessThan(String value) {
            addCriterion("biz_license_no <", value, "bizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBizLicenseNoLessThanOrEqualTo(String value) {
            addCriterion("biz_license_no <=", value, "bizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBizLicenseNoLike(String value) {
            addCriterion("biz_license_no like", value, "bizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBizLicenseNoNotLike(String value) {
            addCriterion("biz_license_no not like", value, "bizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBizLicenseNoIn(List<String> values) {
            addCriterion("biz_license_no in", values, "bizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBizLicenseNoNotIn(List<String> values) {
            addCriterion("biz_license_no not in", values, "bizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBizLicenseNoBetween(String value1, String value2) {
            addCriterion("biz_license_no between", value1, value2, "bizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBizLicenseNoNotBetween(String value1, String value2) {
            addCriterion("biz_license_no not between", value1, value2, "bizLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlIsNull() {
            addCriterion("business_license_url is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlIsNotNull() {
            addCriterion("business_license_url is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlEqualTo(String value) {
            addCriterion("business_license_url =", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlNotEqualTo(String value) {
            addCriterion("business_license_url <>", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlGreaterThan(String value) {
            addCriterion("business_license_url >", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlGreaterThanOrEqualTo(String value) {
            addCriterion("business_license_url >=", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlLessThan(String value) {
            addCriterion("business_license_url <", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlLessThanOrEqualTo(String value) {
            addCriterion("business_license_url <=", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlLike(String value) {
            addCriterion("business_license_url like", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlNotLike(String value) {
            addCriterion("business_license_url not like", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlIn(List<String> values) {
            addCriterion("business_license_url in", values, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlNotIn(List<String> values) {
            addCriterion("business_license_url not in", values, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlBetween(String value1, String value2) {
            addCriterion("business_license_url between", value1, value2, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlNotBetween(String value1, String value2) {
            addCriterion("business_license_url not between", value1, value2, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdIsNull() {
            addCriterion("industry_type_id is null");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdIsNotNull() {
            addCriterion("industry_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdEqualTo(Long value) {
            addCriterion("industry_type_id =", value, "industryTypeId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdNotEqualTo(Long value) {
            addCriterion("industry_type_id <>", value, "industryTypeId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdGreaterThan(Long value) {
            addCriterion("industry_type_id >", value, "industryTypeId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("industry_type_id >=", value, "industryTypeId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdLessThan(Long value) {
            addCriterion("industry_type_id <", value, "industryTypeId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("industry_type_id <=", value, "industryTypeId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdIn(List<Long> values) {
            addCriterion("industry_type_id in", values, "industryTypeId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdNotIn(List<Long> values) {
            addCriterion("industry_type_id not in", values, "industryTypeId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdBetween(Long value1, Long value2) {
            addCriterion("industry_type_id between", value1, value2, "industryTypeId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("industry_type_id not between", value1, value2, "industryTypeId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNameIsNull() {
            addCriterion("industry_type_name is null");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNameIsNotNull() {
            addCriterion("industry_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNameEqualTo(String value) {
            addCriterion("industry_type_name =", value, "industryTypeName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNameNotEqualTo(String value) {
            addCriterion("industry_type_name <>", value, "industryTypeName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNameGreaterThan(String value) {
            addCriterion("industry_type_name >", value, "industryTypeName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("industry_type_name >=", value, "industryTypeName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNameLessThan(String value) {
            addCriterion("industry_type_name <", value, "industryTypeName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNameLessThanOrEqualTo(String value) {
            addCriterion("industry_type_name <=", value, "industryTypeName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNameLike(String value) {
            addCriterion("industry_type_name like", value, "industryTypeName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNameNotLike(String value) {
            addCriterion("industry_type_name not like", value, "industryTypeName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNameIn(List<String> values) {
            addCriterion("industry_type_name in", values, "industryTypeName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNameNotIn(List<String> values) {
            addCriterion("industry_type_name not in", values, "industryTypeName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNameBetween(String value1, String value2) {
            addCriterion("industry_type_name between", value1, value2, "industryTypeName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNameNotBetween(String value1, String value2) {
            addCriterion("industry_type_name not between", value1, value2, "industryTypeName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoIdIsNull() {
            addCriterion("industry_type_two_id is null");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoIdIsNotNull() {
            addCriterion("industry_type_two_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoIdEqualTo(Long value) {
            addCriterion("industry_type_two_id =", value, "industryTypeTwoId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoIdNotEqualTo(Long value) {
            addCriterion("industry_type_two_id <>", value, "industryTypeTwoId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoIdGreaterThan(Long value) {
            addCriterion("industry_type_two_id >", value, "industryTypeTwoId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("industry_type_two_id >=", value, "industryTypeTwoId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoIdLessThan(Long value) {
            addCriterion("industry_type_two_id <", value, "industryTypeTwoId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoIdLessThanOrEqualTo(Long value) {
            addCriterion("industry_type_two_id <=", value, "industryTypeTwoId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoIdIn(List<Long> values) {
            addCriterion("industry_type_two_id in", values, "industryTypeTwoId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoIdNotIn(List<Long> values) {
            addCriterion("industry_type_two_id not in", values, "industryTypeTwoId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoIdBetween(Long value1, Long value2) {
            addCriterion("industry_type_two_id between", value1, value2, "industryTypeTwoId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoIdNotBetween(Long value1, Long value2) {
            addCriterion("industry_type_two_id not between", value1, value2, "industryTypeTwoId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoNameIsNull() {
            addCriterion("industry_type_two_name is null");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoNameIsNotNull() {
            addCriterion("industry_type_two_name is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoNameEqualTo(String value) {
            addCriterion("industry_type_two_name =", value, "industryTypeTwoName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoNameNotEqualTo(String value) {
            addCriterion("industry_type_two_name <>", value, "industryTypeTwoName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoNameGreaterThan(String value) {
            addCriterion("industry_type_two_name >", value, "industryTypeTwoName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoNameGreaterThanOrEqualTo(String value) {
            addCriterion("industry_type_two_name >=", value, "industryTypeTwoName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoNameLessThan(String value) {
            addCriterion("industry_type_two_name <", value, "industryTypeTwoName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoNameLessThanOrEqualTo(String value) {
            addCriterion("industry_type_two_name <=", value, "industryTypeTwoName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoNameLike(String value) {
            addCriterion("industry_type_two_name like", value, "industryTypeTwoName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoNameNotLike(String value) {
            addCriterion("industry_type_two_name not like", value, "industryTypeTwoName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoNameIn(List<String> values) {
            addCriterion("industry_type_two_name in", values, "industryTypeTwoName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoNameNotIn(List<String> values) {
            addCriterion("industry_type_two_name not in", values, "industryTypeTwoName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoNameBetween(String value1, String value2) {
            addCriterion("industry_type_two_name between", value1, value2, "industryTypeTwoName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeTwoNameNotBetween(String value1, String value2) {
            addCriterion("industry_type_two_name not between", value1, value2, "industryTypeTwoName");
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

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(String value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(String value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(String value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(String value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(String value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(String value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLike(String value) {
            addCriterion("province_id like", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotLike(String value) {
            addCriterion("province_id not like", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<String> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<String> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(String value1, String value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(String value1, String value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("province_name is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("province_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("province_name =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("province_name <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("province_name >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("province_name >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("province_name <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("province_name <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("province_name like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("province_name not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("province_name in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("province_name not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("province_name between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("province_name not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(String value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(String value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(String value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(String value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(String value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLike(String value) {
            addCriterion("city_id like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotLike(String value) {
            addCriterion("city_id not like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<String> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<String> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(String value1, String value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(String value1, String value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNull() {
            addCriterion("district_id is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNotNull() {
            addCriterion("district_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdEqualTo(String value) {
            addCriterion("district_id =", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotEqualTo(String value) {
            addCriterion("district_id <>", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThan(String value) {
            addCriterion("district_id >", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThanOrEqualTo(String value) {
            addCriterion("district_id >=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThan(String value) {
            addCriterion("district_id <", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThanOrEqualTo(String value) {
            addCriterion("district_id <=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLike(String value) {
            addCriterion("district_id like", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotLike(String value) {
            addCriterion("district_id not like", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIn(List<String> values) {
            addCriterion("district_id in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotIn(List<String> values) {
            addCriterion("district_id not in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdBetween(String value1, String value2) {
            addCriterion("district_id between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotBetween(String value1, String value2) {
            addCriterion("district_id not between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictNameIsNull() {
            addCriterion("district_name is null");
            return (Criteria) this;
        }

        public Criteria andDistrictNameIsNotNull() {
            addCriterion("district_name is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictNameEqualTo(String value) {
            addCriterion("district_name =", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotEqualTo(String value) {
            addCriterion("district_name <>", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameGreaterThan(String value) {
            addCriterion("district_name >", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameGreaterThanOrEqualTo(String value) {
            addCriterion("district_name >=", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameLessThan(String value) {
            addCriterion("district_name <", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameLessThanOrEqualTo(String value) {
            addCriterion("district_name <=", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameLike(String value) {
            addCriterion("district_name like", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotLike(String value) {
            addCriterion("district_name not like", value, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameIn(List<String> values) {
            addCriterion("district_name in", values, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotIn(List<String> values) {
            addCriterion("district_name not in", values, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameBetween(String value1, String value2) {
            addCriterion("district_name between", value1, value2, "districtName");
            return (Criteria) this;
        }

        public Criteria andDistrictNameNotBetween(String value1, String value2) {
            addCriterion("district_name not between", value1, value2, "districtName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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
     * 数据库表：lm_agent
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * lm_agent
     * Criterion
     * 数据库表：lm_agent
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