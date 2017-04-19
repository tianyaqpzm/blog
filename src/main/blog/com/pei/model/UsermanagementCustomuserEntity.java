package com.pei.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by pei on 2017/4/19.
 */
@Entity
@Table(name = "usermanagement_customuser", schema = "blog", catalog = "")
public class UsermanagementCustomuserEntity {
    private int id;
    private String password;
    private Timestamp lastLogin;
    private byte isSuperuser;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private byte isStaff;
    private byte isActive;
    private Timestamp dateJoined;
    private int status;
    private String qq;
    private String website;
    private String activationCode;
    private Collection<BlogArticleEntity> blogArticlesById;
    private Collection<BlogArticleEntity> blogArticlesById_0;
    private Collection<BlogCategoryEntity> blogCategoriesById;
    private Collection<BlogCategoryEntity> blogCategoriesById_0;
    private Collection<BlogCommentEntity> blogCommentsById;
    private Collection<BlogLinkEntity> blogLinksById;
    private Collection<BlogLinkEntity> blogLinksById_0;
    private Collection<BlogPhotoEntity> blogPhotosById;
    private Collection<BlogPhotoEntity> blogPhotosById_0;
    private Collection<BlogSliderEntity> blogSlidersById;
    private Collection<BlogSliderEntity> blogSlidersById_0;
    private Collection<BlogTagEntity> blogTagsById;
    private Collection<BlogTagEntity> blogTagsById_0;
    private Collection<DjangoAdminLogEntity> djangoAdminLogsById;
    private Collection<UsermanagementCustomuserGroupsEntity> usermanagementCustomuserGroupsById;
    private Collection<UsermanagementCustomuserUserPermissionsEntity> usermanagementCustomuserUserPermissionsById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 128)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "last_login", nullable = false)
    public Timestamp getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Basic
    @Column(name = "is_superuser", nullable = false)
    public byte getIsSuperuser() {
        return isSuperuser;
    }

    public void setIsSuperuser(byte isSuperuser) {
        this.isSuperuser = isSuperuser;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 50)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "first_name", nullable = false, length = 30)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = false, length = 30)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 75)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "is_staff", nullable = false)
    public byte getIsStaff() {
        return isStaff;
    }

    public void setIsStaff(byte isStaff) {
        this.isStaff = isStaff;
    }

    @Basic
    @Column(name = "is_active", nullable = false)
    public byte getIsActive() {
        return isActive;
    }

    public void setIsActive(byte isActive) {
        this.isActive = isActive;
    }

    @Basic
    @Column(name = "date_joined", nullable = false)
    public Timestamp getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Timestamp dateJoined) {
        this.dateJoined = dateJoined;
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
    @Column(name = "qq", nullable = true, length = 20)
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "website", nullable = true, length = 512)
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Basic
    @Column(name = "activation_code", nullable = false, length = 255)
    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsermanagementCustomuserEntity that = (UsermanagementCustomuserEntity) o;

        if (id != that.id) return false;
        if (isSuperuser != that.isSuperuser) return false;
        if (isStaff != that.isStaff) return false;
        if (isActive != that.isActive) return false;
        if (status != that.status) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (lastLogin != null ? !lastLogin.equals(that.lastLogin) : that.lastLogin != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (dateJoined != null ? !dateJoined.equals(that.dateJoined) : that.dateJoined != null) return false;
        if (qq != null ? !qq.equals(that.qq) : that.qq != null) return false;
        if (website != null ? !website.equals(that.website) : that.website != null) return false;
        if (activationCode != null ? !activationCode.equals(that.activationCode) : that.activationCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (lastLogin != null ? lastLogin.hashCode() : 0);
        result = 31 * result + (int) isSuperuser;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (int) isStaff;
        result = 31 * result + (int) isActive;
        result = 31 * result + (dateJoined != null ? dateJoined.hashCode() : 0);
        result = 31 * result + status;
        result = 31 * result + (qq != null ? qq.hashCode() : 0);
        result = 31 * result + (website != null ? website.hashCode() : 0);
        result = 31 * result + (activationCode != null ? activationCode.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "usermanagementCustomuserByCreatorId")
    public Collection<BlogArticleEntity> getBlogArticlesById() {
        return blogArticlesById;
    }

    public void setBlogArticlesById(Collection<BlogArticleEntity> blogArticlesById) {
        this.blogArticlesById = blogArticlesById;
    }

    @OneToMany(mappedBy = "usermanagementCustomuserByModifierId")
    public Collection<BlogArticleEntity> getBlogArticlesById_0() {
        return blogArticlesById_0;
    }

    public void setBlogArticlesById_0(Collection<BlogArticleEntity> blogArticlesById_0) {
        this.blogArticlesById_0 = blogArticlesById_0;
    }

    @OneToMany(mappedBy = "usermanagementCustomuserByCreatorId")
    public Collection<BlogCategoryEntity> getBlogCategoriesById() {
        return blogCategoriesById;
    }

    public void setBlogCategoriesById(Collection<BlogCategoryEntity> blogCategoriesById) {
        this.blogCategoriesById = blogCategoriesById;
    }

    @OneToMany(mappedBy = "usermanagementCustomuserByModifierId")
    public Collection<BlogCategoryEntity> getBlogCategoriesById_0() {
        return blogCategoriesById_0;
    }

    public void setBlogCategoriesById_0(Collection<BlogCategoryEntity> blogCategoriesById_0) {
        this.blogCategoriesById_0 = blogCategoriesById_0;
    }

    @OneToMany(mappedBy = "usermanagementCustomuserByUserId")
    public Collection<BlogCommentEntity> getBlogCommentsById() {
        return blogCommentsById;
    }

    public void setBlogCommentsById(Collection<BlogCommentEntity> blogCommentsById) {
        this.blogCommentsById = blogCommentsById;
    }

    @OneToMany(mappedBy = "usermanagementCustomuserByCreatorId")
    public Collection<BlogLinkEntity> getBlogLinksById() {
        return blogLinksById;
    }

    public void setBlogLinksById(Collection<BlogLinkEntity> blogLinksById) {
        this.blogLinksById = blogLinksById;
    }

    @OneToMany(mappedBy = "usermanagementCustomuserByModifierId")
    public Collection<BlogLinkEntity> getBlogLinksById_0() {
        return blogLinksById_0;
    }

    public void setBlogLinksById_0(Collection<BlogLinkEntity> blogLinksById_0) {
        this.blogLinksById_0 = blogLinksById_0;
    }

    @OneToMany(mappedBy = "usermanagementCustomuserByCreatorId")
    public Collection<BlogPhotoEntity> getBlogPhotosById() {
        return blogPhotosById;
    }

    public void setBlogPhotosById(Collection<BlogPhotoEntity> blogPhotosById) {
        this.blogPhotosById = blogPhotosById;
    }

    @OneToMany(mappedBy = "usermanagementCustomuserByModifierId")
    public Collection<BlogPhotoEntity> getBlogPhotosById_0() {
        return blogPhotosById_0;
    }

    public void setBlogPhotosById_0(Collection<BlogPhotoEntity> blogPhotosById_0) {
        this.blogPhotosById_0 = blogPhotosById_0;
    }

    @OneToMany(mappedBy = "usermanagementCustomuserByCreatorId")
    public Collection<BlogSliderEntity> getBlogSlidersById() {
        return blogSlidersById;
    }

    public void setBlogSlidersById(Collection<BlogSliderEntity> blogSlidersById) {
        this.blogSlidersById = blogSlidersById;
    }

    @OneToMany(mappedBy = "usermanagementCustomuserByModifierId")
    public Collection<BlogSliderEntity> getBlogSlidersById_0() {
        return blogSlidersById_0;
    }

    public void setBlogSlidersById_0(Collection<BlogSliderEntity> blogSlidersById_0) {
        this.blogSlidersById_0 = blogSlidersById_0;
    }

    @OneToMany(mappedBy = "usermanagementCustomuserByCreatorId")
    public Collection<BlogTagEntity> getBlogTagsById() {
        return blogTagsById;
    }

    public void setBlogTagsById(Collection<BlogTagEntity> blogTagsById) {
        this.blogTagsById = blogTagsById;
    }

    @OneToMany(mappedBy = "usermanagementCustomuserByModifierId")
    public Collection<BlogTagEntity> getBlogTagsById_0() {
        return blogTagsById_0;
    }

    public void setBlogTagsById_0(Collection<BlogTagEntity> blogTagsById_0) {
        this.blogTagsById_0 = blogTagsById_0;
    }

    @OneToMany(mappedBy = "usermanagementCustomuserByUserId")
    public Collection<DjangoAdminLogEntity> getDjangoAdminLogsById() {
        return djangoAdminLogsById;
    }

    public void setDjangoAdminLogsById(Collection<DjangoAdminLogEntity> djangoAdminLogsById) {
        this.djangoAdminLogsById = djangoAdminLogsById;
    }

    @OneToMany(mappedBy = "usermanagementCustomuserByCustomuserId")
    public Collection<UsermanagementCustomuserGroupsEntity> getUsermanagementCustomuserGroupsById() {
        return usermanagementCustomuserGroupsById;
    }

    public void setUsermanagementCustomuserGroupsById(Collection<UsermanagementCustomuserGroupsEntity> usermanagementCustomuserGroupsById) {
        this.usermanagementCustomuserGroupsById = usermanagementCustomuserGroupsById;
    }

    @OneToMany(mappedBy = "usermanagementCustomuserByCustomuserId")
    public Collection<UsermanagementCustomuserUserPermissionsEntity> getUsermanagementCustomuserUserPermissionsById() {
        return usermanagementCustomuserUserPermissionsById;
    }

    public void setUsermanagementCustomuserUserPermissionsById(Collection<UsermanagementCustomuserUserPermissionsEntity> usermanagementCustomuserUserPermissionsById) {
        this.usermanagementCustomuserUserPermissionsById = usermanagementCustomuserUserPermissionsById;
    }
}
