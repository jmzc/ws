package com.jmzc.server.persistence;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.jmzc.server.persistence.mapper.UserMapper;


/*
 * 	Factoría de sesiones
 * 
 */

public class SessionFactory 
{

    private static  SqlSessionFactory session;
    
 
    
    public static SqlSessionFactory getSession() throws Exception
    {
    	 try
         {
    		 if ( session == null )
    		 {
	    			 Reader reader  = Resources.getResourceAsReader("configuration.xml");
	    			 session = new SqlSessionFactoryBuilder().build(reader);
	    			 session.getConfiguration().addMapper(UserMapper.class);
    		 }

         }
         catch(Exception e)
         {
         	e.printStackTrace();
         }
         
         return session;

    }
}