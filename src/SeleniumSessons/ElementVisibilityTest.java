package SeleniumSessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ui.cogmento.com/home");	
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://api.cogmento.com/register/");
		
		//1. isDisplayed() method: applicable for all the elements
		boolean b1 = driver.findElement(By.name("action")).isDisplayed(); //for sign up button
		System.out.println(b1); //true
		
		//2. isEnabled() method:
		boolean b2 = driver.findElement(By.name("action")).isEnabled(); 
		System.out.println(b2);//True 
	}

}
