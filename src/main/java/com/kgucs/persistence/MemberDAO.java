package com.kgucs.persistence;

import java.util.List;

import com.kgucs.domain.FileVO;
import com.kgucs.domain.UserVO;

public interface MemberDAO {
	public String login(UserVO uvo);
	
	public int checkId(UserVO uvo);
	
	public int signUp(UserVO uvo);
	
	public UserVO getUser(UserVO uvo);
	

}
