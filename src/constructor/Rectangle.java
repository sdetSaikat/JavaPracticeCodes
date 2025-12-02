package constructor;

public class Rectangle {
	
	double length;
	double width;
	
	

	public Rectangle() {
		this.length=0.0;
		this.width =0.0;
		double area =calculateArea();
		
		System.out.printf("The rectangle is having the length %.2f and the width %.2f Hence area of the rectangle is %.2f "
				,length,width,area);
	}
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
		double area =calculateArea();
		System.out.printf("The rectangle is having the length %.2f and the width %.2f Hence area of the rectangle is %.2f "
				,length,width,area);
	}
	
	public double calculateArea() {
		return length*width;
		
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle def = new Rectangle();
		System.out.println();
		Rectangle param=new Rectangle(15.5,20.5);
		

	}

}
