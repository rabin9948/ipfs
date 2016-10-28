package com.kgucs.ipfs;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.kgucs.domain.UserVO;
import com.kgucs.service.MemberService;

@RestController
@RequestMapping("/member/*")
public class MemberController {
	
	@Inject
	MemberService mService;
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public Map<String,String> login(UserVO vo, HttpServletRequest request, Model model){
		
		Map<String, String> result = new HashMap<String, String>();
		UserVO userInformation = null;
		int loginSuccess = Integer.parseInt(mService.login(vo));
		
		if(loginSuccess == 2){
			userInformation = mService.getUser(vo);
			
			HttpSession session = request.getSession(true);
			session.setAttribute("userInfo", userInformation); // 세션을 만들어준다.
			
			result.put("try_login", "success");
			
		}
		else{
			result.put("try_login", "fail");
		}
		
		return result;
	}
	
	@RequestMapping(value="/check-id", method= RequestMethod.POST)
	public Map<String,String> checkID(@RequestBody UserVO vo){
		Map<String, String> result = new HashMap<String, String>();
		int searchId = 0;
		
		try{
			searchId = mService.checkId(vo);
			
			if(searchId == 0 ){
				result.put("check_id","abled");
			}
			else{
				result.put("check_id", "unabled");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return result;
	}
	
	@RequestMapping(value="/sign-up",method= RequestMethod.POST)
	public Map<String,String> signUp(@RequestBody UserVO vo){
		Map<String, String> result = new HashMap<String, String>();
		int signUpResult = 0;
		
		try{
			
			signUpResult = mService.signUp(vo);
			
			if(signUpResult == 1){
				result.put("create_member", "success");
			}
			else{
				result.put("create_member", "fail");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return result;
	}
	
}
