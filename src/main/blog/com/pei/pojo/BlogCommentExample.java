package com.pei.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogCommentExample() {
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

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Integer value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Integer value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Integer value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Integer value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Integer> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Integer> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailIsNull() {
            addCriterion("author_email is null");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailIsNotNull() {
            addCriterion("author_email is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailEqualTo(String value) {
            addCriterion("author_email =", value, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailNotEqualTo(String value) {
            addCriterion("author_email <>", value, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailGreaterThan(String value) {
            addCriterion("author_email >", value, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailGreaterThanOrEqualTo(String value) {
            addCriterion("author_email >=", value, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailLessThan(String value) {
            addCriterion("author_email <", value, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailLessThanOrEqualTo(String value) {
            addCriterion("author_email <=", value, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailLike(String value) {
            addCriterion("author_email like", value, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailNotLike(String value) {
            addCriterion("author_email not like", value, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailIn(List<String> values) {
            addCriterion("author_email in", values, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailNotIn(List<String> values) {
            addCriterion("author_email not in", values, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailBetween(String value1, String value2) {
            addCriterion("author_email between", value1, value2, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorEmailNotBetween(String value1, String value2) {
            addCriterion("author_email not between", value1, value2, "authorEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorWebsiteIsNull() {
            addCriterion("author_website is null");
            return (Criteria) this;
        }

        public Criteria andAuthorWebsiteIsNotNull() {
            addCriterion("author_website is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorWebsiteEqualTo(String value) {
            addCriterion("author_website =", value, "authorWebsite");
            return (Criteria) this;
        }

        public Criteria andAuthorWebsiteNotEqualTo(String value) {
            addCriterion("author_website <>", value, "authorWebsite");
            return (Criteria) this;
        }

        public Criteria andAuthorWebsiteGreaterThan(String value) {
            addCriterion("author_website >", value, "authorWebsite");
            return (Criteria) this;
        }

        public Criteria andAuthorWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("author_website >=", value, "authorWebsite");
            return (Criteria) this;
        }

        public Criteria andAuthorWebsiteLessThan(String value) {
            addCriterion("author_website <", value, "authorWebsite");
            return (Criteria) this;
        }

        public Criteria andAuthorWebsiteLessThanOrEqualTo(String value) {
            addCriterion("author_website <=", value, "authorWebsite");
            return (Criteria) this;
        }

        public Criteria andAuthorWebsiteLike(String value) {
            addCriterion("author_website like", value, "authorWebsite");
            return (Criteria) this;
        }

        public Criteria andAuthorWebsiteNotLike(String value) {
            addCriterion("author_website not like", value, "authorWebsite");
            return (Criteria) this;
        }

        public Criteria andAuthorWebsiteIn(List<String> values) {
            addCriterion("author_website in", values, "authorWebsite");
            return (Criteria) this;
        }

        public Criteria andAuthorWebsiteNotIn(List<String> values) {
            addCriterion("author_website not in", values, "authorWebsite");
            return (Criteria) this;
        }

        public Criteria andAuthorWebsiteBetween(String value1, String value2) {
            addCriterion("author_website between", value1, value2, "authorWebsite");
            return (Criteria) this;
        }

        public Criteria andAuthorWebsiteNotBetween(String value1, String value2) {
            addCriterion("author_website not between", value1, value2, "authorWebsite");
            return (Criteria) this;
        }

        public Criteria andAuthorIpIsNull() {
            addCriterion("author_ip is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIpIsNotNull() {
            addCriterion("author_ip is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIpEqualTo(String value) {
            addCriterion("author_ip =", value, "authorIp");
            return (Criteria) this;
        }

        public Criteria andAuthorIpNotEqualTo(String value) {
            addCriterion("author_ip <>", value, "authorIp");
            return (Criteria) this;
        }

        public Criteria andAuthorIpGreaterThan(String value) {
            addCriterion("author_ip >", value, "authorIp");
            return (Criteria) this;
        }

        public Criteria andAuthorIpGreaterThanOrEqualTo(String value) {
            addCriterion("author_ip >=", value, "authorIp");
            return (Criteria) this;
        }

        public Criteria andAuthorIpLessThan(String value) {
            addCriterion("author_ip <", value, "authorIp");
            return (Criteria) this;
        }

        public Criteria andAuthorIpLessThanOrEqualTo(String value) {
            addCriterion("author_ip <=", value, "authorIp");
            return (Criteria) this;
        }

        public Criteria andAuthorIpLike(String value) {
            addCriterion("author_ip like", value, "authorIp");
            return (Criteria) this;
        }

        public Criteria andAuthorIpNotLike(String value) {
            addCriterion("author_ip not like", value, "authorIp");
            return (Criteria) this;
        }

        public Criteria andAuthorIpIn(List<String> values) {
            addCriterion("author_ip in", values, "authorIp");
            return (Criteria) this;
        }

        public Criteria andAuthorIpNotIn(List<String> values) {
            addCriterion("author_ip not in", values, "authorIp");
            return (Criteria) this;
        }

        public Criteria andAuthorIpBetween(String value1, String value2) {
            addCriterion("author_ip between", value1, value2, "authorIp");
            return (Criteria) this;
        }

        public Criteria andAuthorIpNotBetween(String value1, String value2) {
            addCriterion("author_ip not between", value1, value2, "authorIp");
            return (Criteria) this;
        }

        public Criteria andAuthorAgentIsNull() {
            addCriterion("author_agent is null");
            return (Criteria) this;
        }

        public Criteria andAuthorAgentIsNotNull() {
            addCriterion("author_agent is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorAgentEqualTo(String value) {
            addCriterion("author_agent =", value, "authorAgent");
            return (Criteria) this;
        }

        public Criteria andAuthorAgentNotEqualTo(String value) {
            addCriterion("author_agent <>", value, "authorAgent");
            return (Criteria) this;
        }

        public Criteria andAuthorAgentGreaterThan(String value) {
            addCriterion("author_agent >", value, "authorAgent");
            return (Criteria) this;
        }

        public Criteria andAuthorAgentGreaterThanOrEqualTo(String value) {
            addCriterion("author_agent >=", value, "authorAgent");
            return (Criteria) this;
        }

        public Criteria andAuthorAgentLessThan(String value) {
            addCriterion("author_agent <", value, "authorAgent");
            return (Criteria) this;
        }

        public Criteria andAuthorAgentLessThanOrEqualTo(String value) {
            addCriterion("author_agent <=", value, "authorAgent");
            return (Criteria) this;
        }

        public Criteria andAuthorAgentLike(String value) {
            addCriterion("author_agent like", value, "authorAgent");
            return (Criteria) this;
        }

        public Criteria andAuthorAgentNotLike(String value) {
            addCriterion("author_agent not like", value, "authorAgent");
            return (Criteria) this;
        }

        public Criteria andAuthorAgentIn(List<String> values) {
            addCriterion("author_agent in", values, "authorAgent");
            return (Criteria) this;
        }

        public Criteria andAuthorAgentNotIn(List<String> values) {
            addCriterion("author_agent not in", values, "authorAgent");
            return (Criteria) this;
        }

        public Criteria andAuthorAgentBetween(String value1, String value2) {
            addCriterion("author_agent between", value1, value2, "authorAgent");
            return (Criteria) this;
        }

        public Criteria andAuthorAgentNotBetween(String value1, String value2) {
            addCriterion("author_agent not between", value1, value2, "authorAgent");
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

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNull() {
            addCriterion("comment_date is null");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNotNull() {
            addCriterion("comment_date is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDateEqualTo(Date value) {
            addCriterion("comment_date =", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotEqualTo(Date value) {
            addCriterion("comment_date <>", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThan(Date value) {
            addCriterion("comment_date >", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_date >=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThan(Date value) {
            addCriterion("comment_date <", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThanOrEqualTo(Date value) {
            addCriterion("comment_date <=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateIn(List<Date> values) {
            addCriterion("comment_date in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotIn(List<Date> values) {
            addCriterion("comment_date not in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateBetween(Date value1, Date value2) {
            addCriterion("comment_date between", value1, value2, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotBetween(Date value1, Date value2) {
            addCriterion("comment_date not between", value1, value2, "commentDate");
            return (Criteria) this;
        }

        public Criteria andHidedIsNull() {
            addCriterion("hided is null");
            return (Criteria) this;
        }

        public Criteria andHidedIsNotNull() {
            addCriterion("hided is not null");
            return (Criteria) this;
        }

        public Criteria andHidedEqualTo(Boolean value) {
            addCriterion("hided =", value, "hided");
            return (Criteria) this;
        }

        public Criteria andHidedNotEqualTo(Boolean value) {
            addCriterion("hided <>", value, "hided");
            return (Criteria) this;
        }

        public Criteria andHidedGreaterThan(Boolean value) {
            addCriterion("hided >", value, "hided");
            return (Criteria) this;
        }

        public Criteria andHidedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hided >=", value, "hided");
            return (Criteria) this;
        }

        public Criteria andHidedLessThan(Boolean value) {
            addCriterion("hided <", value, "hided");
            return (Criteria) this;
        }

        public Criteria andHidedLessThanOrEqualTo(Boolean value) {
            addCriterion("hided <=", value, "hided");
            return (Criteria) this;
        }

        public Criteria andHidedIn(List<Boolean> values) {
            addCriterion("hided in", values, "hided");
            return (Criteria) this;
        }

        public Criteria andHidedNotIn(List<Boolean> values) {
            addCriterion("hided not in", values, "hided");
            return (Criteria) this;
        }

        public Criteria andHidedBetween(Boolean value1, Boolean value2) {
            addCriterion("hided between", value1, value2, "hided");
            return (Criteria) this;
        }

        public Criteria andHidedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hided not between", value1, value2, "hided");
            return (Criteria) this;
        }

        public Criteria andPublishedIsNull() {
            addCriterion("published is null");
            return (Criteria) this;
        }

        public Criteria andPublishedIsNotNull() {
            addCriterion("published is not null");
            return (Criteria) this;
        }

        public Criteria andPublishedEqualTo(Boolean value) {
            addCriterion("published =", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotEqualTo(Boolean value) {
            addCriterion("published <>", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedGreaterThan(Boolean value) {
            addCriterion("published >", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("published >=", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedLessThan(Boolean value) {
            addCriterion("published <", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedLessThanOrEqualTo(Boolean value) {
            addCriterion("published <=", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedIn(List<Boolean> values) {
            addCriterion("published in", values, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotIn(List<Boolean> values) {
            addCriterion("published not in", values, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedBetween(Boolean value1, Boolean value2) {
            addCriterion("published between", value1, value2, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("published not between", value1, value2, "published");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIsNull() {
            addCriterion("sync_status is null");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIsNotNull() {
            addCriterion("sync_status is not null");
            return (Criteria) this;
        }

        public Criteria andSyncStatusEqualTo(Integer value) {
            addCriterion("sync_status =", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotEqualTo(Integer value) {
            addCriterion("sync_status <>", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusGreaterThan(Integer value) {
            addCriterion("sync_status >", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sync_status >=", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusLessThan(Integer value) {
            addCriterion("sync_status <", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sync_status <=", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIn(List<Integer> values) {
            addCriterion("sync_status in", values, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotIn(List<Integer> values) {
            addCriterion("sync_status not in", values, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusBetween(Integer value1, Integer value2) {
            addCriterion("sync_status between", value1, value2, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sync_status not between", value1, value2, "syncStatus");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDuoshuoIdIsNull() {
            addCriterion("duoshuo_id is null");
            return (Criteria) this;
        }

        public Criteria andDuoshuoIdIsNotNull() {
            addCriterion("duoshuo_id is not null");
            return (Criteria) this;
        }

        public Criteria andDuoshuoIdEqualTo(String value) {
            addCriterion("duoshuo_id =", value, "duoshuoId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoIdNotEqualTo(String value) {
            addCriterion("duoshuo_id <>", value, "duoshuoId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoIdGreaterThan(String value) {
            addCriterion("duoshuo_id >", value, "duoshuoId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoIdGreaterThanOrEqualTo(String value) {
            addCriterion("duoshuo_id >=", value, "duoshuoId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoIdLessThan(String value) {
            addCriterion("duoshuo_id <", value, "duoshuoId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoIdLessThanOrEqualTo(String value) {
            addCriterion("duoshuo_id <=", value, "duoshuoId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoIdLike(String value) {
            addCriterion("duoshuo_id like", value, "duoshuoId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoIdNotLike(String value) {
            addCriterion("duoshuo_id not like", value, "duoshuoId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoIdIn(List<String> values) {
            addCriterion("duoshuo_id in", values, "duoshuoId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoIdNotIn(List<String> values) {
            addCriterion("duoshuo_id not in", values, "duoshuoId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoIdBetween(String value1, String value2) {
            addCriterion("duoshuo_id between", value1, value2, "duoshuoId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoIdNotBetween(String value1, String value2) {
            addCriterion("duoshuo_id not between", value1, value2, "duoshuoId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoUserIdIsNull() {
            addCriterion("duoshuo_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDuoshuoUserIdIsNotNull() {
            addCriterion("duoshuo_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDuoshuoUserIdEqualTo(String value) {
            addCriterion("duoshuo_user_id =", value, "duoshuoUserId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoUserIdNotEqualTo(String value) {
            addCriterion("duoshuo_user_id <>", value, "duoshuoUserId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoUserIdGreaterThan(String value) {
            addCriterion("duoshuo_user_id >", value, "duoshuoUserId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("duoshuo_user_id >=", value, "duoshuoUserId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoUserIdLessThan(String value) {
            addCriterion("duoshuo_user_id <", value, "duoshuoUserId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoUserIdLessThanOrEqualTo(String value) {
            addCriterion("duoshuo_user_id <=", value, "duoshuoUserId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoUserIdLike(String value) {
            addCriterion("duoshuo_user_id like", value, "duoshuoUserId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoUserIdNotLike(String value) {
            addCriterion("duoshuo_user_id not like", value, "duoshuoUserId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoUserIdIn(List<String> values) {
            addCriterion("duoshuo_user_id in", values, "duoshuoUserId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoUserIdNotIn(List<String> values) {
            addCriterion("duoshuo_user_id not in", values, "duoshuoUserId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoUserIdBetween(String value1, String value2) {
            addCriterion("duoshuo_user_id between", value1, value2, "duoshuoUserId");
            return (Criteria) this;
        }

        public Criteria andDuoshuoUserIdNotBetween(String value1, String value2) {
            addCriterion("duoshuo_user_id not between", value1, value2, "duoshuoUserId");
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