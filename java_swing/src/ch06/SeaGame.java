package ch06;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SeaGame extends JFrame {
	JLabel teemoLabel;
	JLabel seaLabel;
	

	public SeaGame() {
		initDate();
		setInitLayout();
		addEventListener();
	}

	private void initDate() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		teemoLabel = new JLabel(new ImageIcon("teemo.png"));
		seaLabel = new JLabel(new ImageIcon("sea.jpg"));

	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setLayout(null);
		teemoLabel.setSize(200, 200);
		teemoLabel.setLocation(200, 200);
		add(teemoLabel);

		seaLabel.setSize(500, 500);
		seaLabel.setLocation(0, 0);
		add(seaLabel);
	}

	private void addEventListener() {

	        this.addKeyListener(new KeyAdapter() {
	            @Override
	            public void keyPressed(KeyEvent e) {
	                int keyCode = e.getKeyCode();
	                if (keyCode == 37) {
	                	teemoLabel.setLocation(teemoLabel.getX() - 10, teemoLabel.getY());
	                } else if (keyCode == 38) {
	                	teemoLabel.setLocation(teemoLabel.getX(), teemoLabel.getY() - 10);
	                } else if (keyCode == 39) {
	                	teemoLabel.setLocation(teemoLabel.getX() + 10, teemoLabel.getY());
	                } else if (keyCode == 40) {
	                	teemoLabel.setLocation(teemoLabel.getX(), teemoLabel.getY() + 10);
	                } else {
	                    System.out.println("잘못 입력되었습니다.");
	                }
	            }
	        });
		
	}
	
}
