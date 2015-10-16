package org.loving.util;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
/**
 * 带附件的邮件类，然而并没有用到。。。
 * @author up
 *
 */
public class SendFileEmail {
	
	public static void SendEmail(String[] toAddress,String fromAddress,String hostAddress
				,String subject,String messageText,String attachPath){
			
			try {
				//准备群发收件人
				InternetAddress[] sendTo = new InternetAddress[toAddress.length];
				for(int i =0;i<toAddress.length;i++){
					sendTo[i] = new InternetAddress(toAddress[i]);
				}
				
				//发件人电子邮箱
				String from = fromAddress;
				
				//指定发送邮件的主机
				String host = hostAddress;
				
				//获取系统属性
				Properties properties = System.getProperties();
				
				//设置邮件服务器
				properties.setProperty("mail.smtp.host", host);
				
				properties.put("mail.smtp.auth", true);//这样才能通过验证
				MyAuthenticator myauth = new MyAuthenticator(Config.AuthenUsername,Config.AuthenPassword);
				
				//获取默认session对象
				Session session = Session.getDefaultInstance(properties, myauth);
				

				//创建默认的MimeMessage对象
				MimeMessage message = new MimeMessage(session);
				
				//Set From：头部字段
				message.setFrom(new InternetAddress(from));
				
				//Set To: 头部头字段（type:要被设置为TO, CC 或者BCC. 这里CC 代表抄送、BCC 代表秘密抄送y.  
				message.addRecipients(Message.RecipientType.TO, sendTo);
				
				//Set Subject:头部头字段
				message.setSubject(subject);
				
				//设置消息体
				message.setText(messageText);
				
				if(attachPath!=null&&!attachPath.equals("")){
					
					//创建消息部分
					BodyPart messageBodyPart = new MimeBodyPart();
					
					//消息
					messageBodyPart.setText(messageText);
					
					//创建多重消息（附件
					Multipart multipart = new MimeMultipart();
					
					//设置文本消息
					multipart.addBodyPart(messageBodyPart);
					
					//附件部分
					messageBodyPart = new MimeBodyPart();
					String filename = attachPath;
					DataSource source = new FileDataSource(filename);
					messageBodyPart.setDataHandler(new DataHandler(source));
					messageBodyPart.setFileName(filename.substring(attachPath.lastIndexOf("/")));
					multipart.addBodyPart(messageBodyPart);
					message.setContent(multipart);
				}
				
				//发送消息
				Transport.send(message);
				System.out.println("Send message successfully!");
			} catch (AddressException e) {
				e.printStackTrace();
			} catch (MessagingException e) {
				e.printStackTrace();
			}
			
			
			
	}
}
