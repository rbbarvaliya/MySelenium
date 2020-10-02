package SeleniumSessons;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPractice {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
//     System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver.exe");
//     WebDriver driver = new ChromeDriver();
//     driver.manage().window().maximize();
//     driver.get("https://www.facebook.com/");
//     driver.findElement(By.name("firstname")).sendKeys("Ravi");
//     driver.findElement(By.name("lastname")).sendKeys("Ravi");
//     driver.findElement(By.name("reg_email__")).sendKeys("1ravindrabarvaliya@gmail.com");
//     driver.findElement(By.name("reg_passwd__")).sendKeys("Barvaliya");
//     Select select = new Select(driver.findElement(By.id("month")));
//     select.selectByVisibleText("Apr");
//     Select selectd = new Select(driver.findElement(By.id("day")));
//     selectd.selectByVisibleText("10");
//     Select selecty = new Select(driver.findElement(By.id("year")));
//     selecty.selectByVisibleText("1990");
//     driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
//     Thread.sleep(2000);
//     driver.findElement(By.name("websubmit")).click();
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ravin\\Downloads\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();// for headless browser
		options.setHeadless(true);
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/home");	
		System.out.println("Before login Title is "+ driver.getTitle());
	    driver.findElement(By.name("email")).sendKeys("ravindrabarvaliya369@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("Rb@199010");
	    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	    Thread.sleep(2000);
	    System.out.println("After login Title is "+ driver.getTitle());
	    boolean a = driver.findElement(By.xpath("//span[@class='user-display']")).isDisplayed();
	    System.out.println(a);
	    String b = driver.findElement(By.xpath("//span[@class='user-display']")).getText();
	    System.out.println(b);
	    driver.quit();
	   
		
//	  System.setProperty("webdriver.edge.driver", "C:\\Users\\ravin\\Downloads\\msedgedriver.exe");
//	  WebDriver driver = new EdgeDriver();
//	  driver.get("http://google.com");
	   
    
	
		
		
		
	}
	

}
