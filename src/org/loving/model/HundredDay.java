package org.loving.model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.loving.util.Config;
import org.loving.util.Log;
import org.loving.util.ShowDialog;

/**
 * 100天倒计时类，因为up对gui的知识不是很了解，所以没能实现我想要的结果，最后代码搞得很low...
 * @author up
 *
 */
public class HundredDay {
	private static JFrame frame = new JFrame("On SomeDay I Found I Was Fall In Love With U");
	private static JLabel ji = new JLabel();
	private static ImageIcon ico = new ImageIcon();
	private static Long TIME = Config.TIME;
	
	public static HundredDay getInstance(){
		return new HundredDay();
	}
	public static void Hundred(/*BufferedImage img,*/Color fontColor,Color endColor,int time,String mouth) throws FileNotFoundException, IOException, InterruptedException{
        
		
		//创建一个图片对象
		BufferedImage img = new BufferedImage(Config.w, Config.h, BufferedImage.TYPE_INT_RGB);
		//创建一个图片对象的画笔
		Graphics2D graphic = img.createGraphics();
		graphic.setColor(Color.WHITE);
		graphic.fillRect(0,0, Config.w, Config.h);
		graphic.setColor(Color.BLACK);
		graphic.drawRect(0, 0,Config.w-1, Config.h-1);
		
		
		int w = (Toolkit.getDefaultToolkit().getScreenSize().width - img.getWidth()) / 2;
        int h = (Toolkit.getDefaultToolkit().getScreenSize().height - img.getHeight()) / 2;
        int firstSize = 65 ;
        int secondSize = 118 ;
        int thirdSize = 168 ;
        int fourSize = 218 ;
        int fiveSize = 268 ;
        int sixSize = 300 ;
        frame.setLocation(w, h);         //把一个框架居中
        frame.setLayout(new BorderLayout());
        Graphics2D g = img.createGraphics();
        Font font = new Font("宋体",Font.BOLD+Font.ITALIC,(int)(h*0.3));
        ico.setImage(img);
        ji.setIcon(ico);
        frame.add(ji, BorderLayout.CENTER);
        g.setFont(font);
		g.setColor(fontColor);
        for(int i=10;i<=time;i++){
        	frame.setVisible(false);
			g.drawString("2015-07-"+i, 80, firstSize);
	        frame.pack();
	        frame.setVisible(true);
	        Thread.sleep(TIME);
	        frame.paintAll(g);//.paint(g);
        }
        frame.setVisible(false);
        g.setColor(endColor);
        g.drawString("2015-07-10  "+String.valueOf(22), 80, firstSize);
        frame.pack();
        frame.setVisible(true);
        Thread.sleep(TIME);
        frame.paint(g);//.paint(g);
        frame.setVisible(false);
        
        
        //second
		g.setColor(Color.PINK);
        for(int i=1;i<=31;i++){
        	frame.setVisible(false);
        	g.drawString("2015-07-10  "+String.valueOf(22), 80, firstSize);
    		if(i<10){
    			g.drawString("2015-08-0"+i, 80, secondSize);
    		} else 
    			g.drawString("2015-08-"+i, 80, secondSize);
	        frame.pack();
	        frame.setVisible(true);
	        Thread.sleep(TIME);
	        frame.paintAll(g);//.paint(g);
        }
        frame.setVisible(false);
        g.drawString("2015-07-10  "+String.valueOf(22), 80, firstSize);
        g.setColor(Color.GREEN);
        g.drawString("2015-08-31  "+String.valueOf(time), 80, secondSize);
        frame.pack();
        frame.setVisible(true);
        Thread.sleep(TIME);
        frame.paint(g);//.paint(g);
        frame.setVisible(false);
        
        
        //third
        g.setColor(Color.ORANGE);
        for(int i=1;i<=30;i++){
        	frame.setVisible(false);
        	g.drawString("2015-07-10  "+String.valueOf(22), 80, firstSize);
        	g.drawString("2015-08-31  "+String.valueOf(time), 80, secondSize);
    		if(i<10){
    			g.drawString("2015-09-0"+i, 80, thirdSize);
    		} else 
    			g.drawString("2015-09-"+i, 80, thirdSize);
	        frame.pack();
	        frame.setVisible(true);
	        Thread.sleep(TIME);
	        frame.paintAll(g);//.paint(g);
        }
        frame.setVisible(false);
        g.drawString("2015-07-10  "+String.valueOf(22), 80, firstSize);
        g.drawString("2015-08-31  "+String.valueOf(time), 80, secondSize);
        g.setColor(Color.CYAN);
        g.drawString("2015-09-31  "+String.valueOf(30), 80, thirdSize);
        frame.pack();
        frame.setVisible(true);
        Thread.sleep(TIME);
        frame.paint(g);//.paint(g);
        frame.setVisible(false);
        

        //four
        g.setColor(Color.MAGENTA);
        for(int i=1;i<=17;i++){
        	frame.setVisible(false);
        	g.drawString("2015-07-10  "+String.valueOf(22), 80, firstSize);
        	g.drawString("2015-08-31  "+String.valueOf(time), 80, secondSize);
        	g.drawString("2015-09-30  "+String.valueOf(30), 80, thirdSize);
    		if(i<10){
    			g.drawString("2015-10-0"+i, 80, fourSize);
    		} else 
    			g.drawString("2015-10-"+i, 80, fourSize);
	        frame.pack();
	        frame.setVisible(true);
	        Thread.sleep(TIME);
	        frame.paintAll(g);//.paint(g);
        }
        frame.setVisible(false);
        g.drawString("2015-07-10  "+String.valueOf(22), 80, firstSize);
        g.drawString("2015-08-31  "+String.valueOf(time), 80, secondSize);
        g.drawString("2015-09-30  "+String.valueOf(30), 80, thirdSize);
        g.setColor(Color.PINK);
        g.drawString("2015-10-17  "+String.valueOf(17), 80, fourSize);
        frame.pack();
        frame.setVisible(true);
        Thread.sleep(TIME);
        frame.paintAll(g);//.paint(g);
        frame.setVisible(false);
        
        frame.setVisible(false);
        g.drawString("2015-07-10  "+String.valueOf(22), 80, firstSize);
        g.drawString("2015-08-31  "+String.valueOf(time), 80, secondSize);
        g.drawString("2015-09-30  "+String.valueOf(30), 80, thirdSize);
        g.drawString("2015-10-17  "+String.valueOf(17), 80, fourSize);
        g.drawString("22+31+30+17==100 ", 80, fiveSize);
        g.setColor(Color.RED);
        g.setFont(new Font("宋体",Font.BOLD+Font.ITALIC,(int)(h*0.1)));
        g.drawString("From 7-10 To 10-17 ", 30, sixSize);
        g.drawString("【100】DAY That We Had Met.I Want To Say I Like You!", 30, sixSize+20);
        frame.pack();
        frame.setVisible(true);
        Thread.sleep(5200);
        g.setBackground(Color.RED);
        frame.paint(g);//.paint(g);
        
        frame.setDefaultCloseOperation(3);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
	}
	public static void main(String[] args) throws InterruptedException {
		HundredDay hundredDay = new HundredDay();
		hundredDay.Day();
	}
	public void Day() throws InterruptedException{
		try {
			//BufferedImage img = ImageIO.read(new FileInputStream(Config.path)); 
			//Graphics2D g = img.createGraphics();
			Hundred(/*img,*/ Color.RED,Color.BLUE, 31, "7");
		} catch (FileNotFoundException e) {
			ShowDialog.Alet("倒计时出错！0 0","出错了0 0");
		} catch (IOException e) {
			ShowDialog.Alet("倒计时出错！0 0","出错了0 0");
		} catch (InterruptedException e) {
			ShowDialog.Alet("倒计时出错！0 0","出错了0 0");
		} finally {
			int loveme = JOptionPane.showConfirmDialog(null, "If You Also Like Me,Please Choose 'y' To Continues... ", "girl's_Name，我中意你", JOptionPane.YES_NO_OPTION);
			if(loveme==JOptionPane.YES_OPTION){
				JOptionPane.showConfirmDialog(null, "I'm So Lucky!", "Girl's_Name，我中意你", JOptionPane.YES_NO_OPTION);
				Log.logPri("Question :If You Also Like Me,Please Choose 'y' To Continues... -->Answer Is YES!!!!!Oh,I'm Success To Show My Heart To You.Amazing,and Unbelivable~");
				Thread.sleep(5200);
				Heart heart = new Heart();
				Thread.sleep(10000);
				heart.setVisible(false);
			}
		}
	}

}
