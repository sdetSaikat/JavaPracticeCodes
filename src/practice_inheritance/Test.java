package practice_inheritance;

public class Test {

	public static void main(String[] args) {
		Car c = new Bmw();
		c.engine();
		Bmw b =(Bmw)c;
		b.autoparkingMethod();
		b.engine();
		
		int i = 1;
		
		char ch = (char)i;
		
		
		
	}

}
