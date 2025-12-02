package stringManupulation;

public class ToString_Parse_Value_OF {

	public static void main(String[] args) {
		Integer num = 25;
		System.out.println(num.toString());   // "25"

		String s = new String("Hello");
		
		System.out.println(s.toString()); 
		
		s=null;
//		System.out.println(s.toString()); 
		System.out.println(String.valueOf(s)); 
		
		String a = "100";
		System.out.println(Integer.valueOf(a));
		System.out.println(Integer.parseInt(a));
		
		
		
		

	}

}
