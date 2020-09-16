package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//A class that returns Firefox or Chrome driver depending upon argument passed and sets System Property accordingly
public class DriverFactory {

	public static WebDriver Open(String browserType)
	{
		if(browserType.equalsIgnoreCase("firefox"))
		{	System.setProperty("webdriver.gecko.driver","C:\\Users\\Jay\\Desktop\\Selenium and Drivers\\geckodriver.exe");
			return new FirefoxDriver();
		}
		else if (browserType.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Jay\\Desktop\\Selenium and Drivers\\chromedriver.exe");
			return new ChromeDriver();
			
		}
		
		else
			{
			return null;
			}
	}
}

