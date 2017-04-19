package com.pei.model;

import javax.persistence.*;

/**
 * Created by pei on 2017/4/19.
 */
@Entity
@Table(name = "django_site", schema = "blog", catalog = "")
public class DjangoSiteEntity {
    private int id;
    private String domain;
    private String name;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "domain", nullable = false, length = 100)
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
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

        DjangoSiteEntity that = (DjangoSiteEntity) o;

        if (id != that.id) return false;
        if (domain != null ? !domain.equals(that.domain) : that.domain != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (domain != null ? domain.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
