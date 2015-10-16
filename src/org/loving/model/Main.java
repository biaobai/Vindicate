package org.loving.model;

import javax.swing.JOptionPane;

import org.apache.commons.mail.EmailException;
import org.loving.util.Config;
import org.loving.util.Log;
import org.loving.util.SendEmail;
import org.loving.util.ShowDialog;

/**
 * 程序主类
 * @author up
 *
 */
public class Main {
	public static void main(String[] args){
		start();
	}
	/**
	 * 分别初始化所需的类，调用相应方法
	 */
	public static void start(){
		try {
			Before.getInstance();
			PrintStar.getInstance();
			HundredDay hundredDay = HundredDay.getInstance();
			hundredDay.Day();
			Send();
		} catch (InterruptedException e) {
			ShowDialog.Alet("something warn,inform author-","发生错误");
		} finally{
			ShowDialog.Alet("this program is ending,but our story just begin~\n\rTo see email on your Qmail", "未完待续...");
		}
	}
	/**
	 * 程序最后用来向双发发送邮件的方法
	 */
	public static void Send(){
		int loveme = JOptionPane.showConfirmDialog(null, "Send A Email To Inform Him That You Also Like Him?", "Girl's_Name，我中意你", JOptionPane.YES_NO_OPTION);
		try {
			if(loveme==JOptionPane.YES_OPTION){
				Log.logPri(Config.Msg);
				SendEmail.Send2Email(Config.SendToGuin, Config.SendTozoyoto,Log.logContext);
			} else {
				Log.logPri("Falied To bb.........");
				SendEmail.Send2Email(Config.SendToGuin,Config.SendTozoyoto,Log.logContext);
			}
		} catch (EmailException e) {
			ShowDialog.Warn("发送邮件失败", "fail to send email");
		}
	}
}
