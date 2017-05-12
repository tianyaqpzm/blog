package com.pei.controller;

import com.pei.pojo.BlogCategory;
import com.pei.service.impl.BlogArticleService;
import com.pei.service.impl.BlogCategoryService;
import com.pei.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by pei on 2017/4/30.
 */

@Controller
@RequestMapping("/backend/post")
public class PostController {
    @Autowired
    private BlogArticleService blogArticleService;
    @Autowired
    private BlogCategoryService blogCategoryService;

    @RequestMapping(value="/edit", method = RequestMethod.GET)
    public String edit(String pid, Model model){
        if(!StringUtils.isBlank(pid)){
//            model.addAttribute("post", postManager.loadReadById(pid));
        }
        model.addAttribute("categorys", blogCategoryService.list());
        List<BlogCategory> l = blogCategoryService.list();

        System.out.println(l);
        for(int i=0;i<l.size();i++){
            System.out.println();
        }
        return "backend/post/edit";
    }
}
