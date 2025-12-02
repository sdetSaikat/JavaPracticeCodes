package superthis;

public class Sports  extends Entertainment{
	public String gameType;
	public int gameTime;
	
	public Sports() {
		super("Sports","entertain people","greate health");
		System.out.println("I am from no parameter constructor of Sport class");
	}
	
	public Sports(String gametype) {
		this.gameType=gametype;
		
		System.out.println("I am from single paramer  constructor of Sport class and the game type is :"+gametype);
	}
	
	public Sports(String gametype, int gameTime) {
		this.gameType=gametype;
		this.gameTime=gameTime;
		
		System.out.println("I am from single paramer  constructor of Sport class and the game type is :"+gametype+" playtime is:-"+gameTime);
	}
	
	
	public void SportsBenifits() {
		System.out.println("Sports has benifits on mental health and physical health");
	}
	
	
	public void sideffects() {
		
		System.out.print("Overall side effects of " +  this.gameType+ " is that it can have fatal injuries");
	}
	

}
