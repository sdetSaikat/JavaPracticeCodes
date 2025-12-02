package practice_inheritance;

public class Bmw extends Car {
	
	@Override
	public void engine() {
		super.engine();
		System.out.println("Engine method from BMW");
	}
	
	public void autoparkingMethod() {
		
		System.out.println("BMW Autoparking Method");
	}
		
	
	}


