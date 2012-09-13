package com.jmzc.server.persistence.mapper;


import org.apache.ibatis.annotations.*;


public interface UserMapper
{
	
	@Select("SELECT USERNAME FROM USER")
	public String getUser() throws Exception;
	
	
}
