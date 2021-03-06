package com.parkspace.db.rmdb.dao;

import java.util.List;
import java.util.Map;

import com.parkspace.db.rmdb.entity.Community;

/**
 * @Title: CommunityDao.java
 * @Package com.parkspace.db.rmdb.dao
 * <p>Description:
 * 小区表:记录小区的基本信息
 * </p>
 * @author sunld
 * @version V1.0.0 
 * <p>CreateDate:2017年9月22日 下午11:14:27</p>
*/

public interface CommunityDao {
	/**
	 * @Title: getCommunity
	 * <p>Description:根据小区id获取小区信息</p>
	 * @param     comid 小区编号
	 * @return Community    返回类型
	 * @throws
	 * <p>CreateDate:2017年9月23日 下午9:18:13</p>
	 */
	public Community getCommunity(String comid);
	/**
	 * @Title: addCommunity
	 * <p>Description:
	 * 保存小区信息id自动生成,在service层返回主键id
	 * </p>
	 * @param     community 小区信息
	 * @return void    返回类型
	 * @throws
	 * <p>CreateDate:2017年9月23日 下午9:17:58</p>
	 */
	public void addCommunity(Community community);
	/**
	 * @Title: updateCommunity
	 * <p>Description:更改小区信息</p>
	 * @param     community 小区信息
	 * @return void    返回类型
	 * @throws
	 * <p>CreateDate:2017年9月23日 下午9:17:44</p>
	 */
	public void updateCommunity(Community community);
	/**
	 * @Title: deleteCommunity
	 * <p>Description:
	 * 删除小区信息,修改isenable为-1,需要同时更新编辑人和编辑时间
	 * </p>
	 * @param     community 小区信息
	 * @return void    返回类型
	 * @throws
	 * <p>CreateDate:2017年9月23日 下午9:17:26</p>
	 */
	public void deleteCommunity(Community community);
	/**
	 * @Title: getCommunityList
	 * <p>Description:根据条件查询小区信息</p>
	 * @param     community 小区信息
	 * @return List<Community>    返回类型
	 * @throws
	 * <p>CreateDate:2017年9月23日 下午9:17:00</p>
	 */
	public List<Community> getCommunityList(Community community);
	
	/**
	 * @Title: getCommunityAllInfoList
	 * <p>Description:根据条件查询小区信息
	 * 包括小区的基本信息，行政区域的基本信息
	 * </p>
	 * @param     community 小区信息
	 * @return List<Community>    返回类型
	 * @throws
	 * <p>CreateDate:2017年9月23日 下午9:17:00</p>
	 */
	public List<Community> getCommunityAllInfoList(Community community);
	/**
	 * @Title: addUserCommunity
	 * <p>Description:增加用户与小区的关联关系</p>
	 * @param     comidAndUserIdMap 
	 * 使用map构建条件   
	 * comid 小区id
	 * userId 用户id
	 * @return void    返回类型
	 * @throws
	 * <p>CreateDate:2017年9月24日 下午6:06:15</p>
	 */
	public void addUserCommunity(Map<String,String> comidAndUserIdMap);
	
	/**
	 * @Title: deleteUserCommunity
	 * <p>Description:删除用户与小区的关联关系</p>
	 * @param     comidAndUserIdMap 
	 * 使用map构建条件   
	 * comid 小区id
	 * userId 用户id
	 * @return void    返回类型
	 * @throws
	 * <p>CreateDate:2017年9月24日 下午6:06:15</p>
	 */
	public void deleteUserCommunity(Map<String,String> comidAndUserIdMap);
}
