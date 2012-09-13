package com.jmzc.server.persistence;


import org.apache.ibatis.session.SqlSession;
import com.jmzc.server.persistence.mapper.UserMapper;

public class User
{

	static public String getUser() 
	{
		try
		{
			SqlSession session = SessionFactory.getSession().openSession();
			try
			{
	
				UserMapper mapper = session.getMapper(UserMapper.class);
				String data = mapper.getUser();
				return data;
			}
			catch (Exception e)
			{
				e.printStackTrace();
				return "???";
			}
	
			finally
			{
				session.close();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return "???";
		}
		
	}
	
}
