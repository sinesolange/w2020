package welcometest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clontest {
	 WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver;
		 String browser= "Firefox";
		 if (browser.equalsIgnoreCase("chrome")) {
			 
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\sosos\\Desktop\\eclipsewspace\\testingmvn\\Driver\\chromedriver.exe");
			  driver= new ChromeDriver();
		 }
 else if ( browser.equalsIgnoreCase("firefox")){
			 
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\sosos\\Desktop\\eclipsewspace\\testingmvn\\Driver\\geckodriver.exe");
			  driver= new FirefoxDriver();
		 }

	}

}
