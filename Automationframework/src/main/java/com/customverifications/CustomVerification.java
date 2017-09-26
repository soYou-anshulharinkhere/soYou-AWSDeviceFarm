package com.customverifications;
import java.io.IOException;
import java.lang.reflect.Array;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import com.base.selenium.features.TakeScreenShot;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class CustomVerification extends Assert  {

	public StringBuffer verificationErrors;

	public  boolean fail=false;


	public CustomVerification() 
	{

		verificationErrors = new StringBuffer();

	}

	public void verifyTrue(ExtentTest extent,WebDriver driver,Boolean expectedCond, String stepName,String detailsMsg) throws IOException {
		try {

				Assert.assertTrue(expectedCond.booleanValue());
				extent.log(LogStatus.PASS, stepName,detailsMsg);
			} catch (Error e) {
	
				extent.log(LogStatus.FAIL, stepName,extent.addScreenCapture(TakeScreenShot.takeSceernShot(driver)));
				verificationErrors.append(detailsMsg+e);
				Reporter.log(stepName +"");
			} 
		}


	public void verifyFalse(ExtentTest extent ,WebDriver driver, Boolean expectedCond,String stepName,String detailsMsg) throws IOException {
		try {
			Assert.assertFalse(expectedCond.booleanValue());
			extent.log(LogStatus.PASS, stepName,detailsMsg);
		} catch (Error e) {
			extent.log(LogStatus.FAIL, stepName,extent.addScreenCapture(TakeScreenShot.takeSceernShot(driver)));
			verificationErrors.append(detailsMsg+e);
			Reporter.log(detailsMsg +"");
		}
	}



	
	public  void verifyEquals(ExtentTest extent,WebDriver driver, String actualValue, Object object,String stepName,String detailsMsg) throws IOException {
		try {
			Assert.assertEquals(actualValue, object, detailsMsg);
			extent.log(LogStatus.PASS, stepName,detailsMsg);
		} catch (Error e) {

			extent.log(LogStatus.FAIL, stepName,extent.addScreenCapture(TakeScreenShot.takeSceernShot(driver)));

			verificationErrors.append(e);
			Reporter.log(detailsMsg +"--Expected Values is"+object+"    "+"Actual values is "+actualValue);
		}
	}
	public  void verifyEquals(ExtentTest extent,WebDriver driver,int actual, int expected, String stepName,String detailsMsg) throws IOException {
		try {
			Assert.assertEquals(actual, expected,detailsMsg);
			extent.log(LogStatus.PASS, stepName,detailsMsg);
		} catch (Error e) {

			extent.log(LogStatus.ERROR, stepName,extent.addScreenCapture(TakeScreenShot.takeSceernShot(driver)));

			verificationErrors.append(e);
			Reporter.log(detailsMsg +"");
		}
	}

	public void verifyEquals(ExtentTest extent,WebDriver driver, Object obj1, Object obj2,String stepName,String detailsMsg) throws IOException {
		try {
			Assert.assertEquals(obj1, obj2);
			extent.log(LogStatus.PASS, stepName,detailsMsg);
		} catch (Error e) {

			extent.log(LogStatus.ERROR, stepName,extent.addScreenCapture(TakeScreenShot.takeSceernShot(driver)));

			verificationErrors.append(detailsMsg+e);
			Reporter.log(detailsMsg +"");
		}
	}

	public void verifyNotEquals(ExtentTest extent,WebDriver driver, Object obj1, Object obj2,String stepName,String detailsMsg) throws IOException {
		try {
			assertNotEquals(obj1, obj2);
			extent.log(LogStatus.PASS, stepName,detailsMsg);
		} catch (Error e) {

			extent.log(LogStatus.ERROR, stepName,extent.addScreenCapture(TakeScreenShot.takeSceernShot(driver)));

			verificationErrors.append(e);
			Reporter.log(detailsMsg +"");
		}
	}

	public void verifyEquals(ExtentTest extent,WebDriver driver, String str1[], String str2[],String stepName,String detailsMsg) throws IOException {
		try {
			Assert.assertEquals(str1, str2, detailsMsg);
			extent.log(LogStatus.PASS, stepName,detailsMsg);
		} catch (Error e) {

			extent.log(LogStatus.ERROR, stepName,extent.addScreenCapture(TakeScreenShot.takeSceernShot(driver)));

			verificationErrors.append(e);
			Reporter.log(detailsMsg +"");
		}
	}

	public void verifyEquals(ExtentTest extent,WebDriver driver,Object str1[], Object str2[], String stepName,String detailsMsg) throws IOException {
		try {
			assertEquals(((Object) (str1)), ((Object) (str2)));
			extent.log(LogStatus.PASS, stepName,detailsMsg);
		} catch (Error e) {

			extent.log(LogStatus.ERROR, stepName,extent.addScreenCapture(TakeScreenShot.takeSceernShot(driver)));

			verificationErrors.append(e);
			Reporter.log(detailsMsg +"");
		}
	}

	public void verifySame(ExtentTest extent,WebDriver driver,Object[] expected,Object[] actual, String stepName,String detailsMsg) throws IOException{

		try{


			assertEquals(actual, expected,  detailsMsg);


			extent.log(LogStatus.PASS, stepName,detailsMsg);
		} catch (Error e) {

			extent.log(LogStatus.ERROR, stepName,extent.addScreenCapture(TakeScreenShot.takeSceernShot(driver)));


			verificationErrors.append(e);

			System.out.println(verificationErrors);
			Reporter.log(detailsMsg +"");
		}
	}

	public void clearVerificationErrors() {
		// System.out.println("Size of the error"+verificationErrors.length());
		verificationErrors = new StringBuffer();

	}

	public void checkForVerificationErrors() {
		String verificationErrorString = verificationErrors.toString();

		// Clear Verification Errors so that it is ready to test new verifications

		clearVerificationErrors();
		if (!"".equals(verificationErrorString)){
			fail=true;

			fail(verificationErrorString);
		}}
	public void verifyArrayEquals(Object[] actual, Object[] Expected, String message){
		try{
			assertArraySame(actual, Expected, message);
		}catch(Error e){
			verificationErrors.append(e);
		}
	}
	private void assertArraySame(Object actual, Object Expected ,String msg){

		boolean flag=true;
		if(actual==null && Expected==null){
			return;
		}
		int counter=0;
		String st="";
		if(Expected!=null){
			if(Expected.getClass().isArray()){
				int expectedlen=Array.getLength(actual);
				if(expectedlen==Array.getLength(Expected)){
					for (int i = 0; i < expectedlen; i++)
					{
						Object _actual = Array.get(actual, i);
						Object _expected = Array.get(Expected, i);

						try
						{

							if(! _actual.equals(_expected)){

								st= msg+"===>>>"+st+"Index Value "+i+" [Expected:: "+_expected.toString()+" && "+" Actual:: "+_actual.toString()+"],  ";
								flag=false;
								counter++;
								System.out.println("Value Mismatched - Actaul ==>"+_actual.toString() +"  Expected ==>"+_expected.toString());
							}
						}catch(Exception e){
							System.err.print(e);

						}
					}

				}else{
					fail("Array are not same for the given array");
				}
				if(!flag){
					try{

						throw new AssertionError();
					}catch(AssertionError ae){


						fail("Value mismathced:-"+"("+counter+")"+st);
					}	
				}
			}
			if(Expected.equals(actual)){
				return;
			}
		}

	}

}
