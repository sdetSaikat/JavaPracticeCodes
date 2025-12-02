package abstraction;

public class Cat extends Animal {
	
	Cat(){
		super();
		System.out.println("This cat class constructor");
		
	}

	@Override
	public void makeNosie() {
		System.out.println("Cat sounds Meaow..");
		
	}

	@Override
	public void type() {
		System.out.println("Mammal");
		
	}
	
	@Override
	public void eat() {
		System.out.println("All the animal eat something to survive");
	}
	

}
