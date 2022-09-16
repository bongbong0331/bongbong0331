package ch03_1;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;



//외부 클래스
class MyFrame2 extends JFrame {

	MyDrawPanel drawPanel;

	public MyFrame2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("paint 연습");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new MyDrawPanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(drawPanel);
	}
	
//인스턴스 내부 클래스
	//내부클래스
	//접근제어 지시자를 설정할 수 있다.
	
	
	//static을 추가하게되면 정적 내부클래스라고 한다.
	public static class MyDrawPanel extends JPanel {

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawString("감옥", 50, 50);
			g.drawLine(350, 20, 200, 100); //선을 긋다 x축, y축
			g.drawLine(350, 20, 500, 100); //선을 긋다 x축, y축 지붕
			
			g.drawLine(440, 150, 440, 200); //선을 긋다 x축, y축
			g.drawLine(425, 150, 425, 200); //선을 긋다 x축, y축
			g.drawLine(410, 150, 410, 200); //선을 긋다 x축, y축
			g.drawLine(290, 150, 290, 200); //선을 긋다 x축, y축
			g.drawLine(275, 150, 275, 200); //선을 긋다 x축, y축
			g.drawLine(260, 150, 260, 200); //선을 긋다 x축, y축
			
			g.drawRect(200, 100, 300, 200); //큰박스
			g.drawRect(250, 150, 50, 50);
			g.drawRect(400, 150, 50, 50);
			g.drawRect(200, 250, 300, 50);
		}
	} // end of MyDrawPanel
	
	
}// end of MyFrame2

//public class
public class PaintMainTest {

	public static void main(String[] args) {
		
		MyFrame2 frame2 = new MyFrame2();
		
		//---인스턴스 내부클래스를 사용하는 바업
		//1. 데이터 타입을 선언
		//외부 클래스 이름으로 접근하고. 연산자 후에 내부 클래스 데이터 타입을 선언하고 변수명을 지정
		//2. 초기화 하는 방법
		//외부 클래스가 생성되어 있고 참조 변수로 접근해서 new 내부클래스(); 로 메모리에 올릴 수 있다.
		//MyFrame2.MyDrawPanel myPanel = frame2.new MyDrawPanel();
		
		
		//---정적 내부클래스를 사용하는 방법
		MyFrame2.MyDrawPanel staticMyPanel = new MyFrame2.MyDrawPanel();
	}

}