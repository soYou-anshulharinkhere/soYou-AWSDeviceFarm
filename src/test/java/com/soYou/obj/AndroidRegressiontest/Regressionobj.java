package com.soYou.obj.AndroidRegressiontest;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class Regressionobj {

	public Regressionobj(AndroidDriver driver)
	{
		this.driver=driver;
	}

	public AndroidDriver driver;
	/*Page Elements*/
	
	By WelcomescreenSkip=By.id("com.joyn.soyou:id/btnSkip");

	//Mobile Number Screen 
	
	By MobileNumberHeader=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]");
	By MobileNumberSubHeader=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinarLayout/android.widget.TextView[2]"); 
	By MobileNumberField=By.id("com.joyn.soyou:id/etmobileNumber");
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
	By OTPSrcHeader=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]");
	By OTPSrcSubHeader=By.id("com.joyn.soyou:id/tvEnterOtpPlaceHolder");
	By RequestNewOTPText=By.id("com.joyn.soyou:id/tvNewOtp");
	By WrongNumberText=By.id("com.joyn.soyou:id/tvWrongNumber");
	By EnterOTPNumberField=By.id("com.joyn.soyou:id/etOtp");
	
	By OTPMisMatchWarning=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout");

//Intermidiate Screen 
	
	By DefalultProfPicPlaceHolder=By.id("com.joyn.soyou:id/ivProfilePicture");
	By FirstNameTextField=By.id("com.joyn.soyou:id/rlRootView");
	By LastNameTextField=By.id("com.joyn.soyou:id/tiLastName");
	By DoneButton=By.id("com.joyn.soyou:id/btnDone");
	By AllowPermission=By.id("com.android.packageinstaller:id/permission_allow_button");
	By OpenCamera=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/com.android.internal.widget.ViewPager/android.widget.LinearLayout/android.widget.GridView/android.widget.LinearLayout[1]/android.widget.FrameLayout");
	By ClickCameraButton=By.id("MENUID_SHUTTER");
	By ClickedOkButton=By.id("OK Button");
	By CropDoneButton=By.id("com.joyn.soyou:id/crop_image_menu_crop");
	//Tab BarLayout
	By FirstTab=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.ImageView");
	By SecondTab=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]/android.widget.ImageView");
	By ThirdTab=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]/android.widget.ImageView");
	By FourthTab=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[4]/android.widget.ImageView");
	By FifthTab=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[5]/android.widget.ImageView");	
				





	/*Objets*/
	public boolean WelcomescreenSkip(){
		try{
			 driver.findElement(WelcomescreenSkip).click();
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
	public boolean AllowPermission(){
		try{
			driver.findElement(permissionallow).click();
			return true;
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
	public boolean InvalidOTPEnter(String InvalidOTP)

	{
		try{
			driver.findElement(EnterOTPNumberField).sendKeys(InvalidOTP);
			return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	public boolean ValidOTP(String ValidOTP) {
	
		try {
			driver.findElement(EnterOTPNumberField).sendKeys(ValidOTP);
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
			driver.findElement(DoneButton).click();
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
			driver.findElement(ThirdTab).click();
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
	
	
	/*Page Elements*/

	//	//First Screen 
	//
	//	By Loanylogo=By.id("com.gyanmatrix.loany:id/appLogo");
	//	By SkipButton=By.id("com.gyanmatrix.loany:id/skip");//SKIP
	//	By NextButton=By.id("com.gyanmatrix.loany:id/next");
	//
	//	//Second Screen
	//
	//	By Header2ndsrc=By.id("com.gyanmatrix.loany:id/title");//Search for agents near you
	//	By PageInfo2ndsrc=By.id("com.gyanmatrix.loany:id/caption");//You can look for agents near you, and notify the ones which look promising.
	//	By Mobilelogo2ndsrc=By.id("com.gyanmatrix.loany:id/image");
	//	By SkipButton2ndsrc=By.id("com.gyanmatrix.loany:id/skip");
	//	By NextBbutton2ndsrc=By.id("com.gyanmatrix.loany:id/next");
	//
	//	//ThirdScreen 
	//
	//
	//	By Header3rdsrc=By.id("com.gyanmatrix.loany:id/title");//Chat with your agents
	//	By PageInfo3rdsrc=By.id("com.gyanmatrix.loany:id/caption");//Stay connected with agents to provide more information and know your loan status.
	//	By Mobilelogo3rdsrc=By.id("com.gyanmatrix.loany:id/image");
	//	By SkipButton3rdsrc=By.id("com.gyanmatrix.loany:id/skip");
	//	By NextBbutton3rdsrc=By.id("com.gyanmatrix.loany:id/next");
	//
	//	//ForthScreen
	//
	//	By Header4thsrc=By.id("com.gyanmatrix.loany:id/title");//Chat with your agents
	//	By PageInfo4thsrc=By.id("com.gyanmatrix.loany:id/caption");//Stay connected with agents to provide more information and know your loan status.
	//	By Mobilelogo4thsrc=By.id("com.gyanmatrix.loany:id/image");
	//	By SkipButton4thsrc=By.id("com.gyanmatrix.loany:id/skip");
	//	By NextBbutton4thsrc=By.id("com.gyanmatrix.loany:id/next");	
	//
	//
	//	//Fifth screen 
	//
	//	By Header5thsrc=By.id("com.gyanmatrix.loany:id/title");//Share your details as Cards
	//	By PageInfo5thsrc=By.id("com.gyanmatrix.loany:id/caption");//A more interactive chat with cards, so you don't have to text everything	
	//	By Mobilelogo5thsrc=By.id("com.gyanmatrix.loany:id/image");
	//	By Termsandcondition=By.id("com.gyanmatrix.loany:id/footer");//BY PROCEEDING YOU ACCEPT OUR TERMS AND CONDITIONS
	//	By SkipButton5thsrc=By.id("com.gyanmatrix.loany:id/skip");
	//	By Donebutton5thsrc=By.id("com.gyanmatrix.loany:id/done");//DONE
	//
	//
	//	// MobileNumber Screen 
	//
	//	By HeaderMobNumScreen=By.id("com.gyanmatrix.loany:id/toolbar_title");//Mobile Number
	//	By PageInfo=By.id("com.gyanmatrix.loany:id/tvAlertForAgent");//Please enter your valid mobile number to which the verification code will be sent.
	//	By CountryCode=By.id("com.gyanmatrix.loany:id/indiaNumber");//Ind(+91)
	//	By GlobeSymbol=By.id("com.gyanmatrix.loany:id/iconCountry");
	//	By Flag=By.id("com.gyanmatrix.loany:id/indiaFlag");
	//	By MobileSymbol=By.id("com.gyanmatrix.loany:id/iconPhone");
	//	By MobileNumTxtFld=By.id("com.gyanmatrix.loany:id/phone_number");//Mobile Number
	//	By DoneButton=By.id("com.gyanmatrix.loany:id/ivTick");
	//
	//
	//	//For Bridge App Only
	//	By Agentinfo=By.id("com.gyanmatrix.loany:id/tagline");//If you are an agent, please register your mobile number first at loany.in/agent Then use the same registered mobile number here.
	//
	//	By DoneMobNumSrc=By.xpath("android.widget.TextView");
	//
	//	//Permissions For Android
	//
	//	By Permission1=By.id("com.android.packageinstaller:id/permission_allow_button");
	//	By Permission2=By.id("com.android.packageinstaller:id/permission_allow_button");
	//	By Permission3=By.id("com.android.packageinstaller:id/permission_allow_button");
	//	By Permission4=By.id("com.android.packageinstaller:id/permission_allow_button");
	//
	//	//VerifyPinNumber Screen
	//
	//	By HeaderVrfyPin=By.xpath("android.widget.TextView");//Verify PIN Number
	//	By EnteredMobNum=By.id("com.gyanmatrix.loany:id/resendLayout");
	//	By MsgYetToRcvSMS=By.id("com.gyanmatrix.loany:id/resendCaption");//Yet to receive SMS ?
	//	By PINRecvMsg=By.id("com.gyanmatrix.loany:id/pin_received");//If you already received PIN, please enter below
	//	By KeySymbol=By.id("com.gyanmatrix.loany:id/secure_key");
	//	By PINEnterTxtFld=By.id("com.gyanmatrix.loany:id/verify_code");//Enter your PIN
	//	By VerifyButton=By.id("com.gyanmatrix.loany:id/verify_pin");
	//
	//	//About Me Screen 
	//
	//	By HeaderAbtMe=By.id("com.gyanmatrix.loany:id/toolbar_title");//About Me
	//	By Imageplaceholder=By.id("com.gyanmatrix.loany:id/profilePic");
	//	By CamButton=By.id("com.gyanmatrix.loany:id/btnCamera");
	//	By YourNameTextField=By.id("com.gyanmatrix.loany:id/user_name");
	//	By EnteredNameWarning=By.xpath("android.widget.TextView");//Loan would be processed against the entered name. Name cannot be changed later.
	//	By NextButtonAbtMeSrc=By.id("com.gyanmatrix.loany:id/nextBtn");//NEXT
	//
	//	//LocationScreen
	//
	//	By HeaderLocSrc=By.xpath("android.widget.TextView");//I Need Agents At
	//	By LocaLogo=By.id("com.gyanmatrix.loany:id/iconImgVw");
	//	By MsgToChooseLoc=By.id("com.gyanmatrix.loany:id/placeHolderTV");//Where do you need agents for loan?
	//	By Bangalore=By.xpath("//android.widget.LinearLayout[@index='0']");
	//	By Chennai=By.xpath("//android.widget.LinearLayout[@index='1']");
	//	By Previous=By.id("com.gyanmatrix.loany:id/previousBtn");//PREVIOUS
	//	By NextLocSrc=By.id("com.gyanmatrix.loany:id/nextBtn");//NEXT
	//
	//	//I NEED (Loan Type Screen)
	//
	//	By HeaderLoanTyp=By.xpath("android.widget.TextView");
	//	By WarningToSelectLoanyTyp=By.id("com.gyanatrix.loany:id/placeHolderTV");//*Loan Type cannnot be changed in future
	//	By SelectHomeLoan=By.xpath("//android.widget.LinearLayout[@index='0']/android.widget.FrameLayout[@index='0']/android.widget.RelativeLayout[@index='0']");
	//	By SelectHomeLoanTransfer=By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.FrameLayout[@index='0']/android.widget.RelativeLayout[@index='0']");       
	//	By SelectPersonalLoan=By.xpath("//android.widget.LinearLayout[@index='2']/android.widget.FrameLayout[@index='0']/android.widget.RelativeLayout[@index='0']");
	//	By SelectAutomobileLoan=By.xpath("//android.widget.LinearLayout[@index='3']/android.widget.FrameLayout[@index='0']/android.widget.RelativeLayout[@index='0']");
	//	By SelectMortgageLoan=By.xpath("//android.widget.LinearLayout[@index='4']/android.widget.FrameLayout[@index='0']/android.widget.RelativeLayout[@index='0']");
	//	By SelectBusinessLoan=By.xpath("//android.widget.LinearLayout[@index='5']/android.widget.FrameLayout[@index='0']/android.widget.RelativeLayout[@index='0']");
	//	By SelectCreditCard=By.xpath("//android.widget.LinearLayout[@index='6']/android.widget.FrameLayout[@index='0']/android.widget.RelativeLayout[@index='0']");
	//	By Nxtbtn=By.id("com.gyanmatrix.loany:id/nextBtn");
	//	By ConfirmationDialogmsg=By.id("android:id/message");//Loan Type cannot be changed in future
	//	By DialogCancel=By.id("android:id/button2");//CANCEL
	//	By DialogOK=By.id("android:id/button1");//OK
	//
	//
	//	//I Need Loan Amount(Loan Amount screen)
	//
	//
	//	By HeaderLoanAmtSrc=By.id("com.gyanmatrix.loany:id/tvTitle");//I Need Loan Amount
	//	By LogoLnAmntSrc=By.id("com.gyanmatrix.loany:id/ivImage");
	//	By PgInfo=By.id("com.gyanmatrix.loany:id/tvText");//How much money do you need?
	//	By LoanAmtSlab1Lto25L=By.xpath("//android.widget.ScrollView[@index='1']/android.widget.LinearLayout[@index='2']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.Button[@index='0']");//1L - 25L
	//	By LoanAmtSlab25Lto50L=By.xpath("//android.widget.ScrollView[@index='1']/android.widget.LinearLayout[@index='2']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.Button[@index='1']");//25L - 50L
	//	By LoanAmtSlab50Lto75L=By.xpath("//android.widget.ScrollView[@index='1']/android.widget.LinearLayout[@index='2']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.Button[@index='2']");//50L - 75L
	//	By LoanAmtSlabupto75L=By.xpath("//android.widget.ScrollView[@index='1']/android.widget.LinearLayout[@index='2']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.Button[@index='3']");//> 75L
	//	By AmountSlider=By.id("com.gyanmatrix.loany:id/sAmountSlider");
	//
	//	//Slab 1Lto25L
	//	By MinLimit1Lakh=By.id("com.gyanmatrix.loany:id/lblMinAmt");//₹ 1,00,000
	//	By MaxLimit25Lakh=By.id("com.gyanmatrix.loany:id/lblMaxAmt");//₹ 25,00,000
	//	//Slab 25Lto50L
	//	By MinLimi25Lakh=By.id("com.gyanmatrix.loany:id/lblMinAmt");//₹ 25,00,000
	//	By MaxLimit50Lakh=By.id("com.gyanmatrix.loany:id/lblMaxAmt");//₹ 50,00,000
	//	//Slab 50Lto75L
	//	By MinLimit50Lakh=By.id("com.gyanmatrix.loany:id/lblMinAmt");//₹ 50,00,000
	//	By MaxLimit75Lakh=By.id("com.gyanmatrix.loany:id/lblMaxAmt");//₹ 75,00,000
	//	//Slab 75Lto75L
	//	By MinLimit75Lakh=By.id("com.gyanmatrix.loany:id/lblMinAmt");//₹ 75,00,000
	//	By MaxLimit75Lkh=By.id("com.gyanmatrix.loany:id/lblMaxAmt");//₹ 75,00,000
	//
	//	By RupeeLogo=By.id("com.gyanmatrix.loany:id/tvRupeeIcon");
	//	By AmountField=By.id("com.gyanmatrix.loany:id/inputetasvAmountInput");//Amount
	//	By PreviousButtonLoanSrc=By.id("com.gyanmatrix.loany:id/btnPrevious");//PREVIOUS
	//	By NextButtonLoanSrc=By.id("com.gyanmatrix.loany:id/btnDone");//NEXT
	//	By Loader=By.xpath("android.widget.ProgressBar");
	//
	//	//My Profession 
	//
	//	By HeaderMyProfssn	=By.xpath("android.widget.TextView");//My Profession
	//	By ProfsnSrcLogo=By.id("com.gyanmatrix.loany:id/iconImgVw");
	//	By SubHeading=By.id("com.gyanmatrix.loany:id/placeHolderTV");//How do you earn?
	//	By Salaried=By.xpath("//android.widget.ListView[@index='3']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@index='1']");//Salaried
	//	By Business=By.xpath("//android.widget.ListView[@index='3']/android.widget.LinearLayout[@index='1']/android.widget.TextView[@index='1']");//Business
	//	By SelfEmployed=By.xpath("//android.widget.ListView[@index='3']/android.widget.LinearLayout[@index='2']/android.widget.TextView[@index='1']");//Self Employed
	//	By PreviousButtonPrfsSrc=By.id("com.gyanmatrix.loany:id/previousBtn");//PREVIOUS
	//	By NextButtonPrfSrc=By.id("com.gyanmatrix.loany:id/nextBtn");//NEXT
	//
	//
	//
	//	//My Monthly Salary Screen 
	//
	//	By HeaderMonthlySalarySrc=By.id("com.gyanmatrix.loany:id/tvTitle");//My Monthly Income
	//	By LogoMonthlySalarySrc=By.id("com.gyanmatrix.loany:id/ivImage");
	//	By SubHeadingMonthlySalarySrc=By.id("com.gyanmatrix.loany:id/tvText");//*Please enter your monthly take home salary
	//	By MonthlyIncSlab20Kto50K=By.xpath("//android.widget.ScrollView[@index='1']/android.widget.LinearLayout[@index='2']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.Button[@index='0']");//20K - 50K
	//	By MonthlyInc50kto2L=By.xpath("//android.widget.ScrollView[@index='1']/android.widget.LinearLayout[@index='2']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.Button[@index='1']");//50K - 2L
	//	By MonthlyInc2Lto5L=By.xpath("//android.widget.ScrollView[@index='1']/android.widget.LinearLayout[@index='2']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.Button[@index='2']");//2L - 5L
	//	By MonthlyIncSlabupto5L=By.xpath("//android.widget.ScrollView[@index='1']/android.widget.LinearLayout[@index='2']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.Button[@index='3']");//> 5L
	//	By AmountSliderMonthlysalarySrc=By.id("com.gyanmatrix.loany:id/sAmountSlider");
	//
	//
	//	//Slab 20K - 50K
	//	By MinLimit20k=By.id("com.gyanmatrix.loany:id/lblMinAmt");//₹ 20,000
	//	By MaxLimit50K=By.id("com.gyanmatrix.loany:id/lblMaxAmt");//₹ 50,000
	//	//Slab 50K - 2L
	//	By MinLimi50K=By.id("com.gyanmatrix.loany:id/lblMinAmt");//₹ 50,000
	//	By MaxLimit2Lakh=By.id("com.gyanmatrix.loany:id/lblMaxAmt");//₹ 2,00,000
	//	//Slab 2L - 5L
	//	By MinLimit2Lakh=By.id("com.gyanmatrix.loany:id/lblMinAmt");//₹ 2,00,000
	//	By MaxLimit5Lakh=By.id("com.gyanmatrix.loany:id/lblMaxAmt");//₹ 5,00,000
	//	//Slab > 5L
	//	By MinLimit5Lakh=By.id("com.gyanmatrix.loany:id/lblMinAmt");//₹ 5,00,000
	//	By MaxLimit5Lkh=By.id("com.gyanmatrix.loany:id/lblMaxAmt");//₹ 5,00,000
	//
	//	By RupeeLogoMonthlyslsrySrc=By.id("com.gyanmatrix.loany:id/tvRupeeIcon");
	//	By AmountFieldMnthlySlrySrc=By.id("com.gyanmatrix.loany:id/inputetasvAmountInput");//Amount
	//	By PreviousButtonLoanSrcMonthlySalarySrc=By.id("com.gyanmatrix.loany:id/btnPrevious");//PREVIOUS
	//	By NextButtonLoanSrcMonthlySalarySrc=By.id("com.gyanmatrix.loany:id/btnNext");//NEXT
	//
	//
	//	//Existing EMIs Screen 
	//
	//	By HeaderEMISrc=By.id("com.gyanmatrix.loany:id/tvTitle");//Existing EMIs
	//	By LogoexistingEMISrc=By.id("com.gyanmatrix.loany:id/ivImage");
	//	By SubheadingEMISrc=By.id("com.gyanmatrix.loany:id/tvText");//*Please enter your existing loan EMIs
	//	By EMISlab0to5k=By.xpath("//android.widget.ScrollView[@index='1']/android.widget.LinearLayout[@index='2']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.Button[@index='0']");//0 - 5k
	//	By EMISlab5Kto15k=By.xpath("//android.widget.ScrollView[@index='1']/android.widget.LinearLayout[@index='2']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.Button[@index='1']");//5K - 15k
	//	By EMISlab15Kto50K=By.xpath("//android.widget.ScrollView[@index='1']/android.widget.LinearLayout[@index='2']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.Button[@index='2']");//15k - 50k
	//	By EMISlabupto50L=By.xpath("//android.widget.ScrollView[@index='1']/android.widget.LinearLayout[@index='2']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.Button[@index='3']");//> 50k
	//	By AmountSliderEMISrc=By.id("com.gyanmatrix.loany:id/sAmountSlider");
	//
	//
	//	//Slab 0 - 5k
	//	By MinLimit0=By.id("com.gyanmatrix.loany:id/lblMinAmt");//₹ 0
	//	By MaxLimit5K=By.id("com.gyanmatrix.loany:id/lblMaxAmt");//₹ 5,000
	//	//Slab 5K - 15k
	//	By MinLimi5K=By.id("com.gyanmatrix.loany:id/lblMinAmt");//₹ 5,000
	//	By MaxLimit15K=By.id("com.gyanmatrix.loany:id/lblMaxAmt");//₹ 15,000
	//	//Slab 15k - 50k
	//	By MinLimit15K=By.id("com.gyanmatrix.loany:id/lblMinAmt");//₹ 15,000
	//	By MaxLimit50L=By.id("com.gyanmatrix.loany:id/lblMaxAmt");//₹ 50,000
	//	//Slab > 50k
	//	By MinLimit50Lkh=By.id("com.gyanmatrix.loany:id/lblMinAmt");//₹ 50,000
	//	By MaxLimit50Lkh=By.id("com.gyanmatrix.loany:id/lblMaxAmt");//₹ 50,000
	//
	//	By RupeeLogoEMISrc=By.id("com.gyanmatrix.loany:id/tvRupeeIcon");
	//	By AmountFieldEMISrc=By.id("com.gyanmatrix.loany:id/inputetasvAmountInput");//Amount
	//	By PreviousButtonEMISrc=By.id("com.gyanmatrix.loany:id/btnPrevious");//PREVIOUS
	//	By DoneButtonEMISrc=By.id("com.gyanmatrix.loany:id/btnDone");//DONE
	//
	//	//Agent Listing Screen 
	//
	//	By SandwichButton=By.id("com.gyanmatrix.loany:id/tvDrawerIcon");
	//	By HeaderAgntLstSrc=By.id("com.gyanmatrix.loany:id/tvTitle");//Select Agents
	//	By HeaderCityName=By.id("com.gyanmatrix.loany:id/tvAgentLocation");//Bangalore
	//	By AgentlistingSrchIcon=By.id("com.gyanmatrix.loany:id/tvSearchIcon");
	//	By AskLoanButton=By.id("com.gyanmatrix.loany:id/menu_notify_agent");//ASK LOAN
	//	By AskLoanBackButton=By.id("com.gyanmatrix.loany:id/action_mode_close_button");
	//
	//
	//	//After Notifying Agent(Chat With Agent Screen) 
	//
	//	By HeaderChatWithAgents=By.id("com.gyanmatrix.loany:id/toolbar_title");//Chat with Agents
	//	By NvgationDrawerOpenerBtn=By.id("com.gyanmatrix.loany:id/drawerOpener");
	//	By SrchButtonOnChatWithAgntSrc=By.id("com.gyanmatrix.loany:id/action_search");
	//	By AddAgentBtn=By.id("com.gyanmatrix.loany:id/actionAddAgentBtn");
	//	By DialogBxCustmrName=By.id("com.gyanmatrix.loany:id/tvDialogUserName");
	//	By LastMsgInDialogBox=By.id("com.gyanmatrix.loany:id/tvDialogLastSent");//You have sent a notification
	//	By ProfPicPlcHolder=By.id("com.gyanmatrix.loany:id/ivDialogProfilePicture");
	//	By RightArwToViewAgntProf=By.id("com.gyanmatrix.loany:id/agentContainer");
	//
	//
	//	//Chat Box(Chat With Agent by customer)
	//
	//	By ChatHeaderAgentName=By.id("com.gyanmatrix.loany:id/tvOpponentName");
	//	By ProfPicPlcHolderOnChat=By.id("com.gyanmatrix.loany:id/cvProfilePicture");
	//	By OnlineStatus=By.id("com.gyanmatrix.loany:id/tvOnlineStatus");
	//	By NotificationCardheading=By.id("com.gyanmatrix.loany:id/contentMessage");
	//	By LoanAmtOnCard=By.id("com.gyanmatrix.loany:id/loanAmount");
	//	By LoanTypeLogo=By.id("com.gyanmatrix.loany:id/loanTypeIcon");
	//	By loanDetailsContainer=By.id("com.gyanmatrix.loany:id/loanDetailsContainer");
	//	By TimeStampOnChatBox=By.id("com.gyanmatrix.loany:id/txtInfo");
	//	By TextOnMsgTypPlc=By.id("com.gyanmatrix.loany:id/etChatMessage");//Type a message
	//	By SendButton=By.id("com.gyanmatrix.loany:id/btnSendMsg");
	//	By DeliverSignmsgStatus=By.id("com.gyanmatrix.loany:id/msgStatus");
	//
	//
	//	//Navigation Drawer
	//
	//	By MyDetailsTitel=By.xpath("//com.gyanmatrix.loany:id/navList[@index='1']/android.widget.RelativeLayout[@index='0']/android.widget.TextView[@index='1']");//My Details
	//	By MyDetailsLogo=By.xpath("//com.gyanmatrix.loany:id/navList[@index='1']/android.widget.RelativeLayout[@index='0']/android.widget.TextView[@index='0']");
	//	By MyAgentsTitel=By.xpath("//com.gyanmatrix.loany:id/navList[@index='1']/android.widget.RelativeLayout[@index='1']/android.widget.TextView[@index='1']");//My Agents
	//	By MyAgentsLogo=By.xpath("//com.gyanmatrix.loany:id/navList[@index='1']/android.widget.RelativeLayout[@index='1']/android.widget.TextView[@index='0']");
	//	By ChatHistorytitel=By.xpath("//com.gyanmatrix.loany:id/navList[@index='1']/android.widget.RelativeLayout[@index='2']/android.widget.TextView[@index='1']");//Chat History
	//	By ChatHistorylogo=By.xpath("//com.gyanmatrix.loany:id/navList[@index='1']/android.widget.RelativeLayout[@index='2']/android.widget.TextView[@index='0']");		
	//	By EMICalculatortitel=By.xpath("//com.gyanmatrix.loany:id/navList[@index='1']/android.widget.RelativeLayout[@index='3']/android.widget.TextView[@index='1']");//EMI Calculator
	//	By EMICalculatorlogo=By.xpath("//com.gyanmatrix.loany:id/navList[@index='1']/android.widget.RelativeLayout[@index='3']/android.widget.TextView[@index='0']");
	//	By Helptitel=By.xpath("//com.gyanmatrix.loany:id/navList[@index='1']/android.widget.RelativeLayout[@index='4']/android.widget.TextView[@index='1']");//Help
	//	By Helplogo=By.xpath("//com.gyanmatrix.loany:id/navList[@index='1']/android.widget.RelativeLayout[@index='4']/android.widget.TextView[@index='0']");
	//	By Settingstitel=By.xpath("//com.gyanmatrix.loany:id/navList[@index='1']/android.widget.RelativeLayout[@index='5']/android.widget.TextView[@index='1']");//Settings
	//	By Settingslogo=By.xpath("//com.gyanmatrix.loany:id/navList[@index='1']/android.widget.RelativeLayout[@index='5']/android.widget.TextView[@index='0']");
	//
	//
	//	//Common Element 
	//
	//	public boolean isSkipButtonShowingText(String info){
	//		try{
	//			return driver.findElement(SkipButton).getText().equals(info);
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean isSkipButtonDisplaying(){
	//		try{
	//			return driver.findElement(SkipButton).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean isNextButtonDisplaying(){
	//		try{
	//			return driver.findElement(NextButton).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean clickOnSrcNextButton(){ 
	//		try{ 
	//			driver.findElement(NextButton).click(); 
	//			return true;
	//		}catch(NoSuchElementException e){ 	
	//			return false;
	//		} 
	//	} 
	//	//First Screen 
	//
	//	public boolean isLoanylogoDisplaying(){
	//		try{
	//			return driver.findElement(Loanylogo).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean isFirstScreenSkipButtonShowingText(String info){
	//		try{
	//			return driver.findElement(SkipButton).getText().equals(info);
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean isFirstScreenSkipButtonDisplaying(){
	//		try{
	//			return driver.findElement(SkipButton).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean isFirstScreenNextButtonDisplaying(){
	//		try{
	//			return driver.findElement(NextButton).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean clickOn1stSrcNextButton(){ 
	//		try{ 
	//			 driver.findElement(NextFirstSrc).click(); 
	//			return true;
	//		}catch(NoSuchElementException e){ 	
	//			return false;
	//		} 
	//	} 
	//
	//
	//	//Second Screen Methods 
	//
	//	public boolean isHeaderInfoDisplaying(){
	//		try{
	//			return driver.findElement(Header2ndsrc).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean isHeaderInfoShowingText(String info){
	//		try{
	//			return driver.findElement(Header2ndsrc).getText().equals(info);
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsSubHeadingInfoDisplaying(){
	//		try{
	//			return driver.findElement(PageInfo2ndsrc).isDisplayed();			
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean IsSubHeadingInfoShowingText(String Info){
	//		try{
	//			return driver.findElement(PageInfo2ndsrc).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean IsMobileLogoDisplaying(){
	//		try{
	//			return driver.findElement(Mobilelogo2ndsrc).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsSkipButtonInSecondScreenShowing(){
	//		try{
	//			return driver.findElement(SkipButton2ndsrc).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsNextButtonInSecondScreenShowing(){
	//		try{
	//			return driver.findElement(NextBbutton2ndsrc).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public void clickOn2ndSrcNextButton(){ 
	//		try{ 
	//			driver.findElement(NextButton).click(); 
	//		}catch(NoSuchElementException e){ 		
	//		} 
	//	} 
	//	//Third Welocome Screen 
	//
	//
	//	public boolean isHeaderInfoDisplayingOnThirdWelcomeScreen(){
	//		try{
	//			return driver.findElement(Header3rdsrc).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean isHeaderInfoShowingTextOnThirdWelcomeScreen(String Header){
	//		try{
	//			return driver.findElement(Header3rdsrc).getText().equals(Header);
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsSubHeadingInfoDisplayingOn3rdScreen(){
	//		try{
	//			return driver.findElement(PageInfo3rdsrc).isDisplayed();			
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean IsSubHeadingInfoOnThirdScreenShowingText(String Info){
	//		try{
	//			return driver.findElement(PageInfo3rdsrc).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean IsMobileLogoDisplayingOnThirdScreen(){
	//		try{
	//			return driver.findElement(Mobilelogo3rdsrc).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsSkipButtonInThirdScreenShowing(){
	//		try{
	//			return driver.findElement(SkipButton3rdsrc).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsNextButtonInThirdScreenShowing(){
	//		try{
	//			return driver.findElement(NextBbutton3rdsrc).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public void clickOn3rdSrcNextButton(){ 
	//		try{ 
	//			driver.findElement(NextButton).click(); 
	//		}catch(NoSuchElementException e){ 		
	//		} 
	//	}
	//
	//	//Fourth Welcome Screen 
	//
	//
	//
	//	public boolean IsHeaderFourthScreenShowing(String Info){
	//		try{
	//			return driver.findElement(Header4thsrc).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean IsSubHeadingOfFourthScreenShowing(String Info){
	//		try{
	//			return driver.findElement(PageInfo4thsrc).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//	public boolean IsMobileLogoOfFourthScreenShowing(){
	//		try{
	//			return driver.findElement(Mobilelogo4thsrc).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsSkipButtonOf4thScreenShowing(String Info){
	//		try{
	//			return driver.findElement(SkipButton4thsrc).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	} 
	//
	//	public boolean IsNextButtonOf4thScreenShowing(){
	//		try{
	//			return driver.findElement(NextBbutton4thsrc).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public void clickOn4rthSrcNextButton(){ 
	//		try{ 
	//			driver.findElement(NextButton).click(); 
	//		}catch(NoSuchElementException e){ 		
	//		} 
	//	}
	//
	//	//Fifth Welcome Screen 
	//
	//	public boolean IsHeaderFifthScreenShowingText(String Info){
	//		try{
	//			return driver.findElement(Header5thsrc).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean IsSubHeadingOfFifthScreenShowingText(String Info){
	//		try{
	//			return driver.findElement(PageInfo5thsrc).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//	public boolean IsMobileLogoOfFifthScreenShowing(){
	//		try{
	//			return driver.findElement(Mobilelogo5thsrc).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsTermsAndConditionLinkShowingText(String Info){
	//		try{
	//			return driver.findElement(Termsandcondition).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean IsSkipButtonOf5thScreenShowingText(String Info){
	//		try{
	//			return driver.findElement(SkipButton5thsrc).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	} 
	//
	//	public boolean IsDoneButtonOf5thScreenShowing(){
	//		try{
	//			return driver.findElement(Donebutton5thsrc).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsDoneButtonclicking(){
	//    try{
	//		driver.findElement(Donebutton5thsrc).click();
	//        return true;
	//	}catch(NoSuchElementException e){
	//	return false;	
	//	}
	//	}
	//
	//	//Mobile Number Screen 
	//
	//
	//	public boolean IsMobileNumberScreenHeaderShowingText(String Info){
	//		try{
	//			return driver.findElement(HeaderMobNumScreen).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	} 
	//
	//	public boolean IsMobileNumberScreenSubHeaderShowingText(String Info){
	//		try{
	//			return driver.findElement(PageInfo).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean IsGlobeIconShowing(){
	//		try{
	//			return driver.findElement(GlobeSymbol).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//	public boolean IsIndianFlagShowing(){
	//		try{
	//			return driver.findElement(Flag).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsCountryCodeShowingText(String Info){
	//		try{
	//			return driver.findElement(CountryCode).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean IsPhoneRecieverIconShowingWithMobileNumberTextField(){
	//		try{
	//			return driver.findElement(MobileSymbol).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsMobileNumberFieldShowingText(String Info){
	//		try{
	//			return driver.findElement(MobileNumTxtFld).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean EnterMobileNumber(String randomphnno){
	//		try{
	//			driver.findElement(MobileNumTxtFld).sendKeys(randomphnno);
	//			return true;
	//		}catch(NoSuchElementException e){
	//return false;
	//		}
	//
	//	}
	//
	//	public boolean IsAfterenteringMobileNumberShowingDoneButtonWithText(String Info){
	//		try{
	//			return driver.findElement(SkipButton5thsrc).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//
	//	public boolean Donebuttonmobilenosrc(){
	//		try{
	//			driver.findElement(DoneButton).click();
	//			return true;
	//		}catch(NoSuchElementException e){
	//         return false;
	//		}
	//		}
	//	
	//	
	//	//Verify PIN Number Screen 
	//
	//	public boolean IsVerifyButtonNumberScreenHeaderShowingText(String Info){
	//		try{
	//			return driver.findElement(HeaderVrfyPin).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean IsEnteredMobileShowing(){
	//		try{
	//			return driver.findElement(EnteredMobNum).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsYetToReceiveSMSLineShowingText(String Info){
	//		try{
	//			return driver.findElement(MsgYetToRcvSMS).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	//    
	//	//    public boolean IsResendButtonWithTextShowing(String Info){
	//	//  		try{
	//	//  		return driver.findElement(PINRecvMsg).getText().equals(Info)	;	
	//	//  		}catch(NoSuchElementException e){
	//	//  			return false;
	//	//  		}
	//	//  					
	//	//  	}
	//
	//	public boolean IsMessageForEnteringAlreadyReceivePIN(String Info){
	//		try{
	//			return driver.findElement(PINRecvMsg).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean EnterOTP(String OTP){
	//		try{
	//			  driver.findElement(PINEnterTxtFld).sendKeys(OTP);
	//			  return true;
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//	public boolean IsKeyIconShowingWithPINTextField(){
	//		try{
	//			return driver.findElement(KeySymbol).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//	
	//	
	//	
	//	
	//	public boolean IsPINTextFieldShowingText(String Info){
	//		try{
	//			return driver.findElement(PINEnterTxtFld).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean IsVerifyButtonWithTextShowing(String Info){
	//		try{
	//			return driver.findElement(VerifyButton).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//	
	//	public boolean IsVerifyButtonclicking(){
	//		try{
	//			 driver.findElement(VerifyButton).click();
	//			 return true;
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	//About Me Screen 
	//
	//	public boolean IsAboutMeScreenShowingHeaderText(String Info){
	//		try{
	//			return driver.findElement(HeaderAbtMe).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean IsAboutMeScreenProfilePicPlaceHolderDisplaying(){
	//		try{
	//			return driver.findElement(Imageplaceholder).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsCamIcontoaddProfilePicDisplaying(){
	//		try{
	//			return driver.findElement(CamButton).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsAboutMeScreenNameFieldShowingText(){
	//		try{
	//			return driver.findElement(YourNameTextField).isDisplayed();	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//	public boolean EnteringName(String Info){
	//		try{
	//			 driver.findElement(YourNameTextField).sendKeys(Info);
	//			 return true;
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//	
	//	public boolean IsWarningForEnteredMobileNumberShowingText(String Info){
	//		try{
	//			return driver.findElement(EnteredNameWarning).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean IsNextButtonOnAboutMescreenDisplaying(String Info){
	//		try{
	//			return driver.findElement(NextButtonAbtMeSrc).getText().equals(Info);
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//	
	//	public boolean IsNextButtonOnAboutMescreenclicking(){
	//		try{
	//			 driver.findElement(NextButtonAbtMeSrc).click();
	//			 return true;
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	//I Need Agents At (Location Screen)
	//
	//
	//	public boolean IsHeaderOnLocationScreenShowingText(String Info){
	//		try{
	//			return driver.findElement(HeaderLocSrc).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean IsLoactionScreenShowingLogo(){
	//		try{
	//			return driver.findElement(LocaLogo).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsLocationScreenShowingMessageToChooseLoaction(String Info){
	//		try{
	//			return driver.findElement(MsgToChooseLoc).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean IsBangaloreRadioButtonDisplaying(){
	//		try{
	//			return driver.findElement(Bangalore).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//	public boolean IsBangaloreRadioButtonClicking(){
	//		try{
	//			 driver.findElement(Bangalore).click();
	//			 return true;
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsOthersRadioButtonForCityDisplaying(){
	//		try{
	//			return driver.findElement(Chennai).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsPreviousButtonOnLocationScreenShowingText(String Info){
	//		try{
	//			return driver.findElement(Previous).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean IsNextButtonOnLocationScreenShowingText(String Info){
	//		try{
	//			return driver.findElement(NextLocSrc).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//	public boolean IsNextButtonOnLocationScreenclicking(){
	//		try{
	//			 driver.findElement(NextLocSrc).click();
	//			 return true;
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	//I Need (Loan Type Selection Screen)
	//
	//	public boolean IsLoanTypeSelectionScreenShowingHeaderText(String Info){
	//		try{
	//			return driver.findElement(HeaderLoanTyp).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean IsFirstTimeSubHeadingLoanTypecannnotbechangedinfutureShowing(String Info){
	//		try{
	//			return driver.findElement(WarningToSelectLoanyTyp).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean SelectHomeLoanType(){
	//		try{
	//			driver.findElement(SelectHomeLoan).click();
	//			return true;
	//		}catch(NoSuchElementException e){
	//			return false;
	//
	//		}
	//	}
	//	public boolean SelectHomelLoanTranseferLoanType(){
	//		try{
	//			driver.findElement(SelectHomeLoanTransfer).click();
	//			return true;
	//		}catch(NoSuchElementException e){
	//			return false;
	//
	//		}
	//	}
	//	public boolean SelectPersonalLoanType(){
	//		try{
	//			driver.findElement(SelectPersonalLoan).click();
	//			return true;
	//		}catch(NoSuchElementException e){
	//			return false;
	//
	//		}
	//	}
	//	public boolean SelectAutomobileLoanType(){
	//		try{
	//			driver.findElement(SelectAutomobileLoan).click();
	//			return true;
	//		}catch(NoSuchElementException e){
	//			return false;
	//
	//		}
	//	}
	//	public boolean SelectMortgageLoanType(){
	//		try{
	//			driver.findElement(SelectMortgageLoan).click();
	//			return true;
	//		}catch(NoSuchElementException e){
	//			return false;
	//
	//		}
	//	}
	//	public boolean SelectBusinessLoanType(){
	//		try{
	//			driver.findElement(SelectBusinessLoan).click();
	//			return true;
	//		}catch(NoSuchElementException e){
	//			return false;
	//
	//		}
	//	}
	//	public boolean SelectCreditLoanType(){
	//		try{
	//			driver.findElement(SelectCreditCard).click();
	//			return true;
	//		}catch(NoSuchElementException e){
	//			return false;
	//
	//		}
	//	}
	//	public boolean IsclickingonLoanTypNxtBtn(){
	//		try{
	//			driver.findElement(Nxtbtn).click();
	//			return true;
	//		}catch(NoSuchElementException e){
	//			return false;
	//
	//		}
	//	}
	//
	//
	//	public boolean WarningMessageOnDialogBoxLoanTypecannnotbechangedinfuture(String Info){
	//		try{
	//			return driver.findElement(ConfirmationDialogmsg).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//	public boolean IsCancelButtonOnWarningDialogBoxDisplaying(){
	//		try{
	//			return driver.findElement(DialogCancel).isDisplayed();
	//
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsOkButtonOnWarningDialogBoxDisplaying(){
	//		try{
	//			return driver.findElement(DialogOK).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//	
	//	public boolean IsOkButtonOnWarningDialogBoxDclicking(){
	//		try{
	//			 driver.findElement(DialogOK).click();
	//			 return true;
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	//Loan Amount Screen 
	//
	//
	//	public boolean InLoanAmountScreenHeaderDiplaying(String Info){
	//		try{
	//			return driver.findElement(HeaderLoanAmtSrc).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean IsLogoOnLoanAmountScreen(){
	//		try{
	//			return driver.findElement(LogoLnAmntSrc).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//
	//	public boolean IsSubHeadingHowmuchmoneydoyouneedShowing(String Info){
	//		try{
	//			return driver.findElement(PgInfo).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//
	//	public boolean LoanAmtSlab1Lto25L(){
	//		try{
	//			driver.findElement(LoanAmtSlab1Lto25L).click();
	//			return true;
	//		}catch(NoSuchElementException e){
	//return false;
	//		}
	//	}
	//
	//	public boolean LoanAmtSlab25Lto50L(){
	//		try{
	//			driver.findElement(LoanAmtSlab25Lto50L).click();
	//			return true;
	//		}catch(NoSuchElementException e){
	//return false;
	//		}
	//	}
	//
	//	public boolean LoanAmtSlab50Lto75L(){
	//		try{
	//			driver.findElement(LoanAmtSlab50Lto75L).click();
	//			return true;
	//		}catch(NoSuchElementException e){
	//return false;
	//		}
	//	}
	//
	//	public boolean LoanAmtSlabupto75L(){
	//		try{
	//			driver.findElement(LoanAmtSlabupto75L).click();
	//			return true;
	//		
	//		}catch(NoSuchElementException e){
	//			return false;
	//
	//		}
	//	}
	//
	//	public boolean IsRupeeIconWithLoanAmountFieldShowing(){
	//		try{
	//			return driver.findElement(RupeeLogo).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsAmountTitelOnLoanAmountTextFieldShowing(String Info){
	//		try{
	//			return driver.findElement(AmountField).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//	public boolean IsPreviousButtonOnLoanAmtSrcDisplaying(String Info){
	//		try{
	//			return driver.findElement(PreviousButtonLoanSrc).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//	public boolean IsNextButtonOnLoanAmountScreen(String Info){
	//		try{
	//			return driver.findElement(NextButtonLoanSrc).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}	
	//	
	//	public boolean IsNextButtonOnLoanAmountScreenclick(){
	//		try{
	//			 driver.findElement(NextButtonLoanSrc).click();
	//			 return true;
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}	
	//
	//	public boolean IsLoaderAfterLoanAmountNextClick(){
	//		try{
	//			return driver.findElement(Loader).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//
	//		}
	//	}
	//
	//	// My profession 
	//
	//
	//	public boolean IsHeaderOnMyProfessionShowing(String Info){
	//		try{
	//			return driver.findElement(HeaderMyProfssn).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}	
	//
	//	public boolean IsProfessionScreenLogoDisplaying(){
	//		try{
	//			return driver.findElement(ProfsnSrcLogo).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsSubHeadingHowdoyouearn(String Info){
	//		try{
	//			return driver.findElement(SubHeading).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}	
	//	
	//	public boolean SalariedRadioButton(String Info){
	//		try{
	//				
	//			driver.findElement(Salaried).click(); 
	//			return driver.findElement(Salaried).getText().equals(Info);
	//			
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//		
	//	}	public boolean BusinessRadioButton(String Info){
	//		try{
	//			driver.findElement(Business).click();
	//			return driver.findElement(Business).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}	public boolean SelfEmployeedRadioButton(String Info){
	//		try{
	//			driver.findElement(SelfEmployed).click();
	//			return driver.findElement(SelfEmployed).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}	public boolean IsPreviousButtonShowingOnProfessionScreen(String Info){
	//		try{
	//			return driver.findElement(PreviousButtonPrfsSrc).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}	public boolean IsNextButtonShowingOnProfessionScreen(String Info){
	//		try{
	//			return driver.findElement(NextButtonPrfSrc).getText().equals(Info)	;	
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//
	//	}
	//	public boolean IsNextButtonClickingOnProfessionScreen(){
	//		try{
	//			 driver.findElement(NextButtonPrfSrc).click();
	//			 return true;
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//		
	//	}
	//	
	//	
	//	
	//	//Monthly Salary Screen
	//
	//	public boolean IsHeaderOnMonthlySalaryScreenShowing(String Info){
	//		try{
	//			return driver.findElement(HeaderMonthlySalarySrc).getText().equals(Info);
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//		
	//	}
	//	public boolean IsLogoOnMothlySalaryScreenShowing(){
	//		try{
	//			return driver.findElement(LogoMonthlySalarySrc).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsSubHeaderOnMonthlySalaryScreenShowing(String Info){
	//		try{
	//			return driver.findElement(SubHeadingMonthlySalarySrc).getText().equals(Info);
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//
	//	public boolean MonthlyIncSlab20Kto50K(String Info){
	//		try{
	//			driver.findElement(MonthlyIncSlab20Kto50K).click();
	//			return driver.findElement(MonthlyIncSlab20Kto50K).getText().equals(Info);
	//
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//	public boolean MonthlyInc50kto2L(String Info){
	//		try{
	//			driver.findElement(MonthlyInc50kto2L).click();
	//			return driver.findElement(MonthlyInc50kto2L).getText().equals(Info);
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean MonthlyInc2Lto5L(String Info){
	//		try{
	//			driver.findElement(MonthlyInc50kto2L).click();
	//			return driver.findElement(MonthlyInc50kto2L).getText().equals(Info);
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//	public boolean MonthlyIncSlabupto5L(String Info){
	//		try{
	//			driver.findElement(MonthlyInc50kto2L).click();
	//			return driver.findElement(MonthlyInc50kto2L).getText().equals(Info);
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsAmountSliderMonthlysalarySrcShowing(){
	//		try{
	//			
	//			return driver.findElement(LogoMonthlySalarySrc).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsRupeeLogoWithMobileSummaryScreenShowing(){
	//		try{
	//			return driver.findElement(RupeeLogoMonthlyslsrySrc).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsAmountFieldShowingAmountTitel (String Info){
	//		try{
	//			return driver.findElement(AmountFieldMnthlySlrySrc).getText().equals(Info);
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsPreviousButtonOnMonthlySalaryScreen(String Info){
	//		try{
	//			return driver.findElement(PreviousButtonLoanSrcMonthlySalarySrc).getText().equals(Info);
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsNextButtonOnMonthlySalaryScreen(String Info){
	//		try{
	//			return driver.findElement(NextButtonLoanSrcMonthlySalarySrc).getText().equals(Info);
	//			
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//	
	//	public boolean IsNextButtonOnMonthlySalaryScreenClicking(){
	//		try{
	//			 driver.findElement(NextButtonLoanSrcMonthlySalarySrc).click();
	//			 return true;
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//	//EMI Screen 
	//
	//
	//
	//	public boolean IsHeaderEMIScreenShowing(String Info){
	//		try{
	//			return driver.findElement(HeaderEMISrc).getText().equals(Info);
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsLogoOfExistingEMIScreenShowing(){
	//		try{
	//			return driver.findElement(LogoexistingEMISrc).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//	public boolean IsSubHeadingOfEMIScreenShowing(String Info){
	//		try{
	//			return driver.findElement(SubheadingEMISrc).getText().equals(Info);
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//	public boolean EMISlab0to5k(){
	//		try{
	//			driver.findElement(EMISlab0to5k).click();
	//			return true;
	//		}catch(NoSuchElementException e){
	//        return false;
	//		}
	//	}
	//	public boolean EMISlab5Kto15k(){
	//		try{
	//			driver.findElement(EMISlab5Kto15k).click();
	//			return true;
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//	public boolean EMISlab15Kto50K(){
	//		try{
	//			driver.findElement(EMISlab15Kto50K).click();
	//			return true;
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean EMISlabupto50L(){
	//		try{
	//			driver.findElement(EMISlab15Kto50K).click();
	//			return true;
	//		}catch(NoSuchElementException e){
	//return false;
	//		}
	//	}
	//
	//	public boolean IsAmountSliderOfEMISrcShowing(){
	//		try{
	//			return driver.findElement(LogoexistingEMISrc).isDisplayed();
	//			
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//
	//
	//	public boolean IsRupeeIconWithEMITextFieldShowing(){
	//		try{
	//			return driver.findElement(RupeeLogoEMISrc).isDisplayed();
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//
	//	public boolean IsAmountFieldEMIScreenShowing(String Info){
	//		try{
	//			return driver.findElement(AmountFieldEMISrc).getText().equals(Info);
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsPreviousButtonOnEMIScreenShowing(String Info){
	//		try{
	//			return driver.findElement(PreviousButtonEMISrc).getText().equals(Info);
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//
	//	public boolean IsDoneButtonOnEMIScreenShowing(String Info){
	//		try{
	//			
	//			return driver.findElement(DoneButtonEMISrc).getText().equals(Info);
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}
	//	
	//	public boolean IsDoneButtonOnEMIScreenclicking(){
	//		try{
	//			 driver.findElement(DoneButtonEMISrc).click();
	//			 return true;
	//		}catch(NoSuchElementException e){
	//			return false;
	//		}
	//	}




}