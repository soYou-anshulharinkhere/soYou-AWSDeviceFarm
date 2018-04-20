package TestSc;

import java.io.IOException;

import org.testng.annotations.Test;

import com.extentReportManager.ExtentTestManager;
import com.framework.internal.feature.AppInitializer;
 
import pageobjects.Notifications_tab;

public class notificationPage extends AppInitializer {
	@Test(priority=35)
	public void verifyPostNavigationFromNotificationTab() throws IOException, InterruptedException {
		Notifications_tab notify=new Notifications_tab(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), notify.verifypostnotification(), "Check Whether post notification naviagtion is sucess or not", "post notification naviagtion is sucess");
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), notify.isBackbuttonClicked(),  "Verify whether back button is clicked or not", "back button is clicked");
		
	}

	@Test(priority=36)
	public void swipeBetweenTabs() throws IOException, InterruptedException {
		Notifications_tab notify=new Notifications_tab(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), notify.SwipeToFriendsTab(), "Check Whether Swipe to Friends tab is success or not", "Swipe to Friends tab is success");
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), notify.SwipeToYouTab(), "Check Whether Swipe to Friends tab is success or not", "Swipe to Friends tab is success");
	}
	
//	@Test(priority=37)
	public void verifyopeningpostinfriendstab() throws IOException, InterruptedException {
		Notifications_tab notify=new Notifications_tab(getiosDriver());
		
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), notify.SwipeToFriendsTab(), "Check Whether Swipe to Friends tab is success or not", "Swipe to Friends tab is success");
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), notify.verifyFreindspostnotification(), "Check Whether post notification naviagtion is sucess or not", "post notification naviagtion is sucess");
	
		verifyTrue(ExtentTestManager.getTest(), getiosDriver(), notify.isBackbuttonClicked(),  "Verify whether back button is clicked or not", "back button is clicked");
	}
}
