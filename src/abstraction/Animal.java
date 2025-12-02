package abstraction;

public abstract class Animal {
	
	public Animal() {
		System.out.println("Constructor from the animal Class");
	}
	
	public  abstract void makeNosie();
	
	public abstract void type();
	
	public void eat() {
		System.out.println("All the animal eat something to survive");
	}
	
	public void rest() {
		System.out.println("All animal need rest of atleast 8 hours to survive");
	}
	
	public final void breeding() {
		System.out.println("In-order to expand their legacy all animal need to have sex");
	}

}
