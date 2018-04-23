package com.framework.internal.feature;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import com.file.utils.ExternalResourcePath;
import com.framework.Constant.TestNGXMLParametersValue;

public final class WebDriverInitializer {
	
	public static WebDriverInitializer loadWebDriverConfigFile(String fileName){
		ExternalResourcePath.setSeleniumConfigPropertyFilePath(fileName);
		return new WebDriverInitializer();

	}
	public static WebDriver getDriver(String platform,String run,String machineHost) throws InterruptedException, IOException{
		WebDriver driver=null;
		if(!platform.equals(TestNGXMLParametersValue.DEFAULT)){
			if(run.equals(TestNGXMLParametersValue.TRUE)){
				if(machineHost.equals(TestNGXMLParametersValue.LOCAL)){
					driver=LocalDriverInstance.getDriver(platform);
				}else if(machineHost.equals(TestNGXMLParametersValue.REMOTE)){
					driver=RemoteWebDriverInstance.getRemoteDriver(platform);
				}

			}else{
				/** Skip Exception will be thrown if the test is intended not to  run form TESTNG.XML file*/
				throw new SkipException("Test has been skiped intentionaly in "+platform+" environment ,"+"If you want to run this test class, then change the attribute 'run' value to 'true' in TextNG.xml file");
			}
		}else{

			/**When test is run from test class directly then this driver will be instantiated as default*/

			driver=LocalDriverInstance.getDefaultDriver();

		}
		
		return driver;
	}

}
