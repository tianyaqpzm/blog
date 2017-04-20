package com.pei.service.impl;

import com.pei.pojo.BlogArticle;
import com.pei.pojo.BlogArticleTags;
import com.pei.service.IBlogArticleTagsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * Created by pei on 2017/4/20.
 */


@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"/spring/applicationContext-*.xml"})
@ContextConfiguration(locations = { "classpath:spring/applicationContext*.xml" })
public class TestBlogArticleTagsService {
    @Autowired
    private IBlogArticleTagsService blogArticleTagsService;

    @Test
    public void test(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
//        JedisPool pool = (JedisPool) applicationContext.getBean("redisClient");
//        BlogArticleTags pool = (BlogArticleTags) applicationContext.getBean("IBlogArticleTagsService");
//        System.out.println(pool.getArticleId());
        System.out.println(blogArticleTagsService.getBlogArticleById(1));

//        BlogArticleTags blogArticleTags = blogArticleTagsService.getBlogArticleById(1);
//        System.out.println(blogArticleTags.getId());
    }
}
