package SeleniumSessons;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodayPractice {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ui.freecrm.com/");	
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		WebElement logbtn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		String logincname = logbtn.getAttribute("classname");
		System.out.println(logincname);
		String loginbtntext = logbtn.getText();
		System.out.println(loginbtntext);
		
//		System.out.println(driver.manage().window().getSize());
//		Dimension d = new Dimension(400,600);
//		driver.manage().window().setSize(d);
		
		driver.quit();

	

		
	
		
	}
}
