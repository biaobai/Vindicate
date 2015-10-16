package org.loving.util;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
/**
 * 用来发送邮件的类
 * @author up
 *
 */
public class SendEmail {
	public static void Send2Email(String to1,String to2,String Msg) throws EmailException{
		Email email = new SimpleEmail();
		email.setAuthentication(Config.AuthenUsername,Config.AuthenPassword);  
		email.setHostName("smtp.qq.com");
		email.setMsg(Msg);
		email.setSubject("❤100Day❤Lving You,Girl‘s_name，我中意你");
		email.setFrom(Config.AuthenUsername);
		email.addTo(to1,to2);
		email.setDebug(false);
		email.send();
	}
}
