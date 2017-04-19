package com.pei.mapper;

import com.pei.pojo.BlogCategory;
import com.pei.pojo.BlogCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogCategoryMapper {
    int countByExample(BlogCategoryExample example);

    int deleteByExample(BlogCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogCategory record);

    int insertSelective(BlogCategory record);

    List<BlogCategory> selectByExampleWithBLOBs(BlogCategoryExample example);

    List<BlogCategory> selectByExample(BlogCategoryExample example);

    BlogCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlogCategory record, @Param("example") BlogCategoryExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogCategory record, @Param("example") BlogCategoryExample example);

    int updateByExample(@Param("record") BlogCategory record, @Param("example") BlogCategoryExample example);

    int updateByPrimaryKeySelective(BlogCategory record);

    int updateByPrimaryKeyWithBLOBs(BlogCategory record);

    int updateByPrimaryKey(BlogCategory record);
}