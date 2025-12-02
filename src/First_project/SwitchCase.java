package First_project;

public class SwitchCase {

	public static void main(String[] args) {
//		int a = 300;
//        int b = 600;
//        int c = 1000;
//        int d = 200;
		double a = 300.9;
        double b = 301.0000000011;
        double c = 25.5;
        double d = 200.0;
        
        System.out.println(b);
        
        if(a>b && a>c && a>d) 
        {
        	System.out.printf("The Variable a = %2f is the lagest value among all",a);
        }
        else if(b>c && b>d) 
        {
        	System.out.printf("The Variable b = %2f is the lagest value among all",b);
        }
        else if(c>d) 
        {
        	System.out.printf("The Variable c = %2f is the lagest value among all",c);
        }
        else 
        {
        	System.out.printf("invalid comparison");
        	
        }
        System.out.println();
        
    	double number = 123.456789;

    	// Format to 2 decimal places
    	String formatted = String.format("%.2f", number);

    	System.out.println(formatted instanceof String);

	}


}
