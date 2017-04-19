package com.pei.mapper;

import com.pei.pojo.UsermanagementCustomuserUserPermissions;
import com.pei.pojo.UsermanagementCustomuserUserPermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsermanagementCustomuserUserPermissionsMapper {
    int countByExample(UsermanagementCustomuserUserPermissionsExample example);

    int deleteByExample(UsermanagementCustomuserUserPermissionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UsermanagementCustomuserUserPermissions record);

    int insertSelective(UsermanagementCustomuserUserPermissions record);

    List<UsermanagementCustomuserUserPermissions> selectByExample(UsermanagementCustomuserUserPermissionsExample example);

    UsermanagementCustomuserUserPermissions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UsermanagementCustomuserUserPermissions record, @Param("example") UsermanagementCustomuserUserPermissionsExample example);

    int updateByExample(@Param("record") UsermanagementCustomuserUserPermissions record, @Param("example") UsermanagementCustomuserUserPermissionsExample example);

    int updateByPrimaryKeySelective(UsermanagementCustomuserUserPermissions record);

    int updateByPrimaryKey(UsermanagementCustomuserUserPermissions record);
}