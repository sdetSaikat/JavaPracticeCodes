package accessspecifiers1;

public class Shyamapada {
	String profession = "Teacher";
	private double salary = 15.5;
	protected int plotCount = 3;
	public int numberOfChildren = 3;
	
	public void healthRisks() {
		System.out.println("Shyamapada has issues of kedney diseases");
	}
	
	protected void vehicles() {
		System.out.println("Shyamapada has a bike near to his heart and a cycle");
	}
	
	void lands() {
		System.out.println("Shyamapada has 8 bighas of land");
	}
	
	private void savings() {
		System.out.println("Shyamapada has 12.5 lakhs in his bank account");
	}
	
	
	public static void main(String args[]) 
	{
		Shyamapada sam = new Shyamapada();
		System.out.println("Shyamapada maity is a "+sam.profession+ " is having slary of "
				+ sam.salary + " also having total "+sam.plotCount+" plots"+ " Having "+sam.numberOfChildren +" children");
		
	}

}
