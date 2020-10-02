package SeleniumSessons;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItDemo {

	public static void main(String[] args) throws IOException, InterruptedException {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://avepdf.com/en/text-to-pdf?gclid=Cj0KCQjwpNr4BRDYARIsAADIx9x_2STCyb5tYfgsUKE7EC_27DO2cBZbKWFEelMM_uBLZebTD9pCJzwaAsgSEALw_wcB");	
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("div.main-wrapper:nth-child(2) div.main-content div.main-content-wrapper div.width_100_per.height_100_per div.flexbox-parent div.flexbox-item.flexbox-item-grow.undefined:nth-child(2) div.container main.ant-layout-content div.content div.row:nth-child(2) div.col div.tools-box.d-flex.flex-column.align-items-center.justify-content-center div.row.w-100 div.w-100 div.col-md-12.upload-file-wrapper:nth-child(2) div.row div.col-md-12 div.tools-upload div.downloaded-wrapper.d-flex.align-items-center.align-content-stretch.justify-content-center.row div.upload-container:nth-child(2) ul.upload-file-methods li.element-with-tooltip:nth-child(1) div:nth-child(2) > button.ant-btn.action-button.tool-icon-fill-order-42")).click();
		
	    Runtime.getRuntime().exec("R:\\FileUploadScript.exe");
		
		Thread.sleep(3000);
		
//	    driver.quit();
		
		
	}

}
