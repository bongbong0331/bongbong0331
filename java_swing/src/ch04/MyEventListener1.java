package ch04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame3 extends JFrame implements ActionListener{
	
	JButton button1;
    JButton button2;
	
	public MyFrame3() {
	}
	
	public void initData() {
		
	}
	
	public void setInitLayout() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	 private void addEventListener() {
	        button1.addActionListener(this);
	        button2.addActionListener(this);
	    }
}


public class MyEventListener1 {

}
