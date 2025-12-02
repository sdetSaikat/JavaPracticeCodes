package stringManupulation;

import java.util.Arrays;

public class ImportantMethods1 {

	public static void main(String[] args) {
		
		String str = "Hi this is my first Sting code and i am happy";
		
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf('i'));
		System.out.println(str.indexOf('i',str.indexOf('i')+1));
		
		System.out.println(str.indexOf('i',str.indexOf('i',str.indexOf('i')+1)+1));
		
		System.out.println(str.indexOf("fatty"));
		
		String test = "    Saikat Maity     ";
		System.out.println("The length of the test string before trim is "+test.length());
		System.out.println("The length of the test string after trim is "+test.trim().length());
		String newName=test.trim().replace('a', 'f');
		System.out.println(newName);
		String str1=newName.concat(" You are old");
		
		System.out.println(str1);
		
		
		String found_sub_string =str.replace("code", "fode");
		String Notfound_sub_string =str.replace("Fode", "fode");
		
		System.out.println(found_sub_string);
		System.out.println(Notfound_sub_string);
		
		String orderMsg = "My order id is 12345";
		String Split[] = orderMsg.split(" ");
		for(String s:(Split)) {
			System.out.println(s);
			
		}
		if(Split[4] instanceof String) {
			System.out.println("Hi");
			Integer x =Integer.parseInt(Split[4]);
			System.out.println(x instanceof Integer);
		}
		else {
			System.out.println("Bye");
			
		}
		
		System.out.println();
		System.out.println(orderMsg.substring(orderMsg.indexOf('1'),orderMsg.length()));
		
		
		String s = "xyJavaXxyWithxySeleniumxyXisxyGreat";
		String sa[]=s.split("xy");
		System.out.println(Arrays.toString(sa));
		System.out.println(sa[1].charAt(0));
			
	}

}