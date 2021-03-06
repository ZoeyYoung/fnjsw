package fnjsw.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import fnjsw.util.Page;

public class OnechildarchivesExample {
    protected Page page;

    public void setPage(Page page) {
        this.page = page;
    }

    public Page getPage() {
        return page;
    }
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OnechildarchivesExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFnameIsNull() {
            addCriterion("fName is null");
            return (Criteria) this;
        }

        public Criteria andFnameIsNotNull() {
            addCriterion("fName is not null");
            return (Criteria) this;
        }

        public Criteria andFnameEqualTo(String value) {
            addCriterion("fName =", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotEqualTo(String value) {
            addCriterion("fName <>", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThan(String value) {
            addCriterion("fName >", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThanOrEqualTo(String value) {
            addCriterion("fName >=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThan(String value) {
            addCriterion("fName <", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThanOrEqualTo(String value) {
            addCriterion("fName <=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLike(String value) {
            addCriterion("fName like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotLike(String value) {
            addCriterion("fName not like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameIn(List<String> values) {
            addCriterion("fName in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotIn(List<String> values) {
            addCriterion("fName not in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameBetween(String value1, String value2) {
            addCriterion("fName between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotBetween(String value1, String value2) {
            addCriterion("fName not between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFidcardnoIsNull() {
            addCriterion("fIdCardNo is null");
            return (Criteria) this;
        }

        public Criteria andFidcardnoIsNotNull() {
            addCriterion("fIdCardNo is not null");
            return (Criteria) this;
        }

        public Criteria andFidcardnoEqualTo(String value) {
            addCriterion("fIdCardNo =", value, "fidcardno");
            return (Criteria) this;
        }

        public Criteria andFidcardnoNotEqualTo(String value) {
            addCriterion("fIdCardNo <>", value, "fidcardno");
            return (Criteria) this;
        }

        public Criteria andFidcardnoGreaterThan(String value) {
            addCriterion("fIdCardNo >", value, "fidcardno");
            return (Criteria) this;
        }

        public Criteria andFidcardnoGreaterThanOrEqualTo(String value) {
            addCriterion("fIdCardNo >=", value, "fidcardno");
            return (Criteria) this;
        }

        public Criteria andFidcardnoLessThan(String value) {
            addCriterion("fIdCardNo <", value, "fidcardno");
            return (Criteria) this;
        }

        public Criteria andFidcardnoLessThanOrEqualTo(String value) {
            addCriterion("fIdCardNo <=", value, "fidcardno");
            return (Criteria) this;
        }

        public Criteria andFidcardnoLike(String value) {
            addCriterion("fIdCardNo like", value, "fidcardno");
            return (Criteria) this;
        }

        public Criteria andFidcardnoNotLike(String value) {
            addCriterion("fIdCardNo not like", value, "fidcardno");
            return (Criteria) this;
        }

        public Criteria andFidcardnoIn(List<String> values) {
            addCriterion("fIdCardNo in", values, "fidcardno");
            return (Criteria) this;
        }

        public Criteria andFidcardnoNotIn(List<String> values) {
            addCriterion("fIdCardNo not in", values, "fidcardno");
            return (Criteria) this;
        }

        public Criteria andFidcardnoBetween(String value1, String value2) {
            addCriterion("fIdCardNo between", value1, value2, "fidcardno");
            return (Criteria) this;
        }

        public Criteria andFidcardnoNotBetween(String value1, String value2) {
            addCriterion("fIdCardNo not between", value1, value2, "fidcardno");
            return (Criteria) this;
        }

        public Criteria andFphoneIsNull() {
            addCriterion("fPhone is null");
            return (Criteria) this;
        }

        public Criteria andFphoneIsNotNull() {
            addCriterion("fPhone is not null");
            return (Criteria) this;
        }

        public Criteria andFphoneEqualTo(String value) {
            addCriterion("fPhone =", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneNotEqualTo(String value) {
            addCriterion("fPhone <>", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneGreaterThan(String value) {
            addCriterion("fPhone >", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneGreaterThanOrEqualTo(String value) {
            addCriterion("fPhone >=", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneLessThan(String value) {
            addCriterion("fPhone <", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneLessThanOrEqualTo(String value) {
            addCriterion("fPhone <=", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneLike(String value) {
            addCriterion("fPhone like", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneNotLike(String value) {
            addCriterion("fPhone not like", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneIn(List<String> values) {
            addCriterion("fPhone in", values, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneNotIn(List<String> values) {
            addCriterion("fPhone not in", values, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneBetween(String value1, String value2) {
            addCriterion("fPhone between", value1, value2, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneNotBetween(String value1, String value2) {
            addCriterion("fPhone not between", value1, value2, "fphone");
            return (Criteria) this;
        }

        public Criteria andMarriageidnoIsNull() {
            addCriterion("marriageIdNo is null");
            return (Criteria) this;
        }

        public Criteria andMarriageidnoIsNotNull() {
            addCriterion("marriageIdNo is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageidnoEqualTo(String value) {
            addCriterion("marriageIdNo =", value, "marriageidno");
            return (Criteria) this;
        }

        public Criteria andMarriageidnoNotEqualTo(String value) {
            addCriterion("marriageIdNo <>", value, "marriageidno");
            return (Criteria) this;
        }

        public Criteria andMarriageidnoGreaterThan(String value) {
            addCriterion("marriageIdNo >", value, "marriageidno");
            return (Criteria) this;
        }

        public Criteria andMarriageidnoGreaterThanOrEqualTo(String value) {
            addCriterion("marriageIdNo >=", value, "marriageidno");
            return (Criteria) this;
        }

        public Criteria andMarriageidnoLessThan(String value) {
            addCriterion("marriageIdNo <", value, "marriageidno");
            return (Criteria) this;
        }

        public Criteria andMarriageidnoLessThanOrEqualTo(String value) {
            addCriterion("marriageIdNo <=", value, "marriageidno");
            return (Criteria) this;
        }

        public Criteria andMarriageidnoLike(String value) {
            addCriterion("marriageIdNo like", value, "marriageidno");
            return (Criteria) this;
        }

        public Criteria andMarriageidnoNotLike(String value) {
            addCriterion("marriageIdNo not like", value, "marriageidno");
            return (Criteria) this;
        }

        public Criteria andMarriageidnoIn(List<String> values) {
            addCriterion("marriageIdNo in", values, "marriageidno");
            return (Criteria) this;
        }

        public Criteria andMarriageidnoNotIn(List<String> values) {
            addCriterion("marriageIdNo not in", values, "marriageidno");
            return (Criteria) this;
        }

        public Criteria andMarriageidnoBetween(String value1, String value2) {
            addCriterion("marriageIdNo between", value1, value2, "marriageidno");
            return (Criteria) this;
        }

        public Criteria andMarriageidnoNotBetween(String value1, String value2) {
            addCriterion("marriageIdNo not between", value1, value2, "marriageidno");
            return (Criteria) this;
        }

        public Criteria andFpermanentaddressIsNull() {
            addCriterion("fPermanentAddress is null");
            return (Criteria) this;
        }

        public Criteria andFpermanentaddressIsNotNull() {
            addCriterion("fPermanentAddress is not null");
            return (Criteria) this;
        }

        public Criteria andFpermanentaddressEqualTo(String value) {
            addCriterion("fPermanentAddress =", value, "fpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andFpermanentaddressNotEqualTo(String value) {
            addCriterion("fPermanentAddress <>", value, "fpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andFpermanentaddressGreaterThan(String value) {
            addCriterion("fPermanentAddress >", value, "fpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andFpermanentaddressGreaterThanOrEqualTo(String value) {
            addCriterion("fPermanentAddress >=", value, "fpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andFpermanentaddressLessThan(String value) {
            addCriterion("fPermanentAddress <", value, "fpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andFpermanentaddressLessThanOrEqualTo(String value) {
            addCriterion("fPermanentAddress <=", value, "fpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andFpermanentaddressLike(String value) {
            addCriterion("fPermanentAddress like", value, "fpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andFpermanentaddressNotLike(String value) {
            addCriterion("fPermanentAddress not like", value, "fpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andFpermanentaddressIn(List<String> values) {
            addCriterion("fPermanentAddress in", values, "fpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andFpermanentaddressNotIn(List<String> values) {
            addCriterion("fPermanentAddress not in", values, "fpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andFpermanentaddressBetween(String value1, String value2) {
            addCriterion("fPermanentAddress between", value1, value2, "fpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andFpermanentaddressNotBetween(String value1, String value2) {
            addCriterion("fPermanentAddress not between", value1, value2, "fpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andFphousenoIsNull() {
            addCriterion("fpHouseNo is null");
            return (Criteria) this;
        }

        public Criteria andFphousenoIsNotNull() {
            addCriterion("fpHouseNo is not null");
            return (Criteria) this;
        }

        public Criteria andFphousenoEqualTo(String value) {
            addCriterion("fpHouseNo =", value, "fphouseno");
            return (Criteria) this;
        }

        public Criteria andFphousenoNotEqualTo(String value) {
            addCriterion("fpHouseNo <>", value, "fphouseno");
            return (Criteria) this;
        }

        public Criteria andFphousenoGreaterThan(String value) {
            addCriterion("fpHouseNo >", value, "fphouseno");
            return (Criteria) this;
        }

        public Criteria andFphousenoGreaterThanOrEqualTo(String value) {
            addCriterion("fpHouseNo >=", value, "fphouseno");
            return (Criteria) this;
        }

        public Criteria andFphousenoLessThan(String value) {
            addCriterion("fpHouseNo <", value, "fphouseno");
            return (Criteria) this;
        }

        public Criteria andFphousenoLessThanOrEqualTo(String value) {
            addCriterion("fpHouseNo <=", value, "fphouseno");
            return (Criteria) this;
        }

        public Criteria andFphousenoLike(String value) {
            addCriterion("fpHouseNo like", value, "fphouseno");
            return (Criteria) this;
        }

        public Criteria andFphousenoNotLike(String value) {
            addCriterion("fpHouseNo not like", value, "fphouseno");
            return (Criteria) this;
        }

        public Criteria andFphousenoIn(List<String> values) {
            addCriterion("fpHouseNo in", values, "fphouseno");
            return (Criteria) this;
        }

        public Criteria andFphousenoNotIn(List<String> values) {
            addCriterion("fpHouseNo not in", values, "fphouseno");
            return (Criteria) this;
        }

        public Criteria andFphousenoBetween(String value1, String value2) {
            addCriterion("fpHouseNo between", value1, value2, "fphouseno");
            return (Criteria) this;
        }

        public Criteria andFphousenoNotBetween(String value1, String value2) {
            addCriterion("fpHouseNo not between", value1, value2, "fphouseno");
            return (Criteria) this;
        }

        public Criteria andFaddressIsNull() {
            addCriterion("fAddress is null");
            return (Criteria) this;
        }

        public Criteria andFaddressIsNotNull() {
            addCriterion("fAddress is not null");
            return (Criteria) this;
        }

        public Criteria andFaddressEqualTo(String value) {
            addCriterion("fAddress =", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotEqualTo(String value) {
            addCriterion("fAddress <>", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressGreaterThan(String value) {
            addCriterion("fAddress >", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressGreaterThanOrEqualTo(String value) {
            addCriterion("fAddress >=", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressLessThan(String value) {
            addCriterion("fAddress <", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressLessThanOrEqualTo(String value) {
            addCriterion("fAddress <=", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressLike(String value) {
            addCriterion("fAddress like", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotLike(String value) {
            addCriterion("fAddress not like", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressIn(List<String> values) {
            addCriterion("fAddress in", values, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotIn(List<String> values) {
            addCriterion("fAddress not in", values, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressBetween(String value1, String value2) {
            addCriterion("fAddress between", value1, value2, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotBetween(String value1, String value2) {
            addCriterion("fAddress not between", value1, value2, "faddress");
            return (Criteria) this;
        }

        public Criteria andFahousenoIsNull() {
            addCriterion("faHouseNo is null");
            return (Criteria) this;
        }

        public Criteria andFahousenoIsNotNull() {
            addCriterion("faHouseNo is not null");
            return (Criteria) this;
        }

        public Criteria andFahousenoEqualTo(String value) {
            addCriterion("faHouseNo =", value, "fahouseno");
            return (Criteria) this;
        }

        public Criteria andFahousenoNotEqualTo(String value) {
            addCriterion("faHouseNo <>", value, "fahouseno");
            return (Criteria) this;
        }

        public Criteria andFahousenoGreaterThan(String value) {
            addCriterion("faHouseNo >", value, "fahouseno");
            return (Criteria) this;
        }

        public Criteria andFahousenoGreaterThanOrEqualTo(String value) {
            addCriterion("faHouseNo >=", value, "fahouseno");
            return (Criteria) this;
        }

        public Criteria andFahousenoLessThan(String value) {
            addCriterion("faHouseNo <", value, "fahouseno");
            return (Criteria) this;
        }

        public Criteria andFahousenoLessThanOrEqualTo(String value) {
            addCriterion("faHouseNo <=", value, "fahouseno");
            return (Criteria) this;
        }

        public Criteria andFahousenoLike(String value) {
            addCriterion("faHouseNo like", value, "fahouseno");
            return (Criteria) this;
        }

        public Criteria andFahousenoNotLike(String value) {
            addCriterion("faHouseNo not like", value, "fahouseno");
            return (Criteria) this;
        }

        public Criteria andFahousenoIn(List<String> values) {
            addCriterion("faHouseNo in", values, "fahouseno");
            return (Criteria) this;
        }

        public Criteria andFahousenoNotIn(List<String> values) {
            addCriterion("faHouseNo not in", values, "fahouseno");
            return (Criteria) this;
        }

        public Criteria andFahousenoBetween(String value1, String value2) {
            addCriterion("faHouseNo between", value1, value2, "fahouseno");
            return (Criteria) this;
        }

        public Criteria andFahousenoNotBetween(String value1, String value2) {
            addCriterion("faHouseNo not between", value1, value2, "fahouseno");
            return (Criteria) this;
        }

        public Criteria andFcompanynameIsNull() {
            addCriterion("fCompanyName is null");
            return (Criteria) this;
        }

        public Criteria andFcompanynameIsNotNull() {
            addCriterion("fCompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andFcompanynameEqualTo(String value) {
            addCriterion("fCompanyName =", value, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andFcompanynameNotEqualTo(String value) {
            addCriterion("fCompanyName <>", value, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andFcompanynameGreaterThan(String value) {
            addCriterion("fCompanyName >", value, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andFcompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("fCompanyName >=", value, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andFcompanynameLessThan(String value) {
            addCriterion("fCompanyName <", value, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andFcompanynameLessThanOrEqualTo(String value) {
            addCriterion("fCompanyName <=", value, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andFcompanynameLike(String value) {
            addCriterion("fCompanyName like", value, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andFcompanynameNotLike(String value) {
            addCriterion("fCompanyName not like", value, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andFcompanynameIn(List<String> values) {
            addCriterion("fCompanyName in", values, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andFcompanynameNotIn(List<String> values) {
            addCriterion("fCompanyName not in", values, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andFcompanynameBetween(String value1, String value2) {
            addCriterion("fCompanyName between", value1, value2, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andFcompanynameNotBetween(String value1, String value2) {
            addCriterion("fCompanyName not between", value1, value2, "fcompanyname");
            return (Criteria) this;
        }

        public Criteria andFcompanyaddrIsNull() {
            addCriterion("fCompanyAddr is null");
            return (Criteria) this;
        }

        public Criteria andFcompanyaddrIsNotNull() {
            addCriterion("fCompanyAddr is not null");
            return (Criteria) this;
        }

        public Criteria andFcompanyaddrEqualTo(String value) {
            addCriterion("fCompanyAddr =", value, "fcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andFcompanyaddrNotEqualTo(String value) {
            addCriterion("fCompanyAddr <>", value, "fcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andFcompanyaddrGreaterThan(String value) {
            addCriterion("fCompanyAddr >", value, "fcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andFcompanyaddrGreaterThanOrEqualTo(String value) {
            addCriterion("fCompanyAddr >=", value, "fcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andFcompanyaddrLessThan(String value) {
            addCriterion("fCompanyAddr <", value, "fcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andFcompanyaddrLessThanOrEqualTo(String value) {
            addCriterion("fCompanyAddr <=", value, "fcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andFcompanyaddrLike(String value) {
            addCriterion("fCompanyAddr like", value, "fcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andFcompanyaddrNotLike(String value) {
            addCriterion("fCompanyAddr not like", value, "fcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andFcompanyaddrIn(List<String> values) {
            addCriterion("fCompanyAddr in", values, "fcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andFcompanyaddrNotIn(List<String> values) {
            addCriterion("fCompanyAddr not in", values, "fcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andFcompanyaddrBetween(String value1, String value2) {
            addCriterion("fCompanyAddr between", value1, value2, "fcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andFcompanyaddrNotBetween(String value1, String value2) {
            addCriterion("fCompanyAddr not between", value1, value2, "fcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("mName is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mName is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mName =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mName <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mName >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mName >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mName <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mName <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mName like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mName not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mName in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mName not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mName between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mName not between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMidcardnoIsNull() {
            addCriterion("mIdCardNo is null");
            return (Criteria) this;
        }

        public Criteria andMidcardnoIsNotNull() {
            addCriterion("mIdCardNo is not null");
            return (Criteria) this;
        }

        public Criteria andMidcardnoEqualTo(String value) {
            addCriterion("mIdCardNo =", value, "midcardno");
            return (Criteria) this;
        }

        public Criteria andMidcardnoNotEqualTo(String value) {
            addCriterion("mIdCardNo <>", value, "midcardno");
            return (Criteria) this;
        }

        public Criteria andMidcardnoGreaterThan(String value) {
            addCriterion("mIdCardNo >", value, "midcardno");
            return (Criteria) this;
        }

        public Criteria andMidcardnoGreaterThanOrEqualTo(String value) {
            addCriterion("mIdCardNo >=", value, "midcardno");
            return (Criteria) this;
        }

        public Criteria andMidcardnoLessThan(String value) {
            addCriterion("mIdCardNo <", value, "midcardno");
            return (Criteria) this;
        }

        public Criteria andMidcardnoLessThanOrEqualTo(String value) {
            addCriterion("mIdCardNo <=", value, "midcardno");
            return (Criteria) this;
        }

        public Criteria andMidcardnoLike(String value) {
            addCriterion("mIdCardNo like", value, "midcardno");
            return (Criteria) this;
        }

        public Criteria andMidcardnoNotLike(String value) {
            addCriterion("mIdCardNo not like", value, "midcardno");
            return (Criteria) this;
        }

        public Criteria andMidcardnoIn(List<String> values) {
            addCriterion("mIdCardNo in", values, "midcardno");
            return (Criteria) this;
        }

        public Criteria andMidcardnoNotIn(List<String> values) {
            addCriterion("mIdCardNo not in", values, "midcardno");
            return (Criteria) this;
        }

        public Criteria andMidcardnoBetween(String value1, String value2) {
            addCriterion("mIdCardNo between", value1, value2, "midcardno");
            return (Criteria) this;
        }

        public Criteria andMidcardnoNotBetween(String value1, String value2) {
            addCriterion("mIdCardNo not between", value1, value2, "midcardno");
            return (Criteria) this;
        }

        public Criteria andMphoneIsNull() {
            addCriterion("mPhone is null");
            return (Criteria) this;
        }

        public Criteria andMphoneIsNotNull() {
            addCriterion("mPhone is not null");
            return (Criteria) this;
        }

        public Criteria andMphoneEqualTo(String value) {
            addCriterion("mPhone =", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotEqualTo(String value) {
            addCriterion("mPhone <>", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneGreaterThan(String value) {
            addCriterion("mPhone >", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneGreaterThanOrEqualTo(String value) {
            addCriterion("mPhone >=", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneLessThan(String value) {
            addCriterion("mPhone <", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneLessThanOrEqualTo(String value) {
            addCriterion("mPhone <=", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneLike(String value) {
            addCriterion("mPhone like", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotLike(String value) {
            addCriterion("mPhone not like", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneIn(List<String> values) {
            addCriterion("mPhone in", values, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotIn(List<String> values) {
            addCriterion("mPhone not in", values, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneBetween(String value1, String value2) {
            addCriterion("mPhone between", value1, value2, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotBetween(String value1, String value2) {
            addCriterion("mPhone not between", value1, value2, "mphone");
            return (Criteria) this;
        }

        public Criteria andMpermanentaddressIsNull() {
            addCriterion("mPermanentAddress is null");
            return (Criteria) this;
        }

        public Criteria andMpermanentaddressIsNotNull() {
            addCriterion("mPermanentAddress is not null");
            return (Criteria) this;
        }

        public Criteria andMpermanentaddressEqualTo(String value) {
            addCriterion("mPermanentAddress =", value, "mpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andMpermanentaddressNotEqualTo(String value) {
            addCriterion("mPermanentAddress <>", value, "mpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andMpermanentaddressGreaterThan(String value) {
            addCriterion("mPermanentAddress >", value, "mpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andMpermanentaddressGreaterThanOrEqualTo(String value) {
            addCriterion("mPermanentAddress >=", value, "mpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andMpermanentaddressLessThan(String value) {
            addCriterion("mPermanentAddress <", value, "mpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andMpermanentaddressLessThanOrEqualTo(String value) {
            addCriterion("mPermanentAddress <=", value, "mpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andMpermanentaddressLike(String value) {
            addCriterion("mPermanentAddress like", value, "mpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andMpermanentaddressNotLike(String value) {
            addCriterion("mPermanentAddress not like", value, "mpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andMpermanentaddressIn(List<String> values) {
            addCriterion("mPermanentAddress in", values, "mpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andMpermanentaddressNotIn(List<String> values) {
            addCriterion("mPermanentAddress not in", values, "mpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andMpermanentaddressBetween(String value1, String value2) {
            addCriterion("mPermanentAddress between", value1, value2, "mpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andMpermanentaddressNotBetween(String value1, String value2) {
            addCriterion("mPermanentAddress not between", value1, value2, "mpermanentaddress");
            return (Criteria) this;
        }

        public Criteria andMphousenoIsNull() {
            addCriterion("mpHouseNo is null");
            return (Criteria) this;
        }

        public Criteria andMphousenoIsNotNull() {
            addCriterion("mpHouseNo is not null");
            return (Criteria) this;
        }

        public Criteria andMphousenoEqualTo(String value) {
            addCriterion("mpHouseNo =", value, "mphouseno");
            return (Criteria) this;
        }

        public Criteria andMphousenoNotEqualTo(String value) {
            addCriterion("mpHouseNo <>", value, "mphouseno");
            return (Criteria) this;
        }

        public Criteria andMphousenoGreaterThan(String value) {
            addCriterion("mpHouseNo >", value, "mphouseno");
            return (Criteria) this;
        }

        public Criteria andMphousenoGreaterThanOrEqualTo(String value) {
            addCriterion("mpHouseNo >=", value, "mphouseno");
            return (Criteria) this;
        }

        public Criteria andMphousenoLessThan(String value) {
            addCriterion("mpHouseNo <", value, "mphouseno");
            return (Criteria) this;
        }

        public Criteria andMphousenoLessThanOrEqualTo(String value) {
            addCriterion("mpHouseNo <=", value, "mphouseno");
            return (Criteria) this;
        }

        public Criteria andMphousenoLike(String value) {
            addCriterion("mpHouseNo like", value, "mphouseno");
            return (Criteria) this;
        }

        public Criteria andMphousenoNotLike(String value) {
            addCriterion("mpHouseNo not like", value, "mphouseno");
            return (Criteria) this;
        }

        public Criteria andMphousenoIn(List<String> values) {
            addCriterion("mpHouseNo in", values, "mphouseno");
            return (Criteria) this;
        }

        public Criteria andMphousenoNotIn(List<String> values) {
            addCriterion("mpHouseNo not in", values, "mphouseno");
            return (Criteria) this;
        }

        public Criteria andMphousenoBetween(String value1, String value2) {
            addCriterion("mpHouseNo between", value1, value2, "mphouseno");
            return (Criteria) this;
        }

        public Criteria andMphousenoNotBetween(String value1, String value2) {
            addCriterion("mpHouseNo not between", value1, value2, "mphouseno");
            return (Criteria) this;
        }

        public Criteria andMaddressIsNull() {
            addCriterion("mAddress is null");
            return (Criteria) this;
        }

        public Criteria andMaddressIsNotNull() {
            addCriterion("mAddress is not null");
            return (Criteria) this;
        }

        public Criteria andMaddressEqualTo(String value) {
            addCriterion("mAddress =", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressNotEqualTo(String value) {
            addCriterion("mAddress <>", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressGreaterThan(String value) {
            addCriterion("mAddress >", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressGreaterThanOrEqualTo(String value) {
            addCriterion("mAddress >=", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressLessThan(String value) {
            addCriterion("mAddress <", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressLessThanOrEqualTo(String value) {
            addCriterion("mAddress <=", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressLike(String value) {
            addCriterion("mAddress like", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressNotLike(String value) {
            addCriterion("mAddress not like", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressIn(List<String> values) {
            addCriterion("mAddress in", values, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressNotIn(List<String> values) {
            addCriterion("mAddress not in", values, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressBetween(String value1, String value2) {
            addCriterion("mAddress between", value1, value2, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressNotBetween(String value1, String value2) {
            addCriterion("mAddress not between", value1, value2, "maddress");
            return (Criteria) this;
        }

        public Criteria andMahousenoIsNull() {
            addCriterion("maHouseNo is null");
            return (Criteria) this;
        }

        public Criteria andMahousenoIsNotNull() {
            addCriterion("maHouseNo is not null");
            return (Criteria) this;
        }

        public Criteria andMahousenoEqualTo(String value) {
            addCriterion("maHouseNo =", value, "mahouseno");
            return (Criteria) this;
        }

        public Criteria andMahousenoNotEqualTo(String value) {
            addCriterion("maHouseNo <>", value, "mahouseno");
            return (Criteria) this;
        }

        public Criteria andMahousenoGreaterThan(String value) {
            addCriterion("maHouseNo >", value, "mahouseno");
            return (Criteria) this;
        }

        public Criteria andMahousenoGreaterThanOrEqualTo(String value) {
            addCriterion("maHouseNo >=", value, "mahouseno");
            return (Criteria) this;
        }

        public Criteria andMahousenoLessThan(String value) {
            addCriterion("maHouseNo <", value, "mahouseno");
            return (Criteria) this;
        }

        public Criteria andMahousenoLessThanOrEqualTo(String value) {
            addCriterion("maHouseNo <=", value, "mahouseno");
            return (Criteria) this;
        }

        public Criteria andMahousenoLike(String value) {
            addCriterion("maHouseNo like", value, "mahouseno");
            return (Criteria) this;
        }

        public Criteria andMahousenoNotLike(String value) {
            addCriterion("maHouseNo not like", value, "mahouseno");
            return (Criteria) this;
        }

        public Criteria andMahousenoIn(List<String> values) {
            addCriterion("maHouseNo in", values, "mahouseno");
            return (Criteria) this;
        }

        public Criteria andMahousenoNotIn(List<String> values) {
            addCriterion("maHouseNo not in", values, "mahouseno");
            return (Criteria) this;
        }

        public Criteria andMahousenoBetween(String value1, String value2) {
            addCriterion("maHouseNo between", value1, value2, "mahouseno");
            return (Criteria) this;
        }

        public Criteria andMahousenoNotBetween(String value1, String value2) {
            addCriterion("maHouseNo not between", value1, value2, "mahouseno");
            return (Criteria) this;
        }

        public Criteria andMcompanynameIsNull() {
            addCriterion("mCompanyName is null");
            return (Criteria) this;
        }

        public Criteria andMcompanynameIsNotNull() {
            addCriterion("mCompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andMcompanynameEqualTo(String value) {
            addCriterion("mCompanyName =", value, "mcompanyname");
            return (Criteria) this;
        }

        public Criteria andMcompanynameNotEqualTo(String value) {
            addCriterion("mCompanyName <>", value, "mcompanyname");
            return (Criteria) this;
        }

        public Criteria andMcompanynameGreaterThan(String value) {
            addCriterion("mCompanyName >", value, "mcompanyname");
            return (Criteria) this;
        }

        public Criteria andMcompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("mCompanyName >=", value, "mcompanyname");
            return (Criteria) this;
        }

        public Criteria andMcompanynameLessThan(String value) {
            addCriterion("mCompanyName <", value, "mcompanyname");
            return (Criteria) this;
        }

        public Criteria andMcompanynameLessThanOrEqualTo(String value) {
            addCriterion("mCompanyName <=", value, "mcompanyname");
            return (Criteria) this;
        }

        public Criteria andMcompanynameLike(String value) {
            addCriterion("mCompanyName like", value, "mcompanyname");
            return (Criteria) this;
        }

        public Criteria andMcompanynameNotLike(String value) {
            addCriterion("mCompanyName not like", value, "mcompanyname");
            return (Criteria) this;
        }

        public Criteria andMcompanynameIn(List<String> values) {
            addCriterion("mCompanyName in", values, "mcompanyname");
            return (Criteria) this;
        }

        public Criteria andMcompanynameNotIn(List<String> values) {
            addCriterion("mCompanyName not in", values, "mcompanyname");
            return (Criteria) this;
        }

        public Criteria andMcompanynameBetween(String value1, String value2) {
            addCriterion("mCompanyName between", value1, value2, "mcompanyname");
            return (Criteria) this;
        }

        public Criteria andMcompanynameNotBetween(String value1, String value2) {
            addCriterion("mCompanyName not between", value1, value2, "mcompanyname");
            return (Criteria) this;
        }

        public Criteria andMcompanyaddrIsNull() {
            addCriterion("mCompanyAddr is null");
            return (Criteria) this;
        }

        public Criteria andMcompanyaddrIsNotNull() {
            addCriterion("mCompanyAddr is not null");
            return (Criteria) this;
        }

        public Criteria andMcompanyaddrEqualTo(String value) {
            addCriterion("mCompanyAddr =", value, "mcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andMcompanyaddrNotEqualTo(String value) {
            addCriterion("mCompanyAddr <>", value, "mcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andMcompanyaddrGreaterThan(String value) {
            addCriterion("mCompanyAddr >", value, "mcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andMcompanyaddrGreaterThanOrEqualTo(String value) {
            addCriterion("mCompanyAddr >=", value, "mcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andMcompanyaddrLessThan(String value) {
            addCriterion("mCompanyAddr <", value, "mcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andMcompanyaddrLessThanOrEqualTo(String value) {
            addCriterion("mCompanyAddr <=", value, "mcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andMcompanyaddrLike(String value) {
            addCriterion("mCompanyAddr like", value, "mcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andMcompanyaddrNotLike(String value) {
            addCriterion("mCompanyAddr not like", value, "mcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andMcompanyaddrIn(List<String> values) {
            addCriterion("mCompanyAddr in", values, "mcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andMcompanyaddrNotIn(List<String> values) {
            addCriterion("mCompanyAddr not in", values, "mcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andMcompanyaddrBetween(String value1, String value2) {
            addCriterion("mCompanyAddr between", value1, value2, "mcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andMcompanyaddrNotBetween(String value1, String value2) {
            addCriterion("mCompanyAddr not between", value1, value2, "mcompanyaddr");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNull() {
            addCriterion("maritalStatus is null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNotNull() {
            addCriterion("maritalStatus is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusEqualTo(String value) {
            addCriterion("maritalStatus =", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotEqualTo(String value) {
            addCriterion("maritalStatus <>", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThan(String value) {
            addCriterion("maritalStatus >", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThanOrEqualTo(String value) {
            addCriterion("maritalStatus >=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThan(String value) {
            addCriterion("maritalStatus <", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThanOrEqualTo(String value) {
            addCriterion("maritalStatus <=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLike(String value) {
            addCriterion("maritalStatus like", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotLike(String value) {
            addCriterion("maritalStatus not like", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIn(List<String> values) {
            addCriterion("maritalStatus in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotIn(List<String> values) {
            addCriterion("maritalStatus not in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusBetween(String value1, String value2) {
            addCriterion("maritalStatus between", value1, value2, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotBetween(String value1, String value2) {
            addCriterion("maritalStatus not between", value1, value2, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMarriagenoIsNull() {
            addCriterion("marriageNo is null");
            return (Criteria) this;
        }

        public Criteria andMarriagenoIsNotNull() {
            addCriterion("marriageNo is not null");
            return (Criteria) this;
        }

        public Criteria andMarriagenoEqualTo(String value) {
            addCriterion("marriageNo =", value, "marriageno");
            return (Criteria) this;
        }

        public Criteria andMarriagenoNotEqualTo(String value) {
            addCriterion("marriageNo <>", value, "marriageno");
            return (Criteria) this;
        }

        public Criteria andMarriagenoGreaterThan(String value) {
            addCriterion("marriageNo >", value, "marriageno");
            return (Criteria) this;
        }

        public Criteria andMarriagenoGreaterThanOrEqualTo(String value) {
            addCriterion("marriageNo >=", value, "marriageno");
            return (Criteria) this;
        }

        public Criteria andMarriagenoLessThan(String value) {
            addCriterion("marriageNo <", value, "marriageno");
            return (Criteria) this;
        }

        public Criteria andMarriagenoLessThanOrEqualTo(String value) {
            addCriterion("marriageNo <=", value, "marriageno");
            return (Criteria) this;
        }

        public Criteria andMarriagenoLike(String value) {
            addCriterion("marriageNo like", value, "marriageno");
            return (Criteria) this;
        }

        public Criteria andMarriagenoNotLike(String value) {
            addCriterion("marriageNo not like", value, "marriageno");
            return (Criteria) this;
        }

        public Criteria andMarriagenoIn(List<String> values) {
            addCriterion("marriageNo in", values, "marriageno");
            return (Criteria) this;
        }

        public Criteria andMarriagenoNotIn(List<String> values) {
            addCriterion("marriageNo not in", values, "marriageno");
            return (Criteria) this;
        }

        public Criteria andMarriagenoBetween(String value1, String value2) {
            addCriterion("marriageNo between", value1, value2, "marriageno");
            return (Criteria) this;
        }

        public Criteria andMarriagenoNotBetween(String value1, String value2) {
            addCriterion("marriageNo not between", value1, value2, "marriageno");
            return (Criteria) this;
        }

        public Criteria andMarriagedateIsNull() {
            addCriterion("marriageDate is null");
            return (Criteria) this;
        }

        public Criteria andMarriagedateIsNotNull() {
            addCriterion("marriageDate is not null");
            return (Criteria) this;
        }

        public Criteria andMarriagedateEqualTo(Date value) {
            addCriterionForJDBCDate("marriageDate =", value, "marriagedate");
            return (Criteria) this;
        }

        public Criteria andMarriagedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("marriageDate <>", value, "marriagedate");
            return (Criteria) this;
        }

        public Criteria andMarriagedateGreaterThan(Date value) {
            addCriterionForJDBCDate("marriageDate >", value, "marriagedate");
            return (Criteria) this;
        }

        public Criteria andMarriagedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("marriageDate >=", value, "marriagedate");
            return (Criteria) this;
        }

        public Criteria andMarriagedateLessThan(Date value) {
            addCriterionForJDBCDate("marriageDate <", value, "marriagedate");
            return (Criteria) this;
        }

        public Criteria andMarriagedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("marriageDate <=", value, "marriagedate");
            return (Criteria) this;
        }

        public Criteria andMarriagedateIn(List<Date> values) {
            addCriterionForJDBCDate("marriageDate in", values, "marriagedate");
            return (Criteria) this;
        }

        public Criteria andMarriagedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("marriageDate not in", values, "marriagedate");
            return (Criteria) this;
        }

        public Criteria andMarriagedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("marriageDate between", value1, value2, "marriagedate");
            return (Criteria) this;
        }

        public Criteria andMarriagedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("marriageDate not between", value1, value2, "marriagedate");
            return (Criteria) this;
        }

        public Criteria andHaschildIsNull() {
            addCriterion("hasChild is null");
            return (Criteria) this;
        }

        public Criteria andHaschildIsNotNull() {
            addCriterion("hasChild is not null");
            return (Criteria) this;
        }

        public Criteria andHaschildEqualTo(String value) {
            addCriterion("hasChild =", value, "haschild");
            return (Criteria) this;
        }

        public Criteria andHaschildNotEqualTo(String value) {
            addCriterion("hasChild <>", value, "haschild");
            return (Criteria) this;
        }

        public Criteria andHaschildGreaterThan(String value) {
            addCriterion("hasChild >", value, "haschild");
            return (Criteria) this;
        }

        public Criteria andHaschildGreaterThanOrEqualTo(String value) {
            addCriterion("hasChild >=", value, "haschild");
            return (Criteria) this;
        }

        public Criteria andHaschildLessThan(String value) {
            addCriterion("hasChild <", value, "haschild");
            return (Criteria) this;
        }

        public Criteria andHaschildLessThanOrEqualTo(String value) {
            addCriterion("hasChild <=", value, "haschild");
            return (Criteria) this;
        }

        public Criteria andHaschildLike(String value) {
            addCriterion("hasChild like", value, "haschild");
            return (Criteria) this;
        }

        public Criteria andHaschildNotLike(String value) {
            addCriterion("hasChild not like", value, "haschild");
            return (Criteria) this;
        }

        public Criteria andHaschildIn(List<String> values) {
            addCriterion("hasChild in", values, "haschild");
            return (Criteria) this;
        }

        public Criteria andHaschildNotIn(List<String> values) {
            addCriterion("hasChild not in", values, "haschild");
            return (Criteria) this;
        }

        public Criteria andHaschildBetween(String value1, String value2) {
            addCriterion("hasChild between", value1, value2, "haschild");
            return (Criteria) this;
        }

        public Criteria andHaschildNotBetween(String value1, String value2) {
            addCriterion("hasChild not between", value1, value2, "haschild");
            return (Criteria) this;
        }

        public Criteria andIsadoptedIsNull() {
            addCriterion("isAdopted is null");
            return (Criteria) this;
        }

        public Criteria andIsadoptedIsNotNull() {
            addCriterion("isAdopted is not null");
            return (Criteria) this;
        }

        public Criteria andIsadoptedEqualTo(String value) {
            addCriterion("isAdopted =", value, "isadopted");
            return (Criteria) this;
        }

        public Criteria andIsadoptedNotEqualTo(String value) {
            addCriterion("isAdopted <>", value, "isadopted");
            return (Criteria) this;
        }

        public Criteria andIsadoptedGreaterThan(String value) {
            addCriterion("isAdopted >", value, "isadopted");
            return (Criteria) this;
        }

        public Criteria andIsadoptedGreaterThanOrEqualTo(String value) {
            addCriterion("isAdopted >=", value, "isadopted");
            return (Criteria) this;
        }

        public Criteria andIsadoptedLessThan(String value) {
            addCriterion("isAdopted <", value, "isadopted");
            return (Criteria) this;
        }

        public Criteria andIsadoptedLessThanOrEqualTo(String value) {
            addCriterion("isAdopted <=", value, "isadopted");
            return (Criteria) this;
        }

        public Criteria andIsadoptedLike(String value) {
            addCriterion("isAdopted like", value, "isadopted");
            return (Criteria) this;
        }

        public Criteria andIsadoptedNotLike(String value) {
            addCriterion("isAdopted not like", value, "isadopted");
            return (Criteria) this;
        }

        public Criteria andIsadoptedIn(List<String> values) {
            addCriterion("isAdopted in", values, "isadopted");
            return (Criteria) this;
        }

        public Criteria andIsadoptedNotIn(List<String> values) {
            addCriterion("isAdopted not in", values, "isadopted");
            return (Criteria) this;
        }

        public Criteria andIsadoptedBetween(String value1, String value2) {
            addCriterion("isAdopted between", value1, value2, "isadopted");
            return (Criteria) this;
        }

        public Criteria andIsadoptedNotBetween(String value1, String value2) {
            addCriterion("isAdopted not between", value1, value2, "isadopted");
            return (Criteria) this;
        }

        public Criteria andResidencenoIsNull() {
            addCriterion("residenceNo is null");
            return (Criteria) this;
        }

        public Criteria andResidencenoIsNotNull() {
            addCriterion("residenceNo is not null");
            return (Criteria) this;
        }

        public Criteria andResidencenoEqualTo(String value) {
            addCriterion("residenceNo =", value, "residenceno");
            return (Criteria) this;
        }

        public Criteria andResidencenoNotEqualTo(String value) {
            addCriterion("residenceNo <>", value, "residenceno");
            return (Criteria) this;
        }

        public Criteria andResidencenoGreaterThan(String value) {
            addCriterion("residenceNo >", value, "residenceno");
            return (Criteria) this;
        }

        public Criteria andResidencenoGreaterThanOrEqualTo(String value) {
            addCriterion("residenceNo >=", value, "residenceno");
            return (Criteria) this;
        }

        public Criteria andResidencenoLessThan(String value) {
            addCriterion("residenceNo <", value, "residenceno");
            return (Criteria) this;
        }

        public Criteria andResidencenoLessThanOrEqualTo(String value) {
            addCriterion("residenceNo <=", value, "residenceno");
            return (Criteria) this;
        }

        public Criteria andResidencenoLike(String value) {
            addCriterion("residenceNo like", value, "residenceno");
            return (Criteria) this;
        }

        public Criteria andResidencenoNotLike(String value) {
            addCriterion("residenceNo not like", value, "residenceno");
            return (Criteria) this;
        }

        public Criteria andResidencenoIn(List<String> values) {
            addCriterion("residenceNo in", values, "residenceno");
            return (Criteria) this;
        }

        public Criteria andResidencenoNotIn(List<String> values) {
            addCriterion("residenceNo not in", values, "residenceno");
            return (Criteria) this;
        }

        public Criteria andResidencenoBetween(String value1, String value2) {
            addCriterion("residenceNo between", value1, value2, "residenceno");
            return (Criteria) this;
        }

        public Criteria andResidencenoNotBetween(String value1, String value2) {
            addCriterion("residenceNo not between", value1, value2, "residenceno");
            return (Criteria) this;
        }

        public Criteria andGetresidencedateIsNull() {
            addCriterion("getResidenceDate is null");
            return (Criteria) this;
        }

        public Criteria andGetresidencedateIsNotNull() {
            addCriterion("getResidenceDate is not null");
            return (Criteria) this;
        }

        public Criteria andGetresidencedateEqualTo(Date value) {
            addCriterionForJDBCDate("getResidenceDate =", value, "getresidencedate");
            return (Criteria) this;
        }

        public Criteria andGetresidencedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("getResidenceDate <>", value, "getresidencedate");
            return (Criteria) this;
        }

        public Criteria andGetresidencedateGreaterThan(Date value) {
            addCriterionForJDBCDate("getResidenceDate >", value, "getresidencedate");
            return (Criteria) this;
        }

        public Criteria andGetresidencedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("getResidenceDate >=", value, "getresidencedate");
            return (Criteria) this;
        }

        public Criteria andGetresidencedateLessThan(Date value) {
            addCriterionForJDBCDate("getResidenceDate <", value, "getresidencedate");
            return (Criteria) this;
        }

        public Criteria andGetresidencedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("getResidenceDate <=", value, "getresidencedate");
            return (Criteria) this;
        }

        public Criteria andGetresidencedateIn(List<Date> values) {
            addCriterionForJDBCDate("getResidenceDate in", values, "getresidencedate");
            return (Criteria) this;
        }

        public Criteria andGetresidencedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("getResidenceDate not in", values, "getresidencedate");
            return (Criteria) this;
        }

        public Criteria andGetresidencedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("getResidenceDate between", value1, value2, "getresidencedate");
            return (Criteria) this;
        }

        public Criteria andGetresidencedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("getResidenceDate not between", value1, value2, "getresidencedate");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddrIsNull() {
            addCriterion("registrationAddr is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddrIsNotNull() {
            addCriterion("registrationAddr is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddrEqualTo(String value) {
            addCriterion("registrationAddr =", value, "registrationaddr");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddrNotEqualTo(String value) {
            addCriterion("registrationAddr <>", value, "registrationaddr");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddrGreaterThan(String value) {
            addCriterion("registrationAddr >", value, "registrationaddr");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddrGreaterThanOrEqualTo(String value) {
            addCriterion("registrationAddr >=", value, "registrationaddr");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddrLessThan(String value) {
            addCriterion("registrationAddr <", value, "registrationaddr");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddrLessThanOrEqualTo(String value) {
            addCriterion("registrationAddr <=", value, "registrationaddr");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddrLike(String value) {
            addCriterion("registrationAddr like", value, "registrationaddr");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddrNotLike(String value) {
            addCriterion("registrationAddr not like", value, "registrationaddr");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddrIn(List<String> values) {
            addCriterion("registrationAddr in", values, "registrationaddr");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddrNotIn(List<String> values) {
            addCriterion("registrationAddr not in", values, "registrationaddr");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddrBetween(String value1, String value2) {
            addCriterion("registrationAddr between", value1, value2, "registrationaddr");
            return (Criteria) this;
        }

        public Criteria andRegistrationaddrNotBetween(String value1, String value2) {
            addCriterion("registrationAddr not between", value1, value2, "registrationaddr");
            return (Criteria) this;
        }

        public Criteria andServicenoIsNull() {
            addCriterion("serviceNo is null");
            return (Criteria) this;
        }

        public Criteria andServicenoIsNotNull() {
            addCriterion("serviceNo is not null");
            return (Criteria) this;
        }

        public Criteria andServicenoEqualTo(String value) {
            addCriterion("serviceNo =", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoNotEqualTo(String value) {
            addCriterion("serviceNo <>", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoGreaterThan(String value) {
            addCriterion("serviceNo >", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoGreaterThanOrEqualTo(String value) {
            addCriterion("serviceNo >=", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoLessThan(String value) {
            addCriterion("serviceNo <", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoLessThanOrEqualTo(String value) {
            addCriterion("serviceNo <=", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoLike(String value) {
            addCriterion("serviceNo like", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoNotLike(String value) {
            addCriterion("serviceNo not like", value, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoIn(List<String> values) {
            addCriterion("serviceNo in", values, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoNotIn(List<String> values) {
            addCriterion("serviceNo not in", values, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoBetween(String value1, String value2) {
            addCriterion("serviceNo between", value1, value2, "serviceno");
            return (Criteria) this;
        }

        public Criteria andServicenoNotBetween(String value1, String value2) {
            addCriterion("serviceNo not between", value1, value2, "serviceno");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateIsNull() {
            addCriterion("registrationDate is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateIsNotNull() {
            addCriterion("registrationDate is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateEqualTo(Date value) {
            addCriterionForJDBCDate("registrationDate =", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("registrationDate <>", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateGreaterThan(Date value) {
            addCriterionForJDBCDate("registrationDate >", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registrationDate >=", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateLessThan(Date value) {
            addCriterionForJDBCDate("registrationDate <", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registrationDate <=", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateIn(List<Date> values) {
            addCriterionForJDBCDate("registrationDate in", values, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("registrationDate not in", values, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registrationDate between", value1, value2, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registrationDate not between", value1, value2, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOpphoneIsNull() {
            addCriterion("opPhone is null");
            return (Criteria) this;
        }

        public Criteria andOpphoneIsNotNull() {
            addCriterion("opPhone is not null");
            return (Criteria) this;
        }

        public Criteria andOpphoneEqualTo(String value) {
            addCriterion("opPhone =", value, "opphone");
            return (Criteria) this;
        }

        public Criteria andOpphoneNotEqualTo(String value) {
            addCriterion("opPhone <>", value, "opphone");
            return (Criteria) this;
        }

        public Criteria andOpphoneGreaterThan(String value) {
            addCriterion("opPhone >", value, "opphone");
            return (Criteria) this;
        }

        public Criteria andOpphoneGreaterThanOrEqualTo(String value) {
            addCriterion("opPhone >=", value, "opphone");
            return (Criteria) this;
        }

        public Criteria andOpphoneLessThan(String value) {
            addCriterion("opPhone <", value, "opphone");
            return (Criteria) this;
        }

        public Criteria andOpphoneLessThanOrEqualTo(String value) {
            addCriterion("opPhone <=", value, "opphone");
            return (Criteria) this;
        }

        public Criteria andOpphoneLike(String value) {
            addCriterion("opPhone like", value, "opphone");
            return (Criteria) this;
        }

        public Criteria andOpphoneNotLike(String value) {
            addCriterion("opPhone not like", value, "opphone");
            return (Criteria) this;
        }

        public Criteria andOpphoneIn(List<String> values) {
            addCriterion("opPhone in", values, "opphone");
            return (Criteria) this;
        }

        public Criteria andOpphoneNotIn(List<String> values) {
            addCriterion("opPhone not in", values, "opphone");
            return (Criteria) this;
        }

        public Criteria andOpphoneBetween(String value1, String value2) {
            addCriterion("opPhone between", value1, value2, "opphone");
            return (Criteria) this;
        }

        public Criteria andOpphoneNotBetween(String value1, String value2) {
            addCriterion("opPhone not between", value1, value2, "opphone");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andZhunshengzhengIsNull() {
            addCriterion("zhunShengZheng is null");
            return (Criteria) this;
        }

        public Criteria andZhunshengzhengIsNotNull() {
            addCriterion("zhunShengZheng is not null");
            return (Criteria) this;
        }

        public Criteria andZhunshengzhengEqualTo(String value) {
            addCriterion("zhunShengZheng =", value, "zhunshengzheng");
            return (Criteria) this;
        }

        public Criteria andZhunshengzhengNotEqualTo(String value) {
            addCriterion("zhunShengZheng <>", value, "zhunshengzheng");
            return (Criteria) this;
        }

        public Criteria andZhunshengzhengGreaterThan(String value) {
            addCriterion("zhunShengZheng >", value, "zhunshengzheng");
            return (Criteria) this;
        }

        public Criteria andZhunshengzhengGreaterThanOrEqualTo(String value) {
            addCriterion("zhunShengZheng >=", value, "zhunshengzheng");
            return (Criteria) this;
        }

        public Criteria andZhunshengzhengLessThan(String value) {
            addCriterion("zhunShengZheng <", value, "zhunshengzheng");
            return (Criteria) this;
        }

        public Criteria andZhunshengzhengLessThanOrEqualTo(String value) {
            addCriterion("zhunShengZheng <=", value, "zhunshengzheng");
            return (Criteria) this;
        }

        public Criteria andZhunshengzhengLike(String value) {
            addCriterion("zhunShengZheng like", value, "zhunshengzheng");
            return (Criteria) this;
        }

        public Criteria andZhunshengzhengNotLike(String value) {
            addCriterion("zhunShengZheng not like", value, "zhunshengzheng");
            return (Criteria) this;
        }

        public Criteria andZhunshengzhengIn(List<String> values) {
            addCriterion("zhunShengZheng in", values, "zhunshengzheng");
            return (Criteria) this;
        }

        public Criteria andZhunshengzhengNotIn(List<String> values) {
            addCriterion("zhunShengZheng not in", values, "zhunshengzheng");
            return (Criteria) this;
        }

        public Criteria andZhunshengzhengBetween(String value1, String value2) {
            addCriterion("zhunShengZheng between", value1, value2, "zhunshengzheng");
            return (Criteria) this;
        }

        public Criteria andZhunshengzhengNotBetween(String value1, String value2) {
            addCriterion("zhunShengZheng not between", value1, value2, "zhunshengzheng");
            return (Criteria) this;
        }

        public Criteria andLastservicetimeIsNull() {
            addCriterion("lastServiceTime is null");
            return (Criteria) this;
        }

        public Criteria andLastservicetimeIsNotNull() {
            addCriterion("lastServiceTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastservicetimeEqualTo(Date value) {
            addCriterionForJDBCDate("lastServiceTime =", value, "lastservicetime");
            return (Criteria) this;
        }

        public Criteria andLastservicetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("lastServiceTime <>", value, "lastservicetime");
            return (Criteria) this;
        }

        public Criteria andLastservicetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("lastServiceTime >", value, "lastservicetime");
            return (Criteria) this;
        }

        public Criteria andLastservicetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lastServiceTime >=", value, "lastservicetime");
            return (Criteria) this;
        }

        public Criteria andLastservicetimeLessThan(Date value) {
            addCriterionForJDBCDate("lastServiceTime <", value, "lastservicetime");
            return (Criteria) this;
        }

        public Criteria andLastservicetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lastServiceTime <=", value, "lastservicetime");
            return (Criteria) this;
        }

        public Criteria andLastservicetimeIn(List<Date> values) {
            addCriterionForJDBCDate("lastServiceTime in", values, "lastservicetime");
            return (Criteria) this;
        }

        public Criteria andLastservicetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("lastServiceTime not in", values, "lastservicetime");
            return (Criteria) this;
        }

        public Criteria andLastservicetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lastServiceTime between", value1, value2, "lastservicetime");
            return (Criteria) this;
        }

        public Criteria andLastservicetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lastServiceTime not between", value1, value2, "lastservicetime");
            return (Criteria) this;
        }

        public Criteria andLastserviceresultIsNull() {
            addCriterion("lastServiceResult is null");
            return (Criteria) this;
        }

        public Criteria andLastserviceresultIsNotNull() {
            addCriterion("lastServiceResult is not null");
            return (Criteria) this;
        }

        public Criteria andLastserviceresultEqualTo(String value) {
            addCriterion("lastServiceResult =", value, "lastserviceresult");
            return (Criteria) this;
        }

        public Criteria andLastserviceresultNotEqualTo(String value) {
            addCriterion("lastServiceResult <>", value, "lastserviceresult");
            return (Criteria) this;
        }

        public Criteria andLastserviceresultGreaterThan(String value) {
            addCriterion("lastServiceResult >", value, "lastserviceresult");
            return (Criteria) this;
        }

        public Criteria andLastserviceresultGreaterThanOrEqualTo(String value) {
            addCriterion("lastServiceResult >=", value, "lastserviceresult");
            return (Criteria) this;
        }

        public Criteria andLastserviceresultLessThan(String value) {
            addCriterion("lastServiceResult <", value, "lastserviceresult");
            return (Criteria) this;
        }

        public Criteria andLastserviceresultLessThanOrEqualTo(String value) {
            addCriterion("lastServiceResult <=", value, "lastserviceresult");
            return (Criteria) this;
        }

        public Criteria andLastserviceresultLike(String value) {
            addCriterion("lastServiceResult like", value, "lastserviceresult");
            return (Criteria) this;
        }

        public Criteria andLastserviceresultNotLike(String value) {
            addCriterion("lastServiceResult not like", value, "lastserviceresult");
            return (Criteria) this;
        }

        public Criteria andLastserviceresultIn(List<String> values) {
            addCriterion("lastServiceResult in", values, "lastserviceresult");
            return (Criteria) this;
        }

        public Criteria andLastserviceresultNotIn(List<String> values) {
            addCriterion("lastServiceResult not in", values, "lastserviceresult");
            return (Criteria) this;
        }

        public Criteria andLastserviceresultBetween(String value1, String value2) {
            addCriterion("lastServiceResult between", value1, value2, "lastserviceresult");
            return (Criteria) this;
        }

        public Criteria andLastserviceresultNotBetween(String value1, String value2) {
            addCriterion("lastServiceResult not between", value1, value2, "lastserviceresult");
            return (Criteria) this;
        }

        public Criteria andLastservicepersonIsNull() {
            addCriterion("lastServicePerson is null");
            return (Criteria) this;
        }

        public Criteria andLastservicepersonIsNotNull() {
            addCriterion("lastServicePerson is not null");
            return (Criteria) this;
        }

        public Criteria andLastservicepersonEqualTo(String value) {
            addCriterion("lastServicePerson =", value, "lastserviceperson");
            return (Criteria) this;
        }

        public Criteria andLastservicepersonNotEqualTo(String value) {
            addCriterion("lastServicePerson <>", value, "lastserviceperson");
            return (Criteria) this;
        }

        public Criteria andLastservicepersonGreaterThan(String value) {
            addCriterion("lastServicePerson >", value, "lastserviceperson");
            return (Criteria) this;
        }

        public Criteria andLastservicepersonGreaterThanOrEqualTo(String value) {
            addCriterion("lastServicePerson >=", value, "lastserviceperson");
            return (Criteria) this;
        }

        public Criteria andLastservicepersonLessThan(String value) {
            addCriterion("lastServicePerson <", value, "lastserviceperson");
            return (Criteria) this;
        }

        public Criteria andLastservicepersonLessThanOrEqualTo(String value) {
            addCriterion("lastServicePerson <=", value, "lastserviceperson");
            return (Criteria) this;
        }

        public Criteria andLastservicepersonLike(String value) {
            addCriterion("lastServicePerson like", value, "lastserviceperson");
            return (Criteria) this;
        }

        public Criteria andLastservicepersonNotLike(String value) {
            addCriterion("lastServicePerson not like", value, "lastserviceperson");
            return (Criteria) this;
        }

        public Criteria andLastservicepersonIn(List<String> values) {
            addCriterion("lastServicePerson in", values, "lastserviceperson");
            return (Criteria) this;
        }

        public Criteria andLastservicepersonNotIn(List<String> values) {
            addCriterion("lastServicePerson not in", values, "lastserviceperson");
            return (Criteria) this;
        }

        public Criteria andLastservicepersonBetween(String value1, String value2) {
            addCriterion("lastServicePerson between", value1, value2, "lastserviceperson");
            return (Criteria) this;
        }

        public Criteria andLastservicepersonNotBetween(String value1, String value2) {
            addCriterion("lastServicePerson not between", value1, value2, "lastserviceperson");
            return (Criteria) this;
        }

        public Criteria andLogoutreasonIsNull() {
            addCriterion("logoutReason is null");
            return (Criteria) this;
        }

        public Criteria andLogoutreasonIsNotNull() {
            addCriterion("logoutReason is not null");
            return (Criteria) this;
        }

        public Criteria andLogoutreasonEqualTo(String value) {
            addCriterion("logoutReason =", value, "logoutreason");
            return (Criteria) this;
        }

        public Criteria andLogoutreasonNotEqualTo(String value) {
            addCriterion("logoutReason <>", value, "logoutreason");
            return (Criteria) this;
        }

        public Criteria andLogoutreasonGreaterThan(String value) {
            addCriterion("logoutReason >", value, "logoutreason");
            return (Criteria) this;
        }

        public Criteria andLogoutreasonGreaterThanOrEqualTo(String value) {
            addCriterion("logoutReason >=", value, "logoutreason");
            return (Criteria) this;
        }

        public Criteria andLogoutreasonLessThan(String value) {
            addCriterion("logoutReason <", value, "logoutreason");
            return (Criteria) this;
        }

        public Criteria andLogoutreasonLessThanOrEqualTo(String value) {
            addCriterion("logoutReason <=", value, "logoutreason");
            return (Criteria) this;
        }

        public Criteria andLogoutreasonLike(String value) {
            addCriterion("logoutReason like", value, "logoutreason");
            return (Criteria) this;
        }

        public Criteria andLogoutreasonNotLike(String value) {
            addCriterion("logoutReason not like", value, "logoutreason");
            return (Criteria) this;
        }

        public Criteria andLogoutreasonIn(List<String> values) {
            addCriterion("logoutReason in", values, "logoutreason");
            return (Criteria) this;
        }

        public Criteria andLogoutreasonNotIn(List<String> values) {
            addCriterion("logoutReason not in", values, "logoutreason");
            return (Criteria) this;
        }

        public Criteria andLogoutreasonBetween(String value1, String value2) {
            addCriterion("logoutReason between", value1, value2, "logoutreason");
            return (Criteria) this;
        }

        public Criteria andLogoutreasonNotBetween(String value1, String value2) {
            addCriterion("logoutReason not between", value1, value2, "logoutreason");
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