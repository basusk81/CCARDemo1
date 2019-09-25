package Practise1;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class base {
	

	public static WebDriver driver1;
	public Properties prop;
	
	public WebDriver initializedriver() throws IOException
	{
		Properties prop1 = new Properties();
		FileInputStream fis1 = new FileInputStream("C:\\Users\\preet\\CCARProject\\src\\main\\java\\Practise1\\data1.properties");
		
		prop1.load(fis1);
		prop1.getProperty("browser");
		
		String browsername = prop1.getProperty("browser");
		
		if (browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\workspace\\SeleniumTest\\Lib\\ChromeDriver\\chromedriver.exe");
			driver1 = new ChromeDriver();
			
		}
		
		else if (browsername.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\workspace\\SeleniumTest\\Lib\\GeckoDriver\\geckodriver.exe");
			driver1 = new FirefoxDriver();
		}
		
		driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver1;
		
		
	}

	public void getScreenshot(String result1) throws IOException
	{
		File src1=((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
		System.out.println("BEFORE COPYING SRC");	//FileUtils.copyFile(src1,new File ("C:\\Selenium\\Project1\\Screenshots"+result+"screenshot.png"));
		FileHandler.copy(src1, new File("C://Selenium//screen.png"));
		 driver1.quit();
		
	}

	
	
}





