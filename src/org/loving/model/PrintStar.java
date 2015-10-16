package org.loving.model;

import javax.swing.JOptionPane;

import org.loving.util.Log;

/**
 * 此类用来打印出三个心形图案
 * @author up
 *
 */
public class PrintStar {
	/**
	 * 初始化时一步一步地打印出一个心形，然后调用相应方法，打印另外两个心形
	 * @throws InterruptedException
	 */
	public PrintStar() throws InterruptedException{
		Thread.sleep(2000);
		Log.logprintln("\t "+(char)3+"\t\t\t\t "+(char)3+"");Thread.sleep(2000);
		Log.logprintln(""+(char)3+"\t\t "+(char)3+"\t\t "+(char)3+"\t\t "+(char)3+"");Thread.sleep(2000);
		Log.logprintln(""+(char)3+"\t\t\t "+(char)3+"\t\t\t "+(char)3+"");Thread.sleep(2000);
		Log.logprint(""+(char)3+"\t\t I \t");Thread.sleep(2000);
		Log.logprint("Love\t");Thread.sleep(2000);
		Log.logprintln("You\t\t "+(char)3+"");Thread.sleep(2000);
		Log.logprintln("\t "+(char)3+"\t\t\t\t "+(char)3+"");Thread.sleep(2000);
		Log.logprintln("\t\t "+(char)3+"\t\t "+(char)3+"");Thread.sleep(2000);
		Log.logprintln("\t\t\t "+(char)3+"");Thread.sleep(2000);
		Log.logprintln(callBack("*"));Thread.sleep(2000);
		Log.logprintln(callBack("O"));Thread.sleep(2000);
	}
	/**
	 * 把心形记录在又将内容里面，
	 * 这个Log使用来记录整个过程输入和输出，打印的一些数据，用于最后发送邮件的Msg
	 */
	private static void getLog(){
		Log.logPri("\t❤\t\t\t\t❤");
		Log.logPri("❤\t\t❤\t\t❤\t\t❤");
		Log.logPri("❤\t\t\t❤\t\t\t❤");
		Log.logPri("❤\t\tI\t");
		Log.logPri("Love\t");
		Log.logPri("You\t\t❤");
		Log.logPri("\t❤\t\t\t\t❤");
		Log.logPri("\t\t❤\t\t❤");
		Log.logPri("\t\t\t❤");
	}
	public static PrintStar getInstance(){
		try {
			return new PrintStar();
		} catch (InterruptedException e) {
			JOptionPane.showMessageDialog(null, "打印心形出错！0 0", "出错了0 0", JOptionPane.ERROR_MESSAGE);
		}
		return null;
	}
	public static void main(String[] args) throws InterruptedException {
		
		new PrintStar();
	}
	public static String callBack(String input){

		int[] array = {0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 4, 5, 2, 3, 4, 1, 0, 1,

		         	  0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < array.length; i++) {

		if(i % 7 == 0)

		sb.append("  \n");

		if(array[i] == 0)

		sb.append("   ");

		else if(array[i] == 4)

		sb.append("  ");

		else if(array[i] == 5)

		sb.append(" I ");

		else if(array[i] == 2)

		sb.append("Lvoe ");

		else if(array[i] == 3)

		sb.append("You");

		else

		sb.append("  "+input);

		}

		return sb.toString();

		}
}
