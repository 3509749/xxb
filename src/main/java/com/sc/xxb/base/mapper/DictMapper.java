package com.sc.xxb.base.mapper;
 
import java.util.List;

import com.sc.xxb.base.model.DictItem;
import com.sc.xxb.base.model.DictTable;
import org.apache.ibatis.annotations.Mapper;


@Mapper  
public interface DictMapper {
	public List<DictItem> getOtherTable(DictTable d);
	public List<DictItem> getDict(DictTable d);
	public String getOtherTableByField(DictTable d);
	
}

