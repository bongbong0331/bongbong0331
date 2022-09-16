package ch05;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventListenerEx3 extends JFrame {

    JLabel label;
    final int LABEL_WIDTH = 100;
    final int LABEL_HEIGHT = 100;
    int xPosition = 100;
    int yPosition = 100;
    
    public MouseEventListenerEx3() {
        inItData();
        setInitLayout();
        addEventListener();
    }

    private void inItData() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel("Hello JAVA");
    }

    private void setInitLayout() {
        setVisible(true);
        setLayout(null);
        
        //사이즈 , 좌표값 위치
//        label.setSize(100, 100);
//        label.setLocation(100, 100);
        label.setBounds(xPosition, yPosition, LABEL_WIDTH, LABEL_HEIGHT);
        System.out.println("bounds : " + label.getBounds());
        add(label);
    }

    private void addEventListener() {
    	//익명구현클래스로 코딩
    	this.addMouseListener(new MouseListener() {
			
    		
    		//마우스가 눌렀다가 떨어졌을때 실행되는 메소드
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("11111111");
				
			}
			
			//마우스가 눌러졌을떄 실행돠는 매소두
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("222222222");
			}
			
			//마우스가 감지되고 있는 객체에서 나갔을떄 실행되는 메소두
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("3333");
			}
			
			
			//마우스가 감지하고 있는 객체에서 들어갔을떄
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("4444");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("5555");
				label.setLocation(e.getX(), e.getY() - (label.getBounds().height));
			}
		});
    }
    


}