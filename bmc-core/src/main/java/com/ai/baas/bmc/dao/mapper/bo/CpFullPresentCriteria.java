package com.ai.baas.bmc.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CpFullPresentCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public CpFullPresentCriteria() {
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

        public Criteria andPresentIdIsNull() {
            addCriterion("PRESENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPresentIdIsNotNull() {
            addCriterion("PRESENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPresentIdEqualTo(Long value) {
            addCriterion("PRESENT_ID =", value, "presentId");
            return (Criteria) this;
        }

        public Criteria andPresentIdNotEqualTo(Long value) {
            addCriterion("PRESENT_ID <>", value, "presentId");
            return (Criteria) this;
        }

        public Criteria andPresentIdGreaterThan(Long value) {
            addCriterion("PRESENT_ID >", value, "presentId");
            return (Criteria) this;
        }

        public Criteria andPresentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PRESENT_ID >=", value, "presentId");
            return (Criteria) this;
        }

        public Criteria andPresentIdLessThan(Long value) {
            addCriterion("PRESENT_ID <", value, "presentId");
            return (Criteria) this;
        }

        public Criteria andPresentIdLessThanOrEqualTo(Long value) {
            addCriterion("PRESENT_ID <=", value, "presentId");
            return (Criteria) this;
        }

        public Criteria andPresentIdIn(List<Long> values) {
            addCriterion("PRESENT_ID in", values, "presentId");
            return (Criteria) this;
        }

        public Criteria andPresentIdNotIn(List<Long> values) {
            addCriterion("PRESENT_ID not in", values, "presentId");
            return (Criteria) this;
        }

        public Criteria andPresentIdBetween(Long value1, Long value2) {
            addCriterion("PRESENT_ID between", value1, value2, "presentId");
            return (Criteria) this;
        }

        public Criteria andPresentIdNotBetween(Long value1, Long value2) {
            addCriterion("PRESENT_ID not between", value1, value2, "presentId");
            return (Criteria) this;
        }

        public Criteria andDetailCodeIsNull() {
            addCriterion("DETAIL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDetailCodeIsNotNull() {
            addCriterion("DETAIL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDetailCodeEqualTo(String value) {
            addCriterion("DETAIL_CODE =", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeNotEqualTo(String value) {
            addCriterion("DETAIL_CODE <>", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeGreaterThan(String value) {
            addCriterion("DETAIL_CODE >", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_CODE >=", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeLessThan(String value) {
            addCriterion("DETAIL_CODE <", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_CODE <=", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeLike(String value) {
            addCriterion("DETAIL_CODE like", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeNotLike(String value) {
            addCriterion("DETAIL_CODE not like", value, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeIn(List<String> values) {
            addCriterion("DETAIL_CODE in", values, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeNotIn(List<String> values) {
            addCriterion("DETAIL_CODE not in", values, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeBetween(String value1, String value2) {
            addCriterion("DETAIL_CODE between", value1, value2, "detailCode");
            return (Criteria) this;
        }

        public Criteria andDetailCodeNotBetween(String value1, String value2) {
            addCriterion("DETAIL_CODE not between", value1, value2, "detailCode");
            return (Criteria) this;
        }

        public Criteria andPresentTypeIsNull() {
            addCriterion("PRESENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPresentTypeIsNotNull() {
            addCriterion("PRESENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPresentTypeEqualTo(String value) {
            addCriterion("PRESENT_TYPE =", value, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeNotEqualTo(String value) {
            addCriterion("PRESENT_TYPE <>", value, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeGreaterThan(String value) {
            addCriterion("PRESENT_TYPE >", value, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRESENT_TYPE >=", value, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeLessThan(String value) {
            addCriterion("PRESENT_TYPE <", value, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeLessThanOrEqualTo(String value) {
            addCriterion("PRESENT_TYPE <=", value, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeLike(String value) {
            addCriterion("PRESENT_TYPE like", value, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeNotLike(String value) {
            addCriterion("PRESENT_TYPE not like", value, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeIn(List<String> values) {
            addCriterion("PRESENT_TYPE in", values, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeNotIn(List<String> values) {
            addCriterion("PRESENT_TYPE not in", values, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeBetween(String value1, String value2) {
            addCriterion("PRESENT_TYPE between", value1, value2, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentTypeNotBetween(String value1, String value2) {
            addCriterion("PRESENT_TYPE not between", value1, value2, "presentType");
            return (Criteria) this;
        }

        public Criteria andPresentAmountIsNull() {
            addCriterion("PRESENT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPresentAmountIsNotNull() {
            addCriterion("PRESENT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPresentAmountEqualTo(Double value) {
            addCriterion("PRESENT_AMOUNT =", value, "presentAmount");
            return (Criteria) this;
        }

        public Criteria andPresentAmountNotEqualTo(Double value) {
            addCriterion("PRESENT_AMOUNT <>", value, "presentAmount");
            return (Criteria) this;
        }

        public Criteria andPresentAmountGreaterThan(Double value) {
            addCriterion("PRESENT_AMOUNT >", value, "presentAmount");
            return (Criteria) this;
        }

        public Criteria andPresentAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("PRESENT_AMOUNT >=", value, "presentAmount");
            return (Criteria) this;
        }

        public Criteria andPresentAmountLessThan(Double value) {
            addCriterion("PRESENT_AMOUNT <", value, "presentAmount");
            return (Criteria) this;
        }

        public Criteria andPresentAmountLessThanOrEqualTo(Double value) {
            addCriterion("PRESENT_AMOUNT <=", value, "presentAmount");
            return (Criteria) this;
        }

        public Criteria andPresentAmountIn(List<Double> values) {
            addCriterion("PRESENT_AMOUNT in", values, "presentAmount");
            return (Criteria) this;
        }

        public Criteria andPresentAmountNotIn(List<Double> values) {
            addCriterion("PRESENT_AMOUNT not in", values, "presentAmount");
            return (Criteria) this;
        }

        public Criteria andPresentAmountBetween(Double value1, Double value2) {
            addCriterion("PRESENT_AMOUNT between", value1, value2, "presentAmount");
            return (Criteria) this;
        }

        public Criteria andPresentAmountNotBetween(Double value1, Double value2) {
            addCriterion("PRESENT_AMOUNT not between", value1, value2, "presentAmount");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIsNull() {
            addCriterion("ACTIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIsNotNull() {
            addCriterion("ACTIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEqualTo(Timestamp value) {
            addCriterion("ACTIVE_TIME =", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotEqualTo(Timestamp value) {
            addCriterion("ACTIVE_TIME <>", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeGreaterThan(Timestamp value) {
            addCriterion("ACTIVE_TIME >", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("ACTIVE_TIME >=", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeLessThan(Timestamp value) {
            addCriterion("ACTIVE_TIME <", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("ACTIVE_TIME <=", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIn(List<Timestamp> values) {
            addCriterion("ACTIVE_TIME in", values, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotIn(List<Timestamp> values) {
            addCriterion("ACTIVE_TIME not in", values, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ACTIVE_TIME between", value1, value2, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ACTIVE_TIME not between", value1, value2, "activeTime");
            return (Criteria) this;
        }

        public Criteria andInactiveTimeIsNull() {
            addCriterion("INACTIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInactiveTimeIsNotNull() {
            addCriterion("INACTIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInactiveTimeEqualTo(Timestamp value) {
            addCriterion("INACTIVE_TIME =", value, "inactiveTime");
            return (Criteria) this;
        }

        public Criteria andInactiveTimeNotEqualTo(Timestamp value) {
            addCriterion("INACTIVE_TIME <>", value, "inactiveTime");
            return (Criteria) this;
        }

        public Criteria andInactiveTimeGreaterThan(Timestamp value) {
            addCriterion("INACTIVE_TIME >", value, "inactiveTime");
            return (Criteria) this;
        }

        public Criteria andInactiveTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("INACTIVE_TIME >=", value, "inactiveTime");
            return (Criteria) this;
        }

        public Criteria andInactiveTimeLessThan(Timestamp value) {
            addCriterion("INACTIVE_TIME <", value, "inactiveTime");
            return (Criteria) this;
        }

        public Criteria andInactiveTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("INACTIVE_TIME <=", value, "inactiveTime");
            return (Criteria) this;
        }

        public Criteria andInactiveTimeIn(List<Timestamp> values) {
            addCriterion("INACTIVE_TIME in", values, "inactiveTime");
            return (Criteria) this;
        }

        public Criteria andInactiveTimeNotIn(List<Timestamp> values) {
            addCriterion("INACTIVE_TIME not in", values, "inactiveTime");
            return (Criteria) this;
        }

        public Criteria andInactiveTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("INACTIVE_TIME between", value1, value2, "inactiveTime");
            return (Criteria) this;
        }

        public Criteria andInactiveTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("INACTIVE_TIME not between", value1, value2, "inactiveTime");
            return (Criteria) this;
        }

        public Criteria andProductIdsIsNull() {
            addCriterion("PRODUCT_IDS is null");
            return (Criteria) this;
        }

        public Criteria andProductIdsIsNotNull() {
            addCriterion("PRODUCT_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdsEqualTo(String value) {
            addCriterion("PRODUCT_IDS =", value, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsNotEqualTo(String value) {
            addCriterion("PRODUCT_IDS <>", value, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsGreaterThan(String value) {
            addCriterion("PRODUCT_IDS >", value, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_IDS >=", value, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsLessThan(String value) {
            addCriterion("PRODUCT_IDS <", value, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_IDS <=", value, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsLike(String value) {
            addCriterion("PRODUCT_IDS like", value, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsNotLike(String value) {
            addCriterion("PRODUCT_IDS not like", value, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsIn(List<String> values) {
            addCriterion("PRODUCT_IDS in", values, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsNotIn(List<String> values) {
            addCriterion("PRODUCT_IDS not in", values, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsBetween(String value1, String value2) {
            addCriterion("PRODUCT_IDS between", value1, value2, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductIdsNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_IDS not between", value1, value2, "productIds");
            return (Criteria) this;
        }

        public Criteria andProductGiftIdsIsNull() {
            addCriterion("PRODUCT_GIFT_IDS is null");
            return (Criteria) this;
        }

        public Criteria andProductGiftIdsIsNotNull() {
            addCriterion("PRODUCT_GIFT_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andProductGiftIdsEqualTo(String value) {
            addCriterion("PRODUCT_GIFT_IDS =", value, "productGiftIds");
            return (Criteria) this;
        }

        public Criteria andProductGiftIdsNotEqualTo(String value) {
            addCriterion("PRODUCT_GIFT_IDS <>", value, "productGiftIds");
            return (Criteria) this;
        }

        public Criteria andProductGiftIdsGreaterThan(String value) {
            addCriterion("PRODUCT_GIFT_IDS >", value, "productGiftIds");
            return (Criteria) this;
        }

        public Criteria andProductGiftIdsGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_GIFT_IDS >=", value, "productGiftIds");
            return (Criteria) this;
        }

        public Criteria andProductGiftIdsLessThan(String value) {
            addCriterion("PRODUCT_GIFT_IDS <", value, "productGiftIds");
            return (Criteria) this;
        }

        public Criteria andProductGiftIdsLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_GIFT_IDS <=", value, "productGiftIds");
            return (Criteria) this;
        }

        public Criteria andProductGiftIdsLike(String value) {
            addCriterion("PRODUCT_GIFT_IDS like", value, "productGiftIds");
            return (Criteria) this;
        }

        public Criteria andProductGiftIdsNotLike(String value) {
            addCriterion("PRODUCT_GIFT_IDS not like", value, "productGiftIds");
            return (Criteria) this;
        }

        public Criteria andProductGiftIdsIn(List<String> values) {
            addCriterion("PRODUCT_GIFT_IDS in", values, "productGiftIds");
            return (Criteria) this;
        }

        public Criteria andProductGiftIdsNotIn(List<String> values) {
            addCriterion("PRODUCT_GIFT_IDS not in", values, "productGiftIds");
            return (Criteria) this;
        }

        public Criteria andProductGiftIdsBetween(String value1, String value2) {
            addCriterion("PRODUCT_GIFT_IDS between", value1, value2, "productGiftIds");
            return (Criteria) this;
        }

        public Criteria andProductGiftIdsNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_GIFT_IDS not between", value1, value2, "productGiftIds");
            return (Criteria) this;
        }

        public Criteria andPresentCodeIsNull() {
            addCriterion("PRESENT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPresentCodeIsNotNull() {
            addCriterion("PRESENT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPresentCodeEqualTo(String value) {
            addCriterion("PRESENT_CODE =", value, "presentCode");
            return (Criteria) this;
        }

        public Criteria andPresentCodeNotEqualTo(String value) {
            addCriterion("PRESENT_CODE <>", value, "presentCode");
            return (Criteria) this;
        }

        public Criteria andPresentCodeGreaterThan(String value) {
            addCriterion("PRESENT_CODE >", value, "presentCode");
            return (Criteria) this;
        }

        public Criteria andPresentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRESENT_CODE >=", value, "presentCode");
            return (Criteria) this;
        }

        public Criteria andPresentCodeLessThan(String value) {
            addCriterion("PRESENT_CODE <", value, "presentCode");
            return (Criteria) this;
        }

        public Criteria andPresentCodeLessThanOrEqualTo(String value) {
            addCriterion("PRESENT_CODE <=", value, "presentCode");
            return (Criteria) this;
        }

        public Criteria andPresentCodeLike(String value) {
            addCriterion("PRESENT_CODE like", value, "presentCode");
            return (Criteria) this;
        }

        public Criteria andPresentCodeNotLike(String value) {
            addCriterion("PRESENT_CODE not like", value, "presentCode");
            return (Criteria) this;
        }

        public Criteria andPresentCodeIn(List<String> values) {
            addCriterion("PRESENT_CODE in", values, "presentCode");
            return (Criteria) this;
        }

        public Criteria andPresentCodeNotIn(List<String> values) {
            addCriterion("PRESENT_CODE not in", values, "presentCode");
            return (Criteria) this;
        }

        public Criteria andPresentCodeBetween(String value1, String value2) {
            addCriterion("PRESENT_CODE between", value1, value2, "presentCode");
            return (Criteria) this;
        }

        public Criteria andPresentCodeNotBetween(String value1, String value2) {
            addCriterion("PRESENT_CODE not between", value1, value2, "presentCode");
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