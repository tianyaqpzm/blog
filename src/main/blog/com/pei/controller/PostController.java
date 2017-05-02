package com.pei.controller;

import com.pei.service.impl.BlogArticleService;
import com.pei.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by pei on 2017/4/30.
 */

@Controller
@RequestMapping("/backend/post")
public class PostController {
    @Autowired
    private BlogArticleService blogArticleService;

    @RequestMapping(value="/edit", method = RequestMethod.GET)
    public String edit(String pid, Model model){
        if(!StringUtils.isBlank(pid)){
//            model.addAttribute("post", postManager.loadReadById(pid));
        }

        model.addAttribute("categorys","cate" );
        return "backend/post/edit";
    }
}
