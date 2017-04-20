package com.pei.service.impl;

import com.pei.mapper.BlogArticleTagsMapper;
import com.pei.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import com.pei.service.*;

/**
 * Created by pei on 2017/4/20.
 */

@SuppressWarnings("SpringJavaAutowiringInspection")
@Service
public class BlogArticleTagsService implements IBlogArticleTagsService {

    @Autowired
    private BlogArticleTagsMapper  blogArticleTagsMap;

    public int getBlogArticleById(int id){

        BlogArticleTags blogArticleTags =blogArticleTagsMap.selectByPrimaryKey(id);
        return blogArticleTags.getArticleId()+100;
//        return 1;
    }
}
