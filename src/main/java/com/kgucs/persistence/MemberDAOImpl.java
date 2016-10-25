package com.kgucs.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

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
}
