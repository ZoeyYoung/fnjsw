package fnjsw.entity;

import java.util.ArrayList;
import java.util.List;

public class DivisionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DivisionExample() {
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

        public Criteria andDivnameIsNull() {
            addCriterion("divName is null");
            return (Criteria) this;
        }

        public Criteria andDivnameIsNotNull() {
            addCriterion("divName is not null");
            return (Criteria) this;
        }

        public Criteria andDivnameEqualTo(String value) {
            addCriterion("divName =", value, "divname");
            return (Criteria) this;
        }

        public Criteria andDivnameNotEqualTo(String value) {
            addCriterion("divName <>", value, "divname");
            return (Criteria) this;
        }

        public Criteria andDivnameGreaterThan(String value) {
            addCriterion("divName >", value, "divname");
            return (Criteria) this;
        }

        public Criteria andDivnameGreaterThanOrEqualTo(String value) {
            addCriterion("divName >=", value, "divname");
            return (Criteria) this;
        }

        public Criteria andDivnameLessThan(String value) {
            addCriterion("divName <", value, "divname");
            return (Criteria) this;
        }

        public Criteria andDivnameLessThanOrEqualTo(String value) {
            addCriterion("divName <=", value, "divname");
            return (Criteria) this;
        }

        public Criteria andDivnameLike(String value) {
            addCriterion("divName like", value, "divname");
            return (Criteria) this;
        }

        public Criteria andDivnameNotLike(String value) {
            addCriterion("divName not like", value, "divname");
            return (Criteria) this;
        }

        public Criteria andDivnameIn(List<String> values) {
            addCriterion("divName in", values, "divname");
            return (Criteria) this;
        }

        public Criteria andDivnameNotIn(List<String> values) {
            addCriterion("divName not in", values, "divname");
            return (Criteria) this;
        }

        public Criteria andDivnameBetween(String value1, String value2) {
            addCriterion("divName between", value1, value2, "divname");
            return (Criteria) this;
        }

        public Criteria andDivnameNotBetween(String value1, String value2) {
            addCriterion("divName not between", value1, value2, "divname");
            return (Criteria) this;
        }

        public Criteria andDivcodeIsNull() {
            addCriterion("divCode is null");
            return (Criteria) this;
        }

        public Criteria andDivcodeIsNotNull() {
            addCriterion("divCode is not null");
            return (Criteria) this;
        }

        public Criteria andDivcodeEqualTo(String value) {
            addCriterion("divCode =", value, "divcode");
            return (Criteria) this;
        }

        public Criteria andDivcodeNotEqualTo(String value) {
            addCriterion("divCode <>", value, "divcode");
            return (Criteria) this;
        }

        public Criteria andDivcodeGreaterThan(String value) {
            addCriterion("divCode >", value, "divcode");
            return (Criteria) this;
        }

        public Criteria andDivcodeGreaterThanOrEqualTo(String value) {
            addCriterion("divCode >=", value, "divcode");
            return (Criteria) this;
        }

        public Criteria andDivcodeLessThan(String value) {
            addCriterion("divCode <", value, "divcode");
            return (Criteria) this;
        }

        public Criteria andDivcodeLessThanOrEqualTo(String value) {
            addCriterion("divCode <=", value, "divcode");
            return (Criteria) this;
        }

        public Criteria andDivcodeLike(String value) {
            addCriterion("divCode like", value, "divcode");
            return (Criteria) this;
        }

        public Criteria andDivcodeNotLike(String value) {
            addCriterion("divCode not like", value, "divcode");
            return (Criteria) this;
        }

        public Criteria andDivcodeIn(List<String> values) {
            addCriterion("divCode in", values, "divcode");
            return (Criteria) this;
        }

        public Criteria andDivcodeNotIn(List<String> values) {
            addCriterion("divCode not in", values, "divcode");
            return (Criteria) this;
        }

        public Criteria andDivcodeBetween(String value1, String value2) {
            addCriterion("divCode between", value1, value2, "divcode");
            return (Criteria) this;
        }

        public Criteria andDivcodeNotBetween(String value1, String value2) {
            addCriterion("divCode not between", value1, value2, "divcode");
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