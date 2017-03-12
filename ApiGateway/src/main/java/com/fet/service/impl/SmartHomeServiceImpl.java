package com.fet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fet.mware.client.WSClient;
import com.fet.service.SmartHomeService;

/**
 * SH2 - Smart Home Service 實作 
 * 
 * @author LiuLeo
 */
@Service("smartHomeService")
public class SmartHomeServiceImpl implements SmartHomeService {
	
	@Autowired
	private transient WSClient wsClient;
	

	/**
	 * 查詢申辦人資料 by DID
	 * @param did
	 * @return
	 */
	public String queryUser(String did) {
		System.out.println("a:" + wsClient);
		System.out.println("did:" + did);
		
				
		final String user = wsClient.getUser(did);
		System.out.println("user:" + user);
		
		return user;
	}
}
