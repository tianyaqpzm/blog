package com.pei.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by pei on 2017/4/19.
 */
@Entity
@Table(name = "blog_link", schema = "blog", catalog = "")
public class BlogLinkEntity {
    private int id;
    private int creatorId;
    private Timestamp createdTime;
    private int modifierId;
    private Timestamp modifiedTime;
    private byte hided;
    private byte published;
    private int syncStatus;
    private Integer order;
    private int type;
    private String title;
    private String iconUrl;
    private String address;
    private String description;
    private UsermanagementCustomuserEntity usermanagementCustomuserByCreatorId;
    private UsermanagementCustomuserEntity usermanagementCustomuserByModifierId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "creator_id", nullable = false)
    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    @Basic
    @Column(name = "created_time", nullable = false)
    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    @Basic
    @Column(name = "modifier_id", nullable = false)
    public int getModifierId() {
        return modifierId;
    }

    public void setModifierId(int modifierId) {
        this.modifierId = modifierId;
    }

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
    @Column(name = "type", nullable = false)
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
    @Column(name = "icon_url", nullable = false, length = 255)
    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @Basic
    @Column(name = "address", nullable = false, length = 200)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "description", nullable = false, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogLinkEntity that = (BlogLinkEntity) o;

        if (id != that.id) return false;
        if (creatorId != that.creatorId) return false;
        if (modifierId != that.modifierId) return false;
        if (hided != that.hided) return false;
        if (published != that.published) return false;
        if (syncStatus != that.syncStatus) return false;
        if (type != that.type) return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null) return false;
        if (modifiedTime != null ? !modifiedTime.equals(that.modifiedTime) : that.modifiedTime != null) return false;
        if (order != null ? !order.equals(that.order) : that.order != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (iconUrl != null ? !iconUrl.equals(that.iconUrl) : that.iconUrl != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

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
        result = 31 * result + type;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (iconUrl != null ? iconUrl.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
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
}
