package com.sc.xxb.business.yw.mapper;

import com.sc.xxb.business.yw.model.XxbUser;
import com.sc.xxb.business.yw.model.XxbUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface XxbUserMapper {
    int countByExample(XxbUserExample example);

    int deleteByExample(XxbUserExample example);

    int insert(XxbUser record);

    int insertSelective(XxbUser record);

    List<XxbUser> selectByExample(XxbUserExample example);

    int updateByExampleSelective(@Param("record") XxbUser record, @Param("example") XxbUserExample example);

    int updateByExample(@Param("record") XxbUser record, @Param("example") XxbUserExample example);
}