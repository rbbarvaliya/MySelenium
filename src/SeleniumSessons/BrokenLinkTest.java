package SeleniumSessons;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
//		driver.get("https://ui.cogmento.com/home");
		driver.get("https://www.ebay.ca/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
//	    driver.findElement(By.name("email")).sendKeys("ravindrabarvaliya369@gmail.com");
//	    driver.findElement(By.name("password")).sendKeys("Rb@199010");
//	    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();   
	    Thread.sleep(1000);
	    
	    //1. get the list of all the links and img
	    List <WebElement> linkList = driver.findElements(By.tagName("a"));
	    linkList.addAll(driver.findElements(By.tagName("img")));
	    
	    System.out.println("size of full links and images--->"+ linkList.size());
	     
	    List <WebElement> activeLinks = new ArrayList <WebElement>();
	    
	    //2.iterate linkList= exclude all links and images does not have href attribute 
	    for(int i=0; i<linkList.size(); i++){
	    	System.out.println(linkList.get(i).getAttribute("href"));
	    	if(linkList.get(i).getAttribute("href") != null) {
//	        if(linkList.get(i).getAttribute("href") != null && (! linkList.get(i).getAttribute("href").contains("javascript"))) {
	    		activeLinks.add(linkList.get(i));
	    	}
	    }
	    // get the size of active links list:
	    System.out.println("size of active links and images--->"+ activeLinks.size());
	    
	    //3.check the href url, with httpconnection api:
	    //200 -- ok
	    //404 -- not found 
	    //500 -- internal error 
	    //400 -- bad request  
	    for(int j=0; j<linkList.size(); j++) {
	    	
	    	HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
	    
	    	connection.connect();
	    	String response = connection.getResponseMessage();//ok
	    	connection.disconnect();
	    	System.out.println(activeLinks.get(j).getAttribute("href") +"---->"+response);
	    	
	    	
	    }
	    
	    
	    driver.quit();
	}
       
}
