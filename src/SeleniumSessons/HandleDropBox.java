package SeleniumSessons;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravin\\Downloads\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		ChromeOptions options = new ChromeOptions ();
//		options.setHeadless(true);
//		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		String title = driver .getTitle();
		System.out.println(title);
		Select select = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		select.selectByVisibleText("USD");
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
