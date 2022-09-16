package ch02;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RuddyRuddy extends JFrame {

   private JButton logo = new JButton();
   private JButton signup = new JButton();
   private JLabel lid = new JLabel();
   private JLabel lpw = new JLabel();
   private JLabel lpw1 = new JLabel();
   private JLabel lname = new JLabel();
   private JLabel lbirth = new JLabel();
   private JLabel lgen = new JLabel();
   private JLabel lemail = new JLabel();
   private JLabel lphone = new JLabel();
   
   private JTextField id = new JTextField();
   private JTextField name = new JTextField();
   private JTextField birth = new JTextField();
   private JTextField gen = new JTextField();
   private JTextField email = new JTextField();
   private JTextField pn = new JTextField();
   
   private JPasswordField pw = new JPasswordField();
   private JPasswordField pw1 = new JPasswordField();
   
   private JCheckBox checkBox;


   private RuddyRuddy() {
      initData();
      setInitLayout();
   }

   private void initData() {
      setTitle("RuddyRuddy 회원가입");
      setSize(350, 680);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      logo = new JButton("RuddyRuddy");
      signup = new JButton("가입하기");
      lid = new JLabel("아이디");
      lpw = new JLabel("비밀번호");
      lpw1 = new JLabel("비밀번호 재확인");
      lname = new JLabel("이 름");
      lbirth = new JLabel("생년월일");
      lgen = new JLabel("성 별");
      lemail = new JLabel("본인확인 이메일");
      lphone = new JLabel("휴대전화");
      id = new JTextField();
      name = new JTextField();
      birth = new JTextField();
      gen = new JTextField();
      email = new JTextField();
      pn = new JTextField();
      pw = new JPasswordField("", 20);
      pw1 = new JPasswordField("", 20);
//      checkBox = new JCheckBox("확인");
   }

   private void setInitLayout() {
      setVisible(true);
      
      setLayout(null);
      
      add(logo);
      logo.setSize(200, 50);
      logo.setLocation(65, 20);
      add(signup);
      signup.setSize(200, 50);
      signup.setLocation(65, 560);
      
      add(lid);
      lid.setSize(100, 60);
      lid.setLocation(65, 50);
      add(lpw);
      lpw.setSize(100, 60);
      lpw.setLocation(65, 110);
      add(lpw1);
      lpw1.setSize(100, 60);
      lpw1.setLocation(65, 170);
      add(lname);
      lname.setSize(100, 60);
      lname.setLocation(65, 230);
      add(lbirth);
      lbirth.setSize(100, 60);
      lbirth.setLocation(65, 290);
      add(lgen);
      lgen.setSize(100, 60);
      lgen.setLocation(65, 350);
      add(lemail);
      lemail.setSize(100, 60);
      lemail.setLocation(65, 410);
      add(lphone);
      lphone.setSize(100, 60);
      lphone.setLocation(65, 470);
      
      add(id);
      id.setSize(200, 30);
      id.setLocation(65, 90);
      add(name);
      name.setSize(200, 30);
      name.setLocation(65, 450);
      add(birth);
      birth.setSize(200, 30);
      birth.setLocation(65, 510);
      add(gen);
      gen.setSize(200, 30);
      gen.setLocation(65, 270);
      add(email);
      email.setSize(200, 30);
      email.setLocation(65, 330);
      add(pn);
      pn.setSize(200, 30);
      pn.setLocation(65, 390);
      
      add(pw);
      pw.setSize(200, 30);
      pw.setLocation(65, 150);
      add(pw1);
      pw1.setSize(200, 30);
      pw1.setLocation(65, 210);
      
   }



   public static void main(String[] args) {
      RuddyRuddy ruddyruddy = new RuddyRuddy();
   }

}