package com.pei.pojo;

import java.util.Date;

public class BlogComment {
    private Integer id;

    private Integer userId;

    private Integer articleId;

    private String author;

    private String authorEmail;

    private String authorWebsite;

    private String authorIp;

    private String authorAgent;

    private Integer parentId;

    private Date commentDate;

    private Boolean hided;

    private Boolean published;

    private Integer syncStatus;

    private Integer status;

    private String duoshuoId;

    private String duoshuoUserId;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail == null ? null : authorEmail.trim();
    }

    public String getAuthorWebsite() {
        return authorWebsite;
    }

    public void setAuthorWebsite(String authorWebsite) {
        this.authorWebsite = authorWebsite == null ? null : authorWebsite.trim();
    }

    public String getAuthorIp() {
        return authorIp;
    }

    public void setAuthorIp(String authorIp) {
        this.authorIp = authorIp == null ? null : authorIp.trim();
    }

    public String getAuthorAgent() {
        return authorAgent;
    }

    public void setAuthorAgent(String authorAgent) {
        this.authorAgent = authorAgent == null ? null : authorAgent.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public Boolean getHided() {
        return hided;
    }

    public void setHided(Boolean hided) {
        this.hided = hided;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public Integer getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(Integer syncStatus) {
        this.syncStatus = syncStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDuoshuoId() {
        return duoshuoId;
    }

    public void setDuoshuoId(String duoshuoId) {
        this.duoshuoId = duoshuoId == null ? null : duoshuoId.trim();
    }

    public String getDuoshuoUserId() {
        return duoshuoUserId;
    }

    public void setDuoshuoUserId(String duoshuoUserId) {
        this.duoshuoUserId = duoshuoUserId == null ? null : duoshuoUserId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}