package com.pei.mapper;

import com.pei.pojo.AuthPermission;
import com.pei.pojo.AuthPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthPermissionMapper {
    int countByExample(AuthPermissionExample example);

    int deleteByExample(AuthPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthPermission record);

    int insertSelective(AuthPermission record);

    List<AuthPermission> selectByExample(AuthPermissionExample example);

    AuthPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthPermission record, @Param("example") AuthPermissionExample example);

    int updateByExample(@Param("record") AuthPermission record, @Param("example") AuthPermissionExample example);

    int updateByPrimaryKeySelective(AuthPermission record);

    int updateByPrimaryKey(AuthPermission record);
}