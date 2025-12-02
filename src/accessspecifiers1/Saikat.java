package accessspecifiers1;

public class Saikat extends Shyamapada {
	protected int plotCount = 0;
	@Override
	public void healthRisks() {
		System.out.println("Saikat does not have any chronic diseases till now");
	}
//	@Override
//	protected void vehicles() {
//		System.out.println("Saikat has one car and one bike and both of these two are very close to his heart");
//	}
	
	@Override
	public void vehicles() {
		
		System.out.println("Saikat has one car and one bike and both of these two are very close to his heart"+super.plotCount);
	}
	
	public static void main(String args[]) 
	{
		Saikat s = new Saikat();
		System.out.println(s.plotCount);
		s.vehicles();
		
		
	}

}
