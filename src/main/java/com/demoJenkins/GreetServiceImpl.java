package com.demoJenkins;

public class GreetServiceImpl implements GreetService {

	public String greet(String uName) {
		
		return String.format("Hello! %s",uName);
	}

}
