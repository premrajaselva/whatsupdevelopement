package prem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.page;

public class letcode1 {
	
	public class parameter {
		 WebDriver driver;
		@Parameters({"textbox"})
		@Test
		public void text (String textbox) {
			
			WebDriverManager.chromedriver().setup();
		    driver =new ChromeDriver();
		    driver.get("https://letcode.in/edit");
		    PageFactory.initElements(driver,page.class);
		    page.textbox.sendKeys(textbox);
		    
		    String title = driver.getTitle();
		    System.out.println("title");
		    driver.quit();

}}
		}
	
