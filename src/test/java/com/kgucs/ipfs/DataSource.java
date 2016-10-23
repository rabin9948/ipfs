package com.kgucs.ipfs;

import java.sql.Connection;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class DataSource {

	@Inject
	private javax.sql.DataSource ds;
	
	@Test
	public void testConnection() throws Exception{
		try{
			Connection con = ds.getConnection();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
