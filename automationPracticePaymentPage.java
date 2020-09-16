package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class automationPracticePaymentPage 
{
	WebDriver driver;
	//box to hold total price
	@FindBy(id="total_price")
	WebElement priceBox;
	//wire transfer payment button
	@FindBy(css="[class='bankwire'][title='Pay by bank wire']")
	WebElement wireTransferButton;
	
	public automationPracticePaymentPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//method that returns total price
	public float returnFinalprice()
	{
		return Float.parseFloat(priceBox.getText().substring(1));
	}
	
	public void clickWireTransferOption()
	{
		wireTransferButton.click();  
	}
	
}
