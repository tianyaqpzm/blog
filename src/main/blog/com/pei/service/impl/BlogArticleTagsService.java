package com.pei.service.impl;

import com.pei.mapper.BlogArticleTagsMapper;
import com.pei.pojo.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import com.pei.service.*;

import java.util.List;

/**
 * Created by pei on 2017/4/20.
 */

//在service类前加上@Transactional，声明这个service所有方法需要事务管理。每一个业务方法开始时都会打开一个事务。

@SuppressWarnings("SpringJavaAutowiringInspection")
@Service
public class BlogArticleTagsService implements IBlogArticleTagsService {

    @Autowired
    private BlogArticleTagsMapper  blogArticleTagsMapper;

    public int countByExample(BlogArticleTagsExample blogArticleTagsExample){
        return blogArticleTagsMapper.countByExample(blogArticleTagsExample);
    }

    public int deleteByExample(BlogArticleTagsExample example){
        return blogArticleTagsMapper.deleteByExample(example);
    }

    public int deleteByExample(Integer id){
        return blogArticleTagsMapper.deleteByPrimaryKey(id);
    }

    public int insert(BlogArticleTags blogArticleTags){
        return blogArticleTagsMapper.insert(blogArticleTags);
    }

    public int insertSelective(BlogArticleTags blogArticleTags){
        return blogArticleTagsMapper.insertSelective(blogArticleTags);}

    public List<BlogArticleTags> selectByExample(BlogArticleTagsExample example){
        return blogArticleTagsMapper.selectByExample(example);
    }

    public BlogArticleTags selectByPrimaryKey(Integer id){
        return blogArticleTagsMapper.selectByPrimaryKey(id);
    }
    public int updateByExampleSelective(@Param("record") BlogArticleTags record,
                                 @Param("example") BlogArticleTagsExample example){
        return blogArticleTagsMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(@Param("record") BlogArticleTags record,
                        @Param("example") BlogArticleTagsExample example){
        return blogArticleTagsMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(BlogArticleTags record){
        return blogArticleTagsMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(BlogArticleTags record){
        return blogArticleTagsMapper.updateByPrimaryKey(record);
    }

//    public int getBlogArticleById(int id){
//        BlogArticleTags blogArticleTags =blogArticleTagsMapper.selectByPrimaryKey(id);
//        return blogArticleTags.getArticleId()+100;
//    }




}
