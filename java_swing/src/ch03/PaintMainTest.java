package ch03;

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
	

	//내부클래스
	class MyDrawPanel extends JPanel {

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
		new MyFrame2();
	}

}