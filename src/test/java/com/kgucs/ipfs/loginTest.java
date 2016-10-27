package com.kgucs.ipfs;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kgucs.domain.FileVO;
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
	public void insertId(){
		
		UserVO vo = new UserVO();
		vo.setId("ra");
		vo.setPassword("ra");
		
		dao.signUp(vo);
	}
	
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
	
	@Test
	public void checkId(){
		
		UserVO vo = new UserVO();
		vo.setId("ra");
		
		System.out.println(dao.checkId(vo));
		
	}
	
	@Test
	public void signUp(){
		
		UserVO vo = new UserVO();
		vo.setId("raaa");
		vo.setPassword("raaa");
		
		System.out.println("signUpÀÇ °á°ú"+dao.signUp(vo));
	}

	@Test
	public void getFiles(){
		
		UserVO vo = new UserVO();
		vo.setIndex(4);
		
		List<FileVO> files = dao.getFiles(vo);
		Iterator<FileVO> iter = files.iterator();
		
		while(iter.hasNext()){
			FileVO fvo = iter.next();
			
			System.out.println(fvo.getIndex());
		}
	}
}
