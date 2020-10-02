package SeleniumSessons;

import java.util.Scanner;


public class LocatorConcept {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://revolkitchen.com/account/login");
		// 1 xpath:
		//driver.findElement(By.xpath("//input[@id='CustomerEmail']")).sendKeys("Tomdevis@gmail.com");
		//driver.findElement(By.xpath("//input[@id='CustomerPassword']")).sendKeys("Devis");
		//driver.findElement(By.xpath("//form[@id='customer_login']//div[@class='text-center']")).click();
		// 2 id:
		//driver.findElement(By.id("CustomerEmail")).sendKeys("Tomdevis@gmail.com");
		//driver.findElement(By.id("CustomerPassword")).sendKeys("Tom");
		// 3 name:
		//driver.findElement(By.name("customer[email]")).sendKeys("Tomdevis@gmail.com");
		//driver.findElement(By.name("customer[password]" )).sendKeys("Tomdevis");
		// 4 linkText I need to work on it
		//driver.findElement(By.linkText("customer_register_link")).click();
		// 5 partiallinlTexT Not usefull
		// 6 CSSSelector:
		// 7 class name
		//Select select = new Select(driver.findElement(By.xpath("//div[@class='global-search__category-dropdown_selected']")));
	    //select.selectByVisibleText("Playing");
		
		@SuppressWarnings("resource")
		Scanner scr = new Scanner (System.in);
		System.out.println("Age");
		int age = scr.nextInt();
		System.out.println("You are " + age );
		
		
		
		
    }
}