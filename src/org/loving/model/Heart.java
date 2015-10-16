package org.loving.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
/**
 * 动态画出心形图案的类，up上网找的...
 * @author up
 *
 */
@SuppressWarnings("serial")
public class Heart extends JFrame {
	// 定义窗口大小
	private static final int WIDTH = 520;
	private static final int HEIGHT = 520;

	// 获取屏幕大小
	private static int WINDOW_WIDTH = Toolkit.getDefaultToolkit()
			.getScreenSize().width;
	private static int WINDOW_HEIGHT = Toolkit.getDefaultToolkit()
			.getScreenSize().height;

	// 构造函数
	public Heart() {
		// 设置窗口标题
		super("❤❤You're In My Heart❤❤");
		// 设置背景色
		this.setBackground(Color.BLACK);
		// 设置窗口位置
		this.setLocation((WINDOW_WIDTH - WIDTH) / 2,
				(WINDOW_HEIGHT - HEIGHT) / 2);
		// 设置窗口大小
		this.setSize(WIDTH, HEIGHT);
		// 设置窗口布局
		this.setLayout(getLayout());
		// 设置窗口可见
		this.setVisible(true);
		// 设置窗口默认关闭方式
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {

		double x, y, r; // 横纵坐标及半径
		Image image = this.createImage(WIDTH, HEIGHT);
		Graphics pic = image.getGraphics();

		// 绘制图形
		for (int i = 0; i <= 99; i++) {
			for (int j = 0; j <= 99; j++) {
				r = Math.PI / 45 + Math.PI / 45 * i
						* (1 - Math.sin(Math.PI / 45 * j)) * 18;

				x = r * Math.cos(Math.PI / 45 * j) * Math.sin(Math.PI / 45 * i)
						+ WIDTH / 2;

				y = -r * Math.sin(Math.PI / 45 * j) + HEIGHT / 2;

				pic.setColor(Color.MAGENTA);
				pic.fillOval((int) x, (int) y, 2, 2);
			}
			// 生成图片
			g.drawImage(image, 0, -100, this);

		}
	}
}