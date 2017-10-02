package com.parkspace.db.rmdb.entity;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @Title: Caruser.java
 * @Package com.parkspace.db.rmdb.entity
 * <p>Description:
 * 车主表（Caruser）
 * </p>
 * @author sunld
 * @version V1.0.0 
 * <p>CreateDate:2017年9月23日 下午5:28:24</p>
*/

public class Caruser extends BaseUser implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//车牌号
	private String carno;
	//状态0:未认证 1：已认证，默认1，-1表示禁用
	private Integer isauth;
	//状态查询条件
	private Integer[] isauthQuery;
	
	//小区信息
	private Community community;
	//行政区域信息
	private Zone zone;
	
	
	@Override
	public String toString() {
		return "Caruser [carno=" + carno + ", isauth=" + isauth + ", isauthQuery=" + Arrays.toString(isauthQuery)
				+ ", community=" + community + ", zone=" + zone + "]";
	}
	public Community getCommunity() {
		return community;
	}
	public void setCommunity(Community community) {
		this.community = community;
	}
	public Zone getZone() {
		return zone;
	}
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	public Integer[] getIsauthQuery() {
		return isauthQuery;
	}
	public void setIsauthQuery(Integer[] isauthQuery) {
		this.isauthQuery = isauthQuery;
	}
	public String getCarno() {
		return carno;
	}
	public void setCarno(String carno) {
		this.carno = carno;
	}
	public Integer getIsauth() {
		return isauth;
	}
	public void setIsauth(Integer isauth) {
		this.isauth = isauth;
	}
}
