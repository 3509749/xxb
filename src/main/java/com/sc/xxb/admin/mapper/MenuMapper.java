package com.sc.xxb.admin.mapper;

import com.sc.xxb.admin.model.UPermission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
	public List<UPermission> getMenuList(UPermission u);
	public int getMenuCount(UPermission u);
	public int insert(UPermission u);
	public int update(UPermission u);
	public int delete(String[] ids);
}
