package POM_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 
{
	@FindBy(id="email")
	private WebElement unField;
	
	@FindBy(id="pass")
	private WebElement PwdField;
	
	@FindBy(name="login")
	private WebElement loginBtn;
	
	public POM1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void passUN(String un)
	{
		unField.sendKeys(un);
	}
	public void password(String pwd) 
	{
		PwdField.sendKeys(pwd);
	}
    public void login()
    {
    	loginBtn.click();
    }
}
