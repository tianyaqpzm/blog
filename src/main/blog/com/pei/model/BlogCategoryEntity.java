package com.pei.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by pei on 2017/4/19.
 */
@Entity
@Table(name = "blog_category", schema = "blog", catalog = "")
public class BlogCategoryEntity {
    private int id;
    private int creatorId;
    private Timestamp createdTime;
    private int modifierId;
    private Timestamp modifiedTime;
    private byte hided;
    private byte published;
    private int syncStatus;
    private Integer order;
    private String name;
    private String slug;
    private String description;
    private String iconUrl;
    private String iconPath;
    private Integer parentId;
    private int viewsCount;
    private Collection<BlogArticleEntity> blogArticlesById;
    private UsermanagementCustomuserEntity usermanagementCustomuserByCreatorId;
    private UsermanagementCustomuserEntity usermanagementCustomuserByModifierId;
    private BlogCategoryEntity blogCategoryByParentId;
    private Collection<BlogCategoryEntity> blogCategoriesById;

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
//
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
    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "slug", nullable = false, length = 100)
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Basic
    @Column(name = "description", nullable = false, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "icon_url", nullable = true, length = 255)
    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @Basic
    @Column(name = "icon_path", nullable = true, length = 100)
    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

//    @Basic
//    @Column(name = "parent_id", nullable = true)
//    public Integer getParentId() {
//        return parentId;
//    }
//
//    public void setParentId(Integer parentId) {
//        this.parentId = parentId;
//    }

    @Basic
    @Column(name = "views_count", nullable = false)
    public int getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(int viewsCount) {
        this.viewsCount = viewsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogCategoryEntity that = (BlogCategoryEntity) o;

        if (id != that.id) return false;
        if (creatorId != that.creatorId) return false;
        if (modifierId != that.modifierId) return false;
        if (hided != that.hided) return false;
        if (published != that.published) return false;
        if (syncStatus != that.syncStatus) return false;
        if (viewsCount != that.viewsCount) return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null) return false;
        if (modifiedTime != null ? !modifiedTime.equals(that.modifiedTime) : that.modifiedTime != null) return false;
        if (order != null ? !order.equals(that.order) : that.order != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (slug != null ? !slug.equals(that.slug) : that.slug != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (iconUrl != null ? !iconUrl.equals(that.iconUrl) : that.iconUrl != null) return false;
        if (iconPath != null ? !iconPath.equals(that.iconPath) : that.iconPath != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;

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
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (slug != null ? slug.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (iconUrl != null ? iconUrl.hashCode() : 0);
        result = 31 * result + (iconPath != null ? iconPath.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + viewsCount;
        return result;
    }

    @OneToMany(mappedBy = "blogCategoryByCategoryId")
    public Collection<BlogArticleEntity> getBlogArticlesById() {
        return blogArticlesById;
    }

    public void setBlogArticlesById(Collection<BlogArticleEntity> blogArticlesById) {
        this.blogArticlesById = blogArticlesById;
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
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    public BlogCategoryEntity getBlogCategoryByParentId() {
        return blogCategoryByParentId;
    }

    public void setBlogCategoryByParentId(BlogCategoryEntity blogCategoryByParentId) {
        this.blogCategoryByParentId = blogCategoryByParentId;
    }

    @OneToMany(mappedBy = "blogCategoryByParentId")
    public Collection<BlogCategoryEntity> getBlogCategoriesById() {
        return blogCategoriesById;
    }

    public void setBlogCategoriesById(Collection<BlogCategoryEntity> blogCategoriesById) {
        this.blogCategoriesById = blogCategoriesById;
    }
}
