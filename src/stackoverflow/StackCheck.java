package stackoverflow;

public class StackCheck {
	
	public void m1() {
		System.out.println("This is m1 method");
		m2();
	}

	public void m2() {
		System.out.println("This is m2 method");
		m3();
		m1();
		
		
	}
	
	public static void m3() {
		System.out.println("This method is m3");
		
	}

	public static void main(String[] args) {
		StackCheck s = new StackCheck();
		s.m1();
		

	}

}
