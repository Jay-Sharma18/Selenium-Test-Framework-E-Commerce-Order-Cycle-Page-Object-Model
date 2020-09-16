package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class automationPracticeSignInPage {
	
	WebDriver driver; 
	
	//Sign in button to log into your account or create new account
	@FindBy(linkText="Sign in")
	WebElement SignInButton;
	
	//constructor to initialize driver
	public automationPracticeSignInPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//method to click Sign in Button
	public void clickSignInButton() {
		SignInButton.click();
	}
	
	

}
