package interview;

import java.util.Scanner;

import First_project.CharecterOperation;

public class InterviewQuestions1 {
	//Toggle the case of a string 
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the string that you want toggle:--");
		String str = sc.nextLine();
		
		//appracoh one
//		String newString="";
//		for(int i = 0;i<str.length();i++) {
//			if(Character.isUpperCase(str.charAt(i))) {
//				newString = newString+Character.toLowerCase(str.charAt(i));
//			}
//			else {
//				newString = newString + Character.toUpperCase(str.charAt(i));
//			}
//		}
//		System.out.println(newString);
		
		
		//Approach2
		
		char[] charArray = str.toCharArray();
		
		
		
		
	}

}
