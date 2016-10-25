package com.kgucs.domain;

public class UserVO {
	
	private int index;
	private String id;
	private String password;
	private String[] file_name;
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String[] getFile_name() {
		return file_name;
	}
	public void setFile_name(String[] file_name) {
		this.file_name = file_name;
	}
	
}
