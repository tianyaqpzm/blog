package com.pei.mapper;

import com.pei.pojo.DjangoSite;
import com.pei.pojo.DjangoSiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DjangoSiteMapper {
    int countByExample(DjangoSiteExample example);

    int deleteByExample(DjangoSiteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DjangoSite record);

    int insertSelective(DjangoSite record);

    List<DjangoSite> selectByExample(DjangoSiteExample example);

    DjangoSite selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DjangoSite record, @Param("example") DjangoSiteExample example);

    int updateByExample(@Param("record") DjangoSite record, @Param("example") DjangoSiteExample example);

    int updateByPrimaryKeySelective(DjangoSite record);

    int updateByPrimaryKey(DjangoSite record);
}