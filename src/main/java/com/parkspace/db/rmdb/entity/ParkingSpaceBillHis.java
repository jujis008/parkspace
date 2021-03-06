package com.parkspace.db.rmdb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

/**
 * @Title: ParkingSpaceBillHis.java
 * @Package com.parkspace.db.rmdb.entity
 * <p>Description:
 * 车位订单流水，记录该车为订单中的预定-使用-延长使用-结算整个流程
 * 状态为结算的订单作为对账订单
 * </p>
 * @author sunld
 * @version V1.0.0 
 * <p>CreateDate:2017年9月23日 下午6:38:15</p>
*/

public class ParkingSpaceBillHis implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//主键
	private String UUID;
	//订单号
	private String orderJnlNo;
	//用户id
	private String userId;
	//业主用户id
	private String spaceOwnerUserId;
	//车牌号
	private String carno;
	//车位编号,形如3-101
	private String spaceno;
	//订单状态：1、预约中，2、使用中，3.延长使用中，4，已结算、5取消订单
	private Integer billStatus;
	//订单状态多条件查询
	private Integer[] billStatusQuery;
	//停车时长，申请停车时长，单位为小时，不能超过24小时
	private Integer parkHours;
	//单价，每小时计费
	private BigDecimal unitPrice;
	//预算：=单价*停车时长
	private BigDecimal budgetPrice;
	//创建时间
	private Date createTime;
	//记录实际的停车时长
	private BigDecimal actualParkHours;
	//预算：=单价*实际停车时长
	private BigDecimal actualPrice;
	//延长停车时长，默认为0
	private Integer delayParkHours;
	
	//上次结算时间:24小时结算一次，并且记录该时间，同时更新结算金额
	private Date lastPayTime;
	//已结算金额：截至目前一共结算的金额
	private BigDecimal payedMoney;
	
	
	
	public Date getLastPayTime() {
		return lastPayTime;
	}
	public void setLastPayTime(Date lastPayTime) {
		this.lastPayTime = lastPayTime;
	}
	public BigDecimal getPayedMoney() {
		return payedMoney;
	}
	public void setPayedMoney(BigDecimal payedMoney) {
		this.payedMoney = payedMoney;
	}
	public String getSpaceOwnerUserId() {
		return spaceOwnerUserId;
	}
	public void setSpaceOwnerUserId(String spaceOwnerUserId) {
		this.spaceOwnerUserId = spaceOwnerUserId;
	}
	public Integer getDelayParkHours() {
		return delayParkHours;
	}
	public void setDelayParkHours(Integer delayParkHours) {
		this.delayParkHours = delayParkHours;
	}
	//记录时间，表示该流水记录的时间
	private Date recodeTime = new Date();
	public String getUUID() {
		return UUID;
	}
	public void setUUID(String uUID) {
		UUID = uUID;
	}
	public String getOrderJnlNo() {
		return orderJnlNo;
	}
	public void setOrderJnlNo(String orderJnlNo) {
		this.orderJnlNo = orderJnlNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCarno() {
		return carno;
	}
	public void setCarno(String carno) {
		this.carno = carno;
	}
	public String getSpaceno() {
		return spaceno;
	}
	public void setSpaceno(String spaceno) {
		this.spaceno = spaceno;
	}
	public Integer getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(Integer billStatus) {
		this.billStatus = billStatus;
	}
	public Integer getParkHours() {
		return parkHours;
	}
	public void setParkHours(Integer parkHours) {
		this.parkHours = parkHours;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public BigDecimal getBudgetPrice() {
		return budgetPrice;
	}
	public void setBudgetPrice(BigDecimal budgetPrice) {
		this.budgetPrice = budgetPrice;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public BigDecimal getActualParkHours() {
		return actualParkHours;
	}
	public void setActualParkHours(BigDecimal actualParkHours) {
		this.actualParkHours = actualParkHours;
	}
	public BigDecimal getActualPrice() {
		return actualPrice;
	}
	public void setActualPrice(BigDecimal actualPrice) {
		this.actualPrice = actualPrice;
	}
	public Date getRecodeTime() {
		return recodeTime;
	}
	public void setRecodeTime(Date recodeTime) {
		this.recodeTime = recodeTime;
	}
	public Integer[] getBillStatusQuery() {
		return billStatusQuery;
	}
	public void setBillStatusQuery(Integer[] billStatusQuery) {
		this.billStatusQuery = billStatusQuery;
	}
	@Override
	public String toString() {
		return "ParkingSpaceBillHis [UUID=" + UUID + ", orderJnlNo=" + orderJnlNo + ", userId=" + userId
				+ ", spaceOwnerUserId=" + spaceOwnerUserId + ", carno=" + carno + ", spaceno=" + spaceno
				+ ", billStatus=" + billStatus + ", billStatusQuery=" + Arrays.toString(billStatusQuery)
				+ ", parkHours=" + parkHours + ", unitPrice=" + unitPrice + ", budgetPrice=" + budgetPrice
				+ ", createTime=" + createTime + ", actualParkHours=" + actualParkHours + ", actualPrice=" + actualPrice
				+ ", delayParkHours=" + delayParkHours + ", lastPayTime=" + lastPayTime + ", payedMoney=" + payedMoney
				+ ", recodeTime=" + recodeTime + "]";
	}
}
