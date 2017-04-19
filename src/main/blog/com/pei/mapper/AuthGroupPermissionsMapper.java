package com.pei.mapper;

import com.pei.pojo.AuthGroupPermissions;
import com.pei.pojo.AuthGroupPermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthGroupPermissionsMapper {
    int countByExample(AuthGroupPermissionsExample example);

    int deleteByExample(AuthGroupPermissionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthGroupPermissions record);

    int insertSelective(AuthGroupPermissions record);

    List<AuthGroupPermissions> selectByExample(AuthGroupPermissionsExample example);

    AuthGroupPermissions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthGroupPermissions record, @Param("example") AuthGroupPermissionsExample example);

    int updateByExample(@Param("record") AuthGroupPermissions record, @Param("example") AuthGroupPermissionsExample example);

    int updateByPrimaryKeySelective(AuthGroupPermissions record);

    int updateByPrimaryKey(AuthGroupPermissions record);
}