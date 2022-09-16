package ch01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BoarderLayoutEx extends JFrame {

	JButton button1 = new JButton("동");
	JButton button2 = new JButton("서");
	JButton button3 = new JButton("남");
	JButton button4 = new JButton("북");
	JButton button5 = new JButton("센터");

	private BorderLayout borderLayout;

	public BoarderLayoutEx() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("border Layout 연습");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//JButton 초기화 완료됨 (멤버 변수로 처리)
		borderLayout = new BorderLayout();
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(borderLayout);
		//프레임에 add 하는 동작만 시켜 주면 됩니다.
        // 직접 코딩해 보세요!
		add(button1, borderLayout.WEST);
		add(button2, borderLayout.EAST);
		add(button3, borderLayout.SOUTH);
		add(button4, borderLayout.NORTH);
		add(button5, borderLayout.CENTER);
		
	}

	public static void main(String[] args) {
		new BoarderLayoutEx();
	} // end of main

} // end of class
