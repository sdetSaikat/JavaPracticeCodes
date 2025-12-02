package methodoverloading;

public class Browser {
	
	String browser;

	public Browser(String browser)
	{
		this.browser = browser;
	}
	
	public static void check(String browser)
	{
		System.out.println("static check");
	}

	public boolean checkBrowser() 
	{
		System.out.println("Checking the broser availability for " + this.browser);
		
		boolean flag=true;
		
		switch (this.browser.toLowerCase()) {
		case "chrome":
			System.out.println("Launching the chrome browser");
			break;
		case "firefox":
			System.out.println("Launching the ff browser");
			break;
		case "saffari":
			System.out.println("Launching the saffari browser");
			break;
		case "ie":
			System.out.println("Launching the ie browser");
			break;

		default:
			flag= false;
			System.out.println(this.browser+" is not avilable");
			break;
		}
		
		return flag;
	}
	
}
