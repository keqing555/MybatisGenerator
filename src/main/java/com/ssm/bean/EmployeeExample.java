package com.ssm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Long value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Long value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Long value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Long value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Long value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Long value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Long> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Long> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Long value1, Long value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Long value1, Long value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEnameIsNull() {
            addCriterion("ename is null");
            return (Criteria) this;
        }

        public Criteria andEnameIsNotNull() {
            addCriterion("ename is not null");
            return (Criteria) this;
        }

        public Criteria andEnameEqualTo(String value) {
            addCriterion("ename =", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotEqualTo(String value) {
            addCriterion("ename <>", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThan(String value) {
            addCriterion("ename >", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThanOrEqualTo(String value) {
            addCriterion("ename >=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThan(String value) {
            addCriterion("ename <", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThanOrEqualTo(String value) {
            addCriterion("ename <=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLike(String value) {
            addCriterion("ename like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotLike(String value) {
            addCriterion("ename not like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameIn(List<String> values) {
            addCriterion("ename in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotIn(List<String> values) {
            addCriterion("ename not in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameBetween(String value1, String value2) {
            addCriterion("ename between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotBetween(String value1, String value2) {
            addCriterion("ename not between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEsexIsNull() {
            addCriterion("esex is null");
            return (Criteria) this;
        }

        public Criteria andEsexIsNotNull() {
            addCriterion("esex is not null");
            return (Criteria) this;
        }

        public Criteria andEsexEqualTo(Long value) {
            addCriterion("esex =", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexNotEqualTo(Long value) {
            addCriterion("esex <>", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexGreaterThan(Long value) {
            addCriterion("esex >", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexGreaterThanOrEqualTo(Long value) {
            addCriterion("esex >=", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexLessThan(Long value) {
            addCriterion("esex <", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexLessThanOrEqualTo(Long value) {
            addCriterion("esex <=", value, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexIn(List<Long> values) {
            addCriterion("esex in", values, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexNotIn(List<Long> values) {
            addCriterion("esex not in", values, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexBetween(Long value1, Long value2) {
            addCriterion("esex between", value1, value2, "esex");
            return (Criteria) this;
        }

        public Criteria andEsexNotBetween(Long value1, Long value2) {
            addCriterion("esex not between", value1, value2, "esex");
            return (Criteria) this;
        }

        public Criteria andEageIsNull() {
            addCriterion("eage is null");
            return (Criteria) this;
        }

        public Criteria andEageIsNotNull() {
            addCriterion("eage is not null");
            return (Criteria) this;
        }

        public Criteria andEageEqualTo(Long value) {
            addCriterion("eage =", value, "eage");
            return (Criteria) this;
        }

        public Criteria andEageNotEqualTo(Long value) {
            addCriterion("eage <>", value, "eage");
            return (Criteria) this;
        }

        public Criteria andEageGreaterThan(Long value) {
            addCriterion("eage >", value, "eage");
            return (Criteria) this;
        }

        public Criteria andEageGreaterThanOrEqualTo(Long value) {
            addCriterion("eage >=", value, "eage");
            return (Criteria) this;
        }

        public Criteria andEageLessThan(Long value) {
            addCriterion("eage <", value, "eage");
            return (Criteria) this;
        }

        public Criteria andEageLessThanOrEqualTo(Long value) {
            addCriterion("eage <=", value, "eage");
            return (Criteria) this;
        }

        public Criteria andEageIn(List<Long> values) {
            addCriterion("eage in", values, "eage");
            return (Criteria) this;
        }

        public Criteria andEageNotIn(List<Long> values) {
            addCriterion("eage not in", values, "eage");
            return (Criteria) this;
        }

        public Criteria andEageBetween(Long value1, Long value2) {
            addCriterion("eage between", value1, value2, "eage");
            return (Criteria) this;
        }

        public Criteria andEageNotBetween(Long value1, Long value2) {
            addCriterion("eage not between", value1, value2, "eage");
            return (Criteria) this;
        }

        public Criteria andEtelephoneIsNull() {
            addCriterion("etelephone is null");
            return (Criteria) this;
        }

        public Criteria andEtelephoneIsNotNull() {
            addCriterion("etelephone is not null");
            return (Criteria) this;
        }

        public Criteria andEtelephoneEqualTo(String value) {
            addCriterion("etelephone =", value, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneNotEqualTo(String value) {
            addCriterion("etelephone <>", value, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneGreaterThan(String value) {
            addCriterion("etelephone >", value, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("etelephone >=", value, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneLessThan(String value) {
            addCriterion("etelephone <", value, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneLessThanOrEqualTo(String value) {
            addCriterion("etelephone <=", value, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneLike(String value) {
            addCriterion("etelephone like", value, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneNotLike(String value) {
            addCriterion("etelephone not like", value, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneIn(List<String> values) {
            addCriterion("etelephone in", values, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneNotIn(List<String> values) {
            addCriterion("etelephone not in", values, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneBetween(String value1, String value2) {
            addCriterion("etelephone between", value1, value2, "etelephone");
            return (Criteria) this;
        }

        public Criteria andEtelephoneNotBetween(String value1, String value2) {
            addCriterion("etelephone not between", value1, value2, "etelephone");
            return (Criteria) this;
        }

        public Criteria andHiredateIsNull() {
            addCriterion("hiredate is null");
            return (Criteria) this;
        }

        public Criteria andHiredateIsNotNull() {
            addCriterion("hiredate is not null");
            return (Criteria) this;
        }

        public Criteria andHiredateEqualTo(Date value) {
            addCriterionForJDBCDate("hiredate =", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateNotEqualTo(Date value) {
            addCriterionForJDBCDate("hiredate <>", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateGreaterThan(Date value) {
            addCriterionForJDBCDate("hiredate >", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hiredate >=", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateLessThan(Date value) {
            addCriterionForJDBCDate("hiredate <", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hiredate <=", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateIn(List<Date> values) {
            addCriterionForJDBCDate("hiredate in", values, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateNotIn(List<Date> values) {
            addCriterionForJDBCDate("hiredate not in", values, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hiredate between", value1, value2, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hiredate not between", value1, value2, "hiredate");
            return (Criteria) this;
        }

        public Criteria andJobnumberIsNull() {
            addCriterion("jobnumber is null");
            return (Criteria) this;
        }

        public Criteria andJobnumberIsNotNull() {
            addCriterion("jobnumber is not null");
            return (Criteria) this;
        }

        public Criteria andJobnumberEqualTo(String value) {
            addCriterion("jobnumber =", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberNotEqualTo(String value) {
            addCriterion("jobnumber <>", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberGreaterThan(String value) {
            addCriterion("jobnumber >", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberGreaterThanOrEqualTo(String value) {
            addCriterion("jobnumber >=", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberLessThan(String value) {
            addCriterion("jobnumber <", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberLessThanOrEqualTo(String value) {
            addCriterion("jobnumber <=", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberLike(String value) {
            addCriterion("jobnumber like", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberNotLike(String value) {
            addCriterion("jobnumber not like", value, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberIn(List<String> values) {
            addCriterion("jobnumber in", values, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberNotIn(List<String> values) {
            addCriterion("jobnumber not in", values, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberBetween(String value1, String value2) {
            addCriterion("jobnumber between", value1, value2, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andJobnumberNotBetween(String value1, String value2) {
            addCriterion("jobnumber not between", value1, value2, "jobnumber");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
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