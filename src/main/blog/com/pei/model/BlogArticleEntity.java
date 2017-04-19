package com.pei.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by pei on 2017/4/19.
 */
@Entity
@Table(name = "blog_article", schema = "blog", catalog = "")
public class BlogArticleEntity {
    private int id;
    private int creatorId;
    private Timestamp createdTime;
    private int modifierId;
    private Timestamp modifiedTime;
    private byte hided;
    private byte published;
    private int syncStatus;
    private Integer order;
    private String title;
    private String slug;
    private int categoryId;
    private int status;
    private byte enableComment;
    private String description;
    private String content;
    private int mark;
    private Timestamp publishDate;
    private byte loginRequired;
    private Integer thumbnailId;
    private int viewsCount;
    private int commentCount;
    private UsermanagementCustomuserEntity usermanagementCustomuserByCreatorId;
    private UsermanagementCustomuserEntity usermanagementCustomuserByModifierId;
    private BlogCategoryEntity blogCategoryByCategoryId;
    private BlogPhotoEntity blogPhotoByThumbnailId;
    private Collection<BlogArticleTagsEntity> blogArticleTagsById;
    private Collection<BlogCommentEntity> blogCommentsById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    @Basic
//    @Column(name = "creator_id", nullable = false)
//    public int getCreatorId() {
//        return creatorId;
//    }
//
//    public void setCreatorId(int creatorId) {
//        this.creatorId = creatorId;
//    }

    @Basic
    @Column(name = "created_time", nullable = false)
    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

//    @Basic
//    @Column(name = "modifier_id", nullable = false)
//    public int getModifierId() {
//        return modifierId;
//    }
//
//    public void setModifierId(int modifierId) {
//        this.modifierId = modifierId;
//    }

    @Basic
    @Column(name = "modified_time", nullable = false)
    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
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
    @Column(name = "order", nullable = true)
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 100)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "slug", nullable = false, length = 100)
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
//
//    @Basic
//    @Column(name = "category_id", nullable = false)
//    public int getCategoryId() {
//        return categoryId;
//    }
//
//    public void setCategoryId(int categoryId) {
//        this.categoryId = categoryId;
//    }

    @Basic
    @Column(name = "status", nullable = false)
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "enable_comment", nullable = false)
    public byte getEnableComment() {
        return enableComment;
    }

    public void setEnableComment(byte enableComment) {
        this.enableComment = enableComment;
    }

    @Basic
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    @Column(name = "mark", nullable = false)
    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Basic
    @Column(name = "publish_date", nullable = false)
    public Timestamp getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Timestamp publishDate) {
        this.publishDate = publishDate;
    }

    @Basic
    @Column(name = "login_required", nullable = false)
    public byte getLoginRequired() {
        return loginRequired;
    }

    public void setLoginRequired(byte loginRequired) {
        this.loginRequired = loginRequired;
    }

//    @Basic
//    @Column(name = "thumbnail_id", nullable = true)
//    public Integer getThumbnailId() {
//        return thumbnailId;
//    }
//
//    public void setThumbnailId(Integer thumbnailId) {
//        this.thumbnailId = thumbnailId;
//    }

    @Basic
    @Column(name = "views_count", nullable = false)
    public int getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(int viewsCount) {
        this.viewsCount = viewsCount;
    }

    @Basic
    @Column(name = "comment_count", nullable = false)
    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogArticleEntity that = (BlogArticleEntity) o;

        if (id != that.id) return false;
        if (creatorId != that.creatorId) return false;
        if (modifierId != that.modifierId) return false;
        if (hided != that.hided) return false;
        if (published != that.published) return false;
        if (syncStatus != that.syncStatus) return false;
        if (categoryId != that.categoryId) return false;
        if (status != that.status) return false;
        if (enableComment != that.enableComment) return false;
        if (mark != that.mark) return false;
        if (loginRequired != that.loginRequired) return false;
        if (viewsCount != that.viewsCount) return false;
        if (commentCount != that.commentCount) return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null) return false;
        if (modifiedTime != null ? !modifiedTime.equals(that.modifiedTime) : that.modifiedTime != null) return false;
        if (order != null ? !order.equals(that.order) : that.order != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (slug != null ? !slug.equals(that.slug) : that.slug != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (publishDate != null ? !publishDate.equals(that.publishDate) : that.publishDate != null) return false;
        if (thumbnailId != null ? !thumbnailId.equals(that.thumbnailId) : that.thumbnailId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + creatorId;
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + modifierId;
        result = 31 * result + (modifiedTime != null ? modifiedTime.hashCode() : 0);
        result = 31 * result + (int) hided;
        result = 31 * result + (int) published;
        result = 31 * result + syncStatus;
        result = 31 * result + (order != null ? order.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (slug != null ? slug.hashCode() : 0);
        result = 31 * result + categoryId;
        result = 31 * result + status;
        result = 31 * result + (int) enableComment;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + mark;
        result = 31 * result + (publishDate != null ? publishDate.hashCode() : 0);
        result = 31 * result + (int) loginRequired;
        result = 31 * result + (thumbnailId != null ? thumbnailId.hashCode() : 0);
        result = 31 * result + viewsCount;
        result = 31 * result + commentCount;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "creator_id", referencedColumnName = "id", nullable = false)
    public UsermanagementCustomuserEntity getUsermanagementCustomuserByCreatorId() {
        return usermanagementCustomuserByCreatorId;
    }

    public void setUsermanagementCustomuserByCreatorId(UsermanagementCustomuserEntity usermanagementCustomuserByCreatorId) {
        this.usermanagementCustomuserByCreatorId = usermanagementCustomuserByCreatorId;
    }

    @ManyToOne
    @JoinColumn(name = "modifier_id", referencedColumnName = "id", nullable = false)
    public UsermanagementCustomuserEntity getUsermanagementCustomuserByModifierId() {
        return usermanagementCustomuserByModifierId;
    }

    public void setUsermanagementCustomuserByModifierId(UsermanagementCustomuserEntity usermanagementCustomuserByModifierId) {
        this.usermanagementCustomuserByModifierId = usermanagementCustomuserByModifierId;
    }

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false)
    public BlogCategoryEntity getBlogCategoryByCategoryId() {
        return blogCategoryByCategoryId;
    }

    public void setBlogCategoryByCategoryId(BlogCategoryEntity blogCategoryByCategoryId) {
        this.blogCategoryByCategoryId = blogCategoryByCategoryId;
    }

    @ManyToOne
    @JoinColumn(name = "thumbnail_id", referencedColumnName = "id")
    public BlogPhotoEntity getBlogPhotoByThumbnailId() {
        return blogPhotoByThumbnailId;
    }

    public void setBlogPhotoByThumbnailId(BlogPhotoEntity blogPhotoByThumbnailId) {
        this.blogPhotoByThumbnailId = blogPhotoByThumbnailId;
    }

    @OneToMany(mappedBy = "blogArticleByArticleId")
    public Collection<BlogArticleTagsEntity> getBlogArticleTagsById() {
        return blogArticleTagsById;
    }

    public void setBlogArticleTagsById(Collection<BlogArticleTagsEntity> blogArticleTagsById) {
        this.blogArticleTagsById = blogArticleTagsById;
    }

    @OneToMany(mappedBy = "blogArticleByArticleId")
    public Collection<BlogCommentEntity> getBlogCommentsById() {
        return blogCommentsById;
    }

    public void setBlogCommentsById(Collection<BlogCommentEntity> blogCommentsById) {
        this.blogCommentsById = blogCommentsById;
    }
}
