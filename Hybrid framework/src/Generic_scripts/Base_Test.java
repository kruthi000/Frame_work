package Generic_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_Constant
{
   protected WebDriver driver;
   @BeforeMethod
   public void openApp()
   {
	   System.setProperty(chrome_key,chrome_value);
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }
   
   
   
   @AfterMethod
   public void closeApp()
   {
	   driver.close();
	   
   }
}
