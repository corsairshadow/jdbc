package jdbc;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class GuiDisp extends JFrame {
	GuiDisp()
	{
		
		setSize(400,400);
		setVisible(true);
		setTitle("DB Connection");
		addWindowListener(new WindowAdapter() {// This is an anonymous class
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
		});
		
	}

	public static void main(String[] args) {
	new GuiDisp();

	}

	
}
