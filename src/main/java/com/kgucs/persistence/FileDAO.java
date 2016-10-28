package com.kgucs.persistence;

import java.util.List;

import com.kgucs.domain.FileVO;
import com.kgucs.domain.UserVO;

public interface FileDAO {
	public List<FileVO> getFiles(UserVO vo);
}
