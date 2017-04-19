package com.pei.model;

import javax.persistence.*;

/**
 * Created by pei on 2017/4/19.
 */
@Entity
@Table(name = "blog_article_tags", schema = "blog", catalog = "")
public class BlogArticleTagsEntity {
    private int id;
    private int articleId;
    private int tagId;
    private BlogArticleEntity blogArticleByArticleId;
    private BlogTagEntity blogTagByTagId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "article_id", nullable = false)
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "tag_id", nullable = false)
    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogArticleTagsEntity that = (BlogArticleTagsEntity) o;

        if (id != that.id) return false;
        if (articleId != that.articleId) return false;
        if (tagId != that.tagId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + articleId;
        result = 31 * result + tagId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "article_id", referencedColumnName = "id", nullable = false)
    public BlogArticleEntity getBlogArticleByArticleId() {
        return blogArticleByArticleId;
    }

    public void setBlogArticleByArticleId(BlogArticleEntity blogArticleByArticleId) {
        this.blogArticleByArticleId = blogArticleByArticleId;
    }

    @ManyToOne
    @JoinColumn(name = "tag_id", referencedColumnName = "id", nullable = false)
    public BlogTagEntity getBlogTagByTagId() {
        return blogTagByTagId;
    }

    public void setBlogTagByTagId(BlogTagEntity blogTagByTagId) {
        this.blogTagByTagId = blogTagByTagId;
    }
}
