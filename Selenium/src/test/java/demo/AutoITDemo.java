package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	
	public static void main(String[] args) throws Exception {
		test();
	}
	@SuppressWarnings("deprecation")
	public static void test() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\Drivers\\geckodriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.name("upfile")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\HP\\Downloads\\FileUploadScript.exe");
		
		Thread.sleep(3000);
		//driver.close();
		
		
	}

}