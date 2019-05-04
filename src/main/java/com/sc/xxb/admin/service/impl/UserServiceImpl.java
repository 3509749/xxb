package com.sc.xxb.admin.service.impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sc.xxb.admin.mapper.UserMapper;
import com.sc.xxb.admin.model.UUser;
import com.sc.xxb.admin.model.User;
import com.sc.xxb.admin.service.UserService;
import com.sc.xxb.base.model.PageBean;

import com.github.pagehelper.PageHelper;
 
@Service
@Transactional
// 此处不再进行创建SqlSession和提交事务，都已交由spring去管理了。
public class UserServiceImpl  implements UserService {
	@Autowired
    private UserMapper userMapper;

	public UUser getUserByLoninName(Object map) {
		UUser user = userMapper.getUserByLoninName(map);
		return user;
	}

	public PageBean getUserByPage(User u, int page, int limit) {
		PageHelper.startPage(page, limit);
		List<User> list = userMapper.getUserByPage(u);
		List<User> list2 = new ArrayList<>();
		for(Object temp : list){
			if(temp instanceof  User){
				list2.add((User)temp);
			}
		}
		int countNums = userMapper.getUserCount(u);
		PageBean<User> pageData = new PageBean<>(page, limit, countNums);
		pageData.setItems(list2);
		return pageData;
	}
	public int insertUser(User u){
		int r=0;
		try {
			r=userMapper.insertUser(u);
//			r+=userMapper.insertRole(u);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}
	@Override
	public int deleteUsers(String[] ids) {
		int r=0;
		try {
//			userMapper.deleteRoles(ids);
			r= userMapper.deleteUsers(ids);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}
	@Override
	public User getUserById(String id) {
		// TODO Auto-generated method stub
		if("".equals(id))
			return new User();
		return userMapper.getUserById(id);
	}
	@Override
	public int updateUser(User u) {
		int r=0;
		try {
			r= userMapper.updateUser(u);
//			   userMapper.deleteRole(u);
//			r+=userMapper.insertRole(u);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}
	@Override
	public int updatePass(User u) {
		int r=0;
		try {
			r= userMapper.updatePass(u);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}

}
