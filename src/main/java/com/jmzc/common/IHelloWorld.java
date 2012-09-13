package com.jmzc.common;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/")
public interface IHelloWorld 
{

		@GET
		@Path("/json")
		@Produces({ "application/json" })
		public String getHelloWorldJSON() ;
		

		@GET
		@Path("/xml")
		@Produces({ "application/xml" })
		public String getHelloWorldXML();

}
