package org.loving.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.apache.commons.mail.EmailException;
import org.loving.util.Config;
import org.loving.util.Log;
import org.loving.util.SendEmail;
import org.loving.util.ShowDialog;

/**
 * 程序入口，需要验证up的几个名词才能进入，妹子一进入系统则向up发送邮件通知
 * @author up
 *
 */
public class Before {
	public static ArrayList<String> name = new ArrayList<String>(Arrays.asList("up's_name1","up's_name2","up's_name3","up's_nickname","..."));
	
	public static Before getInstance(){
		try {
			return new Before();
		} catch (InterruptedException e) {
			ShowDialog.Warn( "初始化错误！0 0",  "出错了0 0");
		}
		return null;
	}
	public Before() throws InterruptedException{
		Object[] options = { "好的", "不好" }; 
		JOptionPane.showOptionDialog(null, "使用前请双击控制台，将其最大化~", "友情提示0 0", 
		JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, 
		null, options, options[0]); 
		Thread.sleep(3000);
		String inputValue = JOptionPane.showInputDialog("Please Enter A Person You Like One,To Enter The System..."); 
		//Log.logprintln("Please Enter A Person You Like One,To Enter The System...");
		//Scanner scan = new Scanner(System.in);
		//key = scan.nextLine();
		while(!name.contains(inputValue)){
			JOptionPane.showOptionDialog(null, "A Boy Who You Like...", "友情提示0 0", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, 
					null, new Object[]{"我想想"}, options[0]); 
			Log.logPri("Girl's Name不喜欢："+inputValue);
			inputValue = JOptionPane.showInputDialog("Please Enter A Person You Like One,To Enter The System...");
		}
		try {
			SendEmail.Send2Email(Config.SendToGuin, null,"She is love me too！");
		} catch (EmailException e) {
			JOptionPane.showMessageDialog(null, "邮件发送出错！0 0", "出错了0 0", JOptionPane.ERROR_MESSAGE);
		}
	}
}
