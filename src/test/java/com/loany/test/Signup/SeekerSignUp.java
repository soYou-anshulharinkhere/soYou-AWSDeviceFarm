//package com.loany.test.Signup;
//
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//import org.testng.AssertJUnit;
//import org.testng.annotations.Test;
//import org.testng.AssertJUnit;
//import org.testng.annotations.Test;
//import org.testng.AssertJUnit;
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import utility.ExcelReader;
//import com.extentReportManager.ExtentTestManager;
////import com.extentReportManager.ExtentTestManager;
////import com.framework.internal.feature.BrowserInitializer;
//import com.framework.internal.feature.AppInitializer;
//import com.loany.obj.Signup.ObjSeekerSignUp;
//
//import java.io.File;
//import java.io.FileInputStream;
////import java.io.FileNotFoundException;
//
//import org.apache.commons.lang3.RandomStringUtils;
//
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
//import org.openqa.selenium.By;
//
//public class SeekerSignUp extends AppInitializer{
//	private static final String Seekerinitial = "Seeker";
//	//public int indexOfMobileNumber=31;
//	String randomNumbers = RandomStringUtils.randomNumeric(5);
//	String phNo = 49393+randomNumbers;	
//	String randomName = RandomStringUtils.randomAlphabetic(3);
//	String Seekername = Seekerinitial+randomName;
//
//	private XSSFWorkbook wb;
//	private XSSFWorkbook wb2;
//
//	@DataProvider(name="WelcomeSrc")
//	public Object[][] userdetails() throws Exception{
//		Object[][] values=ExcelReader.getTableArray("C://Anshul//Automationframework//Data//Seekerdata1.xlsx","WelcomeScreens");
//		return values;
//	}
//	// 1st Welcome Screen --------------------->
//
//	@Test(priority = 1)
//	public void Welcomescreens() throws IOException, InterruptedException {
//
//		ObjSeekerSignUp a = new ObjSeekerSignUp(getAppiumDriver());		
//		getAppiumDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(2000);
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.isLoanylogoDisplaying(), "Check whether Loany Logo is displaying or not", "Loany Logo is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.isSkipButtonShowingText(SkipBtn), "Check whether first screen SKIP button is Showing Text or not", "SKIP Button Showing Text");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.isNextButtonDisplaying(), "Check whether first screen next button is displaying or not", "FirstScreen Next button is displaying");
//		a.clickOnSrcNextButton();
//
//		//2nd screen test
//
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.isHeaderInfoDisplaying(), "Check whether 2nd screen header displaying or not", "2nd screen header is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.isHeaderInfoShowingText(scndHeaderText), "Check whether 2nd screen header showing text or not", "2nd screen sub header is showing text");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsSubHeadingInfoDisplaying(), "Check whether 2nd screen SubHeadingInfoDisplaying or not", "2nd screen Sub Heading Info Displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsSubHeadingInfoShowingText(scndsubhdnginfo), "Check whether 2nd screen SubHeadingInfoShowingText or not", "2nd screen SubHeadingInfo is ShowingText");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsMobileLogoDisplaying(), "Check whether 2nd screen MobileLogoDisplaying or not", "2nd screen MobileLogo is Displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.isSkipButtonDisplaying(), "Check whether 2nd screen SkipButton Showing or not", "2nd screen SkipButton is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.isSkipButtonShowingText(SkipBtn), "Check whether first screen SKIP button is Showing Text or not", "SKIP Button Showing Text");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.isNextButtonDisplaying(), "Check whether 2nd screen NextButton displaying or not", "2nd screen NextButton is displaying");
//		a.clickOnSrcNextButton();
//
//		//3rd screen test
//
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.isHeaderInfoDisplayingOnThirdWelcomeScreen(), "Check whether 3rd screen header displaying or not", "3rd screen header is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.isHeaderInfoShowingTextOnThirdWelcomeScreen(thrdhdrtxt), "Check whether 3rd screen header showing text or not", "3rd screen sub header is showing text");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsSubHeadingInfoDisplayingOn3rdScreen(), "Check whether 3rd screen SubHeadingInfoDisplaying or not", "3rd screen Sub Heading Info Displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsSubHeadingInfoOnThirdScreenShowingText(thrdsubhdnginfo), "Check whether 3rd screen SubHeadingInfoShowingText or not", "3rd screen SubHeadingInfo is ShowingText");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsMobileLogoDisplayingOnThirdScreen(), "Check whether 3rd screen MobileLogoDisplaying or not", "3rd screen MobileLogo is Displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsSkipButtonInThirdScreenShowing(), "Check whether 3rd screen SkipButton Showing or not", "3rd screen SkipButton is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.isSkipButtonShowingText(SkipBtn), "Check whether first screen SKIP button is Showing Text or not", "SKIP Button Showing Text");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.isNextButtonDisplaying(), "Check whether 3rd screen NextButton displaying or not", "3rd screen NextButton is displaying");
//		a.clickOnSrcNextButton();
//
//		//4th screen test
//
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsHeaderFourthScreenShowing(Hdr4thSrc), "Check whether 4th screen header displaying or not", "4th screen header is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsSubHeadingOfFourthScreenShowing(SubHdrFrthText), "Check whether 4th screen sub header showing text or not", "4th screen sub header is showing text");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsMobileLogoOfFourthScreenShowing(), "Check whether 4th screen mobilelogo is displaying or not", "4th screen mobilelogo Displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.isSkipButtonDisplaying(), "Check whether 4th screen SkipButton Showing or not", "4th screen SkipButton is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.isSkipButtonShowingText(SkipBtn), "Check whether first screen SKIP button is Showing Text or not", "SKIP Button Showing Text");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.isNextButtonDisplaying(), "Check whether 4th screen NextButton displaying or not", "4th screen NextButton is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.clickOnSrcNextButton(), "Check whether 4th screen NextButton clicking or not", "4th screen NextButton is clicking");
//		
//
//
//		//5th Screen test
//
//
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsHeaderFifthScreenShowingText(Hdr5thSrc), "Check whether 5th screen header displaying or not", "5th screen header is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsSubHeadingOfFifthScreenShowingText(Subhdng5thsrc), "Check whether 5th screen sub header showing text or not", "5th screen sub header is showing text");
//		//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsMobileLogoOfFifthScreenShowing(), "Check whether 5th screen mobile logo is displaying or not", " 5th screen mobile logo is displaying");
//		//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.isSkipButtonDisplaying(), "Check whether 5th screen SkipButton Showing or not", "5th screen SkipButton is displaying");
//		//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.isSkipButtonShowingText(SkipBtn), "Check whether 5th screen SKIP button is Showing Text or not", "5th screen SKIP Button Showing Text");
//		//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.isNextButtonDisplaying(), "Check whether 5th screen NextButton displaying or not", "5th screen NextButton is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsDoneButtonclicking(), "Check whether 5th screen sub header showing text or not", "5th screen sub header is showing text");
//	}
//	
//	// Mobile number Screen ---------------------->
//	@DataProvider(name="MobileNoSrc")
//	public Object[][] MobileNoScreen() throws Exception{
//		Object[][] values=ExcelReader.getTableArray("C://Anshul//Automationframework//Data//Seekerdata1.xlsx","MobileNumberScreen");
//		return values;
//	}
//
//
//	@Test(priority = 2,dataProvider="MobileNoSrc")
//	public void mobileNumberScreen(String MobNoHeader,String MobNoSubHeader,String Countrycode,String MobNoField) throws IOException, InterruptedException {
//
//		ObjSeekerSignUp a = new ObjSeekerSignUp(getAppiumDriver());	
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsMobileNumberScreenHeaderShowingText(MobNoHeader), "Check whether mobile no screen number header showing text or not", "Mobile number screen number header is showing text");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsMobileNumberScreenSubHeaderShowingText(MobNoSubHeader), "Check whether mobile number sub header showing text or not", "mobile number sub header is showing text");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsGlobeIconShowing(), "Check whether globe icon is displaying or not", "Globe icon is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsIndianFlagShowing(), "Check whether indian flag is displaying or not", "Indian flag is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsCountryCodeShowingText(Countrycode), "Check whether country code is displaying or not", "Country code is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsPhoneRecieverIconShowingWithMobileNumberTextField(), "Check whether phone reciever icon displaying or not", "Phone reciever icon is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsMobileNumberFieldShowingText(MobNoField), "Check whether mobile number text field showing text or not", "Mobile number text field is showing text");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.EnterMobileNumber(phNo), "Check whether mobile entering or not", "Mobile number entered");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.Donebuttonmobilenosrc(), "Check whether done button clicking or not", "Clicking on done button");
//		Thread.sleep(5000);
//
//
//	}
//	// Verify PIN Screen ---------------------->
//	@DataProvider(name="OTPScreen")
//	public Object[][] OTPScreen() throws Exception{
//		Object[][] values=ExcelReader.getTableArray("C://Anshul//Automationframework//Data//Seekerdata1.xlsx","OTPScreen");
//		return values;
//	}
//	@Test(priority = 3,dataProvider="OTPScreen")
//	public void VerifyPIN(String OTPheader,String Yettorevivemsg,String MsgForEnterAlrdyRcvPIN,String PINTxtField,String VerifyTxt) throws IOException, InterruptedException {
//		ObjSeekerSignUp a = new ObjSeekerSignUp(getAppiumDriver());	
//		Thread.sleep(9000);
//		//verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsVerifyButtonNumberScreenHeaderShowingText(OTPheader), "Check whether OTP screen header showing text or not", " OTP screen header is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsEnteredMobileShowing(), "Check entered mobile number displaying or not", "entered mobile number is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsYetToReceiveSMSLineShowingText(Yettorevivemsg), "Check whether Yet To Receive SMS LineShowing Text or not", "Yet To Receive SMS Line is Showing Text");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsMessageForEnteringAlreadyReceivePIN(MsgForEnterAlrdyRcvPIN), "Check whether Message For Entering Already Receive PIN displaying or not", "Message For Entering Already Receive PIN is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsKeyIconShowingWithPINTextField(), "Check whether Key Icon Showing With PIN Text Field displaying or not", "Key Icon Showing With PIN Text Field is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.EnterOTP("1111"), "Check whether OTP entering or not", "OTP is Entering");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsPINTextFieldShowingText(PINTxtField), "Check whether PIN Text Field Showing Text or not", "PIN Text Field is Showing Text");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsVerifyButtonWithTextShowing(VerifyTxt), "Check whether Verify Button With Text displaying or not", "Verify Button With Text is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsVerifyButtonclicking(), "Check whether Verify Button clicking or not", "Verify Button is clicking");
//		Thread.sleep(5000);
//	}
//
//	//verify About Me Screen------------------>
//	@DataProvider(name="AboutMeSrcn")
//	public Object[][] AboutMeScreen() throws Exception{
//		Object[][] values=ExcelReader.getTableArray("C://Anshul//Automationframework//Data//Seekerdata1.xlsx","AboutMeScreen");
//		return values;
//	}
//
//	@Test(priority = 4,dataProvider="AboutMeSrcn")
//	public void AboutMeScreen(String AbtMeSrcHdr,String NextButtonOnAboutMescreenDisplaying) throws IOException, InterruptedException {
//		ObjSeekerSignUp a = new ObjSeekerSignUp(getAppiumDriver());	
//		Thread.sleep(10000);
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsAboutMeScreenShowingHeaderText(AbtMeSrcHdr), "Check whether About Me Screen Showing Header Text or not", "About Me Screen is Showing Header Text");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsAboutMeScreenProfilePicPlaceHolderDisplaying(), "Check whether About Me Screen Profile Pic PlaceHolder Displaying or not", "About Me Screen Profile Pic PlaceHolder is Displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsCamIcontoaddProfilePicDisplaying(), "Cam Icon to add Profile Pic Displaying or not", "Cam Icon to add Profile Pic is Displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsAboutMeScreenNameFieldShowingText(), "Check Whether About Me ScreenName Field Showing Text or not", "About Me ScreenName Field is Showing Text");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.EnteringName(randomName), "Check Whether About Me ScreenName Field Showing Text or not", "About Me ScreenName Field is Showing Text");
//		//verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsWarningForEnteredMobileNumberShowingText(WrngForEnterdMobNo), "Check whether Warning For Entered Mobile Number Showing Text or not", "Warning For Entered Mobile Number is Showing Text");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsNextButtonOnAboutMescreenDisplaying(NextButtonOnAboutMescreenDisplaying), "Check whether Next Button On About Me screen Displaying or not", "Next Button On About Me screen is Displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsNextButtonOnAboutMescreenclicking(), "Check whether Next Button On About Me screen clicking or not", "Next Button On About Me screen is clicking");
//	}
//
////	I Need Agents At (Location Screen)------------------>
//	@DataProvider(name="LocationScreen")
//	public Object[][] LocationSrc() throws Exception{
//		Object[][] values=ExcelReader.getTableArray("C://Anshul//Automationframework//Data//Seekerdata1.xlsx","LocationScreen");
//		return values;
//	}
//
//	@Test(priority = 5,dataProvider="LocationScreen")
//	public void LocationScreen(String LocSrcShwingMsgToChsLoc,String PreviousBtn,String NxtBtnShngTxt) throws IOException {
//
//		ObjSeekerSignUp a = new ObjSeekerSignUp(getAppiumDriver());	
//
//		//verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsHeaderOnLocationScreenShowingText(HdrOnLocSrc), "Check whether Header On Location Screen Showing Text or not", "Header On Location Screen is Showing Text");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsLoactionScreenShowingLogo(), "Check whether Loaction Screen Showing Logo or not", "Loaction Screen is Showing Logo");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsLocationScreenShowingMessageToChooseLoaction(LocSrcShwingMsgToChsLoc), "Check whether Location Screen Showing Message To Choose Location or not", "Location Screen is Showing Message To Choose Location");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsBangaloreRadioButtonDisplaying(), "Check whether Bangalore Radio Button Displaying or not", "Bangalore Radio Button is Displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsBangaloreRadioButtonClicking(), "Check whether Bangalore Radio Button clicking or not", "Bangalore Radio Button is clicking");
//		//verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsOthersRadioButtonForCityDisplaying(), "Check whether Others Radio Button For City Displaying or not", "Others Radio Button For City is Displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsPreviousButtonOnLocationScreenShowingText(PreviousBtn), "Check whether Previous Button On Location Screen Showing Text or not", "Previous Button On Location Screen is Showing Text");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsNextButtonOnLocationScreenShowingText(NxtBtnShngTxt), "Check whether Next Button On Location Screen Showing Text or not", "Next Button On Location Screen is Showing Text");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(), a.IsNextButtonOnLocationScreenclicking(), "Check whether Next Button On Location Screen clicking or not", "Next Button On Location Screen is clicking");
//	}
////I Need (Loan Type Selection Screen)------------------->	 
//
//	@DataProvider(name="LoanTyp")
//	public Object[][] LoanyTyp() throws Exception{
//		Object[][] values=ExcelReader.getTableArray("C://Anshul//Automationframework//Data//Seekerdata1.xlsx","LoanType");
//		return values;
//	}
//
//
//	@Test(priority = 6,dataProvider="LoanTyp")
//	public void LoanType(String WrngMsgToChngLoanTyp) throws IOException, InterruptedException {
//
//		ObjSeekerSignUp a = new ObjSeekerSignUp(getAppiumDriver());
//		//verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsLoanTypeSelectionScreenShowingHeaderText(LoanTypSelectionHdr), "Check whether 5th screen header displaying or not", "5th screen header is displaying");
//		Thread.sleep(2000);
//		//verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsFirstTimeSubHeadingLoanTypecannnotbechangedinfutureShowing(FirstTymWrningTochngTyp), "Check whether First Time SubHeading Loan Type cannnot be changed infuture Showing or not", "First Time SubHeading Loan Type cannnot be changed infuture is Showing");	
//		Thread.sleep(2000);
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.SelectHomeLoanType(), "Check whether Selecting Home Loan Type or not", "Selecting Home Loan Type");	
//		Thread.sleep(2000);
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.SelectHomelLoanTranseferLoanType(), "Check whether loan type  Selecting Home Loan Transefer Loan Type or not", "Selecting Home Loan Transefer Loan Type");	
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.SelectPersonalLoanType(), "Check whether loan type Selecting Personal Loan Type or not", "Selecting Personal Loan Type");	
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.SelectAutomobileLoanType(), "Check whether loan type Selecting Automobile Loan Type or not", "Selecting Automobile Loan Type");	
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.SelectMortgageLoanType(), "Check whether loan type Selecting Mortgage Loan Type or not", "Selecting Mortgage Loan Type");	
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.SelectBusinessLoanType(), "Check whether loan type Selecting Business Loan Type or not", "Selecting Business Loan Type");	
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.SelectCreditLoanType(), "Check whether loan type Selecting Credit Loan Type or not", "loan type is Selecting Credit Loan Type");	
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsclickingonLoanTypNxtBtn(), "Check whether clicking on Loan Typ NxtBtn or not", "clicking on Loan Typ NxtBtn");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.WarningMessageOnDialogBoxLoanTypecannnotbechangedinfuture(WrngMsgToChngLoanTyp), "Check whether Warning Message On Dialog Box LoanType cannnot be changed infuture displaying or not", "Warning Message On Dialog Box LoanType cannnot be changed infuture is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsCancelButtonOnWarningDialogBoxDisplaying(), "Check whether Cancel Button On Warning Dialog Box Displaying or not", "Cancel Button On Warning Dialog Box is Displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsOkButtonOnWarningDialogBoxDisplaying(),"Check whether Ok Button On Warning Dialog Box Displaying or not", "Ok Button On Warning Dialog Box is Displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsOkButtonOnWarningDialogBoxDclicking(),"Check whether Ok Button On Warning Dialog Box Displaying or not", "Ok Button On Warning Dialog Box is Displaying");
//	}
////	//Loan Amount Screen -------------->
//	@DataProvider(name="LoanAmtSrc")
//	public Object[][] LoanAmtSrc() throws Exception{
//		Object[][] values=ExcelReader.getTableArray("C://Anshul//Automationframework//Data//Seekerdata1.xlsx","LoanAmountScreen");
//		return values;
//	}	
//
//	@Test(priority = 7,dataProvider="LoanAmtSrc")
//	public void LoanAmount (String LoanAmountScreenHeaderDiplaying,String SubHeadingHowmuchmoneydoyouneedShowing,String AmountTitelOnLoanAmountTextFieldShowing,String PreviousButtonOnLoanAmtSrcDisplaying,String NextButtonOnLoanAmountScreen) throws IOException {
//
//		ObjSeekerSignUp a = new ObjSeekerSignUp(getAppiumDriver());
//
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.InLoanAmountScreenHeaderDiplaying(LoanAmountScreenHeaderDiplaying), "Check whether Ok Button OnWarning Dialog Box Displaying or not", "Ok Button OnWarning Dialog Box is Displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsLogoOnLoanAmountScreen(),"Check whether Logo On Loan Amount Screen displaying or not","Logo On Loan Amount Screen is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsSubHeadingHowmuchmoneydoyouneedShowing(SubHeadingHowmuchmoneydoyouneedShowing),"Check whether Sub Heading How much money do you need Showing or not","Sub Heading How much money do you need is Showing");
//		//verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.LoanAmtSlab1Lto25L(),"Check whether Loan Amt Slab 1Lto25L clicking or not","Sub Heading How much money do you need is clicking");
////		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.LoanAmtSlab25Lto50L(),"Check whether Loan Amt Slab 25Lto50L clicking or not","Sub Heading How much money do you need is clicking	");
////		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.LoanAmtSlab50Lto75L(),"Check whether Loan Amt Slab 50Lto75L clicking or not","Sub Heading How much money do you need is clicking");
//	//	verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.LoanAmtSlabupto75L(),"Check whether Loan Amt Slab upto75L clicking or not","Loan Amt Slab upto75L is clicking");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsRupeeIconWithLoanAmountFieldShowing(),"Check whether Rupee Icon With Loan Amount Field showing or not","Rupee Icon With Loan Amount Field is showing");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsAmountTitelOnLoanAmountTextFieldShowing(AmountTitelOnLoanAmountTextFieldShowing),"Check whether Amount Titel On Loan Amount Text Field Showing or not","Titel On Loan Amount Text Field is Showing");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsPreviousButtonOnLoanAmtSrcDisplaying(PreviousButtonOnLoanAmtSrcDisplaying),"Check whether Previous Button On Loan Amt Src Displaying or not","Previous Button On Loan Amt Src is Displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsNextButtonOnLoanAmountScreen(NextButtonOnLoanAmountScreen),"Check whether Next Button On Loan Amount Screen displaying or not","Next Button On Loan Amount Screen is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsNextButtonOnLoanAmountScreenclick(),"Check whether Next Button On Loan Amount Screen clicking or not","Next Button On Loan Amount Screen is clicking");
//		//	verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsLoaderAfterLoanAmountNextClick(),"Check whether Loader After Loan Amount Next Click displaying or not","Loader After Loan Amount Next  is displaying");
//	}
////	// Choose Profession Screen-------------> 
//	@DataProvider(name="ProfessionScreen")
//	public Object[][] ProfsnSrc() throws Exception{
//		Object[][] values=ExcelReader.getTableArray("C://Anshul//Automationframework//Data//Seekerdata1.xlsx","ProfessionScreen");
//		return values;
//	}
//
//	@Test(priority = 7,dataProvider="ProfessionScreen")
//	public void ProfessionScreen(String SubHeadingHowdoyouearn,String SalariedRadioBtn,String BusinessRadioBtn,String SelfEmployeedRadioBtn,String PreviousButtonShowingOnProfessionScreen,String NextButtonShowingOnProfessionScreen) throws IOException {
//
//		ObjSeekerSignUp a = new ObjSeekerSignUp(getAppiumDriver());
//
//		//verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsHeaderOnMyProfessionShowing(HeaderOnMyProfessionShowing),"Check whether Header On My Profession Showing or not","Header On My Profession is Showing");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsProfessionScreenLogoDisplaying(),"Check whether Profession Screen Logo Displaying or not","Profession Screen Logo is Displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsSubHeadingHowdoyouearn(SubHeadingHowdoyouearn),"Check whether Sub Heading How do you earn displaying or not","Sub Heading How do you earn is displaying ");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.SalariedRadioButton(SalariedRadioBtn),"Check whether Salaried Radio Button displaying and clicking or not","Salaried Radio Button is displaying and clicking");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.BusinessRadioButton(BusinessRadioBtn),"Check whether Business Radio Button displaying and clicking or not"," Business Radio Button is displaying and clicking");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.SelfEmployeedRadioButton(SelfEmployeedRadioBtn),"Check whether Self Employeed Radio Button displaying and clicking or not","Self Employeed Radio Button is displaying and clicking");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsPreviousButtonShowingOnProfessionScreen(PreviousButtonShowingOnProfessionScreen),"Check whether Previous Button Showing On Profession Screen or not","Previous Button is Showing On Profession Screen");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsNextButtonShowingOnProfessionScreen(NextButtonShowingOnProfessionScreen),"Check whether Next Button Showing On Profession Screen or not","Next Button is Showing On Profession Screen");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsNextButtonClickingOnProfessionScreen(),"Check whether Next Button clicking On Profession Screen or not","Next Button is clicking On Profession Screen");
//	}
//	
//	
//
//	// //Monthly Salary Screen --------------------->
//	@DataProvider(name="MonthlySalarySrc")
//	public Object[][] MonthlySrc() throws Exception{
//		Object[][] values=ExcelReader.getTableArray("C://Anshul//Automationframework//Data//Seekerdata1.xlsx","MonthlySlary");
//		return values;
//	}
//
//	@Test(priority = 8,dataProvider="MonthlySalarySrc")
//	public void MonthlySalarySrc(String HeaderOnMonthlySalaryScreenShowing,String SubHeaderOnMonthlySalaryScreenShowing,String AmountFieldShowingAmountTitel,String PreviousButtonOnMonthlySalaryScreen,String NextButtonOnMonthlySalaryScreen) throws IOException {
//
//		ObjSeekerSignUp a = new ObjSeekerSignUp(getAppiumDriver());
//
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsHeaderOnMonthlySalaryScreenShowing(HeaderOnMonthlySalaryScreenShowing),"Check whether Header On Monthly Salary Screen Showing or not","Header On Monthly Salary Screen is Showing");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsLogoOnMothlySalaryScreenShowing(),"Check whether Logo On Mothly Salary Screen Showing  or not","Logo On Mothly Salary Screen is Showing");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsSubHeaderOnMonthlySalaryScreenShowing(SubHeaderOnMonthlySalaryScreenShowing),"Check whether Sub Header On Monthly Salary Screen Showing or not","Sub Header On Monthly Salary Screen is Showing");
////		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.MonthlyIncSlab20Kto50K(MnthyIncSlab20Kto50K),"Check whether Monthly Inc Slab 20Kto50K showing or not","Monthly Inc Slab 20Kto50K is showing");
////		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.MonthlyInc50kto2L(MnthlyInc50kto2L),"Check whether Monthly Inc 50kto2L showing or not","Monthly Inc 50kto2L is showing");
////		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.MonthlyInc2Lto5L(MnthlyInc2Lto5L),"Check whether Monthly Inc 2Lto5L showing or not","Monthly Inc 2Lto5L is showing");
////		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.MonthlyIncSlabupto5L(MnthlyIncSlabupto5L),"Check whether Monthly Inc Slab upto5L showing or not","Monthly Inc Slab upto5L is showing");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsAmountSliderMonthlysalarySrcShowing(),"Check whether Amount Slider Monthly salary Src Showing or not","Amount Slider Monthly in salary Src is Showing");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsRupeeLogoWithMobileSummaryScreenShowing(),"Check whether Rupee Logo With Mobile Summary Screen Showing or not","Rupee Logo With Mobile Summary Screen is Showing");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsAmountFieldShowingAmountTitel(AmountFieldShowingAmountTitel),"Check whether Amount Field Showing Amount Titel or not","Amount Field is Showing Amount Titel");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsPreviousButtonOnMonthlySalaryScreen(PreviousButtonOnMonthlySalaryScreen),"Check whether Previous Button On Monthly Salary Screen Showing or not","Previous Button On Monthly Salary Screen is Showing");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsNextButtonOnMonthlySalaryScreen(NextButtonOnMonthlySalaryScreen),"Check whether Next Button On Monthly Salary Screen displaying or not","Next Button On Monthly Salary Screen is displaying");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsNextButtonOnMonthlySalaryScreenClicking(),"Check whether Next Button On Monthly Salary Screen clicking or not","Next Button On Monthly Salary Screen is clicking");
//	}
// //EMI screen ---------->
//	@DataProvider(name="EMISrc")
//	public Object[][] EMIsrc() throws Exception{
//		Object[][] values=ExcelReader.getTableArray("C://Anshul//Automationframework//Data//Seekerdata1.xlsx","EMIScreen");
//		return values;
//	}
//
//	@Test(priority = 9, dataProvider="EMISrc")
//	public void EMIScreen(String HeaderEMIScreenShowing,String SubHeadingOfEMIScreenShowing,String AmountFieldEMIScreenShowing,String PreviousButtonOnEMIScreenShowing,String DoneButtonOnEMIScreenShowing) throws IOException, InterruptedException {
//
//		ObjSeekerSignUp a = new ObjSeekerSignUp(getAppiumDriver()); 
//
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsHeaderEMIScreenShowing(HeaderEMIScreenShowing),"Check whether Header EMI Screen Showing or not","Header EMI Screen is Showing");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsLogoOfExistingEMIScreenShowing(),"Check whether Logo Of Existing EMI Screen Showing or not","Logo Of Existing EMI Screen is Showing");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsSubHeadingOfEMIScreenShowing(SubHeadingOfEMIScreenShowing),"Check whether SubHeading Of EMI Screen Showing or not","SubHeading Of EMI Screen is Showing");
//		//verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.EMISlab0to5k(),"Check whether EMI Slab 0to5k clicking or not","EMI Slab 0to5k clicking");
//	
////		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.EMISlab5Kto15k(),"Check whether EMI Slab 5Kto15k clicking or not","EMI Slab 5Kto15k is clicking");
////		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.EMISlab15Kto50K(),"Check whether EMI Slab 15Kto50K clicking or not","EMI Slab 15Kto50K is clicking");
////		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.EMISlabupto50L(),"Check whether EMI Slab upto 50L Clicking or not","EMI Slab upto 50L is Clicking");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsAmountSliderOfEMISrcShowing(),"Check whether Amount Slider Of EMI Src Showing or not","Amount Slider Of EMI Src is Showing");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsRupeeIconWithEMITextFieldShowing(),"Check whether Rupee Icon With EMI Text Field Showing or not","Rupee Icon With EMI Text Field is Showing");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsAmountFieldEMIScreenShowing(AmountFieldEMIScreenShowing),"Check whether Amount Field EMI Screen Showing or not","Amount Field EMI Screen is Showing");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsPreviousButtonOnEMIScreenShowing(PreviousButtonOnEMIScreenShowing),"Check whether Previous Button On EMI Screen Showing or not","Previous Button On EMI Screen is Showing");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsDoneButtonOnEMIScreenShowing(DoneButtonOnEMIScreenShowing),"Check whether Done Button On EMI Screen Showing or not","Done Button On EMI Screen Showing");
//		verifyTrue(ExtentTestManager.getTest(),getAppiumDriver(),a.IsDoneButtonOnEMIScreenclicking(),"Check whether Done Button On EMI Screen clicking or not","Done Button On EMI Screen clicking");
//	
//	}
//}
//	}
//
