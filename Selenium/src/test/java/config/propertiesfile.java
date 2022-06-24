package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test.TestNG_Demo;

public class propertiesfile {
	
	static Properties prop = new Properties();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProperties();
		setProperties();
		getProperties();

	}

	public static void getProperties() {

		try {
			
			//String projectPath = System.getProperty("User.dir");
			InputStream input = new  FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium\\src\\test\\java\\config\\config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			TestNG_Demo.browserName = browser;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void setProperties() {
		
		try {
			OutputStream output = new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium\\src\\test\\java\\config\\config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}
}
