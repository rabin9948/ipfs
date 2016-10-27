package com.kgucs.service;

import java.util.List;

import com.kgucs.domain.FileVO;
import com.kgucs.domain.UserVO;

public interface MemberService {
	public String login(UserVO uvo);
	
	public int checkId(UserVO uvo);
	
	public int signUp(UserVO uvo);
	
	public UserVO getUser(UserVO uvo);
	
	public List<FileVO> getFiles(UserVO vo);
}
