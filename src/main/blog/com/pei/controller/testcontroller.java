package com.pei.controller;

import com.pei.pojo.BlogArticleTags;
import com.pei.service.IBlogArticleTagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by pei on 2017/4/20.
 */
@Controller
public class testcontroller {
    @Autowired
    private IBlogArticleTagsService iBlogArticleTagsService;
    @RequestMapping("/test")
    public String test(){
//        BlogArticleTags blogArticleTags = iBlogArticleTagsService.getBlogArticleById(1);
        int blogArticleTags = iBlogArticleTagsService.getBlogArticleById(1);
        System.out.println("weee");
//        System.out.println(blogArticleTags.getId());
        return "test";
    }
}
