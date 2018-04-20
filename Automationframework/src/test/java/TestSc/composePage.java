
package TestSc;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.extentReportManager.ExtentTestManager;
import com.framework.internal.feature.AppInitializer;
import pageobjects.composescreen;
import utility.ExcelReader;

public class composePage extends AppInitializer{
	@DataProvider(name="details")
	 public Object[][] userdetails() throws Exception{
	  Object[][] values=ExcelReader.getTableArray(".//Data//user_details.xlsx", "details");
	  return values;
	 }
	
	String hashtag = "#gmx";
	
//	@Test(priority=30)
//	public void composeGiftFromCamera() throws IOException, InterruptedException {
//		composescreen composepage=new composescreen(getiosDriver());
//		getiosDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.IsselectContactsDisplayed(), "Check Whether Select contacts is displaying or not", "Select contacts is displaying displaying");
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.IsContactsListDisplayed(), "Check Whether contacts is displaying or not", "contacts is displaying");
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.ComposeImageFromCamera(), "Check Whether image from camera is clicked or not", "image from camera is clicked");
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.sendButton(), "Check Whether send button clicked or not", "send button clicked");
//	}
	
	@Test(priority=31)
	public void composeImageGiftFromGallery() throws IOException, InterruptedException {
		composescreen composepage=new composescreen(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.IsselectContactsDisplayed(), "Check Whether Select contacts is displaying or not", "Select contacts is displaying displaying");
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.IsContactsListDisplayed(), "Check Whether contacts is displaying or not", "contacts is displaying");
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.selectImageFromGallery(), "Check Whether image is selected from gallery or not", "image is selected from gallery");
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.sendButton(), "Check Whether send button clicked or not", "send button clicked");
	}
//	
//	@Test(priority=32)
//	public void composeVideoGiftFromGallery() throws IOException, InterruptedException {
//		composescreen composepage=new composescreen(getiosDriver());
//		
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.IsselectContactsDisplayed(), "Check Whether Select contacts is displaying or not", "Select contacts is displaying displaying");
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.IsContactsListDisplayed(), "Check Whether contacts is displaying or not", "contacts is displaying");
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.selectvideoFromGallery(), "Check Whether video is selected from gallery or not", "video is selected from gallery");
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.sendButton(), "Check Whether send button clicked or not", "send button clicked");
//	}
//	
//	@Test(priority=33,dataProvider="details")
//	public void composetextasGift( String mobilenumber,String countryname,String Firstname,String Lastname,String email,String Text,String link,String name,String groupName) throws IOException, InterruptedException {
//		composescreen composepage=new composescreen(getiosDriver());
//		
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.IsselectContactsDisplayed(), "Check Whether Select contacts is displaying or not", "Select contacts is displaying displaying");
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.IsContactsListDisplayed(), "Check Whether contacts is displaying or not", "contacts is displaying");
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.sendtext(Text), "Check Whether text is added in compose area description or not", "text is added in compose area description");
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.userMention(name), "Check Whether user is able to tag friends or not", "user is able to tag friends ");
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.sendButton(), "Check Whether send button clicked or not", "send button clicked");
//	}
//	
//	@Test(priority=34,dataProvider="details")
//	public void composeWeblinkasGift( String mobilenumber,String countryname,String Firstname,String Lastname,String email,String text,String Link,String name,String groupName) throws IOException, InterruptedException {
//		composescreen composepage=new composescreen(getiosDriver());
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.IsselectContactsDisplayed(), "Check Whether Select contacts is displaying or not", "Select contacts is displaying displaying");
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.IsContactsListDisplayed(), "Check Whether contacts is displaying or not", "contacts is displaying");
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.sendWeblinkt(Link), "Check Whether web link is able to send or not", "web link is able to send");
//		Thread.sleep(500);
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.iscloseButtonDisplayed(), "Check Whether close button of URL metadata is displaying or not", "close button of URL metadata is displaying");
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.sendtext(hashtag), "Check Whether hashtag is added or not", "hashtag is added");
//		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), composepage.sendButton(), "Check Whether send button clicked or not", "send button clicked");
//	}
}