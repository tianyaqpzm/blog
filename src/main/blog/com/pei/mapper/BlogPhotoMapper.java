package com.pei.mapper;

import com.pei.pojo.BlogPhoto;
import com.pei.pojo.BlogPhotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogPhotoMapper {
    int countByExample(BlogPhotoExample example);

    int deleteByExample(BlogPhotoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogPhoto record);

    int insertSelective(BlogPhoto record);

    List<BlogPhoto> selectByExample(BlogPhotoExample example);

    BlogPhoto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlogPhoto record, @Param("example") BlogPhotoExample example);

    int updateByExample(@Param("record") BlogPhoto record, @Param("example") BlogPhotoExample example);

    int updateByPrimaryKeySelective(BlogPhoto record);

    int updateByPrimaryKey(BlogPhoto record);
}