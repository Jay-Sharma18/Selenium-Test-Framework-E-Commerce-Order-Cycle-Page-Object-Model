package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class automationPracticeLoginPage 
{	
	WebDriver driver; 
	//constructor to initialize driver
	public automationPracticeLoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//email text field
	@FindBy(id="email")
	WebElement emailBox;
	//password text field
	@FindBy(id="passwd")
	WebElement passwordBox;
	//login button
	@FindBy(id="SubmitLogin")
	WebElement signInButton;
	//method to enter email
	public void enterEmail(String email)
	{
		emailBox.sendKeys(email);
	}

	//method to enter password
	public void enterPassword(String password)
	{
		passwordBox.sendKeys(password);
	}
	//method to click Sign in button
	public void clickSignin()
	{
		signInButton.click();
	}
	
}
