package org.loving.test;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.loving.util.MyAuthenticator;
import org.loving.util.SendFileEmail;

/**
 * 由于想到要发邮件，顺便去学了java如何发邮件，都说了up是个新猿啦、、、
 * 这个是一个test类，发送邮件的账号密码需要用自己的
 * @author up
 *
 */
public class TestEmail {
	public static void main(String[] args) {
		
		
		 // 收件人邮箱【多个收件人】  
        String[] toAddress = new String[] { "test邮箱"};  
        // 发件人邮箱  
        String fromAddress = "up的邮箱地址";  
        // 邮件服务器类型（这里为qq，如果要用163则为“smtp.163.com”）  
        String hostAddress = "smtp.qq.com";  
        // 邮件的主题  
        String subject = "我的第一封java邮件";  
        // 邮件的正文  
        String messageText = "Hello World 【up】";  
  
        // 发送邮件  
        try {
			//send(toAddress, fromAddress, hostAddress, subject, messageText);
        	SendFileEmail.SendEmail(toAddress, fromAddress, hostAddress, subject, messageText, "E:/test/a.doc");
		} catch (Exception e) {
			e.printStackTrace();
		}  
        
        
		/*try {
			Properties props = System.getProperties();
			//传递一个邮件服务器名smtp.163.com
			//mail.smtp.host代表是发信人所在的邮箱服务器名
			props.put("mail.smtp.host", "smtp.qq.com");
			props.put("mail.smtp.auth", true);
			//对于发送邮件，只需要保证发送人所在的邮件服务器正确打开就可以了
			//收件人可以是任意的
			
			MyAuthenticator myauth = new MyAuthenticator("account", "password");
			
			 //创建一个程序与邮件服务器的通信
			Session mailConnect = Session.getDefaultInstance(props, myauth);  
			
			Message msg=new MimeMessage(mailConnect);
			
			//设置发送人和接受人
			
			Address sender = new InternetAddress("up'email");
			Address receiver = new InternetAddress("test");
			
			msg.setFrom(sender);
			msg.setRecipient(Message.RecipientType.TO,receiver);
			msg.setSubject("this is my first java mail!ohooooooooooo~");
			
			msg.saveChanges();
			
			Transport.send(msg); 
			
			Transport trans = mailConnect.getTransport("stmp");
			String username = "xxxxx ";
			String password = "********";
			
			trans.connect("stmp.qq.com", username, password);
			trans.sendMessage(msg, msg.getAllRecipients());
			trans.close();
			
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		} finally{
            System.exit(0);
        }*/
		
	}
	public static void send(String[] toAddress, String fromAddress, String hostAddress, String subject, String messageText) throws Exception{
		// 收件人电子邮箱【可以有多个收件人】  
        InternetAddress[] sendTo = new InternetAddress[toAddress.length];  
        for (int i = 0; i < toAddress.length; i++) {  
            System.out.println("发送到:" + toAddress[i]);  
            sendTo[i] = new InternetAddress(toAddress[i]);  
        }  
  
        // 发件人电子邮箱  
        String from = fromAddress;  
  
        // 指定发送邮件的主机  
        String host = hostAddress;  
  
        // 获取系统属性  
        Properties properties = System.getProperties();  
  
        // 设置邮件服务器  
        properties.setProperty("mail.smtp.host", host);  
  
        properties.put("mail.smtp.auth", "true"); // 这样才能通过验证  
        MyAuthenticator myauth = new MyAuthenticator("account", "*******");  
  
        // 获取默认session对象  
        Session session = Session.getDefaultInstance(properties, myauth);  
  
        try {  
            // 创建默认的 MimeMessage 对象  
            MimeMessage message = new MimeMessage(session);  
  
            // Set From: 头部头字段  
            message.setFrom(new InternetAddress(from));  
  
            // Set To: 头部头字段（type:要被设置为TO, CC 或者BCC. 这里CC 代表抄送、BCC 代表秘密抄送y.  
            // 举例：Message.RecipientType.TO）  
            message.addRecipients(Message.RecipientType.TO, sendTo);  
  
            // Set Subject: 头部头字段  
            message.setSubject(subject);  
  
            // 设置消息体  
            message.setText(messageText);  
  
            // 发送消息  
            Transport.send(message);  
            System.out.println("Sent message successfully....");  
        } catch (MessagingException mex) {  
            mex.printStackTrace();  
        }  
  
    }  
}
