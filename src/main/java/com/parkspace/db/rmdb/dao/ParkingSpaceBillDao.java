package com.parkspace.db.rmdb.dao;

import java.util.List;

import com.parkspace.db.rmdb.entity.ParkingSpaceBill;

/**
 * @Title: ParkingSpaceBillDao.java
 * @Package com.parkspace.db.rmdb.dao
 * <p>Description:
 * 车位订单，用来记录车位的订单信息
 * 预约
 * 使用中
 * 使用完成
 * </p>
 * @author sunld
 * @version V1.0.0 
 * <p>CreateDate:2017年9月22日 下午11:14:27</p>
*/

public interface ParkingSpaceBillDao {
	/**
	 * @Title: getParkingSpaceBill
	 * <p>Description:根据订单编号获取车位订单信息</p>
	 * @param     orderJnlNo 订单编号
	 * @return ParkingSpaceBill    返回类型
	 * @throws
	 * <p>CreateDate:2017年9月23日 下午9:16:29</p>
	 */
	public ParkingSpaceBill getParkingSpaceBill(String orderJnlNo);
	/**
	 * @Title: addParkingSpaceBill
	 * <p>Description:
	 * 保存车位订单信息，id自动生成,在service层返回主键id
	 * </p>
	 * @param     parkingSpaceBill 车位订单信息
	 * @return void    返回类型
	 * @throws
	 * <p>CreateDate:2017年9月23日 下午9:16:08</p>
	 */
	public void addParkingSpaceBill(ParkingSpaceBill parkingSpaceBill);
	/**
	 * @Title: updateParkingSpaceBill
	 * <p>Description:
	 * 更改车位订单信息,当状态发生变换时需要把状态之前的数据保存到历史订单中
	 * </p>
	 * @param     parkingSpaceBill 车位订单信息
	 * @return void    返回类型
	 * @throws
	 * <p>CreateDate:2017年9月23日 下午9:15:51</p>
	 */
	public void updateParkingSpaceBill(ParkingSpaceBill parkingSpaceBill);
	/**
	 * @Title: deleteParkingSpaceBill
	 * <p>Description:
	 * 删除车位订单信息，数据保存到历史订单中
	 * </p>
	 * @param     orderJnlNo 车位订单编号
	 * @return void    返回类型
	 * @throws
	 * <p>CreateDate:2017年9月23日 下午9:15:24</p>
	 */
	public void deleteParkingSpaceBill(String orderJnlNo);
	/**
	 * @Title: getParkingSpaceBillList
	 * <p>Description:根据条件查询车位订单信息</p>
	 * @param     parkingSpaceBill 车位订单信息
	 * @return List<ParkingSpaceBill>    返回类型
	 * @throws
	 * <p>CreateDate:2017年9月23日 下午9:15:03</p>
	 */
	public List<ParkingSpaceBill> getParkingSpaceBillList(ParkingSpaceBill parkingSpaceBill);
}