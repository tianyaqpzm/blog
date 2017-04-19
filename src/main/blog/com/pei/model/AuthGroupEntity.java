package com.pei.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by pei on 2017/4/19.
 */
@Entity
@Table(name = "auth_group", schema = "blog", catalog = "")
public class AuthGroupEntity {
    private int id;
    private String name;
    private Collection<AuthGroupPermissionsEntity> authGroupPermissionsById;
    private Collection<UsermanagementCustomuserGroupsEntity> usermanagementCustomuserGroupsById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 80)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthGroupEntity that = (AuthGroupEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "authGroupByGroupId")
    public Collection<AuthGroupPermissionsEntity> getAuthGroupPermissionsById() {
        return authGroupPermissionsById;
    }

    public void setAuthGroupPermissionsById(Collection<AuthGroupPermissionsEntity> authGroupPermissionsById) {
        this.authGroupPermissionsById = authGroupPermissionsById;
    }

    @OneToMany(mappedBy = "authGroupByGroupId")
    public Collection<UsermanagementCustomuserGroupsEntity> getUsermanagementCustomuserGroupsById() {
        return usermanagementCustomuserGroupsById;
    }

    public void setUsermanagementCustomuserGroupsById(Collection<UsermanagementCustomuserGroupsEntity> usermanagementCustomuserGroupsById) {
        this.usermanagementCustomuserGroupsById = usermanagementCustomuserGroupsById;
    }
}
