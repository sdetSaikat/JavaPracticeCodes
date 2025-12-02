package stringManupulation;

import java.util.Arrays;

public class StringReverseWordsinSamePosition {
	
	public static String reverseString(String toBeReversed) {
		if(toBeReversed == null) {
			throw new NullPointerException("Null value can not be reversed");
		}
		
		if(toBeReversed.length()==1|toBeReversed.length()==0) {
			return toBeReversed;
		}
		String reverseString = "";
		
		String s[]=toBeReversed.split(" ");
		System.out.println(Arrays.toString(s)+s.length);
		for(int i = 0;i<s.length;i++) {
			for(int j = s[i].length()-1;j>=0;j--) {
				reverseString = reverseString+s[i].charAt(j);
				
				
			}
			reverseString = reverseString +" ";
			
			
		}
		
		
		
		return reverseString;
		
	}

	public static void main(String[] args) {
		String str ="testing automation selenium";
		String rev = reverseString(str);
		System.out.println(rev.trim());
		

	}

}
