package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class automationPracticeAddressPage {
	
	WebDriver driver;
	//Comment Box 
	@FindBy(name="message")
	WebElement commentBox;
	//proceed to checkout button
	@FindBy(name ="processAddress")
	WebElement proceedcheckoutButton;
	public automationPracticeAddressPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//method to add delivery note
	public void addComment(String Message)
	{
		commentBox.sendKeys(Message);
	}
	
	//method to click proceed button
	public void pressCheckoutButton()
	{
		proceedcheckoutButton.click();
	}
}
