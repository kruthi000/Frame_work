package Runner_script;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import Generic_scripts.Base_Test;
import Generic_scripts.DDT_Generic;
import POM_scripts.POM1;

public class Excel_runner extends  Base_Test
{
  @Test
  public void fb() throws EncryptedDocumentException, IOException
  {
	  POM1 p=new POM1(driver);
	  String un = DDT_Generic.getData("Sheet1", 1, 0);
	  p.passUN(un);
	  String pwd = DDT_Generic.getData("Sheet1", 1, 1);
	  p.passUN(pwd);
	  p.login();
  }
}
