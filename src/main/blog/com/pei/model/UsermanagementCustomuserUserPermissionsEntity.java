package com.pei.model;

import javax.persistence.*;

/**
 * Created by pei on 2017/4/19.
 */
@Entity
@Table(name = "usermanagement_customuser_user_permissions", schema = "blog", catalog = "")
public class UsermanagementCustomuserUserPermissionsEntity {
    private int id;
    private int customuserId;
    private int permissionId;
    private UsermanagementCustomuserEntity usermanagementCustomuserByCustomuserId;
    private AuthPermissionEntity authPermissionByPermissionId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
//
//    @Basic
//    @Column(name = "customuser_id", nullable = false)
//    public int getCustomuserId() {
//        return customuserId;
//    }
//
//    public void setCustomuserId(int customuserId) {
//        this.customuserId = customuserId;
//    }
//
//    @Basic
//    @Column(name = "permission_id", nullable = false)
//    public int getPermissionId() {
//        return permissionId;
//    }
//
//    public void setPermissionId(int permissionId) {
//        this.permissionId = permissionId;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsermanagementCustomuserUserPermissionsEntity that = (UsermanagementCustomuserUserPermissionsEntity) o;

        if (id != that.id) return false;
        if (customuserId != that.customuserId) return false;
        if (permissionId != that.permissionId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + customuserId;
        result = 31 * result + permissionId;
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
    @JoinColumn(name = "permission_id", referencedColumnName = "id", nullable = false)
    public AuthPermissionEntity getAuthPermissionByPermissionId() {
        return authPermissionByPermissionId;
    }

    public void setAuthPermissionByPermissionId(AuthPermissionEntity authPermissionByPermissionId) {
        this.authPermissionByPermissionId = authPermissionByPermissionId;
    }
}
