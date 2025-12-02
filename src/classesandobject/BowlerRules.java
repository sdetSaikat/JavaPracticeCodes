package classesandobject;

import java.util.Arrays;

public class BowlerRules {
	
	String playerName;
	String bowlingType;
	int runConceded;
	int oversBowled;
	final static int ballsInOver =6;
	
	public BowlerRules(String name, String bowlertype, int totalRuns, int totalOversBowled) 
	{
		this.playerName = name;
		this.bowlingType = bowlertype;
		this.runConceded = totalRuns;
		this.oversBowled = totalOversBowled;
	}
	
//	public String ratingCheck(int totalruns,int oversBowled) 
//	{
//		double economyRate = totalruns/oversBowled;
////		int totalBallsBowled=ballsInOver*oversBowled;
//		String bowlerRating ="Not eligible for seceltion";
//		
//		if (economyRate<6) {
//			System.out.println(playerName+" is a very good Bowler");
//			bowlerRating = "Elite";
//			return bowlerRating;
//		}
//		else if(economyRate>6 && economyRate<=8 )
//		{
//			System.out.println(playerName+" is a good  T20 bowler");
//			return bowlerRating="Premium";
//			
//		}
//		else 
//		{
//			System.out.println("You need to improve your game");
//			return bowlerRating;
//		}	
//		
//	}
	public String ratingCheck() 
	{
		double economyRate = this.runConceded/this.oversBowled;
		int totalBallsBowled=ballsInOver*oversBowled;
		String bowlerRating ="Not eligible for seceltion";
		
		if (economyRate<6) {
			System.out.println(playerName+" is a very good Bowler");
			bowlerRating = "Elite";
			return bowlerRating;
		}
		else if(economyRate>6 && economyRate<=8 )
		{
			System.out.println(playerName+" is a good  T20 bowler");
			return bowlerRating="Premium";
			
		}
		else 
		{
			System.out.println("You need to improve your game");
			return bowlerRating;
		}	
		
	}
	
	

	public static void main(String[] args) {
		
		BowlerRules bowler1=new BowlerRules("Saikat","First Bowler",24,3);
		
		System.out.println("The bowler "+bowler1.playerName+ " is a "+bowler1.bowlingType +" has bowled total "+(BowlerRules.ballsInOver*bowler1.oversBowled)+
				" balls and conceded total "+bowler1.runConceded +" runs");
		
//		String rating= bowler1.ratingCheck(bowler1.runConceded, bowler1.oversBowled);
		String rating= bowler1.ratingCheck();
		
		switch (rating.trim().toLowerCase()) {
		case "elite":
			System.out.println("You are ready for test selection");
			break;
			
		case "premium":
			System.out.println("You are ready for T20 selection");
			break;

		default:
			System.out.println("Better luck next time!");
			break;
		}

	}
	
	

}
