package com.kgucs.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.kgucs.domain.UserVO;
import com.kgucs.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject
	MemberDAO mdao;
	
	@Override
	public String login(UserVO uvo){
		String result = null;
		
		
		
		return result;
	}
}
