package SeleniumSessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.ca/");	
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'register')]")).click();
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Java");
		
		//absolute xpath: not recommended
		///html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/input[1]
		//1.performance issue
		//2.not reliable
		//3.can be change any time in the future
		
		//we should use customize xpath (relative xpath)
		//1.very fast
		//2.syntax are simple
		//3.performance issues are not there 
		//its unique and generic 
		

		
	}

}
