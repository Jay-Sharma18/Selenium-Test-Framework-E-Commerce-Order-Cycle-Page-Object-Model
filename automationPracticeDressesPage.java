package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class automationPracticeDressesPage {
	
	WebDriver driver;
	
	//add to cart button for 2nd dress
	@FindBy(css = "a[title='Add to cart'][data-id-product='4']")
	WebElement addToCartButton2; 
	//Web Element to hover over, before selecting merchandise
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")
	WebElement dressImage;
	//Proceed to checkout buttton after merchandise selection
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div/div[2]/div[4]/a")
	WebElement CheckoutButton;
	
	public automationPracticeDressesPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//method to click add to cart button for dress number 2 after hovering over it
	public void clickaddToCartButton2()
	{	
		Actions action=new Actions(driver);
		action.moveToElement(dressImage).perform();
		addToCartButton2.click();
	}
	
	//method to proceed to checkout once dress is selected
	public void clickProceedToCheckout() 
	{
		CheckoutButton.click();
	}

}
