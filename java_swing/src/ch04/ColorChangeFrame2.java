package ch04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangeFrame2 extends JFrame{

	
	JButton button1;


	public ColorChangeFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("Button");
	}

	private void setInitLayout() {
		setVisible(true);
		this.setLayout(new FlowLayout());
		add(button1);
	}

	private void addEventListener() {
		//익명클래스
		//익명 구현 클래스
		button1.addActionListener(new ActionListener() {
			
			//temp - 구현클래스
			ActionListener temp = new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			};
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	public static void main(String[] args) {
		//익명클래스
		new ColorChangeFrame2();
		
//		ColorChangeFrame3 myColor = new ColorChangeFrame3();
//        ColorChangeFrame3 myColor2 = new ColorChangeFrame3();

	} // end main
}// end class
