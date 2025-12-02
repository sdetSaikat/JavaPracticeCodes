package superthis;

public class Cricket extends Sports {
	
	String matchType;
	String seriesName;

	public Cricket() {
		System.out.println("This is the default constructor from the Cricket class");
	}
	
	public Cricket(String matchType,String seriesName) {
		this();
		this.matchType = matchType;
		this.seriesName = seriesName;
		System.out.println(this.matchType + " is being played in the  "+this.seriesName );
	}
	
	
	
	public Cricket(String SportsName) {
		
		System.out.println("This a single parameter constructor from the Cricket class");
	}
	
	@Override
	public void sideffects() {
		super.sideffects();
//		super.Benifit;
		System.out.println(" and Crcket injury can be ruin any one's cricketing life");
	}
}
