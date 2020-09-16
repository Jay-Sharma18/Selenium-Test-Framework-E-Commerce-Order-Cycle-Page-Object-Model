package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class automationPracticeShippingPage 
{
	WebDriver driver;
	//terms and conditions checkbox
	@FindBy(id="cgv")
	WebElement termsCheckbox;
	//proceed to checkout button
	@FindBy(name="processCarrier")
	WebElement proceedButton2;
	public automationPracticeShippingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//method to check terms and conditions checkbox
	public void enableTermsCheckbox()
	{
		termsCheckbox.click();
	}
	
	//method to click proceed to checkout button
	public void proceedCheckoutButton2()
	{
		proceedButton2.click();
	}
}
