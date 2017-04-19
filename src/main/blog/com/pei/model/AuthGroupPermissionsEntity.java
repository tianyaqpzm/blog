package com.pei.model;

import javax.persistence.*;

/**
 * Created by pei on 2017/4/19.
 */
@Entity
@Table(name = "auth_group_permissions", schema = "blog", catalog = "")
public class AuthGroupPermissionsEntity {
    private int id;
    private int groupId;
    private int permissionId;
    private AuthGroupEntity authGroupByGroupId;
    private AuthPermissionEntity authPermissionByPermissionId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "group_id", nullable = false)
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "permission_id", nullable = false)
    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthGroupPermissionsEntity that = (AuthGroupPermissionsEntity) o;

        if (id != that.id) return false;
        if (groupId != that.groupId) return false;
        if (permissionId != that.permissionId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + groupId;
        result = 31 * result + permissionId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id", nullable = false)
    public AuthGroupEntity getAuthGroupByGroupId() {
        return authGroupByGroupId;
    }

    public void setAuthGroupByGroupId(AuthGroupEntity authGroupByGroupId) {
        this.authGroupByGroupId = authGroupByGroupId;
    }

    @ManyToOne
    @JoinColumn(name = "permission_id", referencedColumnName = "id", nullable = false)
    public AuthPermissionEntity getAuthPermissionByPermissionId() {
        return authPermissionByPermissionId;
    }

    public void setAuthPermissionByPermissionId(AuthPermissionEntity authPermissionByPermissionId) {
        this.authPermissionByPermissionId = authPermissionByPermissionId;
    }
}
