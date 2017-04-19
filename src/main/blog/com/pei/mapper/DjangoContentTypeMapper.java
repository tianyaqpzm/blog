package com.pei.mapper;

import com.pei.pojo.DjangoContentType;
import com.pei.pojo.DjangoContentTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DjangoContentTypeMapper {
    int countByExample(DjangoContentTypeExample example);

    int deleteByExample(DjangoContentTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DjangoContentType record);

    int insertSelective(DjangoContentType record);

    List<DjangoContentType> selectByExample(DjangoContentTypeExample example);

    DjangoContentType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DjangoContentType record, @Param("example") DjangoContentTypeExample example);

    int updateByExample(@Param("record") DjangoContentType record, @Param("example") DjangoContentTypeExample example);

    int updateByPrimaryKeySelective(DjangoContentType record);

    int updateByPrimaryKey(DjangoContentType record);
}