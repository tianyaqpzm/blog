package com.pei.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by pei on 2017/4/19.
 */
@Entity
@Table(name = "blog_comment", schema = "blog", catalog = "")
public class BlogCommentEntity {
    private int id;
    private Integer userId;
    private int articleId;
    private String author;
    private String authorEmail;
    private String authorWebsite;
    private String authorIp;
    private String authorAgent;
    private Integer parentId;
    private Timestamp commentDate;
    private String content;
    private byte hided;
    private byte published;
    private int syncStatus;
    private int status;
    private String duoshuoId;
    private String duoshuoUserId;
    private UsermanagementCustomuserEntity usermanagementCustomuserByUserId;
    private BlogArticleEntity blogArticleByArticleId;
    private BlogCommentEntity blogCommentByParentId;
    private Collection<BlogCommentEntity> blogCommentsById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "article_id", nullable = false)
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "author", nullable = false, length = 100)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "author_email", nullable = false, length = 100)
    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    @Basic
    @Column(name = "author_website", nullable = true, length = 512)
    public String getAuthorWebsite() {
        return authorWebsite;
    }

    public void setAuthorWebsite(String authorWebsite) {
        this.authorWebsite = authorWebsite;
    }

    @Basic
    @Column(name = "author_ip", nullable = false, length = 100)
    public String getAuthorIp() {
        return authorIp;
    }

    public void setAuthorIp(String authorIp) {
        this.authorIp = authorIp;
    }

    @Basic
    @Column(name = "author_agent", nullable = false, length = 1024)
    public String getAuthorAgent() {
        return authorAgent;
    }

    public void setAuthorAgent(String authorAgent) {
        this.authorAgent = authorAgent;
    }

    @Basic
    @Column(name = "parent_id", nullable = true)
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "comment_date", nullable = false)
    public Timestamp getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Timestamp commentDate) {
        this.commentDate = commentDate;
    }

    @Basic
    @Column(name = "content", nullable = false, length = -1)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "hided", nullable = false)
    public byte getHided() {
        return hided;
    }

    public void setHided(byte hided) {
        this.hided = hided;
    }

    @Basic
    @Column(name = "published", nullable = false)
    public byte getPublished() {
        return published;
    }

    public void setPublished(byte published) {
        this.published = published;
    }

    @Basic
    @Column(name = "sync_status", nullable = false)
    public int getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(int syncStatus) {
        this.syncStatus = syncStatus;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "duoshuo_id", nullable = true, length = 50)
    public String getDuoshuoId() {
        return duoshuoId;
    }

    public void setDuoshuoId(String duoshuoId) {
        this.duoshuoId = duoshuoId;
    }

    @Basic
    @Column(name = "duoshuo_user_id", nullable = true, length = 50)
    public String getDuoshuoUserId() {
        return duoshuoUserId;
    }

    public void setDuoshuoUserId(String duoshuoUserId) {
        this.duoshuoUserId = duoshuoUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogCommentEntity that = (BlogCommentEntity) o;

        if (id != that.id) return false;
        if (articleId != that.articleId) return false;
        if (hided != that.hided) return false;
        if (published != that.published) return false;
        if (syncStatus != that.syncStatus) return false;
        if (status != that.status) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (authorEmail != null ? !authorEmail.equals(that.authorEmail) : that.authorEmail != null) return false;
        if (authorWebsite != null ? !authorWebsite.equals(that.authorWebsite) : that.authorWebsite != null)
            return false;
        if (authorIp != null ? !authorIp.equals(that.authorIp) : that.authorIp != null) return false;
        if (authorAgent != null ? !authorAgent.equals(that.authorAgent) : that.authorAgent != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (commentDate != null ? !commentDate.equals(that.commentDate) : that.commentDate != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (duoshuoId != null ? !duoshuoId.equals(that.duoshuoId) : that.duoshuoId != null) return false;
        if (duoshuoUserId != null ? !duoshuoUserId.equals(that.duoshuoUserId) : that.duoshuoUserId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + articleId;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (authorEmail != null ? authorEmail.hashCode() : 0);
        result = 31 * result + (authorWebsite != null ? authorWebsite.hashCode() : 0);
        result = 31 * result + (authorIp != null ? authorIp.hashCode() : 0);
        result = 31 * result + (authorAgent != null ? authorAgent.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (commentDate != null ? commentDate.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (int) hided;
        result = 31 * result + (int) published;
        result = 31 * result + syncStatus;
        result = 31 * result + status;
        result = 31 * result + (duoshuoId != null ? duoshuoId.hashCode() : 0);
        result = 31 * result + (duoshuoUserId != null ? duoshuoUserId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    public UsermanagementCustomuserEntity getUsermanagementCustomuserByUserId() {
        return usermanagementCustomuserByUserId;
    }

    public void setUsermanagementCustomuserByUserId(UsermanagementCustomuserEntity usermanagementCustomuserByUserId) {
        this.usermanagementCustomuserByUserId = usermanagementCustomuserByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "article_id", referencedColumnName = "id", nullable = false)
    public BlogArticleEntity getBlogArticleByArticleId() {
        return blogArticleByArticleId;
    }

    public void setBlogArticleByArticleId(BlogArticleEntity blogArticleByArticleId) {
        this.blogArticleByArticleId = blogArticleByArticleId;
    }

    @ManyToOne
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    public BlogCommentEntity getBlogCommentByParentId() {
        return blogCommentByParentId;
    }

    public void setBlogCommentByParentId(BlogCommentEntity blogCommentByParentId) {
        this.blogCommentByParentId = blogCommentByParentId;
    }

    @OneToMany(mappedBy = "blogCommentByParentId")
    public Collection<BlogCommentEntity> getBlogCommentsById() {
        return blogCommentsById;
    }

    public void setBlogCommentsById(Collection<BlogCommentEntity> blogCommentsById) {
        this.blogCommentsById = blogCommentsById;
    }
}
