package org.loving.test;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.loving.util.Config;
import org.loving.util.Log;

/**
 * 这也是一个测试类
 * @author up
 *
 */
public class TestEmailApi {
	public static void main(String[] args) {
		Email email = new SimpleEmail();
		try {
			/*email.setAuthenticator(new DefaultAuthenticator("xxxxxx", "*******"));
			email.setHostName("smtp.yeah.net");
			email.setSmtpPort(25);
			email.setSSLOnConnect(true);
			email.setMsg("我");
			email.setSubject("你");
			email.setFrom("xxxxxxx");
			email.addTo("xxxxxx");
			email.send();*/
			
			//-----------OK-------------
			email.setAuthentication("xxxxxxxxxx", "xxxxxxx");  
			email.setHostName("smtp.qq.com");
			//email.setSmtpPort(25);
			//email.setSSLOnConnect(true);
			email.setMsg("我");
			email.setSubject("你");
			email.setFrom("xxxxxxx");
			email.addTo("xxxxxx");
			email.setDebug(true);
			email.send();
			
			/**
			 * 网易坑人，不让开启smtp，pop3，服务，需要验证手机。所以一下方法弃用！
			 */
			/*
			email.setAuthentication("ggn_loving_xxxx@163.com", "*****");
			email.setHostName("smtp.163.com");
			//email.setSmtpPort(25);
			email.setMsg("我");
			email.setSubject("你");
			email.setFrom("ggn_loving_@163.com");
			email.addTo("*************");
			//email.setSSLOnConnect(true);
			email.setDebug(true);
			email.send();*/
		} catch (EmailException e) {
			e.printStackTrace();
		} finally{
			System.out.println("ok");
		}
	}
}
