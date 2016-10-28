package com.kgucs.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.kgucs.domain.FileVO;
import com.kgucs.domain.UserVO;
import com.kgucs.persistence.FileDAO;

@Service
public class FileServiceImpl implements FileService{
	
	@Inject
	FileDAO fdao;
	
	@Override
	public List<FileVO> getFiles(UserVO vo){
		return fdao.getFiles(vo);
	}
}
