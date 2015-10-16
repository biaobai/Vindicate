package org.loving.util;

/**
 * 这个类用于储存一些全局变量。方便修改
 * @author up
 *
 */
public class Config {
	public static Long TIME = (long) 520;
	//发送邮件的账号密码
	public static String AuthenUsername = "myaccount";
	public static String AuthenPassword = "******";
	//接受者账号
	public static String SendToGuin = "up's Email";
	public static String SendTozoyoto = "Girl'sEmail";
	public static String path = "src/black.JPG";//GUi的一张背景图片，之后弃用
	//倒计时的大小
	public static int w = 818;//750
	public static int h = 357;
	//邮件正文
	public static String Msg = "***********"
			+ "**************"
			+ "**********"
			+ "此处省略n个字，关于一些回忆"
			+ "*********"
			+ "*******，我中意你！\n\r";
	
}
