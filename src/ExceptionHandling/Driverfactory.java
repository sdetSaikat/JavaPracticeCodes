package ExceptionHandling;

import java.lang.classfile.instruction.SwitchCase;

public class Driverfactory {
	
	public static void selectbrowser(String browserName) throws BrowserException {
		
		System.out.println("Looking for the "+browserName+" Browser");
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Launching chrome browser..");
			break;
		case "firefox":
			System.out.println("Launching chrome browser..");
			break;
			
		case "saffari":
			System.out.println("Launching chrome browser..");
			break;

		default:
			throw new BrowserException(browserName);
			
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		selectbrowser("Saikat");
		}
		
		catch(BrowserException be) {
			System.out.println("");
			System.out.println(be.getMessage());
			be.printStackTrace();
			
		}
		
		
	}

}
