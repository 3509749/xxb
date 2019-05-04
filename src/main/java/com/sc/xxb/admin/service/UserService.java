package com.sc.xxb.admin.service;

 
import com.sc.xxb.admin.model.UPermission;
import com.sc.xxb.admin.model.UUser;
import com.sc.xxb.admin.model.User;
import com.sc.xxb.base.model.PageBean;
 
public interface UserService {
	public UUser getUserByLoninName(Object map);
	public PageBean getUserByPage(User u, int page, int limit);
	public int insertUser(User u);
	public int deleteUsers(String[] ids) ;
	public User getUserById(String id);
	public int updateUser(User u);
	public int updatePass(User u);
}
