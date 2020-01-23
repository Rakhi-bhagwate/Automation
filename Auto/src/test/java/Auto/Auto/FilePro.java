package Auto.Auto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FilePro {
	public static WebDriver driver;
	
	@Test
	public void openBrowser() throws FileNotFoundException, InterruptedException {
		System. setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
//	using properties to create object
		Properties property = new Properties();
// Call the file OR.properties file		
		
	FileInputStream objFile = new FileInputStream("D:\\workspace\\Auto\\UP.properties");	
//	load the properties file
	try {
		property.load(objFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	driver.get(property.getProperty("url"));
	driver.manage().window().maximize();
	System.out.println("Window is maximised");
	
	driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(property.getProperty("username"));
	System.out.println("name is entered");
	
	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(property.getProperty("password"));
	System.out.println("password is entered");
	
	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	System.out.println("submit is clicked");
	
	
	
	}
	
}

