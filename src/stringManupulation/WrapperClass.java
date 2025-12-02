package stringManupulation;

public class WrapperClass {
	
	
	public static void main(String[] args) {
		String s = "1000";
		System.out.println(Integer.parseInt(s)*2);
		
		int a = 5;
		String.valueOf(a);
		
		boolean b = true;
		String.valueOf(b);
		
		String d = "12.33";
		System.out.println(d);
		double k=Double.parseDouble(d);
		System.out.println(k);
		
		WrapperClass wc = new WrapperClass();
		System.out.println(wc.toString());

	}

}
