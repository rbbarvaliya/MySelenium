package SeleniumSessons;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeElementScreenshot {

	public static void main(String[] args) throws IOException {


		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ravin\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/home");
//		driver.findElement(By.name("email")).isDisplayed();
		
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));
		
		takeElementScreenshot(email, "emailElement");
		takeElementScreenshot(password, "passwordelement");
     	driver.quit();
	}
	
	public static void takeElementScreenshot(WebElement element, String fileName) {
		
		File srcFile = element.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile,new File("C:\\Users\\ravin\\eclipse-workspace\\MySelenium\\src\\SeleniumSessons\\"+fileName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
		}
		 
		


}
