package com.fet.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * Smart Home Web Service (REST)
 * 
 * @author LeoLiu
 */
@Path("/")
public class SmartHomeWS {
	
	
	@POST
	@Path("/getDeviceStatus")
	@Consumes(MediaType.APPLICATION_JSON)
	public String getDeviceStatus(String jsonData) {
		System.out.println("jsonData::" + jsonData);
		return "aa";
	}

}
