package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class automationPracticeCartSummaryPage 
{
	WebDriver driver;
	//box holding total amount
	@FindBy(id="total_price")
	WebElement amountBox;
	@FindBy(css = "a[class='button btn btn-default standard-checkout button-medium'][title='Proceed to checkout']")
	WebElement proceedButton;
	public automationPracticeCartSummaryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//return total amount from cart summary page
	public float getTotalAmount()
	{	
		return Float.parseFloat(amountBox.getText().substring(1));
	}
	
	//click proceed button
	public void clickProceedButton()
	{
		proceedButton.click();
	}
	
	
}
