package com.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.dao.MyFavoriteUserDAO;
import com.blog.model.BllFavuser;

/**
 * @author：Tim
 * @date：2017年7月9日 下午9:50:40
 * @description：TODO
 */
@Service
public class MyFavoriteUserService {

	@Autowired
	private MyFavoriteUserDAO myFavoriteUserDAO;

	/**
	 * 获取当前用户关注的用户
	 * @param userCode 当前用户编码
	 * @return
	 */
	public List<BllFavuser> getMyFavoriteUser(String userCode) {
		return myFavoriteUserDAO.getMyFavoriteUser(userCode);
	}
}