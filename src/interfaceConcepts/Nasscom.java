package interfaceConcepts;

public interface Nasscom{
	
	
	
	public void employmentRules();
	
	String helpdeskNumber ="9191";
	
	public static void helpDesk() {
		System.out.println("Please Call "+helpdeskNumber+" for any help");
	}
	
	default void timingRegulations() {
		System.out.println("It is recomended to main 9 to 5 work timings employee working in india");
		
	}

}
