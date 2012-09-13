
package com.jmzc.server.jaxrs;

import javax.inject.Inject;

import com.jmzc.common.IHelloWorld;


public class HelloWorld implements IHelloWorld
{
	@Inject
	HelloService helloService;


	public String getHelloWorldJSON() 
	{
		return "{\"result\":\"" + helloService.createHelloMessage("World") + "\"}";
	}


	public String getHelloWorldXML() 
	{
		return "<xml><result>" + helloService.createHelloMessage("World")
				+ "</result></xml>";
	}

}
