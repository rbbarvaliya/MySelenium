package SeleniumSessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitdriverMethod {

	public static void main(String[] args) throws InterruptedException {
		
		//1 testing is happening behind the scene= no browse launch 
		//2 very fast = execution of the test very fast
		//3 not suitable for Action class= mouse movement, drag and drop 
		//4ghost driver= Headless browser 
		
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver.exe");
//	    WebDriver driver = new ChromeDriver();
		HtmlUnitDriver driver = new HtmlUnitDriver();
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
//	    driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
//	    Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
		
//    	@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	    
//	    System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver.exe");
//		WebDriver driver = new HtmlUnitDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://book.spicejet.com/");	
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		System.out.println("First page Title is "+ driver.getTitle());
//		driver.findElement(By.xpath("//span[contains(text(),'Check-In')]")).click();
//		System.out.println("Second page Title is "+ driver.getTitle());

		

	}

}
