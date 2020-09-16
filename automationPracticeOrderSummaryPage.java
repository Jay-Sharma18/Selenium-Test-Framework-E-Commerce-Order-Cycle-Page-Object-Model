package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class automationPracticeOrderSummaryPage 
{
	WebDriver driver;
	//confirm order button
	@FindBy(css="button[class='button btn btn-default button-medium'][type='submit']")
	WebElement confirmOrderButton;
	
	public automationPracticeOrderSummaryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//method to click confirm order button
	public void clickConfirmOrderButton()
	{
		confirmOrderButton.click();
	}
	
}
