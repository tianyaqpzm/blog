package com.pei.service.impl;

import com.pei.mapper.UsermanagementCustomuserMapper;
import com.pei.pojo.UsermanagementCustomuserExample;
import com.pei.service.IUsermanagementCustomuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by pei on 2017/4/26.
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@Service
public class UsermanagementCustomuserService implements IUsermanagementCustomuserService{


    @Autowired
    private UsermanagementCustomuserMapper usermanagementCustomuserMapper;

//    统计有多少用户
    public int count(){
        return usermanagementCustomuserMapper.count();
    }



}
