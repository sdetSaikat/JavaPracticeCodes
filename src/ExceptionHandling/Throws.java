package ExceptionHandling;

public class Throws {
	
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	

	private void m2() {
		System.out.println("m2 Method");
		try{m3(10,0);}
		catch(Exception e) {System.out.println("m2 catch");
		e.printStackTrace();}
		
	}



	private void m3(int i, int j) {
		System.out.println("m3 method");
		int a=i/j;
		System.out.println(a);
		
	}



	public static void main(String[] args) {
		new Throws().m1();

	}

}
