package com.jmzc.client;



public class Client {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        TestEndPointService service1 = new TestEndPointService();
	        System.out.println("Create Web Service...");
	        TestEndPoint port1 = service1.getTestEndPointPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.getUser());
	        System.out.println("Create Web Service...");
	        TestEndPoint port2 = service1.getTestEndPointPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.getUser());
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
