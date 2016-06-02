package com.zang.api.example;

import com.zang.api.ZangConnector;
import com.zang.api.configuration.BasicZangConfiguration;
import com.zang.api.domain.Application;
import com.zang.api.exceptions.ZangException;
import com.zang.api.requests.ApplicationRequest;

public class CreateApplicationExample {

	public static void main(String[] args) {
		BasicZangConfiguration conf = new BasicZangConfiguration();
		conf.setSid("{AccountSid}");
		conf.setAuthToken("{AuthToken}");
		ZangConnector conn = new ZangConnector(conf);

		ApplicationRequest applicationRequest = new ApplicationRequest();
		applicationRequest.setFriendlyName("Welcome Application");
		applicationRequest.setVoiceUrl("http://www.zang.io/ivr/welcome/call");
		applicationRequest.setSmsUrl("http://www.zang.io/ivr/welcome/sms");

		try {
			Application application = conn.createApplication(applicationRequest);
			System.out.println(application.getSid());
		} catch (ZangException e) {
			e.printStackTrace();
		}
	}
}
