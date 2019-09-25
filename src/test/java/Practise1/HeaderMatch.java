package Practise1;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class HeaderMatch extends base{
	
	public static Logger Log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void HeaderMatches() throws IOException, InterruptedException
	{
	driver1 = initializedriver();	
	
	Log.info("Driver is Initialzed");
	
	driver1.get("https://www.qaclickacademy.com/practice.php");
	
	driver1.manage().window().maximize();
	
	Thread.sleep(2000);
	
	HomePage hp = new HomePage(driver1);
	
	System.out.println(hp.driver1.getCurrentUrl());

		String nameactual = hp.driver1.findElement(By.xpath("/html/body/h1")).getText();
		System.out.println(nameactual);
		String nameexpected = "Practice Page";
		Assert.assertEquals(nameexpected, nameactual);
		
		System.out.println("TEST3");
		//Log.info("Names are matching");
		driver1.close();
	}
}
