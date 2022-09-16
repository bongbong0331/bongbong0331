package ch01;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx01 extends JFrame {

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private GridLayout gridLayout;

	public GridLayoutEx01() {
		initData();
		setInitLayout();

	}

	private void initData() {
		setTitle("그리드 레이아웃 연습");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button1 = new JButton("가");
		button2 = new JButton("나");
		button3 = new JButton("다");
		button4 = new JButton("라");
		button5 = new JButton("마");
		button6 = new JButton("바");

//		gridLayout = new GridLayout(1, 3);
	}

	private void setInitLayout() {
		setVisible(true);
		// setLayout : JFrame의 배치 관리자를 지정한다.
//		setLayout(gridLayout);
		setLayout(new GridLayout(2,2));
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
	}
	
	
	public static void main(String[] args) {
		new GridLayoutEx01();
	}
}
