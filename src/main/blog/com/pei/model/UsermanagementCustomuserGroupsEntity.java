package com.pei.model;

import javax.persistence.*;

/**
 * Created by pei on 2017/4/19.
 */
@Entity
@Table(name = "usermanagement_customuser_groups", schema = "blog", catalog = "")
public class UsermanagementCustomuserGroupsEntity {
    private int id;
    private int customuserId;
    private int groupId;
    private UsermanagementCustomuserEntity usermanagementCustomuserByCustomuserId;
    private AuthGroupEntity authGroupByGroupId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "customuser_id", nullable = false)
    public int getCustomuserId() {
        return customuserId;
    }

    public void setCustomuserId(int customuserId) {
        this.customuserId = customuserId;
    }

    @Basic
    @Column(name = "group_id", nullable = false)
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsermanagementCustomuserGroupsEntity that = (UsermanagementCustomuserGroupsEntity) o;

        if (id != that.id) return false;
        if (customuserId != that.customuserId) return false;
        if (groupId != that.groupId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + customuserId;
        result = 31 * result + groupId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "customuser_id", referencedColumnName = "id", nullable = false)
    public UsermanagementCustomuserEntity getUsermanagementCustomuserByCustomuserId() {
        return usermanagementCustomuserByCustomuserId;
    }

    public void setUsermanagementCustomuserByCustomuserId(UsermanagementCustomuserEntity usermanagementCustomuserByCustomuserId) {
        this.usermanagementCustomuserByCustomuserId = usermanagementCustomuserByCustomuserId;
    }

    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id", nullable = false)
    public AuthGroupEntity getAuthGroupByGroupId() {
        return authGroupByGroupId;
    }

    public void setAuthGroupByGroupId(AuthGroupEntity authGroupByGroupId) {
        this.authGroupByGroupId = authGroupByGroupId;
    }
}
