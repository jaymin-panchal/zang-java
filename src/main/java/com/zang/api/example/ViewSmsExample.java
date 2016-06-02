package com.zang.api.example;

import com.zang.api.ZangConnector;
import com.zang.api.configuration.BasicZangConfiguration;
import com.zang.api.domain.SmsMessage;
import com.zang.api.exceptions.ZangException;

public class ViewSmsExample {

	public static void main(String[] args) {
		BasicZangConfiguration conf = new BasicZangConfiguration();
		conf.setSid("{AccountSid}");
		conf.setAuthToken("{AuthToken}");
		ZangConnector conn = new ZangConnector(conf);
		
		try {
			SmsMessage smsMessage = conn.viewSmsMessage("{SmsMessageSid}");
			System.out.println(smsMessage.getSid());
		} catch (ZangException e) {
			e.printStackTrace();
		}
	}
}
