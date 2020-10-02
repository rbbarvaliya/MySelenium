package SeleniumSessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ravin\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
//	    System.setProperty("webdriver.edge.driver", "C:\\Users\\ravin\\Downloads\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.get("http://google.com");
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		//Validation ptoint
		if (title.equals("Google")) {
			System.out.println("Title is correct");
		}
		else {
		
			System.out.println("Title is incorrect");
		}
		  
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		driver.quit();
		
		
	}

}
