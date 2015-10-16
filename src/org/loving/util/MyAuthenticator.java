package org.loving.util;

import javax.mail.PasswordAuthentication;
/**
 * 邮件类
 * @author up
 *
 */
public class MyAuthenticator extends javax.mail.Authenticator {
	private String strUser;  
    private String strPwd;  
  
    public MyAuthenticator(String user, String password) {  
        this.strUser = user;  
        this.strPwd = password;  
    }  
  
    protected PasswordAuthentication getPasswordAuthentication() {  
        return new PasswordAuthentication(strUser, strPwd);  
    }  
}
