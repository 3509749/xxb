package com.sc.xxb.business.yw.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XxbUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XxbUserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Short value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Short value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Short value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Short value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Short value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Short> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Short> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Short value1, Short value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Short value1, Short value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("ROLE_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("ROLE_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("ROLE_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("ROLE_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("ROLE_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("ROLE_ID like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("ROLE_ID not like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("ROLE_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("ROLE_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("ROLE_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("ROLE_ID not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("NICK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("NICK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("NICK_NAME =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("NICK_NAME <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("NICK_NAME >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("NICK_NAME >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("NICK_NAME <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("NICK_NAME <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("NICK_NAME like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("NICK_NAME not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("NICK_NAME in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("NICK_NAME not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("NICK_NAME between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("NICK_NAME not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("PROVINCE =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("PROVINCE <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("PROVINCE >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("PROVINCE <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("PROVINCE like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("PROVINCE not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("PROVINCE in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("PROVINCE not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("PROVINCE between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("PROVINCE not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("COUNTY is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("COUNTY is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("COUNTY =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("COUNTY <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("COUNTY >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTY >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("COUNTY <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("COUNTY <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("COUNTY like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("COUNTY not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("COUNTY in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("COUNTY not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("COUNTY between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("COUNTY not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andProfileIsNull() {
            addCriterion("PROFILE is null");
            return (Criteria) this;
        }

        public Criteria andProfileIsNotNull() {
            addCriterion("PROFILE is not null");
            return (Criteria) this;
        }

        public Criteria andProfileEqualTo(String value) {
            addCriterion("PROFILE =", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotEqualTo(String value) {
            addCriterion("PROFILE <>", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileGreaterThan(String value) {
            addCriterion("PROFILE >", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileGreaterThanOrEqualTo(String value) {
            addCriterion("PROFILE >=", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileLessThan(String value) {
            addCriterion("PROFILE <", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileLessThanOrEqualTo(String value) {
            addCriterion("PROFILE <=", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileLike(String value) {
            addCriterion("PROFILE like", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotLike(String value) {
            addCriterion("PROFILE not like", value, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileIn(List<String> values) {
            addCriterion("PROFILE in", values, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotIn(List<String> values) {
            addCriterion("PROFILE not in", values, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileBetween(String value1, String value2) {
            addCriterion("PROFILE between", value1, value2, "profile");
            return (Criteria) this;
        }

        public Criteria andProfileNotBetween(String value1, String value2) {
            addCriterion("PROFILE not between", value1, value2, "profile");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("STUDENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("STUDENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("STUDENT_NAME =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("STUDENT_NAME <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("STUDENT_NAME >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_NAME >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("STUDENT_NAME <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_NAME <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("STUDENT_NAME like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("STUDENT_NAME not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("STUDENT_NAME in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("STUDENT_NAME not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("STUDENT_NAME between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("STUDENT_NAME not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentCardIdIsNull() {
            addCriterion("STUDENT_CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andStudentCardIdIsNotNull() {
            addCriterion("STUDENT_CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCardIdEqualTo(String value) {
            addCriterion("STUDENT_CARD_ID =", value, "studentCardId");
            return (Criteria) this;
        }

        public Criteria andStudentCardIdNotEqualTo(String value) {
            addCriterion("STUDENT_CARD_ID <>", value, "studentCardId");
            return (Criteria) this;
        }

        public Criteria andStudentCardIdGreaterThan(String value) {
            addCriterion("STUDENT_CARD_ID >", value, "studentCardId");
            return (Criteria) this;
        }

        public Criteria andStudentCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_CARD_ID >=", value, "studentCardId");
            return (Criteria) this;
        }

        public Criteria andStudentCardIdLessThan(String value) {
            addCriterion("STUDENT_CARD_ID <", value, "studentCardId");
            return (Criteria) this;
        }

        public Criteria andStudentCardIdLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_CARD_ID <=", value, "studentCardId");
            return (Criteria) this;
        }

        public Criteria andStudentCardIdLike(String value) {
            addCriterion("STUDENT_CARD_ID like", value, "studentCardId");
            return (Criteria) this;
        }

        public Criteria andStudentCardIdNotLike(String value) {
            addCriterion("STUDENT_CARD_ID not like", value, "studentCardId");
            return (Criteria) this;
        }

        public Criteria andStudentCardIdIn(List<String> values) {
            addCriterion("STUDENT_CARD_ID in", values, "studentCardId");
            return (Criteria) this;
        }

        public Criteria andStudentCardIdNotIn(List<String> values) {
            addCriterion("STUDENT_CARD_ID not in", values, "studentCardId");
            return (Criteria) this;
        }

        public Criteria andStudentCardIdBetween(String value1, String value2) {
            addCriterion("STUDENT_CARD_ID between", value1, value2, "studentCardId");
            return (Criteria) this;
        }

        public Criteria andStudentCardIdNotBetween(String value1, String value2) {
            addCriterion("STUDENT_CARD_ID not between", value1, value2, "studentCardId");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("EDUCATION =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("EDUCATION <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("EDUCATION >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATION >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("EDUCATION <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("EDUCATION <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("EDUCATION like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("EDUCATION not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("EDUCATION in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("EDUCATION not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("EDUCATION between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("EDUCATION not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andGraduatedTimeIsNull() {
            addCriterion("GRADUATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andGraduatedTimeIsNotNull() {
            addCriterion("GRADUATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andGraduatedTimeEqualTo(Date value) {
            addCriterion("GRADUATED_TIME =", value, "graduatedTime");
            return (Criteria) this;
        }

        public Criteria andGraduatedTimeNotEqualTo(Date value) {
            addCriterion("GRADUATED_TIME <>", value, "graduatedTime");
            return (Criteria) this;
        }

        public Criteria andGraduatedTimeGreaterThan(Date value) {
            addCriterion("GRADUATED_TIME >", value, "graduatedTime");
            return (Criteria) this;
        }

        public Criteria andGraduatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("GRADUATED_TIME >=", value, "graduatedTime");
            return (Criteria) this;
        }

        public Criteria andGraduatedTimeLessThan(Date value) {
            addCriterion("GRADUATED_TIME <", value, "graduatedTime");
            return (Criteria) this;
        }

        public Criteria andGraduatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("GRADUATED_TIME <=", value, "graduatedTime");
            return (Criteria) this;
        }

        public Criteria andGraduatedTimeIn(List<Date> values) {
            addCriterion("GRADUATED_TIME in", values, "graduatedTime");
            return (Criteria) this;
        }

        public Criteria andGraduatedTimeNotIn(List<Date> values) {
            addCriterion("GRADUATED_TIME not in", values, "graduatedTime");
            return (Criteria) this;
        }

        public Criteria andGraduatedTimeBetween(Date value1, Date value2) {
            addCriterion("GRADUATED_TIME between", value1, value2, "graduatedTime");
            return (Criteria) this;
        }

        public Criteria andGraduatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("GRADUATED_TIME not between", value1, value2, "graduatedTime");
            return (Criteria) this;
        }

        public Criteria andDiplomasIsNull() {
            addCriterion("DIPLOMAS is null");
            return (Criteria) this;
        }

        public Criteria andDiplomasIsNotNull() {
            addCriterion("DIPLOMAS is not null");
            return (Criteria) this;
        }

        public Criteria andDiplomasEqualTo(String value) {
            addCriterion("DIPLOMAS =", value, "diplomas");
            return (Criteria) this;
        }

        public Criteria andDiplomasNotEqualTo(String value) {
            addCriterion("DIPLOMAS <>", value, "diplomas");
            return (Criteria) this;
        }

        public Criteria andDiplomasGreaterThan(String value) {
            addCriterion("DIPLOMAS >", value, "diplomas");
            return (Criteria) this;
        }

        public Criteria andDiplomasGreaterThanOrEqualTo(String value) {
            addCriterion("DIPLOMAS >=", value, "diplomas");
            return (Criteria) this;
        }

        public Criteria andDiplomasLessThan(String value) {
            addCriterion("DIPLOMAS <", value, "diplomas");
            return (Criteria) this;
        }

        public Criteria andDiplomasLessThanOrEqualTo(String value) {
            addCriterion("DIPLOMAS <=", value, "diplomas");
            return (Criteria) this;
        }

        public Criteria andDiplomasLike(String value) {
            addCriterion("DIPLOMAS like", value, "diplomas");
            return (Criteria) this;
        }

        public Criteria andDiplomasNotLike(String value) {
            addCriterion("DIPLOMAS not like", value, "diplomas");
            return (Criteria) this;
        }

        public Criteria andDiplomasIn(List<String> values) {
            addCriterion("DIPLOMAS in", values, "diplomas");
            return (Criteria) this;
        }

        public Criteria andDiplomasNotIn(List<String> values) {
            addCriterion("DIPLOMAS not in", values, "diplomas");
            return (Criteria) this;
        }

        public Criteria andDiplomasBetween(String value1, String value2) {
            addCriterion("DIPLOMAS between", value1, value2, "diplomas");
            return (Criteria) this;
        }

        public Criteria andDiplomasNotBetween(String value1, String value2) {
            addCriterion("DIPLOMAS not between", value1, value2, "diplomas");
            return (Criteria) this;
        }

        public Criteria andCardPic1IsNull() {
            addCriterion("CARD_PIC1 is null");
            return (Criteria) this;
        }

        public Criteria andCardPic1IsNotNull() {
            addCriterion("CARD_PIC1 is not null");
            return (Criteria) this;
        }

        public Criteria andCardPic1EqualTo(String value) {
            addCriterion("CARD_PIC1 =", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1NotEqualTo(String value) {
            addCriterion("CARD_PIC1 <>", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1GreaterThan(String value) {
            addCriterion("CARD_PIC1 >", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1GreaterThanOrEqualTo(String value) {
            addCriterion("CARD_PIC1 >=", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1LessThan(String value) {
            addCriterion("CARD_PIC1 <", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1LessThanOrEqualTo(String value) {
            addCriterion("CARD_PIC1 <=", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1Like(String value) {
            addCriterion("CARD_PIC1 like", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1NotLike(String value) {
            addCriterion("CARD_PIC1 not like", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1In(List<String> values) {
            addCriterion("CARD_PIC1 in", values, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1NotIn(List<String> values) {
            addCriterion("CARD_PIC1 not in", values, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1Between(String value1, String value2) {
            addCriterion("CARD_PIC1 between", value1, value2, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1NotBetween(String value1, String value2) {
            addCriterion("CARD_PIC1 not between", value1, value2, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic2IsNull() {
            addCriterion("CARD_PIC2 is null");
            return (Criteria) this;
        }

        public Criteria andCardPic2IsNotNull() {
            addCriterion("CARD_PIC2 is not null");
            return (Criteria) this;
        }

        public Criteria andCardPic2EqualTo(String value) {
            addCriterion("CARD_PIC2 =", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2NotEqualTo(String value) {
            addCriterion("CARD_PIC2 <>", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2GreaterThan(String value) {
            addCriterion("CARD_PIC2 >", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2GreaterThanOrEqualTo(String value) {
            addCriterion("CARD_PIC2 >=", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2LessThan(String value) {
            addCriterion("CARD_PIC2 <", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2LessThanOrEqualTo(String value) {
            addCriterion("CARD_PIC2 <=", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2Like(String value) {
            addCriterion("CARD_PIC2 like", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2NotLike(String value) {
            addCriterion("CARD_PIC2 not like", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2In(List<String> values) {
            addCriterion("CARD_PIC2 in", values, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2NotIn(List<String> values) {
            addCriterion("CARD_PIC2 not in", values, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2Between(String value1, String value2) {
            addCriterion("CARD_PIC2 between", value1, value2, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2NotBetween(String value1, String value2) {
            addCriterion("CARD_PIC2 not between", value1, value2, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeIsNull() {
            addCriterion("VERIFICATION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeIsNotNull() {
            addCriterion("VERIFICATION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeEqualTo(String value) {
            addCriterion("VERIFICATION_CODE =", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeNotEqualTo(String value) {
            addCriterion("VERIFICATION_CODE <>", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeGreaterThan(String value) {
            addCriterion("VERIFICATION_CODE >", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFICATION_CODE >=", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeLessThan(String value) {
            addCriterion("VERIFICATION_CODE <", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeLessThanOrEqualTo(String value) {
            addCriterion("VERIFICATION_CODE <=", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeLike(String value) {
            addCriterion("VERIFICATION_CODE like", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeNotLike(String value) {
            addCriterion("VERIFICATION_CODE not like", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeIn(List<String> values) {
            addCriterion("VERIFICATION_CODE in", values, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeNotIn(List<String> values) {
            addCriterion("VERIFICATION_CODE not in", values, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeBetween(String value1, String value2) {
            addCriterion("VERIFICATION_CODE between", value1, value2, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeNotBetween(String value1, String value2) {
            addCriterion("VERIFICATION_CODE not between", value1, value2, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("MARITAL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("MARITAL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(String value) {
            addCriterion("MARITAL_STATUS =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(String value) {
            addCriterion("MARITAL_STATUS <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(String value) {
            addCriterion("MARITAL_STATUS >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MARITAL_STATUS >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(String value) {
            addCriterion("MARITAL_STATUS <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(String value) {
            addCriterion("MARITAL_STATUS <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLike(String value) {
            addCriterion("MARITAL_STATUS like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotLike(String value) {
            addCriterion("MARITAL_STATUS not like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<String> values) {
            addCriterion("MARITAL_STATUS in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<String> values) {
            addCriterion("MARITAL_STATUS not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(String value1, String value2) {
            addCriterion("MARITAL_STATUS between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(String value1, String value2) {
            addCriterion("MARITAL_STATUS not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andWorkplaceIsNull() {
            addCriterion("WORKPLACE is null");
            return (Criteria) this;
        }

        public Criteria andWorkplaceIsNotNull() {
            addCriterion("WORKPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkplaceEqualTo(String value) {
            addCriterion("WORKPLACE =", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotEqualTo(String value) {
            addCriterion("WORKPLACE <>", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceGreaterThan(String value) {
            addCriterion("WORKPLACE >", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceGreaterThanOrEqualTo(String value) {
            addCriterion("WORKPLACE >=", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLessThan(String value) {
            addCriterion("WORKPLACE <", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLessThanOrEqualTo(String value) {
            addCriterion("WORKPLACE <=", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLike(String value) {
            addCriterion("WORKPLACE like", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotLike(String value) {
            addCriterion("WORKPLACE not like", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceIn(List<String> values) {
            addCriterion("WORKPLACE in", values, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotIn(List<String> values) {
            addCriterion("WORKPLACE not in", values, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceBetween(String value1, String value2) {
            addCriterion("WORKPLACE between", value1, value2, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotBetween(String value1, String value2) {
            addCriterion("WORKPLACE not between", value1, value2, "workplace");
            return (Criteria) this;
        }

        public Criteria andDutiesIsNull() {
            addCriterion("DUTIES is null");
            return (Criteria) this;
        }

        public Criteria andDutiesIsNotNull() {
            addCriterion("DUTIES is not null");
            return (Criteria) this;
        }

        public Criteria andDutiesEqualTo(String value) {
            addCriterion("DUTIES =", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesNotEqualTo(String value) {
            addCriterion("DUTIES <>", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesGreaterThan(String value) {
            addCriterion("DUTIES >", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesGreaterThanOrEqualTo(String value) {
            addCriterion("DUTIES >=", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesLessThan(String value) {
            addCriterion("DUTIES <", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesLessThanOrEqualTo(String value) {
            addCriterion("DUTIES <=", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesLike(String value) {
            addCriterion("DUTIES like", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesNotLike(String value) {
            addCriterion("DUTIES not like", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesIn(List<String> values) {
            addCriterion("DUTIES in", values, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesNotIn(List<String> values) {
            addCriterion("DUTIES not in", values, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesBetween(String value1, String value2) {
            addCriterion("DUTIES between", value1, value2, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesNotBetween(String value1, String value2) {
            addCriterion("DUTIES not between", value1, value2, "duties");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeIsNull() {
            addCriterion("ANNUAL_INCOME is null");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeIsNotNull() {
            addCriterion("ANNUAL_INCOME is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeEqualTo(String value) {
            addCriterion("ANNUAL_INCOME =", value, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeNotEqualTo(String value) {
            addCriterion("ANNUAL_INCOME <>", value, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeGreaterThan(String value) {
            addCriterion("ANNUAL_INCOME >", value, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("ANNUAL_INCOME >=", value, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeLessThan(String value) {
            addCriterion("ANNUAL_INCOME <", value, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeLessThanOrEqualTo(String value) {
            addCriterion("ANNUAL_INCOME <=", value, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeLike(String value) {
            addCriterion("ANNUAL_INCOME like", value, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeNotLike(String value) {
            addCriterion("ANNUAL_INCOME not like", value, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeIn(List<String> values) {
            addCriterion("ANNUAL_INCOME in", values, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeNotIn(List<String> values) {
            addCriterion("ANNUAL_INCOME not in", values, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeBetween(String value1, String value2) {
            addCriterion("ANNUAL_INCOME between", value1, value2, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andAnnualIncomeNotBetween(String value1, String value2) {
            addCriterion("ANNUAL_INCOME not between", value1, value2, "annualIncome");
            return (Criteria) this;
        }

        public Criteria andPoliticalOrientationIsNull() {
            addCriterion("POLITICAL_ORIENTATION is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalOrientationIsNotNull() {
            addCriterion("POLITICAL_ORIENTATION is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalOrientationEqualTo(String value) {
            addCriterion("POLITICAL_ORIENTATION =", value, "politicalOrientation");
            return (Criteria) this;
        }

        public Criteria andPoliticalOrientationNotEqualTo(String value) {
            addCriterion("POLITICAL_ORIENTATION <>", value, "politicalOrientation");
            return (Criteria) this;
        }

        public Criteria andPoliticalOrientationGreaterThan(String value) {
            addCriterion("POLITICAL_ORIENTATION >", value, "politicalOrientation");
            return (Criteria) this;
        }

        public Criteria andPoliticalOrientationGreaterThanOrEqualTo(String value) {
            addCriterion("POLITICAL_ORIENTATION >=", value, "politicalOrientation");
            return (Criteria) this;
        }

        public Criteria andPoliticalOrientationLessThan(String value) {
            addCriterion("POLITICAL_ORIENTATION <", value, "politicalOrientation");
            return (Criteria) this;
        }

        public Criteria andPoliticalOrientationLessThanOrEqualTo(String value) {
            addCriterion("POLITICAL_ORIENTATION <=", value, "politicalOrientation");
            return (Criteria) this;
        }

        public Criteria andPoliticalOrientationLike(String value) {
            addCriterion("POLITICAL_ORIENTATION like", value, "politicalOrientation");
            return (Criteria) this;
        }

        public Criteria andPoliticalOrientationNotLike(String value) {
            addCriterion("POLITICAL_ORIENTATION not like", value, "politicalOrientation");
            return (Criteria) this;
        }

        public Criteria andPoliticalOrientationIn(List<String> values) {
            addCriterion("POLITICAL_ORIENTATION in", values, "politicalOrientation");
            return (Criteria) this;
        }

        public Criteria andPoliticalOrientationNotIn(List<String> values) {
            addCriterion("POLITICAL_ORIENTATION not in", values, "politicalOrientation");
            return (Criteria) this;
        }

        public Criteria andPoliticalOrientationBetween(String value1, String value2) {
            addCriterion("POLITICAL_ORIENTATION between", value1, value2, "politicalOrientation");
            return (Criteria) this;
        }

        public Criteria andPoliticalOrientationNotBetween(String value1, String value2) {
            addCriterion("POLITICAL_ORIENTATION not between", value1, value2, "politicalOrientation");
            return (Criteria) this;
        }

        public Criteria andCardAddressIsNull() {
            addCriterion("CARD_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCardAddressIsNotNull() {
            addCriterion("CARD_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCardAddressEqualTo(String value) {
            addCriterion("CARD_ADDRESS =", value, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressNotEqualTo(String value) {
            addCriterion("CARD_ADDRESS <>", value, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressGreaterThan(String value) {
            addCriterion("CARD_ADDRESS >", value, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_ADDRESS >=", value, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressLessThan(String value) {
            addCriterion("CARD_ADDRESS <", value, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressLessThanOrEqualTo(String value) {
            addCriterion("CARD_ADDRESS <=", value, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressLike(String value) {
            addCriterion("CARD_ADDRESS like", value, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressNotLike(String value) {
            addCriterion("CARD_ADDRESS not like", value, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressIn(List<String> values) {
            addCriterion("CARD_ADDRESS in", values, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressNotIn(List<String> values) {
            addCriterion("CARD_ADDRESS not in", values, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressBetween(String value1, String value2) {
            addCriterion("CARD_ADDRESS between", value1, value2, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andCardAddressNotBetween(String value1, String value2) {
            addCriterion("CARD_ADDRESS not between", value1, value2, "cardAddress");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("BANK_NAME =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("BANK_NAME <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("BANK_NAME >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NAME >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("BANK_NAME <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_NAME <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("BANK_NAME like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("BANK_NAME not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("BANK_NAME in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("BANK_NAME not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("BANK_NAME between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("BANK_NAME not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameIsNull() {
            addCriterion("BANK_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankUserNameIsNotNull() {
            addCriterion("BANK_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankUserNameEqualTo(String value) {
            addCriterion("BANK_USER_NAME =", value, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameNotEqualTo(String value) {
            addCriterion("BANK_USER_NAME <>", value, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameGreaterThan(String value) {
            addCriterion("BANK_USER_NAME >", value, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_USER_NAME >=", value, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameLessThan(String value) {
            addCriterion("BANK_USER_NAME <", value, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_USER_NAME <=", value, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameLike(String value) {
            addCriterion("BANK_USER_NAME like", value, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameNotLike(String value) {
            addCriterion("BANK_USER_NAME not like", value, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameIn(List<String> values) {
            addCriterion("BANK_USER_NAME in", values, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameNotIn(List<String> values) {
            addCriterion("BANK_USER_NAME not in", values, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameBetween(String value1, String value2) {
            addCriterion("BANK_USER_NAME between", value1, value2, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankUserNameNotBetween(String value1, String value2) {
            addCriterion("BANK_USER_NAME not between", value1, value2, "bankUserName");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNull() {
            addCriterion("BANK_CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNotNull() {
            addCriterion("BANK_CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoEqualTo(String value) {
            addCriterion("BANK_CARD_NO =", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotEqualTo(String value) {
            addCriterion("BANK_CARD_NO <>", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThan(String value) {
            addCriterion("BANK_CARD_NO >", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CARD_NO >=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThan(String value) {
            addCriterion("BANK_CARD_NO <", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThanOrEqualTo(String value) {
            addCriterion("BANK_CARD_NO <=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLike(String value) {
            addCriterion("BANK_CARD_NO like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotLike(String value) {
            addCriterion("BANK_CARD_NO not like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIn(List<String> values) {
            addCriterion("BANK_CARD_NO in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotIn(List<String> values) {
            addCriterion("BANK_CARD_NO not in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoBetween(String value1, String value2) {
            addCriterion("BANK_CARD_NO between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotBetween(String value1, String value2) {
            addCriterion("BANK_CARD_NO not between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andEmergencContact1IsNull() {
            addCriterion("EMERGENC_CONTACT1 is null");
            return (Criteria) this;
        }

        public Criteria andEmergencContact1IsNotNull() {
            addCriterion("EMERGENC_CONTACT1 is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencContact1EqualTo(String value) {
            addCriterion("EMERGENC_CONTACT1 =", value, "emergencContact1");
            return (Criteria) this;
        }

        public Criteria andEmergencContact1NotEqualTo(String value) {
            addCriterion("EMERGENC_CONTACT1 <>", value, "emergencContact1");
            return (Criteria) this;
        }

        public Criteria andEmergencContact1GreaterThan(String value) {
            addCriterion("EMERGENC_CONTACT1 >", value, "emergencContact1");
            return (Criteria) this;
        }

        public Criteria andEmergencContact1GreaterThanOrEqualTo(String value) {
            addCriterion("EMERGENC_CONTACT1 >=", value, "emergencContact1");
            return (Criteria) this;
        }

        public Criteria andEmergencContact1LessThan(String value) {
            addCriterion("EMERGENC_CONTACT1 <", value, "emergencContact1");
            return (Criteria) this;
        }

        public Criteria andEmergencContact1LessThanOrEqualTo(String value) {
            addCriterion("EMERGENC_CONTACT1 <=", value, "emergencContact1");
            return (Criteria) this;
        }

        public Criteria andEmergencContact1Like(String value) {
            addCriterion("EMERGENC_CONTACT1 like", value, "emergencContact1");
            return (Criteria) this;
        }

        public Criteria andEmergencContact1NotLike(String value) {
            addCriterion("EMERGENC_CONTACT1 not like", value, "emergencContact1");
            return (Criteria) this;
        }

        public Criteria andEmergencContact1In(List<String> values) {
            addCriterion("EMERGENC_CONTACT1 in", values, "emergencContact1");
            return (Criteria) this;
        }

        public Criteria andEmergencContact1NotIn(List<String> values) {
            addCriterion("EMERGENC_CONTACT1 not in", values, "emergencContact1");
            return (Criteria) this;
        }

        public Criteria andEmergencContact1Between(String value1, String value2) {
            addCriterion("EMERGENC_CONTACT1 between", value1, value2, "emergencContact1");
            return (Criteria) this;
        }

        public Criteria andEmergencContact1NotBetween(String value1, String value2) {
            addCriterion("EMERGENC_CONTACT1 not between", value1, value2, "emergencContact1");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone1IsNull() {
            addCriterion("EMERGENC_PHONE1 is null");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone1IsNotNull() {
            addCriterion("EMERGENC_PHONE1 is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone1EqualTo(String value) {
            addCriterion("EMERGENC_PHONE1 =", value, "emergencPhone1");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone1NotEqualTo(String value) {
            addCriterion("EMERGENC_PHONE1 <>", value, "emergencPhone1");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone1GreaterThan(String value) {
            addCriterion("EMERGENC_PHONE1 >", value, "emergencPhone1");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone1GreaterThanOrEqualTo(String value) {
            addCriterion("EMERGENC_PHONE1 >=", value, "emergencPhone1");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone1LessThan(String value) {
            addCriterion("EMERGENC_PHONE1 <", value, "emergencPhone1");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone1LessThanOrEqualTo(String value) {
            addCriterion("EMERGENC_PHONE1 <=", value, "emergencPhone1");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone1Like(String value) {
            addCriterion("EMERGENC_PHONE1 like", value, "emergencPhone1");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone1NotLike(String value) {
            addCriterion("EMERGENC_PHONE1 not like", value, "emergencPhone1");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone1In(List<String> values) {
            addCriterion("EMERGENC_PHONE1 in", values, "emergencPhone1");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone1NotIn(List<String> values) {
            addCriterion("EMERGENC_PHONE1 not in", values, "emergencPhone1");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone1Between(String value1, String value2) {
            addCriterion("EMERGENC_PHONE1 between", value1, value2, "emergencPhone1");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone1NotBetween(String value1, String value2) {
            addCriterion("EMERGENC_PHONE1 not between", value1, value2, "emergencPhone1");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr1IsNull() {
            addCriterion("EMERGENC_ADDR1 is null");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr1IsNotNull() {
            addCriterion("EMERGENC_ADDR1 is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr1EqualTo(String value) {
            addCriterion("EMERGENC_ADDR1 =", value, "emergencAddr1");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr1NotEqualTo(String value) {
            addCriterion("EMERGENC_ADDR1 <>", value, "emergencAddr1");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr1GreaterThan(String value) {
            addCriterion("EMERGENC_ADDR1 >", value, "emergencAddr1");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr1GreaterThanOrEqualTo(String value) {
            addCriterion("EMERGENC_ADDR1 >=", value, "emergencAddr1");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr1LessThan(String value) {
            addCriterion("EMERGENC_ADDR1 <", value, "emergencAddr1");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr1LessThanOrEqualTo(String value) {
            addCriterion("EMERGENC_ADDR1 <=", value, "emergencAddr1");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr1Like(String value) {
            addCriterion("EMERGENC_ADDR1 like", value, "emergencAddr1");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr1NotLike(String value) {
            addCriterion("EMERGENC_ADDR1 not like", value, "emergencAddr1");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr1In(List<String> values) {
            addCriterion("EMERGENC_ADDR1 in", values, "emergencAddr1");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr1NotIn(List<String> values) {
            addCriterion("EMERGENC_ADDR1 not in", values, "emergencAddr1");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr1Between(String value1, String value2) {
            addCriterion("EMERGENC_ADDR1 between", value1, value2, "emergencAddr1");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr1NotBetween(String value1, String value2) {
            addCriterion("EMERGENC_ADDR1 not between", value1, value2, "emergencAddr1");
            return (Criteria) this;
        }

        public Criteria andEmergencContact2IsNull() {
            addCriterion("EMERGENC_CONTACT2 is null");
            return (Criteria) this;
        }

        public Criteria andEmergencContact2IsNotNull() {
            addCriterion("EMERGENC_CONTACT2 is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencContact2EqualTo(String value) {
            addCriterion("EMERGENC_CONTACT2 =", value, "emergencContact2");
            return (Criteria) this;
        }

        public Criteria andEmergencContact2NotEqualTo(String value) {
            addCriterion("EMERGENC_CONTACT2 <>", value, "emergencContact2");
            return (Criteria) this;
        }

        public Criteria andEmergencContact2GreaterThan(String value) {
            addCriterion("EMERGENC_CONTACT2 >", value, "emergencContact2");
            return (Criteria) this;
        }

        public Criteria andEmergencContact2GreaterThanOrEqualTo(String value) {
            addCriterion("EMERGENC_CONTACT2 >=", value, "emergencContact2");
            return (Criteria) this;
        }

        public Criteria andEmergencContact2LessThan(String value) {
            addCriterion("EMERGENC_CONTACT2 <", value, "emergencContact2");
            return (Criteria) this;
        }

        public Criteria andEmergencContact2LessThanOrEqualTo(String value) {
            addCriterion("EMERGENC_CONTACT2 <=", value, "emergencContact2");
            return (Criteria) this;
        }

        public Criteria andEmergencContact2Like(String value) {
            addCriterion("EMERGENC_CONTACT2 like", value, "emergencContact2");
            return (Criteria) this;
        }

        public Criteria andEmergencContact2NotLike(String value) {
            addCriterion("EMERGENC_CONTACT2 not like", value, "emergencContact2");
            return (Criteria) this;
        }

        public Criteria andEmergencContact2In(List<String> values) {
            addCriterion("EMERGENC_CONTACT2 in", values, "emergencContact2");
            return (Criteria) this;
        }

        public Criteria andEmergencContact2NotIn(List<String> values) {
            addCriterion("EMERGENC_CONTACT2 not in", values, "emergencContact2");
            return (Criteria) this;
        }

        public Criteria andEmergencContact2Between(String value1, String value2) {
            addCriterion("EMERGENC_CONTACT2 between", value1, value2, "emergencContact2");
            return (Criteria) this;
        }

        public Criteria andEmergencContact2NotBetween(String value1, String value2) {
            addCriterion("EMERGENC_CONTACT2 not between", value1, value2, "emergencContact2");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone2IsNull() {
            addCriterion("EMERGENC_PHONE2 is null");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone2IsNotNull() {
            addCriterion("EMERGENC_PHONE2 is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone2EqualTo(String value) {
            addCriterion("EMERGENC_PHONE2 =", value, "emergencPhone2");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone2NotEqualTo(String value) {
            addCriterion("EMERGENC_PHONE2 <>", value, "emergencPhone2");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone2GreaterThan(String value) {
            addCriterion("EMERGENC_PHONE2 >", value, "emergencPhone2");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone2GreaterThanOrEqualTo(String value) {
            addCriterion("EMERGENC_PHONE2 >=", value, "emergencPhone2");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone2LessThan(String value) {
            addCriterion("EMERGENC_PHONE2 <", value, "emergencPhone2");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone2LessThanOrEqualTo(String value) {
            addCriterion("EMERGENC_PHONE2 <=", value, "emergencPhone2");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone2Like(String value) {
            addCriterion("EMERGENC_PHONE2 like", value, "emergencPhone2");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone2NotLike(String value) {
            addCriterion("EMERGENC_PHONE2 not like", value, "emergencPhone2");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone2In(List<String> values) {
            addCriterion("EMERGENC_PHONE2 in", values, "emergencPhone2");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone2NotIn(List<String> values) {
            addCriterion("EMERGENC_PHONE2 not in", values, "emergencPhone2");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone2Between(String value1, String value2) {
            addCriterion("EMERGENC_PHONE2 between", value1, value2, "emergencPhone2");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone2NotBetween(String value1, String value2) {
            addCriterion("EMERGENC_PHONE2 not between", value1, value2, "emergencPhone2");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr2IsNull() {
            addCriterion("EMERGENC_ADDR2 is null");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr2IsNotNull() {
            addCriterion("EMERGENC_ADDR2 is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr2EqualTo(String value) {
            addCriterion("EMERGENC_ADDR2 =", value, "emergencAddr2");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr2NotEqualTo(String value) {
            addCriterion("EMERGENC_ADDR2 <>", value, "emergencAddr2");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr2GreaterThan(String value) {
            addCriterion("EMERGENC_ADDR2 >", value, "emergencAddr2");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr2GreaterThanOrEqualTo(String value) {
            addCriterion("EMERGENC_ADDR2 >=", value, "emergencAddr2");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr2LessThan(String value) {
            addCriterion("EMERGENC_ADDR2 <", value, "emergencAddr2");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr2LessThanOrEqualTo(String value) {
            addCriterion("EMERGENC_ADDR2 <=", value, "emergencAddr2");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr2Like(String value) {
            addCriterion("EMERGENC_ADDR2 like", value, "emergencAddr2");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr2NotLike(String value) {
            addCriterion("EMERGENC_ADDR2 not like", value, "emergencAddr2");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr2In(List<String> values) {
            addCriterion("EMERGENC_ADDR2 in", values, "emergencAddr2");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr2NotIn(List<String> values) {
            addCriterion("EMERGENC_ADDR2 not in", values, "emergencAddr2");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr2Between(String value1, String value2) {
            addCriterion("EMERGENC_ADDR2 between", value1, value2, "emergencAddr2");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr2NotBetween(String value1, String value2) {
            addCriterion("EMERGENC_ADDR2 not between", value1, value2, "emergencAddr2");
            return (Criteria) this;
        }

        public Criteria andEmergencContact3IsNull() {
            addCriterion("EMERGENC_CONTACT3 is null");
            return (Criteria) this;
        }

        public Criteria andEmergencContact3IsNotNull() {
            addCriterion("EMERGENC_CONTACT3 is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencContact3EqualTo(String value) {
            addCriterion("EMERGENC_CONTACT3 =", value, "emergencContact3");
            return (Criteria) this;
        }

        public Criteria andEmergencContact3NotEqualTo(String value) {
            addCriterion("EMERGENC_CONTACT3 <>", value, "emergencContact3");
            return (Criteria) this;
        }

        public Criteria andEmergencContact3GreaterThan(String value) {
            addCriterion("EMERGENC_CONTACT3 >", value, "emergencContact3");
            return (Criteria) this;
        }

        public Criteria andEmergencContact3GreaterThanOrEqualTo(String value) {
            addCriterion("EMERGENC_CONTACT3 >=", value, "emergencContact3");
            return (Criteria) this;
        }

        public Criteria andEmergencContact3LessThan(String value) {
            addCriterion("EMERGENC_CONTACT3 <", value, "emergencContact3");
            return (Criteria) this;
        }

        public Criteria andEmergencContact3LessThanOrEqualTo(String value) {
            addCriterion("EMERGENC_CONTACT3 <=", value, "emergencContact3");
            return (Criteria) this;
        }

        public Criteria andEmergencContact3Like(String value) {
            addCriterion("EMERGENC_CONTACT3 like", value, "emergencContact3");
            return (Criteria) this;
        }

        public Criteria andEmergencContact3NotLike(String value) {
            addCriterion("EMERGENC_CONTACT3 not like", value, "emergencContact3");
            return (Criteria) this;
        }

        public Criteria andEmergencContact3In(List<String> values) {
            addCriterion("EMERGENC_CONTACT3 in", values, "emergencContact3");
            return (Criteria) this;
        }

        public Criteria andEmergencContact3NotIn(List<String> values) {
            addCriterion("EMERGENC_CONTACT3 not in", values, "emergencContact3");
            return (Criteria) this;
        }

        public Criteria andEmergencContact3Between(String value1, String value2) {
            addCriterion("EMERGENC_CONTACT3 between", value1, value2, "emergencContact3");
            return (Criteria) this;
        }

        public Criteria andEmergencContact3NotBetween(String value1, String value2) {
            addCriterion("EMERGENC_CONTACT3 not between", value1, value2, "emergencContact3");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone3IsNull() {
            addCriterion("EMERGENC_PHONE3 is null");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone3IsNotNull() {
            addCriterion("EMERGENC_PHONE3 is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone3EqualTo(String value) {
            addCriterion("EMERGENC_PHONE3 =", value, "emergencPhone3");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone3NotEqualTo(String value) {
            addCriterion("EMERGENC_PHONE3 <>", value, "emergencPhone3");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone3GreaterThan(String value) {
            addCriterion("EMERGENC_PHONE3 >", value, "emergencPhone3");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone3GreaterThanOrEqualTo(String value) {
            addCriterion("EMERGENC_PHONE3 >=", value, "emergencPhone3");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone3LessThan(String value) {
            addCriterion("EMERGENC_PHONE3 <", value, "emergencPhone3");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone3LessThanOrEqualTo(String value) {
            addCriterion("EMERGENC_PHONE3 <=", value, "emergencPhone3");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone3Like(String value) {
            addCriterion("EMERGENC_PHONE3 like", value, "emergencPhone3");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone3NotLike(String value) {
            addCriterion("EMERGENC_PHONE3 not like", value, "emergencPhone3");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone3In(List<String> values) {
            addCriterion("EMERGENC_PHONE3 in", values, "emergencPhone3");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone3NotIn(List<String> values) {
            addCriterion("EMERGENC_PHONE3 not in", values, "emergencPhone3");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone3Between(String value1, String value2) {
            addCriterion("EMERGENC_PHONE3 between", value1, value2, "emergencPhone3");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone3NotBetween(String value1, String value2) {
            addCriterion("EMERGENC_PHONE3 not between", value1, value2, "emergencPhone3");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr3IsNull() {
            addCriterion("EMERGENC_ADDR3 is null");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr3IsNotNull() {
            addCriterion("EMERGENC_ADDR3 is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr3EqualTo(String value) {
            addCriterion("EMERGENC_ADDR3 =", value, "emergencAddr3");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr3NotEqualTo(String value) {
            addCriterion("EMERGENC_ADDR3 <>", value, "emergencAddr3");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr3GreaterThan(String value) {
            addCriterion("EMERGENC_ADDR3 >", value, "emergencAddr3");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr3GreaterThanOrEqualTo(String value) {
            addCriterion("EMERGENC_ADDR3 >=", value, "emergencAddr3");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr3LessThan(String value) {
            addCriterion("EMERGENC_ADDR3 <", value, "emergencAddr3");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr3LessThanOrEqualTo(String value) {
            addCriterion("EMERGENC_ADDR3 <=", value, "emergencAddr3");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr3Like(String value) {
            addCriterion("EMERGENC_ADDR3 like", value, "emergencAddr3");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr3NotLike(String value) {
            addCriterion("EMERGENC_ADDR3 not like", value, "emergencAddr3");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr3In(List<String> values) {
            addCriterion("EMERGENC_ADDR3 in", values, "emergencAddr3");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr3NotIn(List<String> values) {
            addCriterion("EMERGENC_ADDR3 not in", values, "emergencAddr3");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr3Between(String value1, String value2) {
            addCriterion("EMERGENC_ADDR3 between", value1, value2, "emergencAddr3");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr3NotBetween(String value1, String value2) {
            addCriterion("EMERGENC_ADDR3 not between", value1, value2, "emergencAddr3");
            return (Criteria) this;
        }

        public Criteria andEmergencContact4IsNull() {
            addCriterion("EMERGENC_CONTACT4 is null");
            return (Criteria) this;
        }

        public Criteria andEmergencContact4IsNotNull() {
            addCriterion("EMERGENC_CONTACT4 is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencContact4EqualTo(String value) {
            addCriterion("EMERGENC_CONTACT4 =", value, "emergencContact4");
            return (Criteria) this;
        }

        public Criteria andEmergencContact4NotEqualTo(String value) {
            addCriterion("EMERGENC_CONTACT4 <>", value, "emergencContact4");
            return (Criteria) this;
        }

        public Criteria andEmergencContact4GreaterThan(String value) {
            addCriterion("EMERGENC_CONTACT4 >", value, "emergencContact4");
            return (Criteria) this;
        }

        public Criteria andEmergencContact4GreaterThanOrEqualTo(String value) {
            addCriterion("EMERGENC_CONTACT4 >=", value, "emergencContact4");
            return (Criteria) this;
        }

        public Criteria andEmergencContact4LessThan(String value) {
            addCriterion("EMERGENC_CONTACT4 <", value, "emergencContact4");
            return (Criteria) this;
        }

        public Criteria andEmergencContact4LessThanOrEqualTo(String value) {
            addCriterion("EMERGENC_CONTACT4 <=", value, "emergencContact4");
            return (Criteria) this;
        }

        public Criteria andEmergencContact4Like(String value) {
            addCriterion("EMERGENC_CONTACT4 like", value, "emergencContact4");
            return (Criteria) this;
        }

        public Criteria andEmergencContact4NotLike(String value) {
            addCriterion("EMERGENC_CONTACT4 not like", value, "emergencContact4");
            return (Criteria) this;
        }

        public Criteria andEmergencContact4In(List<String> values) {
            addCriterion("EMERGENC_CONTACT4 in", values, "emergencContact4");
            return (Criteria) this;
        }

        public Criteria andEmergencContact4NotIn(List<String> values) {
            addCriterion("EMERGENC_CONTACT4 not in", values, "emergencContact4");
            return (Criteria) this;
        }

        public Criteria andEmergencContact4Between(String value1, String value2) {
            addCriterion("EMERGENC_CONTACT4 between", value1, value2, "emergencContact4");
            return (Criteria) this;
        }

        public Criteria andEmergencContact4NotBetween(String value1, String value2) {
            addCriterion("EMERGENC_CONTACT4 not between", value1, value2, "emergencContact4");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone4IsNull() {
            addCriterion("EMERGENC_PHONE4 is null");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone4IsNotNull() {
            addCriterion("EMERGENC_PHONE4 is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone4EqualTo(String value) {
            addCriterion("EMERGENC_PHONE4 =", value, "emergencPhone4");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone4NotEqualTo(String value) {
            addCriterion("EMERGENC_PHONE4 <>", value, "emergencPhone4");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone4GreaterThan(String value) {
            addCriterion("EMERGENC_PHONE4 >", value, "emergencPhone4");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone4GreaterThanOrEqualTo(String value) {
            addCriterion("EMERGENC_PHONE4 >=", value, "emergencPhone4");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone4LessThan(String value) {
            addCriterion("EMERGENC_PHONE4 <", value, "emergencPhone4");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone4LessThanOrEqualTo(String value) {
            addCriterion("EMERGENC_PHONE4 <=", value, "emergencPhone4");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone4Like(String value) {
            addCriterion("EMERGENC_PHONE4 like", value, "emergencPhone4");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone4NotLike(String value) {
            addCriterion("EMERGENC_PHONE4 not like", value, "emergencPhone4");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone4In(List<String> values) {
            addCriterion("EMERGENC_PHONE4 in", values, "emergencPhone4");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone4NotIn(List<String> values) {
            addCriterion("EMERGENC_PHONE4 not in", values, "emergencPhone4");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone4Between(String value1, String value2) {
            addCriterion("EMERGENC_PHONE4 between", value1, value2, "emergencPhone4");
            return (Criteria) this;
        }

        public Criteria andEmergencPhone4NotBetween(String value1, String value2) {
            addCriterion("EMERGENC_PHONE4 not between", value1, value2, "emergencPhone4");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr4IsNull() {
            addCriterion("EMERGENC_ADDR4 is null");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr4IsNotNull() {
            addCriterion("EMERGENC_ADDR4 is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr4EqualTo(String value) {
            addCriterion("EMERGENC_ADDR4 =", value, "emergencAddr4");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr4NotEqualTo(String value) {
            addCriterion("EMERGENC_ADDR4 <>", value, "emergencAddr4");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr4GreaterThan(String value) {
            addCriterion("EMERGENC_ADDR4 >", value, "emergencAddr4");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr4GreaterThanOrEqualTo(String value) {
            addCriterion("EMERGENC_ADDR4 >=", value, "emergencAddr4");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr4LessThan(String value) {
            addCriterion("EMERGENC_ADDR4 <", value, "emergencAddr4");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr4LessThanOrEqualTo(String value) {
            addCriterion("EMERGENC_ADDR4 <=", value, "emergencAddr4");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr4Like(String value) {
            addCriterion("EMERGENC_ADDR4 like", value, "emergencAddr4");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr4NotLike(String value) {
            addCriterion("EMERGENC_ADDR4 not like", value, "emergencAddr4");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr4In(List<String> values) {
            addCriterion("EMERGENC_ADDR4 in", values, "emergencAddr4");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr4NotIn(List<String> values) {
            addCriterion("EMERGENC_ADDR4 not in", values, "emergencAddr4");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr4Between(String value1, String value2) {
            addCriterion("EMERGENC_ADDR4 between", value1, value2, "emergencAddr4");
            return (Criteria) this;
        }

        public Criteria andEmergencAddr4NotBetween(String value1, String value2) {
            addCriterion("EMERGENC_ADDR4 not between", value1, value2, "emergencAddr4");
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