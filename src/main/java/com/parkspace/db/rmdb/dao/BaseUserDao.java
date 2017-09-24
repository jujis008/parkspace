package com.parkspace.db.rmdb.dao;

import com.parkspace.db.rmdb.entity.BaseUser;

/**
 * 用户基础信息表
 * @author lidongliang
 *
 */
public interface BaseUserDao {
	/**
	 * 新增
	 * @param baseUser
	 */
	public void save(BaseUser baseUser);
	/**
	 * 删除
	 * @param baseUser
	 */
	public void delete(BaseUser baseUser);
	/**
	 * 更新
	 * @param baseUser
	 */
	public void update(BaseUser baseUser);
	/**
	 * 
	 * @param userId
	 * @return
	 */
	public BaseUser getById(String userId);
}