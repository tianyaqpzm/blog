package com.pei.service.impl;

import com.pei.mapper.BlogCategoryMapper;
import com.pei.pojo.BlogCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pei on 2017/5/6.
 */

@SuppressWarnings("SpringJavaAutowiringInspection")
@Service
public class BlogCategoryService {

    @Autowired
    private BlogCategoryMapper blogCategoryMapper;

    public List<BlogCategory> list(){
        return blogCategoryMapper.list();
    }


}
