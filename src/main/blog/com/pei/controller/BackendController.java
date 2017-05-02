package com.pei.controller;

import com.pei.pojo.BlogArticleTags;
import com.pei.pojo.UsermanagementCustomuserExample;
import com.pei.service.IBlogArticleTagsService;
import com.pei.service.IUsermanagementCustomuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/backend")
public class BackendController {
    @Autowired
    private IBlogArticleTagsService blogArticleTagsService;
    @Autowired
    private IUsermanagementCustomuserService usermanagementCustomuserService;


//    @RequestMapping("/index",method = RequestMethod.GET)
//    public String test(){
////        BlogArticleTags blogArticleTags = iBlogArticleTagsService.getBlogArticleById(1);
////        int blogArticleTags = iBlogArticleTagsService.getBlogArticleById(1);
//        System.out.println("weee");
////        System.out.println(blogArticleTagsService.getBlogArticleById(1));
//        return "index/index";
//    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model){

        UsermanagementCustomuserExample example=new UsermanagementCustomuserExample();
        model.addAttribute("userCount", usermanagementCustomuserService.count());
        return "backend/index";
    }
}
