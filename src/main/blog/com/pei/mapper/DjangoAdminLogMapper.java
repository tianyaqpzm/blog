package com.pei.mapper;

import com.pei.pojo.DjangoAdminLog;
import com.pei.pojo.DjangoAdminLogExample;
import com.pei.pojo.DjangoAdminLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DjangoAdminLogMapper {
    int countByExample(DjangoAdminLogExample example);

    int deleteByExample(DjangoAdminLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DjangoAdminLogWithBLOBs record);

    int insertSelective(DjangoAdminLogWithBLOBs record);

    List<DjangoAdminLogWithBLOBs> selectByExampleWithBLOBs(DjangoAdminLogExample example);

    List<DjangoAdminLog> selectByExample(DjangoAdminLogExample example);

    DjangoAdminLogWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DjangoAdminLogWithBLOBs record, @Param("example") DjangoAdminLogExample example);

    int updateByExampleWithBLOBs(@Param("record") DjangoAdminLogWithBLOBs record, @Param("example") DjangoAdminLogExample example);

    int updateByExample(@Param("record") DjangoAdminLog record, @Param("example") DjangoAdminLogExample example);

    int updateByPrimaryKeySelective(DjangoAdminLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DjangoAdminLogWithBLOBs record);

    int updateByPrimaryKey(DjangoAdminLog record);
}