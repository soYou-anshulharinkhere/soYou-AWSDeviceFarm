package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;

public class BTest extends Assert{
	

		
		public static WebDriver driver;
		
		@BeforeClass 
		public void setUp() throws InterruptedException{

				System.setProperty("webdriver.chrome.driver",".//WebDriver//chromedriver");
				DesiredCapabilities capabilities=DesiredCapabilities.chrome();
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				driver=new ChromeDriver(capabilities);
			
			//driver.get("https://staging.neonmob.com/");
			driver.get("localhost:8000");
			//driver.get("https://www.neonmob.com/");
			WebElement html = driver.findElement(By.tagName("html"));
		
		}


}
