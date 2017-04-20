package com.pei.mapper;

import com.pei.pojo.BlogArticleTags;
import com.pei.pojo.BlogArticleTagsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface BlogArticleTagsMapper {
    int countByExample(BlogArticleTagsExample example);

    int deleteByExample(BlogArticleTagsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogArticleTags record);

    int insertSelective(BlogArticleTags record);

    List<BlogArticleTags> selectByExample(BlogArticleTagsExample example);

    BlogArticleTags selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlogArticleTags record, @Param("example") BlogArticleTagsExample example);

    int updateByExample(@Param("record") BlogArticleTags record, @Param("example") BlogArticleTagsExample example);

    int updateByPrimaryKeySelective(BlogArticleTags record);

    int updateByPrimaryKey(BlogArticleTags record);
}