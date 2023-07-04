package Runner_script;

import org.testng.annotations.Test;

import Generic_scripts.Base_Test;
import POM_scripts.POM1;

public class Script1 extends Base_Test
{
   @Test
   public void fb()
   {
	   
	   
	   POM1 p=new POM1(driver);
	   p.passUN("un");
	   p.password("pwd");
	   p.login();
   }
}
	   

