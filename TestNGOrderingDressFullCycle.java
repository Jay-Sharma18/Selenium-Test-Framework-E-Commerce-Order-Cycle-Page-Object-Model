package POM_Tests;
/* Test script to order merchandise on an E-commerce website. The merchandise is ordered from a registered account.
   The programs implements Page Object Model. 2 Assert statements are used in the program: first statement verifies
   that amount on Cart Summary Page and Payment page are equal; second statement verifies that merchandise order
   cycle is completed successfully and the confirmation message's verbiage is asserted */

import org.testng.annotations.Test;

import Pages.automationPracticeAccountPage;
import Pages.automationPracticeAddressPage;
import Pages.automationPracticeCartSummaryPage;
import Pages.automationPracticeDressesPage;
import Pages.automationPracticeLoginPage;
import Pages.automationPracticeOrderConfirmationPage;
import Pages.automationPracticeOrderSummaryPage;
import Pages.automationPracticePaymentPage;
import Pages.automationPracticeShippingPage;
import Pages.automationPracticeSignInPage;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class TestNGOrderingDressFullCycle 
{	
	
	WebDriver driver;
	//browser choice
	String browser="chrome";
	//URL of E-commerce website
	String Url="http://automationpractice.com/index.php";
	String email="test.test9@gmail.com";
	String password="robertsmith";
	//instance of Sign in Page class
	automationPracticeSignInPage signIn;
	//instance of Login Page class
	automationPracticeLoginPage login;
	//instance of Page class that has Dresses button
	automationPracticeAccountPage accountPage;
	//instance of Dresses Page class
	automationPracticeDressesPage dressesPage;
	//instance of Cart Summary Page class
	automationPracticeCartSummaryPage cartSummary;
	Float amountCartSummaryPage;
	//instance of Address Page class
	automationPracticeAddressPage address;
	String deliveryMessage="Please deliver at back door";
	//instance of Shipping Page
	automationPracticeShippingPage shipping;
	//instance of payment page
	automationPracticePaymentPage paymentPage;
	//float variable to hold amount on payment page
	Float amountPaymentPage;
	//instance of Order Summary Page
	automationPracticeOrderSummaryPage orderSummary;
	//instance of order confirmation page
	automationPracticeOrderConfirmationPage confirmOrder;
	
	@Test
	public void testFullOrder() 
	{	
		signIn=new automationPracticeSignInPage(driver);
		login = new automationPracticeLoginPage(driver);
		//method to click on Sign In button
		signIn.clickSignInButton();
		//method to enter email 
		login.enterEmail(email);
		//methods to enter password and click login
		login.enterPassword(password);
		login.clickSignin();
		accountPage=new automationPracticeAccountPage(driver);
		//method to click on Dresses button
		accountPage.clickDressesButton();
		dressesPage=new automationPracticeDressesPage(driver);
		//method to add to Cart button for dress 2
		dressesPage.clickaddToCartButton2();
		//method to click proceed to checkout button
		dressesPage.clickProceedToCheckout();
		//instance of Cart Summary Page
		cartSummary=new automationPracticeCartSummaryPage(driver);
		//get amount on cart Summary Page in a float variable for verification later
		amountCartSummaryPage=cartSummary.getTotalAmount();
		//click proceed button to move to next page
		cartSummary.clickProceedButton();
		address=new automationPracticeAddressPage(driver);
		//add delivery comment
		address.addComment(deliveryMessage);
		//click proceed to checkout
		address.pressCheckoutButton();
		shipping=new automationPracticeShippingPage(driver);
		//check the terms and conditions checkbox
		shipping.enableTermsCheckbox();
		//method to proceed to next page
		shipping.proceedCheckoutButton2(); 
		//instance of Payment Page
		paymentPage=new automationPracticePaymentPage(driver);
		//get amount on Payment Page
		amountPaymentPage=paymentPage.returnFinalprice();
		//Test Case: make sure price on Payment Page and Cart summary page is equal
		assertEquals(amountCartSummaryPage,amountPaymentPage); 
		//click wire transfer button
		paymentPage.clickWireTransferOption();
		orderSummary=new automationPracticeOrderSummaryPage(driver);
		//click confirm order button
		orderSummary.clickConfirmOrderButton();
		confirmOrder=new automationPracticeOrderConfirmationPage(driver);
		//Test Case:assert confirmation message from order confirmation page
		assertTrue(confirmOrder.getConfirmation().contains("Your order on My Store is complete"));
	}	
	@BeforeMethod
	public void beforeMethod() 
	{	
		
		driver=utilities.DriverFactory.Open(browser);
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
	}

	@AfterMethod
	public void afterMethod() 
	{
	  driver.close();
	}

}
