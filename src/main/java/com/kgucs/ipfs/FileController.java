package com.kgucs.ipfs;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kgucs.domain.FileVO;
import com.kgucs.domain.UserVO;
import com.kgucs.service.FileService;

@Controller
@RequestMapping("/file/*")
public class FileController {

	@Inject
	FileService fService;
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public String filePage(){
		return "main";
	}
	
	
	@ResponseBody
	@RequestMapping(value="/getFile", method= RequestMethod.POST)
	public List<FileVO> getFile(HttpServletRequest request){
		
		HttpSession session = request.getSession(false);
		List<FileVO> files = null;
		
		if( session != null ){
			UserVO vo = (UserVO)session.getAttribute("userInfo");
			files = fService.getFiles(vo);
		}
		
		return files;
	}
	
}
