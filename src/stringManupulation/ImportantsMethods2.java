package stringManupulation;

import java.util.Arrays;

public class ImportantsMethods2 {

	public static void main(String[] args) {
		String s1= "Hi my name is Saikat Maity and i am strugging to maintain my composure";
		String re1=s1.replace('i', 'j');
		String re2=s1.replace("Saikat", "Faikat");
		String re3=s1.replace("z", "x");
		
		System.out.println(re1);
		System.out.println(re2);
		System.out.println(re3);

		System.out.println(s1.contains("Saikat"));
		
		String s[]=s1.split("@");
		System.out.println(Arrays.toString(s));
		System.out.println(s.length);
	}

}
