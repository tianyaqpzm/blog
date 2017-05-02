package com.pei.mapper;

import com.pei.pojo.UsermanagementCustomuser;
import com.pei.pojo.UsermanagementCustomuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsermanagementCustomuserMapper {
    int countByExample(UsermanagementCustomuserExample example);

    int deleteByExample(UsermanagementCustomuserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UsermanagementCustomuser record);

    int insertSelective(UsermanagementCustomuser record);

    List<UsermanagementCustomuser> selectByExample(UsermanagementCustomuserExample example);

    UsermanagementCustomuser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UsermanagementCustomuser record, @Param("example") UsermanagementCustomuserExample example);

    int updateByExample(@Param("record") UsermanagementCustomuser record, @Param("example") UsermanagementCustomuserExample example);

    int updateByPrimaryKeySelective(UsermanagementCustomuser record);

    int updateByPrimaryKey(UsermanagementCustomuser record);

    int count();
}