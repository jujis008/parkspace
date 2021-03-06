package com.parkspace.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.parkspace.common.exception.ParkspaceServiceException;
import com.parkspace.db.rmdb.dao.IntegralDao;
import com.parkspace.db.rmdb.entity.Integral;
import com.parkspace.service.IIntegralService;
@Service("iIntegralService")
public class IIntegralServiceImpl implements IIntegralService {
	@Resource
	private IntegralDao integralDao;
	@Override
	public Integer getIntegral(String userId) throws ParkspaceServiceException, Exception {
		Integral integral = integralDao.getByUserId(userId);
		return integral.getVal();
	}

}
