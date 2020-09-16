package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class automationPracticeOrderConfirmationPage 
{
	
	WebDriver driver;
	//order confirmation message box
	@FindBy(xpath ="//*[@id=\"center_column\"]/div/p/strong")
	WebElement orderConfirmationBox;
	
	public automationPracticeOrderConfirmationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getConfirmation()
	{
		return orderConfirmationBox.getText();
	}
	
}
