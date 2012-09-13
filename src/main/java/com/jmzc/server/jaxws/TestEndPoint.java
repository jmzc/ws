package com.jmzc.server.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.jmzc.server.persistence.User;

@WebService()
public class TestEndPoint
{

	@WebMethod()
	public String getUser()
	{
		String user = User.getUser();
		System.out.println("Hello: " + User.getUser());
		return "Hello " + user + "!";
	}
}
