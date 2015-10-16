package org.loving.util;

import javax.swing.JOptionPane;
/**
 * 把两种弹窗给装到此类以便调用。
 * @author up
 *
 */
public class ShowDialog {
	
    /** Return value from class method if YES is chosen. */
    public static final int         YES_OPTION = 0;
    /** Return value from class method if NO is chosen. */
    public static final int         NO_OPTION = 1;
    
	public static void Warn(String msg,String title){
		JOptionPane.showMessageDialog(null, msg, title, JOptionPane.ERROR_MESSAGE); 
	}
	public static int Alet(String msg,String title){
		return JOptionPane.showConfirmDialog(null, msg, title, JOptionPane.YES_NO_OPTION);
	}
}
