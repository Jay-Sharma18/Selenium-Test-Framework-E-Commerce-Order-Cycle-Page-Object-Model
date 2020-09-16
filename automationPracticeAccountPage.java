package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class automationPracticeAccountPage 
{
	WebDriver driver;
	
	//Text displayed when user successfully logs in
	@FindBy(xpath ="//*[@id=\"center_column\"]/p")
	WebElement welcomeText;
	
	//Dresses Button
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]")
	WebElement dressesButton;
	
	public automationPracticeAccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//method to return true if user successfully logs in. otherwise return false
	public boolean logInSuccessful()
	{	
		if(welcomeText.getText().toLowerCase().contains("welcome")) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	//method to click Dresses Button to open merchandise selection
	public void clickDressesButton()
	{
		dressesButton.click();
	}
	

}
