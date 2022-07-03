package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signupzero {
	
	@FindBy(xpath="//input[@id='user_mobile']")private WebElement mobile;
	@FindBy(xpath="//button[@id='open_account_proceed_form']")private WebElement continuee;
	@FindBy(xpath="//a[text()='Want to open an NRI account?']")private WebElement nri;
	
	
	
	public Signupzero(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void mobilenum(String numm)
	{
		mobile.sendKeys(numm);
	}
	public void done()
	{
		continuee.click();
	}
	public void accountnri()
	{
		nri.click();
	}
	
}
