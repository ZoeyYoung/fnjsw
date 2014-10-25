package fnjsw.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import fnjsw.util.Page;

public class GestationinfoExample {
    // added by c
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

    public GestationinfoExample() {
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

        protected void addCriterion(String condition, Object value,
                String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property
                        + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1,
                Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property
                        + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value,
                String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property
                        + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()),
                    property);
        }

        protected void addCriterionForJDBCDate(String condition,
                List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property
                        + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1,
                Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property
                        + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()),
                    new java.sql.Date(value2.getTime()), property);
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

        public Criteria andOcaidIsNull() {
            addCriterion("ocaid is null");
            return (Criteria) this;
        }

        public Criteria andOcaidIsNotNull() {
            addCriterion("ocaid is not null");
            return (Criteria) this;
        }

        public Criteria andOcaidEqualTo(Integer value) {
            addCriterion("ocaid =", value, "ocaid");
            return (Criteria) this;
        }

        public Criteria andOcaidNotEqualTo(Integer value) {
            addCriterion("ocaid <>", value, "ocaid");
            return (Criteria) this;
        }

        public Criteria andOcaidGreaterThan(Integer value) {
            addCriterion("ocaid >", value, "ocaid");
            return (Criteria) this;
        }

        public Criteria andOcaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ocaid >=", value, "ocaid");
            return (Criteria) this;
        }

        public Criteria andOcaidLessThan(Integer value) {
            addCriterion("ocaid <", value, "ocaid");
            return (Criteria) this;
        }

        public Criteria andOcaidLessThanOrEqualTo(Integer value) {
            addCriterion("ocaid <=", value, "ocaid");
            return (Criteria) this;
        }

        public Criteria andOcaidIn(List<Integer> values) {
            addCriterion("ocaid in", values, "ocaid");
            return (Criteria) this;
        }

        public Criteria andOcaidNotIn(List<Integer> values) {
            addCriterion("ocaid not in", values, "ocaid");
            return (Criteria) this;
        }

        public Criteria andOcaidBetween(Integer value1, Integer value2) {
            addCriterion("ocaid between", value1, value2, "ocaid");
            return (Criteria) this;
        }

        public Criteria andOcaidNotBetween(Integer value1, Integer value2) {
            addCriterion("ocaid not between", value1, value2, "ocaid");
            return (Criteria) this;
        }

        public Criteria andServicetimeIsNull() {
            addCriterion("serviceTime is null");
            return (Criteria) this;
        }

        public Criteria andServicetimeIsNotNull() {
            addCriterion("serviceTime is not null");
            return (Criteria) this;
        }

        public Criteria andServicetimeEqualTo(Date value) {
            addCriterionForJDBCDate("serviceTime =", value, "servicetime");
            return (Criteria) this;
        }

        public Criteria andServicetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("serviceTime <>", value, "servicetime");
            return (Criteria) this;
        }

        public Criteria andServicetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("serviceTime >", value, "servicetime");
            return (Criteria) this;
        }

        public Criteria andServicetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("serviceTime >=", value, "servicetime");
            return (Criteria) this;
        }

        public Criteria andServicetimeLessThan(Date value) {
            addCriterionForJDBCDate("serviceTime <", value, "servicetime");
            return (Criteria) this;
        }

        public Criteria andServicetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("serviceTime <=", value, "servicetime");
            return (Criteria) this;
        }

        public Criteria andServicetimeIn(List<Date> values) {
            addCriterionForJDBCDate("serviceTime in", values, "servicetime");
            return (Criteria) this;
        }

        public Criteria andServicetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("serviceTime not in", values, "servicetime");
            return (Criteria) this;
        }

        public Criteria andServicetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("serviceTime between", value1, value2,
                    "servicetime");
            return (Criteria) this;
        }

        public Criteria andServicetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("serviceTime not between", value1, value2,
                    "servicetime");
            return (Criteria) this;
        }

        public Criteria andServiceresultIsNull() {
            addCriterion("serviceResult is null");
            return (Criteria) this;
        }

        public Criteria andServiceresultIsNotNull() {
            addCriterion("serviceResult is not null");
            return (Criteria) this;
        }

        public Criteria andServiceresultEqualTo(String value) {
            addCriterion("serviceResult =", value, "serviceresult");
            return (Criteria) this;
        }

        public Criteria andServiceresultNotEqualTo(String value) {
            addCriterion("serviceResult <>", value, "serviceresult");
            return (Criteria) this;
        }

        public Criteria andServiceresultGreaterThan(String value) {
            addCriterion("serviceResult >", value, "serviceresult");
            return (Criteria) this;
        }

        public Criteria andServiceresultGreaterThanOrEqualTo(String value) {
            addCriterion("serviceResult >=", value, "serviceresult");
            return (Criteria) this;
        }

        public Criteria andServiceresultLessThan(String value) {
            addCriterion("serviceResult <", value, "serviceresult");
            return (Criteria) this;
        }

        public Criteria andServiceresultLessThanOrEqualTo(String value) {
            addCriterion("serviceResult <=", value, "serviceresult");
            return (Criteria) this;
        }

        public Criteria andServiceresultLike(String value) {
            addCriterion("serviceResult like", value, "serviceresult");
            return (Criteria) this;
        }

        public Criteria andServiceresultNotLike(String value) {
            addCriterion("serviceResult not like", value, "serviceresult");
            return (Criteria) this;
        }

        public Criteria andServiceresultIn(List<String> values) {
            addCriterion("serviceResult in", values, "serviceresult");
            return (Criteria) this;
        }

        public Criteria andServiceresultNotIn(List<String> values) {
            addCriterion("serviceResult not in", values, "serviceresult");
            return (Criteria) this;
        }

        public Criteria andServiceresultBetween(String value1, String value2) {
            addCriterion("serviceResult between", value1, value2,
                    "serviceresult");
            return (Criteria) this;
        }

        public Criteria andServiceresultNotBetween(String value1, String value2) {
            addCriterion("serviceResult not between", value1, value2,
                    "serviceresult");
            return (Criteria) this;
        }

        public Criteria andServicepersonIsNull() {
            addCriterion("servicePerson is null");
            return (Criteria) this;
        }

        public Criteria andServicepersonIsNotNull() {
            addCriterion("servicePerson is not null");
            return (Criteria) this;
        }

        public Criteria andServicepersonEqualTo(String value) {
            addCriterion("servicePerson =", value, "serviceperson");
            return (Criteria) this;
        }

        public Criteria andServicepersonNotEqualTo(String value) {
            addCriterion("servicePerson <>", value, "serviceperson");
            return (Criteria) this;
        }

        public Criteria andServicepersonGreaterThan(String value) {
            addCriterion("servicePerson >", value, "serviceperson");
            return (Criteria) this;
        }

        public Criteria andServicepersonGreaterThanOrEqualTo(String value) {
            addCriterion("servicePerson >=", value, "serviceperson");
            return (Criteria) this;
        }

        public Criteria andServicepersonLessThan(String value) {
            addCriterion("servicePerson <", value, "serviceperson");
            return (Criteria) this;
        }

        public Criteria andServicepersonLessThanOrEqualTo(String value) {
            addCriterion("servicePerson <=", value, "serviceperson");
            return (Criteria) this;
        }

        public Criteria andServicepersonLike(String value) {
            addCriterion("servicePerson like", value, "serviceperson");
            return (Criteria) this;
        }

        public Criteria andServicepersonNotLike(String value) {
            addCriterion("servicePerson not like", value, "serviceperson");
            return (Criteria) this;
        }

        public Criteria andServicepersonIn(List<String> values) {
            addCriterion("servicePerson in", values, "serviceperson");
            return (Criteria) this;
        }

        public Criteria andServicepersonNotIn(List<String> values) {
            addCriterion("servicePerson not in", values, "serviceperson");
            return (Criteria) this;
        }

        public Criteria andServicepersonBetween(String value1, String value2) {
            addCriterion("servicePerson between", value1, value2,
                    "serviceperson");
            return (Criteria) this;
        }

        public Criteria andServicepersonNotBetween(String value1, String value2) {
            addCriterion("servicePerson not between", value1, value2,
                    "serviceperson");
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

        protected Criterion(String condition, Object value, Object secondValue,
                String typeHandler) {
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
