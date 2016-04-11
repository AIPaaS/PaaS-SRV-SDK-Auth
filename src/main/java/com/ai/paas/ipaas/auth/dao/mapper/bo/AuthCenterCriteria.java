package com.ai.paas.ipaas.auth.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class AuthCenterCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public AuthCenterCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

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

        public Criteria andAuthIdIsNull() {
            addCriterion("AUTH_ID is null");
            return (Criteria) this;
        }

        public Criteria andAuthIdIsNotNull() {
            addCriterion("AUTH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthIdEqualTo(Long value) {
            addCriterion("AUTH_ID =", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotEqualTo(Long value) {
            addCriterion("AUTH_ID <>", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdGreaterThan(Long value) {
            addCriterion("AUTH_ID >", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdGreaterThanOrEqualTo(Long value) {
            addCriterion("AUTH_ID >=", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdLessThan(Long value) {
            addCriterion("AUTH_ID <", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdLessThanOrEqualTo(Long value) {
            addCriterion("AUTH_ID <=", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdIn(List<Long> values) {
            addCriterion("AUTH_ID in", values, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotIn(List<Long> values) {
            addCriterion("AUTH_ID not in", values, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdBetween(Long value1, Long value2) {
            addCriterion("AUTH_ID between", value1, value2, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotBetween(Long value1, Long value2) {
            addCriterion("AUTH_ID not between", value1, value2, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthPidIsNull() {
            addCriterion("AUTH_PID is null");
            return (Criteria) this;
        }

        public Criteria andAuthPidIsNotNull() {
            addCriterion("AUTH_PID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthPidEqualTo(String value) {
            addCriterion("AUTH_PID =", value, "authPid");
            return (Criteria) this;
        }

        public Criteria andAuthPidNotEqualTo(String value) {
            addCriterion("AUTH_PID <>", value, "authPid");
            return (Criteria) this;
        }

        public Criteria andAuthPidGreaterThan(String value) {
            addCriterion("AUTH_PID >", value, "authPid");
            return (Criteria) this;
        }

        public Criteria andAuthPidGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_PID >=", value, "authPid");
            return (Criteria) this;
        }

        public Criteria andAuthPidLessThan(String value) {
            addCriterion("AUTH_PID <", value, "authPid");
            return (Criteria) this;
        }

        public Criteria andAuthPidLessThanOrEqualTo(String value) {
            addCriterion("AUTH_PID <=", value, "authPid");
            return (Criteria) this;
        }

        public Criteria andAuthPidLike(String value) {
            addCriterion("AUTH_PID like", value, "authPid");
            return (Criteria) this;
        }

        public Criteria andAuthPidNotLike(String value) {
            addCriterion("AUTH_PID not like", value, "authPid");
            return (Criteria) this;
        }

        public Criteria andAuthPidIn(List<String> values) {
            addCriterion("AUTH_PID in", values, "authPid");
            return (Criteria) this;
        }

        public Criteria andAuthPidNotIn(List<String> values) {
            addCriterion("AUTH_PID not in", values, "authPid");
            return (Criteria) this;
        }

        public Criteria andAuthPidBetween(String value1, String value2) {
            addCriterion("AUTH_PID between", value1, value2, "authPid");
            return (Criteria) this;
        }

        public Criteria andAuthPidNotBetween(String value1, String value2) {
            addCriterion("AUTH_PID not between", value1, value2, "authPid");
            return (Criteria) this;
        }

        public Criteria andAuthPasswordIsNull() {
            addCriterion("AUTH_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andAuthPasswordIsNotNull() {
            addCriterion("AUTH_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andAuthPasswordEqualTo(String value) {
            addCriterion("AUTH_PASSWORD =", value, "authPassword");
            return (Criteria) this;
        }

        public Criteria andAuthPasswordNotEqualTo(String value) {
            addCriterion("AUTH_PASSWORD <>", value, "authPassword");
            return (Criteria) this;
        }

        public Criteria andAuthPasswordGreaterThan(String value) {
            addCriterion("AUTH_PASSWORD >", value, "authPassword");
            return (Criteria) this;
        }

        public Criteria andAuthPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_PASSWORD >=", value, "authPassword");
            return (Criteria) this;
        }

        public Criteria andAuthPasswordLessThan(String value) {
            addCriterion("AUTH_PASSWORD <", value, "authPassword");
            return (Criteria) this;
        }

        public Criteria andAuthPasswordLessThanOrEqualTo(String value) {
            addCriterion("AUTH_PASSWORD <=", value, "authPassword");
            return (Criteria) this;
        }

        public Criteria andAuthPasswordLike(String value) {
            addCriterion("AUTH_PASSWORD like", value, "authPassword");
            return (Criteria) this;
        }

        public Criteria andAuthPasswordNotLike(String value) {
            addCriterion("AUTH_PASSWORD not like", value, "authPassword");
            return (Criteria) this;
        }

        public Criteria andAuthPasswordIn(List<String> values) {
            addCriterion("AUTH_PASSWORD in", values, "authPassword");
            return (Criteria) this;
        }

        public Criteria andAuthPasswordNotIn(List<String> values) {
            addCriterion("AUTH_PASSWORD not in", values, "authPassword");
            return (Criteria) this;
        }

        public Criteria andAuthPasswordBetween(String value1, String value2) {
            addCriterion("AUTH_PASSWORD between", value1, value2, "authPassword");
            return (Criteria) this;
        }

        public Criteria andAuthPasswordNotBetween(String value1, String value2) {
            addCriterion("AUTH_PASSWORD not between", value1, value2, "authPassword");
            return (Criteria) this;
        }

        public Criteria andAuthSourceIsNull() {
            addCriterion("AUTH_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andAuthSourceIsNotNull() {
            addCriterion("AUTH_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andAuthSourceEqualTo(String value) {
            addCriterion("AUTH_SOURCE =", value, "authSource");
            return (Criteria) this;
        }

        public Criteria andAuthSourceNotEqualTo(String value) {
            addCriterion("AUTH_SOURCE <>", value, "authSource");
            return (Criteria) this;
        }

        public Criteria andAuthSourceGreaterThan(String value) {
            addCriterion("AUTH_SOURCE >", value, "authSource");
            return (Criteria) this;
        }

        public Criteria andAuthSourceGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_SOURCE >=", value, "authSource");
            return (Criteria) this;
        }

        public Criteria andAuthSourceLessThan(String value) {
            addCriterion("AUTH_SOURCE <", value, "authSource");
            return (Criteria) this;
        }

        public Criteria andAuthSourceLessThanOrEqualTo(String value) {
            addCriterion("AUTH_SOURCE <=", value, "authSource");
            return (Criteria) this;
        }

        public Criteria andAuthSourceLike(String value) {
            addCriterion("AUTH_SOURCE like", value, "authSource");
            return (Criteria) this;
        }

        public Criteria andAuthSourceNotLike(String value) {
            addCriterion("AUTH_SOURCE not like", value, "authSource");
            return (Criteria) this;
        }

        public Criteria andAuthSourceIn(List<String> values) {
            addCriterion("AUTH_SOURCE in", values, "authSource");
            return (Criteria) this;
        }

        public Criteria andAuthSourceNotIn(List<String> values) {
            addCriterion("AUTH_SOURCE not in", values, "authSource");
            return (Criteria) this;
        }

        public Criteria andAuthSourceBetween(String value1, String value2) {
            addCriterion("AUTH_SOURCE between", value1, value2, "authSource");
            return (Criteria) this;
        }

        public Criteria andAuthSourceNotBetween(String value1, String value2) {
            addCriterion("AUTH_SOURCE not between", value1, value2, "authSource");
            return (Criteria) this;
        }

        public Criteria andAuthUserIdIsNull() {
            addCriterion("AUTH_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andAuthUserIdIsNotNull() {
            addCriterion("AUTH_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthUserIdEqualTo(String value) {
            addCriterion("AUTH_USER_ID =", value, "authUserId");
            return (Criteria) this;
        }

        public Criteria andAuthUserIdNotEqualTo(String value) {
            addCriterion("AUTH_USER_ID <>", value, "authUserId");
            return (Criteria) this;
        }

        public Criteria andAuthUserIdGreaterThan(String value) {
            addCriterion("AUTH_USER_ID >", value, "authUserId");
            return (Criteria) this;
        }

        public Criteria andAuthUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_USER_ID >=", value, "authUserId");
            return (Criteria) this;
        }

        public Criteria andAuthUserIdLessThan(String value) {
            addCriterion("AUTH_USER_ID <", value, "authUserId");
            return (Criteria) this;
        }

        public Criteria andAuthUserIdLessThanOrEqualTo(String value) {
            addCriterion("AUTH_USER_ID <=", value, "authUserId");
            return (Criteria) this;
        }

        public Criteria andAuthUserIdLike(String value) {
            addCriterion("AUTH_USER_ID like", value, "authUserId");
            return (Criteria) this;
        }

        public Criteria andAuthUserIdNotLike(String value) {
            addCriterion("AUTH_USER_ID not like", value, "authUserId");
            return (Criteria) this;
        }

        public Criteria andAuthUserIdIn(List<String> values) {
            addCriterion("AUTH_USER_ID in", values, "authUserId");
            return (Criteria) this;
        }

        public Criteria andAuthUserIdNotIn(List<String> values) {
            addCriterion("AUTH_USER_ID not in", values, "authUserId");
            return (Criteria) this;
        }

        public Criteria andAuthUserIdBetween(String value1, String value2) {
            addCriterion("AUTH_USER_ID between", value1, value2, "authUserId");
            return (Criteria) this;
        }

        public Criteria andAuthUserIdNotBetween(String value1, String value2) {
            addCriterion("AUTH_USER_ID not between", value1, value2, "authUserId");
            return (Criteria) this;
        }

        public Criteria andAuthUserNameIsNull() {
            addCriterion("AUTH_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAuthUserNameIsNotNull() {
            addCriterion("AUTH_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAuthUserNameEqualTo(String value) {
            addCriterion("AUTH_USER_NAME =", value, "authUserName");
            return (Criteria) this;
        }

        public Criteria andAuthUserNameNotEqualTo(String value) {
            addCriterion("AUTH_USER_NAME <>", value, "authUserName");
            return (Criteria) this;
        }

        public Criteria andAuthUserNameGreaterThan(String value) {
            addCriterion("AUTH_USER_NAME >", value, "authUserName");
            return (Criteria) this;
        }

        public Criteria andAuthUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_USER_NAME >=", value, "authUserName");
            return (Criteria) this;
        }

        public Criteria andAuthUserNameLessThan(String value) {
            addCriterion("AUTH_USER_NAME <", value, "authUserName");
            return (Criteria) this;
        }

        public Criteria andAuthUserNameLessThanOrEqualTo(String value) {
            addCriterion("AUTH_USER_NAME <=", value, "authUserName");
            return (Criteria) this;
        }

        public Criteria andAuthUserNameLike(String value) {
            addCriterion("AUTH_USER_NAME like", value, "authUserName");
            return (Criteria) this;
        }

        public Criteria andAuthUserNameNotLike(String value) {
            addCriterion("AUTH_USER_NAME not like", value, "authUserName");
            return (Criteria) this;
        }

        public Criteria andAuthUserNameIn(List<String> values) {
            addCriterion("AUTH_USER_NAME in", values, "authUserName");
            return (Criteria) this;
        }

        public Criteria andAuthUserNameNotIn(List<String> values) {
            addCriterion("AUTH_USER_NAME not in", values, "authUserName");
            return (Criteria) this;
        }

        public Criteria andAuthUserNameBetween(String value1, String value2) {
            addCriterion("AUTH_USER_NAME between", value1, value2, "authUserName");
            return (Criteria) this;
        }

        public Criteria andAuthUserNameNotBetween(String value1, String value2) {
            addCriterion("AUTH_USER_NAME not between", value1, value2, "authUserName");
            return (Criteria) this;
        }

        public Criteria andAuthParamIsNull() {
            addCriterion("AUTH_PARAM is null");
            return (Criteria) this;
        }

        public Criteria andAuthParamIsNotNull() {
            addCriterion("AUTH_PARAM is not null");
            return (Criteria) this;
        }

        public Criteria andAuthParamEqualTo(String value) {
            addCriterion("AUTH_PARAM =", value, "authParam");
            return (Criteria) this;
        }

        public Criteria andAuthParamNotEqualTo(String value) {
            addCriterion("AUTH_PARAM <>", value, "authParam");
            return (Criteria) this;
        }

        public Criteria andAuthParamGreaterThan(String value) {
            addCriterion("AUTH_PARAM >", value, "authParam");
            return (Criteria) this;
        }

        public Criteria andAuthParamGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_PARAM >=", value, "authParam");
            return (Criteria) this;
        }

        public Criteria andAuthParamLessThan(String value) {
            addCriterion("AUTH_PARAM <", value, "authParam");
            return (Criteria) this;
        }

        public Criteria andAuthParamLessThanOrEqualTo(String value) {
            addCriterion("AUTH_PARAM <=", value, "authParam");
            return (Criteria) this;
        }

        public Criteria andAuthParamLike(String value) {
            addCriterion("AUTH_PARAM like", value, "authParam");
            return (Criteria) this;
        }

        public Criteria andAuthParamNotLike(String value) {
            addCriterion("AUTH_PARAM not like", value, "authParam");
            return (Criteria) this;
        }

        public Criteria andAuthParamIn(List<String> values) {
            addCriterion("AUTH_PARAM in", values, "authParam");
            return (Criteria) this;
        }

        public Criteria andAuthParamNotIn(List<String> values) {
            addCriterion("AUTH_PARAM not in", values, "authParam");
            return (Criteria) this;
        }

        public Criteria andAuthParamBetween(String value1, String value2) {
            addCriterion("AUTH_PARAM between", value1, value2, "authParam");
            return (Criteria) this;
        }

        public Criteria andAuthParamNotBetween(String value1, String value2) {
            addCriterion("AUTH_PARAM not between", value1, value2, "authParam");
            return (Criteria) this;
        }

        public Criteria andAuthStateIsNull() {
            addCriterion("AUTH_STATE is null");
            return (Criteria) this;
        }

        public Criteria andAuthStateIsNotNull() {
            addCriterion("AUTH_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andAuthStateEqualTo(String value) {
            addCriterion("AUTH_STATE =", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateNotEqualTo(String value) {
            addCriterion("AUTH_STATE <>", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateGreaterThan(String value) {
            addCriterion("AUTH_STATE >", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_STATE >=", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateLessThan(String value) {
            addCriterion("AUTH_STATE <", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateLessThanOrEqualTo(String value) {
            addCriterion("AUTH_STATE <=", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateLike(String value) {
            addCriterion("AUTH_STATE like", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateNotLike(String value) {
            addCriterion("AUTH_STATE not like", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateIn(List<String> values) {
            addCriterion("AUTH_STATE in", values, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateNotIn(List<String> values) {
            addCriterion("AUTH_STATE not in", values, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateBetween(String value1, String value2) {
            addCriterion("AUTH_STATE between", value1, value2, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateNotBetween(String value1, String value2) {
            addCriterion("AUTH_STATE not between", value1, value2, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthRegisterTimeIsNull() {
            addCriterion("AUTH_REGISTER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAuthRegisterTimeIsNotNull() {
            addCriterion("AUTH_REGISTER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAuthRegisterTimeEqualTo(Timestamp value) {
            addCriterion("AUTH_REGISTER_TIME =", value, "authRegisterTime");
            return (Criteria) this;
        }

        public Criteria andAuthRegisterTimeNotEqualTo(Timestamp value) {
            addCriterion("AUTH_REGISTER_TIME <>", value, "authRegisterTime");
            return (Criteria) this;
        }

        public Criteria andAuthRegisterTimeGreaterThan(Timestamp value) {
            addCriterion("AUTH_REGISTER_TIME >", value, "authRegisterTime");
            return (Criteria) this;
        }

        public Criteria andAuthRegisterTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("AUTH_REGISTER_TIME >=", value, "authRegisterTime");
            return (Criteria) this;
        }

        public Criteria andAuthRegisterTimeLessThan(Timestamp value) {
            addCriterion("AUTH_REGISTER_TIME <", value, "authRegisterTime");
            return (Criteria) this;
        }

        public Criteria andAuthRegisterTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("AUTH_REGISTER_TIME <=", value, "authRegisterTime");
            return (Criteria) this;
        }

        public Criteria andAuthRegisterTimeIn(List<Timestamp> values) {
            addCriterion("AUTH_REGISTER_TIME in", values, "authRegisterTime");
            return (Criteria) this;
        }

        public Criteria andAuthRegisterTimeNotIn(List<Timestamp> values) {
            addCriterion("AUTH_REGISTER_TIME not in", values, "authRegisterTime");
            return (Criteria) this;
        }

        public Criteria andAuthRegisterTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("AUTH_REGISTER_TIME between", value1, value2, "authRegisterTime");
            return (Criteria) this;
        }

        public Criteria andAuthRegisterTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("AUTH_REGISTER_TIME not between", value1, value2, "authRegisterTime");
            return (Criteria) this;
        }

        public Criteria andAuthActiveTimeIsNull() {
            addCriterion("AUTH_ACTIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAuthActiveTimeIsNotNull() {
            addCriterion("AUTH_ACTIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAuthActiveTimeEqualTo(Timestamp value) {
            addCriterion("AUTH_ACTIVE_TIME =", value, "authActiveTime");
            return (Criteria) this;
        }

        public Criteria andAuthActiveTimeNotEqualTo(Timestamp value) {
            addCriterion("AUTH_ACTIVE_TIME <>", value, "authActiveTime");
            return (Criteria) this;
        }

        public Criteria andAuthActiveTimeGreaterThan(Timestamp value) {
            addCriterion("AUTH_ACTIVE_TIME >", value, "authActiveTime");
            return (Criteria) this;
        }

        public Criteria andAuthActiveTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("AUTH_ACTIVE_TIME >=", value, "authActiveTime");
            return (Criteria) this;
        }

        public Criteria andAuthActiveTimeLessThan(Timestamp value) {
            addCriterion("AUTH_ACTIVE_TIME <", value, "authActiveTime");
            return (Criteria) this;
        }

        public Criteria andAuthActiveTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("AUTH_ACTIVE_TIME <=", value, "authActiveTime");
            return (Criteria) this;
        }

        public Criteria andAuthActiveTimeIn(List<Timestamp> values) {
            addCriterion("AUTH_ACTIVE_TIME in", values, "authActiveTime");
            return (Criteria) this;
        }

        public Criteria andAuthActiveTimeNotIn(List<Timestamp> values) {
            addCriterion("AUTH_ACTIVE_TIME not in", values, "authActiveTime");
            return (Criteria) this;
        }

        public Criteria andAuthActiveTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("AUTH_ACTIVE_TIME between", value1, value2, "authActiveTime");
            return (Criteria) this;
        }

        public Criteria andAuthActiveTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("AUTH_ACTIVE_TIME not between", value1, value2, "authActiveTime");
            return (Criteria) this;
        }

        public Criteria andAuthCancelTimeIsNull() {
            addCriterion("AUTH_CANCEL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAuthCancelTimeIsNotNull() {
            addCriterion("AUTH_CANCEL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAuthCancelTimeEqualTo(Timestamp value) {
            addCriterion("AUTH_CANCEL_TIME =", value, "authCancelTime");
            return (Criteria) this;
        }

        public Criteria andAuthCancelTimeNotEqualTo(Timestamp value) {
            addCriterion("AUTH_CANCEL_TIME <>", value, "authCancelTime");
            return (Criteria) this;
        }

        public Criteria andAuthCancelTimeGreaterThan(Timestamp value) {
            addCriterion("AUTH_CANCEL_TIME >", value, "authCancelTime");
            return (Criteria) this;
        }

        public Criteria andAuthCancelTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("AUTH_CANCEL_TIME >=", value, "authCancelTime");
            return (Criteria) this;
        }

        public Criteria andAuthCancelTimeLessThan(Timestamp value) {
            addCriterion("AUTH_CANCEL_TIME <", value, "authCancelTime");
            return (Criteria) this;
        }

        public Criteria andAuthCancelTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("AUTH_CANCEL_TIME <=", value, "authCancelTime");
            return (Criteria) this;
        }

        public Criteria andAuthCancelTimeIn(List<Timestamp> values) {
            addCriterion("AUTH_CANCEL_TIME in", values, "authCancelTime");
            return (Criteria) this;
        }

        public Criteria andAuthCancelTimeNotIn(List<Timestamp> values) {
            addCriterion("AUTH_CANCEL_TIME not in", values, "authCancelTime");
            return (Criteria) this;
        }

        public Criteria andAuthCancelTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("AUTH_CANCEL_TIME between", value1, value2, "authCancelTime");
            return (Criteria) this;
        }

        public Criteria andAuthCancelTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("AUTH_CANCEL_TIME not between", value1, value2, "authCancelTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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