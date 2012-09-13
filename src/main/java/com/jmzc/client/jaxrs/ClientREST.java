package com.jmzc.client.jaxrs;


import org.apache.cxf.jaxrs.client.JAXRSClientFactory;

import com.jmzc.common.IHelloWorld;


public class ClientREST 
{
	
	public static void main(String[] a)
	{
		IHelloWorld s = JAXRSClientFactory.create("http://localhost:8080/ws-0.0.1-SNAPSHOT/rest", IHelloWorld.class);
		
		System.out.println("Resultado de getHelloWorldJSON():" +  s.getHelloWorldJSON());
		System.out.println("Resultado de getHelloWorldXML():" +  s.getHelloWorldXML());
	}
}