package com.pei.mapper;

import com.pei.pojo.BlogSlider;
import com.pei.pojo.BlogSliderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogSliderMapper {
    int countByExample(BlogSliderExample example);

    int deleteByExample(BlogSliderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogSlider record);

    int insertSelective(BlogSlider record);

    List<BlogSlider> selectByExampleWithBLOBs(BlogSliderExample example);

    List<BlogSlider> selectByExample(BlogSliderExample example);

    BlogSlider selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlogSlider record, @Param("example") BlogSliderExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogSlider record, @Param("example") BlogSliderExample example);

    int updateByExample(@Param("record") BlogSlider record, @Param("example") BlogSliderExample example);

    int updateByPrimaryKeySelective(BlogSlider record);

    int updateByPrimaryKeyWithBLOBs(BlogSlider record);

    int updateByPrimaryKey(BlogSlider record);
}