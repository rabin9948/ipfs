package com.kgucs.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kgucs.domain.FileVO;
import com.kgucs.domain.UserVO;



@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	SqlSession session;
	
	private static String namespace = "com.kgucs.mapper.MemberMapper";
	
	@Override
	public String login(UserVO vo){
		
		return session.selectOne(namespace+".login",vo);
	}
	
	@Override
	public int checkId(UserVO uvo){
		
		return session.selectOne(namespace+".checkId", uvo);
	}
	
	@Override
	public int signUp(UserVO uvo){
		return session.insert(namespace+".signUp", uvo);
	}
	
	
	@Override
	public UserVO getUser(UserVO uvo){
		return session.selectOne(namespace+".getUser", uvo);
	}
	
	@Override
	public List<FileVO> getFiles(UserVO uvo){
		return session.selectList(namespace+".getFiles", uvo);
	} 
}
