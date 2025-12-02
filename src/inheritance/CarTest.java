package inheritance;

public class CarTest {

	public static void main(String[] args) {
		Bmw b =new Bmw();
		Bmw.running();//Child class static method is considered thou
		b.getVehicleType();
		b.autoparking();
		
		System.out.println("--------------");
		Car c = new Bmw();
		c.engine();
		System.out.println("same Parent class ref variable now refereing to the audi sibing");
		c=new Audi();
		c.engine();
		c.getChesisNmber();
		
		c.getVehicleType();
		
		String s = "Saikat";
		for(int i =0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
	

	}

}
