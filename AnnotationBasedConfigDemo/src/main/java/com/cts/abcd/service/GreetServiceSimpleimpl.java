package com.cts.abcd.service;

import org.springframework.stereotype.Component;

@Component("g1")
public class GreetServiceSimpleimpl implements GreetService {

	public String greet(String userName) {
		// TODO Auto-generated method stub
		return "welcome" +userName;
	}
    
	

}
