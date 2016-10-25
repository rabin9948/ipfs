package com.kgucs.ipfs;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kgucs.domain.UserVO;
import com.kgucs.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class loginTest {
	
	@Inject
	MemberDAO dao;
	
	@Inject
	SqlSession session;
	
	private static String namespace = "com.kgucs.mapper.MemberMapper";
	
	@Test
	public void loginT(){
		
		try{
			UserVO vo = new UserVO();
			
			String resulTest = null;
			
			vo.setId("ra");
			vo.setPassword("raa");
			
			//resulTest = session.selectOne(namespace+".login", vo);
			
			resulTest =  dao.login(vo);
			
			System.out.println(resulTest);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
}
