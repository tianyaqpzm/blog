package com.pei.mapper;

import com.pei.pojo.BlogComment;
import com.pei.pojo.BlogCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogCommentMapper {
    int countByExample(BlogCommentExample example);

    int deleteByExample(BlogCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogComment record);

    int insertSelective(BlogComment record);

    List<BlogComment> selectByExampleWithBLOBs(BlogCommentExample example);

    List<BlogComment> selectByExample(BlogCommentExample example);

    BlogComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlogComment record, @Param("example") BlogCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogComment record, @Param("example") BlogCommentExample example);

    int updateByExample(@Param("record") BlogComment record, @Param("example") BlogCommentExample example);

    int updateByPrimaryKeySelective(BlogComment record);

    int updateByPrimaryKeyWithBLOBs(BlogComment record);

    int updateByPrimaryKey(BlogComment record);
}