package com.kgucs.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.kgucs.domain.FileVO;
import com.kgucs.domain.UserVO;
import com.kgucs.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject
	MemberDAO mdao;
	
	@Override
	public String login(UserVO uvo){
		String result = mdao.login(uvo);
		
		return result;
	}
	
	@Override
	public int checkId(UserVO uvo){
		
		return mdao.checkId(uvo);
	}
	
	@Override
	public int signUp(UserVO uvo){
		return mdao.signUp(uvo);
	}
	
	@Override
	public UserVO getUser(UserVO uvo){
		return mdao.getUser(uvo);
	}
	
	
}
