package Auto.Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testng {
	 WebDriver driver=null; 
	
	@BeforeMethod
	public void beforeSuite() {
		System. setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		// Initialize browser.
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/");
		
	}
	
	@Test
	public void test1() throws InterruptedException {
	
	 WebElement element = driver.findElement(By.xpath("//*[@id=\"page\"]/div[1]/header/nav/div/div/form/a/i"));
	 Thread.sleep(1000);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", element);
	
	Actions act = new Actions(driver);
	WebElement search1 = driver.findElement(By.xpath("(//*[@id=\"the7-micro-widget-search\"])[1]"));
	act.moveToElement(search1).sendKeys("Selenium").build().perform();
	Thread.sleep(2000);
	
	WebElement search2 = driver.findElement(By.xpath("//*[@id=\"page\"]/div[1]/header/nav/div/div/form/div/a/i"));
	act.moveToElement(search2).click().build().perform();
	Thread.sleep(2000);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	Thread.sleep(2000);
	
	WebElement dot = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/a[6]"));
	dot.click();
	
	WebElement fifteen = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/a[15]"));
	fifteen.click();
	
	WebElement videos = driver.findElement(By.xpath("(//*[@id=\"primary-menu\"]/li[4]/a/span/span)[1]"));
	act.moveToElement(videos).perform();
	Thread.sleep(2000);
	
	WebElement cucumber = driver.findElement(By.xpath("(//*[@id=\"primary-menu\"]/li[4]/ul/li[2]/a/span/span)[1]"));
	cucumber.click();
	Thread.sleep(2000);
	}
}