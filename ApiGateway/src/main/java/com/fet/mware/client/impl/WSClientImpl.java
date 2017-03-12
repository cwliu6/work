package com.fet.mware.client.impl;

import org.springframework.stereotype.Component;

import com.fet.mware.client.WSClient;

/**
 * SH2 API - WS Client 實作
 * 
 * @author LiuLeo
 */
@Component("wsClient")
public class WSClientImpl implements WSClient {

	/**
	 * 取得申辦人資料 by DID
	 * @param did
	 * @return
	 */
	public String getUser(String did) {
		return "run user";
	}
}
