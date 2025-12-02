package interface_Practice;

public class saikatIsHuman extends Monkey implements human,MoralDuties {
	
	String name ="Saikat";
	

	@Override
	public void ancistors() {
		System.out.println(name + " is also part of Homosapiens");
		
	}

	@Override
	public void eat() {
		System.out.println(name + " is a non vegitarian");
		
	}

	@Override
	public void sleep() {
		System.out.println(name + " has sleep disorder");
		
	}

	@Override
	public void work() {
		System.out.println(name + " is currently out of job");
		
	}

	public void loan() {
		System.out.println("currently responsible for one car loan");
	}

//	public void sex() {
//		System.out.println("Some people ");
//	}

	@Override
	public void wellManer() {
		System.out.println("Every human should be honest and well mannerd");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

}
