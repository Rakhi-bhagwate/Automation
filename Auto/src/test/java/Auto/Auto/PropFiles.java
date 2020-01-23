package Auto.Auto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PropFiles {
	public static WebDriver driver;
	
	@Test
	public void openBrowser() throws FileNotFoundException, InterruptedException {
		System. setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
//	using properties to create object
		Properties property = new Properties();
// Call the file OR.properties file		
		
	FileInputStream objFile = new FileInputStream("D:\\workspace\\Auto\\OR.properties");	
//	load the properties file
	try {
		property.load(objFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//	open toolsqa.com
	driver.get(property.getProperty("baseUrl"));
	driver.manage().window().maximize();
	System.out.println("Window is maximised");
	
	driver.findElement(By.xpath(property.getProperty("Home"))).click();
	Thread.sleep(4000);
	System.out.println("home is clicked");
	
	driver.findElement(By.xpath(property.getProperty("Seleniumtraining"))).click();
	Thread.sleep(4000);
	System.out.println("Selenium is clicked");
	
	driver.findElement(By.xpath(property.getProperty("Blogs"))).click();
	Thread.sleep(4000);
	System.out.println("Blogs is clicked");
	}
	
}
