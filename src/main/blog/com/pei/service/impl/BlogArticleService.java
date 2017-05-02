package com.pei.service.impl;

import com.pei.mapper.BlogArticleMapper;
import com.pei.pojo.BlogArticle;
import com.pei.pojo.BlogArticleWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by pei on 2017/4/30.
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@Service
public class BlogArticleService {

    @Autowired
    private  BlogArticleMapper blogArticleMapper;


    /**
     * 默认增加 ？？
     * @param blogArticleWithBLOBs
     * @return
     */
    public int insert(BlogArticleWithBLOBs blogArticleWithBLOBs){
        return blogArticleMapper.insert(blogArticleWithBLOBs);
    }

    /**
     * 增加文章 有选择？？
     * @param blogArticleWithBLOBs
     * @return
     */
    public int insertSelective(BlogArticleWithBLOBs blogArticleWithBLOBs){
        return blogArticleMapper.insertSelective(blogArticleWithBLOBs);
    }
}
