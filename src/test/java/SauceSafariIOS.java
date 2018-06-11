import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;

public class SauceSafariIOS {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc=DesiredCapabilities.iphone();
		dc.setCapability("platformName", "iOS");

		//cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.IOS);

		dc.setCapability("platformVersion", "11.2");

		//cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1");

		dc.setCapability("appiumVersion", "1.7.2");

		dc.setCapability("deviceName", "iPhone 6s Plus Simulator");

		dc.setCapability("browserName", "safari");

		IOSDriver driver=new IOSDriver(new URL("http://Anshul.Harinkhere123:d5a51c1d-8132-4a59-b005-bcb7e990ead5@ondemand.saucelabs.com:80/wd/hub"),dc);

		//IOSDriver driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap );

		/*driver.get("http://google.com");

		Thread.sleep(8000L);*/

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("Navigating to soyou");

		driver.get("https://soyou.co");

		System.out.println("Succesfully navigated to soyou");

	}

}
