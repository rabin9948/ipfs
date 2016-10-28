package com.kgucs.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kgucs.domain.FileVO;
import com.kgucs.domain.UserVO;

@Repository
public class FileDAOImpl implements FileDAO {
	
	@Inject
	SqlSession session;
	
	private static String namespace = "com.kgucs.mapper.FileMapper";
	
	@Override
	public List<FileVO> getFiles(UserVO uvo){
		return session.selectList(namespace+".getFiles", uvo);
	}
}
