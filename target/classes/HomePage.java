package Practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage{
	
	public WebDriver driver1;
	
		By signin = By.cssSelector("a[href*='sign in']");
		
		By Radio = By.xpath("//input[@value='radio2']");
		
		By Country = By.xpath("//input[@id='autocomplete']");
		
		By Dropdown = By.xpath("//select[@id='dropdown-class-example']");
	
	public HomePage(WebDriver driver1) {
			this.driver1 = driver1;
		}


	public WebElement getLogin()
	{
		return driver1.findElement(signin);
	}
	public WebElement Radio()
	{
		return driver1.findElement(Radio);
	}

	public WebElement Country()
	{
		return driver1.findElement(Country);
	}
	
	public WebElement Dropdown()
	{
		return driver1.findElement(Dropdown);
	}
	
	
	
	
}
