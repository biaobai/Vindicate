package org.loving.util;

/**
 * 记录整个程序的类，内容用于发送邮件
 * @author up
 *
 */
public class Log {
	public static String logContext = null;
	
	public static void logprintln(String word){
		System.out.println(word);
		logContext+=word+"\n\r";
	}
	public static void logprint(String word){
		System.out.print(word);
		logContext+=word+"\n\r";
	}
	public static void logPri(String word){
		logContext+=word+"\n\r";
	}
}
