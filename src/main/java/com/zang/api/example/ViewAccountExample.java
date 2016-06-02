package com.zang.api.example;

import com.zang.api.ZangConnector;
import com.zang.api.configuration.BasicZangConfiguration;
import com.zang.api.domain.Account;
import com.zang.api.exceptions.ZangException;

public class ViewAccountExample {

	public static void main(String[] args) {
		BasicZangConfiguration conf = new BasicZangConfiguration();
		conf.setSid("{AccountSid}");
		conf.setAuthToken("{AuthToken}");
		ZangConnector conn = new ZangConnector(conf);
		
		try {
			Account account = conn.viewAccount("{AccountSid}");
			System.out.println(account.getSid());
		} catch (ZangException e) {
			e.printStackTrace();
		}
	}
}
