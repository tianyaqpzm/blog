package com.pei.controller;

import com.pei.service.IBlogArticleTagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by pei on 2017/4/18.
 */

@Controller
public class MainController {
    /**
     * （1）@Controller注解：采用注解的方式，可以明确地定义该类为处理请求的Controller类；
     * （2）@RequestMapping()注解：用于定义一个请求映射，value为请求的url，值为 / 说明，该请求首页请求，method用以指定该请求类型，一般为get和post；
     * （3）return "index"：处理完该请求后返回的页面，此请求返回 index.jsp页面。
     * @return
     */
    @Autowired
    private IBlogArticleTagsService blogArticleTagsService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public  String index(){
        System.out.println("aaaaaaaaaaa");
//        System.out.println(blogArticleTagsService.getBlogArticleById(1));
        return "index/index";
    }
}
