package Generic_scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenShot_Generic extends Base_Test
{
  public static void getphoto(WebDriver driver) throws IOException
  {
	  String photo="./photos/";
	  TakesScreenshot tss=(TakesScreenshot)driver;
	  File src=tss.getScreenshotAs(OutputType.FILE);
	  File dst=new File(photo+".jpeg");
	  FileHandler.copy(src, dst);
  }
}
