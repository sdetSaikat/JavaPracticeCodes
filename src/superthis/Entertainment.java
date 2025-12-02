package superthis;

public class Entertainment {
	
	String EntertainmentType;
	String aimOfEnt;
	String Benifit;

	public Entertainment() {
		System.out.println("Entertainment has different form like music,sports,dance");
	};
	public Entertainment(String EntertainmentType,String aimOfEnt,String Benifit) {
		this.EntertainmentType= EntertainmentType;
		this.Benifit= Benifit;
		this.aimOfEnt =aimOfEnt;
		System.out.println("The aim of "+this.EntertainmentType +"is to "+this.aimOfEnt +" along with this is has the benifit of " +this.Benifit);
	}
}
