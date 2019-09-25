package Practise1;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class PractisePage extends base{
	
	public static Logger Log = LogManager.getLogger(base.class.getName());
	
	@Test
	
	public void MainPageLoad1() throws IOException, InterruptedException
	{
		driver1 = initializedriver();	
		
		Log.info("Driver is Initialzed");
		
		driver1.get("https://www.qaclickacademy.com/practice.php");
		
		driver1.manage().window().maximize();
		
		HomePage hp = new HomePage(driver1);
		
		System.out.println(hp.driver1.getCurrentUrl());
		
		/*if (driver1.findElement(By.xpath("//div[@style*='position']")).isDisplayed())
		{
			System.out.println(driver1.findElement(By.xpath("//div[@style*='position']")).getText());
			
		}
			
		else
		{*/
		System.out.println("TEST1");
		
		//hp.getLogin().click();
		Thread.sleep(5000);
		driver1.close();
		}		
	
	
		
		@Test
		public void MainPageLoad2() throws InterruptedException, IOException
		{
			
		driver1 = initializedriver();	
			
		HomePage hp = new HomePage(driver1);
		driver1.get("https://www.qaclickacademy.com/practice.php");
		driver1.manage().window().maximize();
		
		hp.Radio().click();
		
		Thread.sleep(2000);
		
		hp.Country().sendKeys("India");
		
		Thread.sleep(2000);
		
		hp.Dropdown().click();
		hp.Dropdown().sendKeys(Keys.ARROW_DOWN);
		hp.Dropdown().sendKeys(Keys.ARROW_DOWN);
		hp.Dropdown().sendKeys(Keys.ARROW_DOWN);
		hp.Dropdown().sendKeys(Keys.ARROW_DOWN);
		hp.Dropdown().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		Log.info("All Values Selected");
		
		System.out.println("TEST2");
		
		driver1.close();
		}
		
	
		
		
	}
	



