package ch02;

import java.awt.TextField;
import java.util.Scanner;

import javax.swing.JTextField;

public class MainTest1 {
	 public static void main(String[] args) {
	        MyComponents myComponents = new MyComponents();
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("아이디입력");
	        String userInput = scanner.nextLine();
	        System.out.println("userInput:" + userInput);
	        
	       myComponents.inputScannerData(userInput);
	       
	        
	    } // end of main
}


class Student {
	String name;
	
}
