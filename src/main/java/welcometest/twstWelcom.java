package welcometest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class twstWelcom {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sosos\\Desktop\\eclipsewspace\\homewk1\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		  
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		driver.findElement(By.name("SIGN-ON")).click();
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		
		driver.findElement(By.name("password")).sendKeys("mercury");
		
		driver.findElement(By.name("login")).click();
		 
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
