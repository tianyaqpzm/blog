package com.pei.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DjangoAdminLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DjangoAdminLogExample() {
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

        public Criteria andActionTimeIsNull() {
            addCriterion("action_time is null");
            return (Criteria) this;
        }

        public Criteria andActionTimeIsNotNull() {
            addCriterion("action_time is not null");
            return (Criteria) this;
        }

        public Criteria andActionTimeEqualTo(Date value) {
            addCriterion("action_time =", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeNotEqualTo(Date value) {
            addCriterion("action_time <>", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeGreaterThan(Date value) {
            addCriterion("action_time >", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("action_time >=", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeLessThan(Date value) {
            addCriterion("action_time <", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeLessThanOrEqualTo(Date value) {
            addCriterion("action_time <=", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeIn(List<Date> values) {
            addCriterion("action_time in", values, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeNotIn(List<Date> values) {
            addCriterion("action_time not in", values, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeBetween(Date value1, Date value2) {
            addCriterion("action_time between", value1, value2, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeNotBetween(Date value1, Date value2) {
            addCriterion("action_time not between", value1, value2, "actionTime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andContentTypeIdIsNull() {
            addCriterion("content_type_id is null");
            return (Criteria) this;
        }

        public Criteria andContentTypeIdIsNotNull() {
            addCriterion("content_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andContentTypeIdEqualTo(Integer value) {
            addCriterion("content_type_id =", value, "contentTypeId");
            return (Criteria) this;
        }

        public Criteria andContentTypeIdNotEqualTo(Integer value) {
            addCriterion("content_type_id <>", value, "contentTypeId");
            return (Criteria) this;
        }

        public Criteria andContentTypeIdGreaterThan(Integer value) {
            addCriterion("content_type_id >", value, "contentTypeId");
            return (Criteria) this;
        }

        public Criteria andContentTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_type_id >=", value, "contentTypeId");
            return (Criteria) this;
        }

        public Criteria andContentTypeIdLessThan(Integer value) {
            addCriterion("content_type_id <", value, "contentTypeId");
            return (Criteria) this;
        }

        public Criteria andContentTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("content_type_id <=", value, "contentTypeId");
            return (Criteria) this;
        }

        public Criteria andContentTypeIdIn(List<Integer> values) {
            addCriterion("content_type_id in", values, "contentTypeId");
            return (Criteria) this;
        }

        public Criteria andContentTypeIdNotIn(List<Integer> values) {
            addCriterion("content_type_id not in", values, "contentTypeId");
            return (Criteria) this;
        }

        public Criteria andContentTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("content_type_id between", value1, value2, "contentTypeId");
            return (Criteria) this;
        }

        public Criteria andContentTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("content_type_id not between", value1, value2, "contentTypeId");
            return (Criteria) this;
        }

        public Criteria andObjectReprIsNull() {
            addCriterion("object_repr is null");
            return (Criteria) this;
        }

        public Criteria andObjectReprIsNotNull() {
            addCriterion("object_repr is not null");
            return (Criteria) this;
        }

        public Criteria andObjectReprEqualTo(String value) {
            addCriterion("object_repr =", value, "objectRepr");
            return (Criteria) this;
        }

        public Criteria andObjectReprNotEqualTo(String value) {
            addCriterion("object_repr <>", value, "objectRepr");
            return (Criteria) this;
        }

        public Criteria andObjectReprGreaterThan(String value) {
            addCriterion("object_repr >", value, "objectRepr");
            return (Criteria) this;
        }

        public Criteria andObjectReprGreaterThanOrEqualTo(String value) {
            addCriterion("object_repr >=", value, "objectRepr");
            return (Criteria) this;
        }

        public Criteria andObjectReprLessThan(String value) {
            addCriterion("object_repr <", value, "objectRepr");
            return (Criteria) this;
        }

        public Criteria andObjectReprLessThanOrEqualTo(String value) {
            addCriterion("object_repr <=", value, "objectRepr");
            return (Criteria) this;
        }

        public Criteria andObjectReprLike(String value) {
            addCriterion("object_repr like", value, "objectRepr");
            return (Criteria) this;
        }

        public Criteria andObjectReprNotLike(String value) {
            addCriterion("object_repr not like", value, "objectRepr");
            return (Criteria) this;
        }

        public Criteria andObjectReprIn(List<String> values) {
            addCriterion("object_repr in", values, "objectRepr");
            return (Criteria) this;
        }

        public Criteria andObjectReprNotIn(List<String> values) {
            addCriterion("object_repr not in", values, "objectRepr");
            return (Criteria) this;
        }

        public Criteria andObjectReprBetween(String value1, String value2) {
            addCriterion("object_repr between", value1, value2, "objectRepr");
            return (Criteria) this;
        }

        public Criteria andObjectReprNotBetween(String value1, String value2) {
            addCriterion("object_repr not between", value1, value2, "objectRepr");
            return (Criteria) this;
        }

        public Criteria andActionFlagIsNull() {
            addCriterion("action_flag is null");
            return (Criteria) this;
        }

        public Criteria andActionFlagIsNotNull() {
            addCriterion("action_flag is not null");
            return (Criteria) this;
        }

        public Criteria andActionFlagEqualTo(Short value) {
            addCriterion("action_flag =", value, "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionFlagNotEqualTo(Short value) {
            addCriterion("action_flag <>", value, "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionFlagGreaterThan(Short value) {
            addCriterion("action_flag >", value, "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("action_flag >=", value, "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionFlagLessThan(Short value) {
            addCriterion("action_flag <", value, "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionFlagLessThanOrEqualTo(Short value) {
            addCriterion("action_flag <=", value, "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionFlagIn(List<Short> values) {
            addCriterion("action_flag in", values, "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionFlagNotIn(List<Short> values) {
            addCriterion("action_flag not in", values, "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionFlagBetween(Short value1, Short value2) {
            addCriterion("action_flag between", value1, value2, "actionFlag");
            return (Criteria) this;
        }

        public Criteria andActionFlagNotBetween(Short value1, Short value2) {
            addCriterion("action_flag not between", value1, value2, "actionFlag");
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