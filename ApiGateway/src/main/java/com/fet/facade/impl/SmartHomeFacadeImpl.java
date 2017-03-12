package com.fet.facade.impl;

import com.fet.facade.SmartHomeFacade;
import com.fet.service.SmartHomeService;

/**
 * Smart Home Facade implement 
 * 
 * @author LiuLeo
 * @version 1.0.0.0
 */
public class SmartHomeFacadeImpl implements SmartHomeFacade {
	
	private transient SmartHomeService smartHomeService;
	
	
	public String queryDevice(final String did) {
		System.out.println("service::" + smartHomeService);
		return smartHomeService.queryUser(did);
	}

	public void setSmartHomeService(SmartHomeService smartHomeService) {
		this.smartHomeService = smartHomeService;
	}
}
