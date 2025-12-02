package inheritance;

public class Bmw extends Car {
	
	
	
	@Override
	public void engine() {
		System.out.println("Customized BMW engine");
		
	}
	
//	public static void running() {
//		System.out.println("BMW Running");
//		Car.running();
//	}
	
	private void ChesisNumber() {
		
		System.out.println("Getting the chesis number");
	}
	
	public void autoparking() {
		//The req is :For auto parking i need the addas written in audi
		
		Audi a = new Audi();
		a.audiAdas();
		System.out.println(" is enabled");
		
		System.out.println("BMW auto parking feature activated");
	}
	

}
