package com.sc.xxb.admin.model;
import java.io.Serializable;
import java.util.List;



/**
 * @Title: UPermission.java 
 * @Package com.xm.shiro.admin.entity
 * @Description:
 * @author bamboo  <a href=
 *         "mailto:zjcjava@163.com?subject=hello,bamboo&body=Dear Bamboo:%0d%0a描述你的问题："
 *         Bamboo</a>   
 * @date 2017-5-10 0:00:45
 * @version V1.0   
 */
public class UPermission  implements Serializable {
	 /** serialVersionUID. */
 	private static final long serialVersionUID =1493049839167L;
 	
 	  private String menuId;
 	  private String menuName;
 	  private String menuType;
 	  private String parentId;
 	  private String parentName;
 	  private List<UPermission> childs;
 	  private String url;
 	  private String notes;
 	  private Integer orderNum;

	public UPermission() {
	}

	public UPermission(String menuId) {
		this.menuId = menuId;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public List<UPermission> getChilds() {
		return childs;
	}

	public void setChilds(List<UPermission> childs) {
		this.childs = childs;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	@Override
	public String toString() {
		return "UPermission{" +
				"menuId='" + menuId + '\'' +
				", menuName='" + menuName + '\'' +
				", menuType='" + menuType + '\'' +
				", parentId='" + parentId + '\'' +
				", parentName='" + parentName + '\'' +
				", childs=" + childs +
				", url='" + url + '\'' +
				", notes='" + notes + '\'' +
				", orderNum=" + orderNum +
				'}';
	}
}
