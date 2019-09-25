package Practise1;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class MainPage extends base{
	
	public static Logger Log = LogManager.getLogger(base.class.getName());
	
	@Test
	
	public void MainPageLoad() throws IOException, InterruptedException
	{
		driver1 = initializedriver();	
		driver1.get("http://www.qaclickacademy.com/practice.php");
		
		driver1.manage().window().maximize();
		
		HomePage hp = new HomePage(driver1);
		
		System.out.println(hp.driver1.getCurrentUrl());
		
		driver1.close();
		
		/*if (driver1.findElement(By.xpath("//div[@style*='position']")).isDisplayed())
		{
			System.out.println(driver1.findElement(By.xpath("//div[@style*='position']")).getText());
			
		}
			
		else
		{*/
		
		//hp.getLogin().click();
		/*driver1.findElement(By.xpath("//input[@id='user_email']")).sendKeys("aaaa");
		Thread.sleep(3000);
		driver1.findElement(By.xpath("//input[@name='commit']")).click();
		Thread.sleep(3000);*/
		
		}		
		
	
	}
	
	


