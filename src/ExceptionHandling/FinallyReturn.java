package ExceptionHandling;

public class FinallyReturn {
	
	
	@SuppressWarnings("finally")
	public static int finallyCheck(int a) {
		
		try {
			return a;
			
		}
		catch(Exception e) {
			return (a+5);
				
		}
		finally {
			return (a+10);
			
		}
		
	}

	public static void main(String[] args) {
		System.out.println(finallyCheck(5));
		

	}

}
