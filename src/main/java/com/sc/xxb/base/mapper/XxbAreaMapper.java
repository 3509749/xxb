package com.sc.xxb.base.mapper;

import com.sc.xxb.base.model.XxbArea;
import com.sc.xxb.base.model.XxbAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxbAreaMapper {
    long countByExample(XxbAreaExample example);

    int deleteByExample(XxbAreaExample example);

    int insert(XxbArea record);

    int insertSelective(XxbArea record);

    List<XxbArea> selectByExample(XxbAreaExample example);

    int updateByExampleSelective(@Param("record") XxbArea record, @Param("example") XxbAreaExample example);

    int updateByExample(@Param("record") XxbArea record, @Param("example") XxbAreaExample example);
}