package ch02;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Bong extends JFrame {

	private JButton button1;

	private JLabel label; // 글자를 넣어서 화면에 띄울 수 있다.
	private JTextField textField; // 사용자에 입력 값을 받을 수 있는 컴포넌스
	private JPasswordField passwordField; // 사용자의 비번을 받는 컴포넌트
	private JCheckBox checkBox;

	public void inputScannerData(String text) {
		this.textField.setText(text);
	}

	public Bong() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("회원가입");
		setSize(1000, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button1 = new JButton("GAVER");
		label = new JLabel("회원가입");
		setTextField(new JTextField("아이디 입력", 20));
		passwordField = new JPasswordField("비번 입력", 20);
		checkBox = new JCheckBox("확인");

	}

	private void setInitLayout() {
		setVisible(true);

		// 좌표값으로 알아서 배치
		setLayout(null);

	        add(button1);
	        button1.setSize(500, 80);
	        button1.setLocation(40, 500);

//	        add(label);
//	        label.setSize(100, 60);
//	        label.setLocation(50, 200);
//	        add(getTextField());
//	        getTextField().setSize(200, 60);
//	        getTextField().setLocation(130, 180);
//	        add(passwordField);
//	        passwordField.setSize(200, 60);
//	        passwordField.setLocation(130, 250);
//	        add(checkBox);
//	        checkBox.setSize(60, 60);
//	        checkBox.setLocation(340, 210);
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public static void main(String[] args) {
		Bong bong = new Bong();
	}// end of main

}
