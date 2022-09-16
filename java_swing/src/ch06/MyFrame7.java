package ch06;

import java.awt.TextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame7 extends JFrame {

   private JTextArea area;

   public MyFrame7() {
      initData();
      setInitLayout();
      addEventListener();
   }

   public void initData() {
      setTitle("키보드 이벤트 연습");
      setSize(500, 500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      area = new JTextArea();
   }

   public void setInitLayout() {
      setVisible(true);
      setResizable(false);
      add(area);
   }

   public void addEventListener() {

      /*
       * // 문제 1. 익명 구현 클래스로 변경해서 구현 : 주석 new KeyListener() {
       * 
       * @Override public void keyTyped(KeyEvent e) {
       * 
       * }
       * 
       * @Override public void keyReleased(KeyEvent e) {
       * System.out.println("keyCode: " + e.getKeyCode()); }
       * 
       * @Override public void keyPressed(KeyEvent e) {
       * 
       * } });
       */
      // 문제 2. Adapter클래스가 있을까 ?
      // 사용방법 1 : 익명 구현 클래스로 만들기
      area.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
//            System.out.println("keyCode: " + e.getKeyCode());
//            area.setText("key code : " + e.getKeyCode());
//            area.append("key cord :" + e.getKeyCode() + "\n");
            displayKeyInfo(e);
         }
      });
   }

//   // 사용방법2
//   // 클래스를 만들면 추가적인 확장들이 가능하다.
//   private class MyKeyListener extends KeyAdapter {
//      @Override
//      public void keyPressed(KeyEvent e) {
//         System.out.println("keyCode: " + e.getKeyCode());
//
//      }
//   }

//   // 문자를 눌렀을 때 호출, 문자키에만 반응
//   @Override
//   public void keyTyped(KeyEvent e) {
//
//   }
//
//   @Override
//   public void keyPressed(KeyEvent e) {
//      System.out.println("keyCode: " + e.getKeyCode());
//
//   }
//
//   @Override
//   public void keyReleased(KeyEvent e) {
//
//   }

   private void displayKeyInfo(KeyEvent e) {
      char c = e.getKeyChar();
      int keyCode = e.getKeyCode();
      String info = "c : " + c + "\t" + "keyCode : " + keyCode;
      System.out.println(info);
      area.append(info + "\n");
   }

}