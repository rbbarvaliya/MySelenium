package SeleniumSessons;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {
	
	 static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\ravin\\eclipse-workspace\\MySelenium\\src\\SeleniumSessons\\config.properties");
		prop.load(ip);

		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		String url = prop.getProperty("URL");
		System.out.println(url);
		String browserName= prop.getProperty("browser");
		System.out.println(browserName);
		
		if (browserName.equals("chrome")){
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver.exe");
		    driver = new ChromeDriver();
		}else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\ravin\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		driver.get(url);
		driver.findElement(By.xpath(prop.getProperty("//input[@placeholder='E-mail address']"))).sendKeys(prop.getProperty("name"));
	

	}

}
