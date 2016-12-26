package com.hotel.booking.twit.service;

import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;


@RemoteProxy(name="dwrService")
public class TweetService {
	
	public TweetService() { }
	
	@RemoteMethod
	public String getTweets() throws Exception {
		
		return "Success";
	}
	
	@RemoteMethod
	public void printAddress() {
		System.out.println("Printing");
	}
}
