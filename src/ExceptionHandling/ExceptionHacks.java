package ExceptionHandling;

public class ExceptionHacks {
	
	final String Name = "saikat";
	
	public double divisionChecks(int a , int b) throws ArithmeticException{
		
		return a/b;
	}
	

	public static void main(String[] args) {
		ExceptionHacks ex = new ExceptionHacks();
		try {
		System.out.println(ex.divisionChecks(9, 2));
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try {
		Thread.sleep(5000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("HI.........hh");
		
		System.out.println("Sleeping...");

        try {
            Thread.sleep(3000); // sleep for 3 seconds
        } catch (InterruptedException e) {
            System.out.println("Sleep was interrupted!");
        }

        System.out.println("Awake now!");
	}

}
