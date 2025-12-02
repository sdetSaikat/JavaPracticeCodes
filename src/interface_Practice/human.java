package interface_Practice;

public interface human extends homosapiens,abcd{
	
	int  hand = 2;
	int eyes = 2;
	int fingers= 10;
	
	public  void eat();
	
	public void sleep();
	
	public void work();
	
	private void abledCheck() {
		System.out.println("All human should be able to have sex");
	}
	
	default  void  sex() {
		abledCheck();
		System.out.println("All human should have sex");
	}
	
	public static void poty() {
		System.out.println("Having a fresh poty is a big part of human life");
	}

}
