package test.baseuser.dao;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.parkspace.db.rmdb.dao.BillDao;
import com.parkspace.db.rmdb.entity.Bill;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-mybatis.xml"})  

public class BillDaoTest {
	private static Logger logger = LoggerFactory.getLogger(BillDaoTest.class);  
	
	@Resource
	private BillDao billDao = null;
	@Test
	public void testsave(){
		Bill bill = new Bill();
		bill.setBillId(UUID.randomUUID().toString());
		bill.setUserId("123");
		bill.setBillType(0);
		bill.setAmount(new BigDecimal("22.30"));
		bill.setState(0);
		bill.setTransTime(new Timestamp(System.currentTimeMillis()));
		bill.setTransDate(new Date(System.currentTimeMillis()));
		billDao.save(bill);
	}
	
	@Test
	public void testUpdate() {
		Bill bill = new Bill();
		bill.setBillId("4a6da79f-165b-4280-b4f5-e553f173d8dd");
		bill.setState(0);
		billDao.update(bill);
	}
	
	
	@Test
	public void getById(){
		Bill bill = billDao.getById("2cae6166-77bf-4339-8930-44a08622de25"); 
		System.out.println(bill.getUserId());
	}
	@Test
	public void getBills(){
		Bill bill = new Bill();
		bill.setUserId("123");
				
		List<Bill> bills = billDao.getBills(bill);
		for(Bill b : bills)
		{
			System.out.println(b.getAmount());
		}
	}
	

}
 