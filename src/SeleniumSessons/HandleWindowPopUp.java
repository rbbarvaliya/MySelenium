package SeleniumSessons;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		//1 alert -- JavaScript Pop Up -- Alert APT (accept, dismiss)
		//2 File Upload Pop UP --- brows button (type= file, sendKeys path )
		//3 Brows Windows Pop Up-- Advertisement Pop Up -- getWindowHandlers()
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://popuptest.com/");	
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'Come & Go Test')]")).click();
		Thread.sleep(2000);
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		System.out.println("parent window id:"+ parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("child window id:"+ childWindowId);
		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		System.out.println("child window popup title:" + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		Thread.sleep(2000);
		System.out.println("parent window popup title:" + driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
	



	}

}
