package com.kgucs.ipfs;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kgucs.domain.FileVO;
import com.kgucs.domain.UserVO;
import com.kgucs.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Inject
	MemberService mService;
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public void login(UserVO vo, HttpServletRequest request, Model model){
		
		UserVO userInformation = null;
		int loginSuccess = Integer.parseInt(mService.login(vo));
		
		if(loginSuccess == 2){
			userInformation = mService.getUser(vo);
			
			HttpSession session = request.getSession(true);
			session.setAttribute("userInfo", userInformation);
			
			List<FileVO> files =  mService.getFiles(userInformation);
		}
		else if(loginSuccess == 1){
			
		}
		else if(loginSuccess == 0){
			
		}
	}
	
	@ResponseBody
	@RequestMapping(value="/check-id", method= RequestMethod.POST)
	public ResponseEntity<String> checkID(@RequestBody UserVO vo){
		System.out.println(vo.getId());
		ResponseEntity<String> entity = null;
		
		int searchId = 0;
		
		try{
			searchId = mService.checkId(vo);
			
			if(searchId == 0 ){
				entity = new ResponseEntity<String>("success", HttpStatus.OK);
			}
			else{
				entity = new ResponseEntity<String>("fail", HttpStatus.OK);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return entity;
	}
	
	@RequestMapping(value="/sign-up",method= RequestMethod.POST)
	public ResponseEntity<String> signUp(@RequestBody UserVO vo){
		ResponseEntity<String> entity = null;
		
		int signUpResult = 0;
		
		try{
			
			signUpResult = mService.signUp(vo);
			
			if(signUpResult == 1){
				entity = new ResponseEntity<String>("success", HttpStatus.OK);
			}
			else{
				entity = new ResponseEntity<String>("fail", HttpStatus.OK);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return entity;
	}
	
}
