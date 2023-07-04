package Generic_scripts;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_Generic extends Base_Test
{
	public static String getData(String sh,int r,int c)
	{
		String value=null;
		try
		{
		FileInputStream fis=new FileInputStream("./excel/DDT.xlsx");
	  	Workbook bk = WorkbookFactory.create(fis);
	  	Sheet s = bk.getSheet(sh);	
	  	Row ro = s.getRow(r);
	  	Cell ce = ro.getCell(c);
	  	value=ce.toString();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return value;
		}
		

}
