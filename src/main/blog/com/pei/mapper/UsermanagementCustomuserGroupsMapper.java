package com.pei.mapper;

import com.pei.pojo.UsermanagementCustomuserGroups;
import com.pei.pojo.UsermanagementCustomuserGroupsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsermanagementCustomuserGroupsMapper {
    int countByExample(UsermanagementCustomuserGroupsExample example);

    int deleteByExample(UsermanagementCustomuserGroupsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UsermanagementCustomuserGroups record);

    int insertSelective(UsermanagementCustomuserGroups record);

    List<UsermanagementCustomuserGroups> selectByExample(UsermanagementCustomuserGroupsExample example);

    UsermanagementCustomuserGroups selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UsermanagementCustomuserGroups record, @Param("example") UsermanagementCustomuserGroupsExample example);

    int updateByExample(@Param("record") UsermanagementCustomuserGroups record, @Param("example") UsermanagementCustomuserGroupsExample example);

    int updateByPrimaryKeySelective(UsermanagementCustomuserGroups record);

    int updateByPrimaryKey(UsermanagementCustomuserGroups record);
}