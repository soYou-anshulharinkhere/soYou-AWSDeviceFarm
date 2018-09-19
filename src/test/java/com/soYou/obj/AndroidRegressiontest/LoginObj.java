package com.soYou.obj.AndroidRegressiontest;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class LoginObj {

	public LoginObj(AndroidDriver driver)
	{
		this.driver=driver;
	}

	public AndroidDriver driver;
	/*Page Elements*/
	
	By WelcomescreenSkip=By.id("com.joyn.soyou:id/btnSkip");

	//Mobile Number Screen 
	
	By MobileNumberHeader=By.id("com.joyn.soyou:id/ivsoYouLogo");
	By MobileNumberSubHeader=By.id("com.joyn.soyou:id/tvLoginTitle"); 
	By MobileNumberField=By.id("com.joyn.soyou:id/etMobileNumber");
	By NextFirstSrc=By.id("com.joyn.soyou:id/btnSubmit");
	By ErrorInvalidNumber=By.id("com.joyn.soyou:id/snackbar_text");
	By SelectCountryDropDown=By.id("com.joyn.soyou:id/imageView_arrow");
	By SelectACountryTitelOnSelectCountrydrpDwn=By.id("com.joyn.soyou:id/textView_title\n");
	By EnterCountryName=By.id("com.joyn.soyou:id/editText_search");
	By SelectCountry=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]");
	By ErrorPleaseEnterYourMobileNumber=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout");
	By LoaderAfterSubmittingTheMobileNumber=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ProgressBar");


	By permissionallow=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]");
	By permissionDeny=By.id("com.android.packageinstaller:id/permission_deny_button");

	//OTP Screen 
	By OTPSrcHeader=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView");
	By OTPSrcSubHeader=By.id("com.joyn.soyou:id/tvEnterOtpPlaceHolder");
	By RequestNewOTPText=By.id("com.joyn.soyou:id/tvNewOtp");
	By WrongNumberText=By.id("com.joyn.soyou:id/tvWrongNumber");
	By EnterOTPNumberFirstField=By.id("com.joyn.soyou:id/etPin1");
	By EnterOTPNumberSecondField=By.id("com.joyn.soyou:id/etPin2");
	By EnterOTPNumberThirdField=By.id("com.joyn.soyou:id/etPin3");
	By EnterOTPNumberFourthField=By.id("com.joyn.soyou:id/etPin4");
	
	
	By OTPMisMatchWarning=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout");

//Intermidiate Screen 
	
	By DefalultProfPicPlaceHolder=By.id("com.joyn.soyou:id/ivProfilePicture");
	By FirstNameTextField=By.id("com.joyn.soyou:id/rlRootView");
	By LastNameTextField=By.id("com.joyn.soyou:id/tiLastName");
	By DoneButton=By.id("com.joyn.soyou:id/btnDone");
	By AllowPermission=By.id("com.android.packageinstaller:id/permission_allow_button");
	By OpenCamera=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]");
	By ClickCameraButton=By.id("Shutter");
	By ClickedOkButton=By.id("Done");
	By CropDoneButton=By.id("com.joyn.soyou:id/crop_image_menu_crop");
	//Tab BarLayout
	By FirstTab=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.RelativeLayout/android.widget.ImageView");
	By SecondTab=By.id("com.joyn.soyou:id/ivTabOne");
	By ComposeTab=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]/android.widget.RelativeLayout/android.widget.ImageView");
	By FourthTab=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[4]/android.widget.RelativeLayout/android.widget.ImageView");
	By FifthTab=By.id("com.joyn.soyou:id/ivBellIcon");





	/*Objets*/
	public boolean WelcomescreenSkip(){
		try{
			MobileElement el1 = (MobileElement) driver.findElementById("com.joyn.soyou:id/btnSkip");
			el1.click();
			return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	
	public boolean MobileNumSrcHeader(){
		try{
			return driver.findElement(MobileNumberHeader).isDisplayed();
			
		}catch(NoSuchElementException e){
			return false;
		}
	}

	public boolean MobileNumSrcSubHeader(){
		try{
			return driver.findElement(MobileNumberSubHeader).isDisplayed();
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean ClickOnSelectCountryDropDown(){ 
		try{ 
			driver.findElement(SelectCountryDropDown).click(); 
			return true;
		}catch(NoSuchElementException e){ 	
			return false;
		} 
	} 
	public boolean IsSelectACountryTitelOnSelectCountrydrpDwnDisply(){
		try{
			return driver.findElement(SelectACountryTitelOnSelectCountrydrpDwn).isDisplayed();
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean EnterCountryName(String CountryName){
		try{
			driver.findElement(EnterCountryName).sendKeys(CountryName);
			return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}

	public boolean SelectCountryNameFromDrpDwn(){ 
		try{ 
			driver.findElement(SelectCountry).click(); 
			return true;
		}catch(NoSuchElementException e){ 	
			return false;
		} 
	} 

	public boolean EnterMobNo(String phNo){
		try{
			driver.findElement(MobileNumberField).sendKeys(phNo);
			return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}

	public boolean ClickOnNext(){ 
		try{ 
			driver.findElement(NextFirstSrc).click(); 
			return true;
		}catch(NoSuchElementException e){ 	
			return false;
		} 
	} 

	public boolean IsErrorInvalidNumberDisplay(){
		try{
			return driver.findElement(ErrorInvalidNumber).isDisplayed();
		}catch(NoSuchElementException e){
			return false;
		}
	}

	public boolean IsErrorEnterMobileNumberDisplay(){
		try{
			return driver.findElement(ErrorPleaseEnterYourMobileNumber).isDisplayed();
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	public boolean IsLoaderAfterSubmittingTheMobileNumberDisplay(){
		try{
			return driver.findElement(LoaderAfterSubmittingTheMobileNumber).isDisplayed();
		}catch(NoSuchElementException e){
			return false;
		}
	}


	//OTP Screen 


	public boolean OTPsSrcHeader(){
		try{
			return driver.findElement(OTPSrcHeader).isDisplayed();
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean OTPSrcSubHeader(){
		try{
			return driver.findElement(OTPSrcSubHeader).isDisplayed();
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean RequestNewOTPText(){
		try{
			return driver.findElement(RequestNewOTPText).isDisplayed();
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean WrongNumberText(){
		try{
			driver.findElement(WrongNumberText).click();
			return driver.findElement(WrongNumberText).isDisplayed();
			
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	public boolean WrongNumberclick(){
		try{
			driver.findElement(WrongNumberText).click();
			return true;
			
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean InvalidOTPFirstEnter(String InvalidOTP)

	{
		try{
			driver.findElement(EnterOTPNumberFirstField).clear();
			driver.findElement(EnterOTPNumberFirstField).sendKeys(InvalidOTP);
			return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	public boolean InvalidOTPSecondEnter(String InvalidOTP)

	{
		try{
			driver.findElement(EnterOTPNumberSecondField).clear();
			driver.findElement(EnterOTPNumberSecondField).sendKeys(InvalidOTP);
			return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean InvalidOTPThirdEnter(String InvalidOTP)

	{
		try{
			driver.findElement(EnterOTPNumberThirdField).sendKeys(InvalidOTP);
			return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean InvalidOTPFourthEnter(String InvalidOTP)

	{
		try{
			driver.findElement(EnterOTPNumberFourthField).sendKeys(InvalidOTP);
			return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	public boolean ValidFirstOTP(String ValidOTP) {
	
		try {
			driver.findElement(EnterOTPNumberFirstField).clear();
			driver.findElement(EnterOTPNumberFirstField).sendKeys(ValidOTP);
			return true;

		}catch(NoSuchElementException e)
		{		
			return false;
		}

	}
	
	public boolean IsOTPMisMatchWarningDisplay(){
		try{
			return driver.findElement(OTPMisMatchWarning).isDisplayed();
		}catch(NoSuchElementException e){
			return false;
		}
	}
//Intermidiate Screen 

	
	public boolean IsDefalultProfPicPlaceHolderDisplay(){
		try{
			return driver.findElement(DefalultProfPicPlaceHolder).isDisplayed();
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean FirstNameTextField(String FirstName) {
		
		try {
			driver.findElement(FirstNameTextField).sendKeys(FirstName);
			return true;

		}catch(NoSuchElementException e)
		{		
			return false;
		}

	}
	
	public boolean LastNameTextField(String LastName) {
		
		try {
			driver.findElement(LastNameTextField).sendKeys(LastName);
			return true;

		}catch(NoSuchElementException e)
		{		
			return false;
		}

	}
	public boolean ClickDefalultProfPicPlaceHolder(){
		try{
			driver.findElement(DefalultProfPicPlaceHolder).click();
			return true;
			
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	
	public boolean ClickIntermidiateSrcDoneButton(){
		try{
			
			driver.findElementById("com.joyn.soyou:id/btnDone").click();
			return true;
			
		}catch(NoSuchElementException e){
			return false;
		}
	}

	public boolean AllowPermissionForProfilePicUpload(){
		try{
			driver.findElement(AllowPermission).click();
			return true;
			
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean ClickOpenCameraButton(){
		try{
			driver.findElement(OpenCamera).click();
			return true;
			
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	public boolean ClickCameraButton(){
		try{
			driver.findElement(ClickCameraButton).click();
			return true;
			
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	public boolean ClickedOkButton(){
		try{
			driver.findElement(ClickedOkButton).click();
			return true;
			
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	public boolean ClickCropDoneButton(){
		try{
			driver.findElement(CropDoneButton).click();
			return true;
			
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	//Tab Bar Layout
	public boolean ClickFirstTab(){
		try{
			driver.findElement(FirstTab).click();
			return true;
			
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean ClickSecondTab(){
		try{
			driver.findElement(SecondTab).click();
			return true;
			
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean ClickThirdTab(){
		try{
			driver.findElement(ComposeTab).click();
			return true;
			
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean ClickFourthTab(){
		try{
			driver.findElement(FourthTab).click();
			return true;
			
		}catch(NoSuchElementException e){
			return false;
		}
	}
	public boolean ClickFifthTab(){
		try{
			driver.findElement(FifthTab).click();
			//List<WebElement> elements = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)");
			return true;
			
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
}