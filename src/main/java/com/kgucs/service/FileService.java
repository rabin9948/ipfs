package com.kgucs.service;

import java.util.List;

import com.kgucs.domain.FileVO;
import com.kgucs.domain.UserVO;

public interface FileService {
	public List<FileVO> getFiles(UserVO vo);
}
