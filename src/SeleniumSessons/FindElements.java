 package SeleniumSessons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.ca/");	
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//find the number of the links= a HTML tag
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());
		//number of imput=  "imput' HTML tag
		//numbers of button = "button" HTML tag
		for(int i=0; i<linkList.size(); i++){
		    String linkText = linkList.get(i).getText();
		    System.out.println(linkText);
		}

		

	}

}
