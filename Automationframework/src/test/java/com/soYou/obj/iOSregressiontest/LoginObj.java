package com.soYou.obj.iOSregressiontest;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.cloud.WaitForOption.Timeout;
import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;

public class LoginObj {
	public IOSDriver driver;
	public LoginObj(IOSDriver driver){
		this.driver=driver;
	}
	
	By allMenuTab=By.xpath("//XCUIElementTypeApplication");
	  By allMenu=By.xpath("//XCUIElementTypeOther");
	
	// First Welcome Screen

	By _WelcomeFirstScreenLogo = By.xpath("//XCUIElementTypeApplication[@name=\"soYou\"]//XCUIElementTypeWindow[1]");
	// By FirstSrcHeader=ByAccessibilityId.AccessibilityId("Welcome to soYou");
	By FirstSrcHeader = By.xpath("//XCUIElementTypeApplication[@name=\"soYou\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther//XCUIElementTypeStaticText[@name=\"Welcome to soYou\"]");
	By FirstSrcSubHeader = By.xpath("//XCUIElementTypeOther//XCUIElementTypeStaticText[@name=\"Less Me, more You.\"]");
	  By SecondSrcClk=By.xpath("//XCUIElementTypeApplication[@name=\"soYou\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther[2]");
	 //Second Welcome Screen 
	  
	  By _WelcomeSecondScreenLogo=By.xpath("//XCUIElementTypeApplication[@name=\"soYou\"]//XCUIElementTypeWindow[1]");
	  By SecondSrcHeader=ByAccessibilityId.AccessibilityId("soYou");
	  By SecondSrcSubHeader=ByAccessibilityId.AccessibilityId("At soYou, you cannot post about yourself. Sharing is an act of giving, as it was meant to be.");
	  By ThirdSrcClk=By.xpath("//XCUIElementTypeApplication[@name=\"soYou\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther[3]");
	  
	  // Third Welcome Screen 
	  
	  By _WelcomeThirdScreenLogo=By.xpath("//XCUIElementTypeApplication[@name=\"soYou\"]//XCUIElementTypeWindow[1]");
	  By ThirdSrcHeader=ByAccessibilityId.AccessibilityId("soYou");
	  By ThirdSrcSubHeader=ByAccessibilityId.AccessibilityId("Send photos, videos, articles, songs to your friends, and see what comes back.");
	  By FourthSrcClk=By.xpath("//XCUIElementTypeApplication[@name=\"soYou\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther[4]");
	  
	  //Fourth Welcome Screen 
	  
	  By _WelcomeFourthScreenLogo=By.xpath("/XCUIElementTypeApplication[@name=\"soYou\"]//XCUIElementTypeWindow[1]");
	  By FourthSrcHeader=ByAccessibilityId.AccessibilityId("Canvas");
	  By FourthSrcSubHeader=ByAccessibilityId.AccessibilityId("Decide what to keep on your Public Canvas.");
	  By FifthSrcClk=By.xpath("//XCUIElementTypeApplication[@name=\"soYou\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther[5]");
	  
	  //Fifth Welcome Screen 
	  
	  By _WelcomeFifthScreenLogo=By.xpath("//XCUIElementTypeApplication[@name=\"soYou\"]//XCUIElementTypeWindow[1]");
	  By FifthSrcSubHeader=ByAccessibilityId.AccessibilityId("Let your world describe you.");
	  By GoClk=ByAccessibilityId.AccessibilityId("Go");
	 
	  // Verify Mobile Number Screen
	  
	  By Allowpermission=ByAccessibilityId.AccessibilityId("Allow");
	  By MobSrcHeader=ByAccessibilityId.AccessibilityId("Verify Your Number");
	  By MobSrcSubHeader=ByAccessibilityId.AccessibilityId("soYou will send an SMS to verify your phone number.");
	  //By CountryName=ByAccessibilityId.AccessibilityId("soYou will send an SMS to verify your phone number.");
	 By MobileNumberEnterFld=By.xpath("//XCUIElementTypeApplication[@name=\"soYou\"]//XCUIElementTypeWindow[1]//XCUIElementTypeOther//XCUIElementTypeOther[1]//XCUIElementTypeOther//XCUIElementTypeOther[2]");
	 By SubmitButton=ByAccessibilityId.AccessibilityId("Submit");
	 
	 
	 
	  

	  
	  public boolean isWelcomeFirstScreenLogoDisplay(){
		  try{
		   return driver.findElement(_WelcomeFirstScreenLogo).isDisplayed();
		  }catch(Exception e){
			  return false;
		  }
	  }
	  
	  public boolean isFirstSrcHeaderDisplay(){
		  try{
		   return driver.findElement(FirstSrcHeader).isDisplayed();
		  }catch(Exception e){
			  return false;
		  }
	  }
	  
	  public boolean isFirstSrcSubHeaderDisplay(){
		  try{
		   return driver.findElement(FirstSrcSubHeader).isDisplayed();
		  }catch(Exception e){
			  return false;
			  
		  }
	  }
	

	  public boolean clickOnSecondSrcClk(){
		  try{
			  driver.findElement(SecondSrcClk).click();
		   return true;
		  }catch(Exception e){
			  return false;
			  
		  }
	  }

//	  public boolean isClickDisplay() {
//		 try {
//			return driver.findElement(SecondSrcClk).isDisplayed();
//		 }catch(Exception e) {
//			 return false;
//		 
//	  }
//	  }
//
//	  public void clickagain() {
//		  TouchAction ac=new TouchAction(driver);
//		  ac.longPress(261, 681);
//		  
//	  }
//	  public void clickagain2() {
//		  TouchAction ac=new TouchAction(driver);
//		  WebElement a=driver.findElement(ThirdSrcClk);
//		  ac.press(a, 261, 681);
//		  
//	  }
//	  public void clickagain3() {
//		 // TouchAction ac=new TouchAction(driver);
//		  WebElement a = driver.findElement(FifthSrcClk);
//		  a.click();
//		  
//		  
//	  }
	 
	  public boolean is_WelcomeSecondScreenLogoDisplay(){
		  try{
		   return driver.findElement(_WelcomeSecondScreenLogo).isDisplayed();
		  }catch(Exception e){
			  return false;
		  }
	  }
	  
	  public boolean isSecondSrcHeaderDisplay(){
		  try{
		   return driver.findElement(SecondSrcHeader).isDisplayed();
		  }catch(Exception e){
			  return false;
		  }
	  }
	  
	  public boolean isSecondSrcSubHeaderDisplay(){
		  try{
		   return driver.findElement(SecondSrcSubHeader).isDisplayed();
		  }catch(Exception e){
			  return false;
			  
		  }
	  }
	  
	 

	  public boolean clickOnThirdSrcClk(){
		  try{
		 driver.findElement(ThirdSrcClk).click();
		   return true;
		  }catch(Exception e){
			  return false;
		  }
	  }
	  
	  
	  public boolean is_WelcomeThirdScreenLogoDisplay(){
		  try{
		   return driver.findElement(_WelcomeThirdScreenLogo).isDisplayed();
		  }catch(Exception e){
			  return false;
		  }
	  }
	  
	  public boolean isThirdSrcHeaderDisplay(){
		  try{
		   return driver.findElement(ThirdSrcHeader).isDisplayed();
		  }catch(Exception e){
			  return false;
		  }
	  }
	  
	  public boolean isThirdSrcSubHeaderDisplay(){
		  try{
		   return driver.findElement(ThirdSrcSubHeader).isDisplayed();
		  }catch(Exception e){
			  return false;
			  
		  }
	  }
	  
	 
	  
	  public boolean clickOnFourthSrcClk(){
		  try{
		  driver.findElement(FourthSrcClk).click();
		  return true;
		  }catch(Exception e){
			  return false;
		  }
	  }
	  
	  public boolean is_WelcomeFourthScreenLogoDisplay(){
		  try{
		   return driver.findElement(_WelcomeFourthScreenLogo).isDisplayed();
		  }catch(Exception e){
			  return false;
		  }
	  }
	 
	  
	  public boolean isFourthSrcHeaderDisplay(){
		  try{
		   return driver.findElement(FourthSrcHeader).isDisplayed();
		  }catch(Exception e){
			  return false;
		  }
	  }
	  
	  public boolean isFourthSrcSubHeaderDisplay(){
		  try{
		   return driver.findElement(FourthSrcSubHeader).isDisplayed();
		  }catch(Exception e){
			  return false;
			  
		  }
	  }
	  
	  public boolean clickOnFifthSrcClk(){
		  try {
		  driver.findElement(FifthSrcClk).click();
		  return true;
		  }catch(Exception e) {
			  return false;
		  }
	  }
	  
	
	  public boolean is_WelcomeFifthScreenLogoDisplay(){
		  try{
		   return driver.findElement(_WelcomeFifthScreenLogo).isDisplayed();
		  }catch(Exception e){
			  return false;
		  }
	  }
	  
	  public boolean isFifthSrcSubHeaderDisplay(){
		  try{
		   return driver.findElement(FifthSrcSubHeader).isDisplayed();
		  }catch(Exception e){
			  return false;
		  }
	  }
	
	  public boolean clickOnGoClk(){
		  try{
			    driver.findElement(GoClk).click();
			    return true;
			  }catch(Exception e){
				  return false;
			  }
		  }
	 

	  
	  public boolean IsAllowPermissionAllowing(){
		  try{
			    driver.findElement(Allowpermission).click();
			    return true;
			  }catch(Exception e){
				  return false;
			  }
		  }
	  public boolean IsMobSrcHeaderDisplay(){
		  try{
		   return driver.findElement(MobSrcHeader).isDisplayed();
		  }catch(Exception e){
			  return false;
		  }
	  }
	  public boolean IsMobSrcSubHeaderDisplay(){
		  try{
		   return driver.findElement(MobSrcSubHeader).isDisplayed();
		  }catch(Exception e){
			  return false;
		  }
	  }
	  
	  public boolean EnteringMobNum(String MobNo){
		  try{
			   driver.findElement(MobSrcSubHeader).sendKeys(MobNo);
			   return true;
		    
		  }catch(Exception e){
			  return false;
		  }
		 
	  }		  
   public boolean IsSubmitButtonClicking(){
			  try{
				    driver.findElement(SubmitButton).click();
				    return true;
				  }catch(Exception e){
					  return false;
				  }
			  }
	  
}
	  
	  
	  

