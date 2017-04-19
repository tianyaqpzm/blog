package com.pei.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by pei on 2017/4/19.
 */
@Entity
@Table(name = "django_content_type", schema = "blog", catalog = "")
public class DjangoContentTypeEntity {
    private int id;
    private String name;
    private String appLabel;
    private String model;
    private Collection<AuthPermissionEntity> authPermissionsById;
    private Collection<DjangoAdminLogEntity> djangoAdminLogsById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "app_label", nullable = false, length = 100)
    public String getAppLabel() {
        return appLabel;
    }

    public void setAppLabel(String appLabel) {
        this.appLabel = appLabel;
    }

    @Basic
    @Column(name = "model", nullable = false, length = 100)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DjangoContentTypeEntity that = (DjangoContentTypeEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (appLabel != null ? !appLabel.equals(that.appLabel) : that.appLabel != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (appLabel != null ? appLabel.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "djangoContentTypeByContentTypeId")
    public Collection<AuthPermissionEntity> getAuthPermissionsById() {
        return authPermissionsById;
    }

    public void setAuthPermissionsById(Collection<AuthPermissionEntity> authPermissionsById) {
        this.authPermissionsById = authPermissionsById;
    }

    @OneToMany(mappedBy = "djangoContentTypeByContentTypeId")
    public Collection<DjangoAdminLogEntity> getDjangoAdminLogsById() {
        return djangoAdminLogsById;
    }

    public void setDjangoAdminLogsById(Collection<DjangoAdminLogEntity> djangoAdminLogsById) {
        this.djangoAdminLogsById = djangoAdminLogsById;
    }
}
