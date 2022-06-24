package Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.propertiesfile;
import Log4jDemo.Log4JDemo;

public class TestNG_Demo {
	
	WebDriver driver = null;
	public static String browserName=null;
	private static Logger logger = LogManager.getLogger(Log4JDemo.class);
	
	
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		propertiesfile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium\\Drivers\\geckodriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\Drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		logger.info("Browser started");
		
	}

	@Test
	public void googleSearch() {
			
		//goto google.com
		driver.get("https://google.com");
		logger.info("Navigated to google.com");
		
		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
	}
	
	@AfterTest
	public void tearDownTest() {
		
		//close browser
				driver.close();
				//driver.quit();
				System.out.println("Test Completed Successfully");
				propertiesfile.setProperties();
		
	}

}