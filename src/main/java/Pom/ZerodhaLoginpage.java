package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginpage {
	
	@FindBy(xpath="//input[@id='userid']")private WebElement username;
	@FindBy(xpath="//input[@id='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;
	
	public ZerodhaLoginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enteruserid(String user)
	{
		username.sendKeys(user);
	}
	public void enterpass(String pass)
	{
		password.sendKeys(pass);
	}
	public void forgott()
	{
		forgot.click();
	}
	public void signupp()
	{
		signup.click();
	}
	
	public void clickonlogin()
	{
		login.click();
	}

}
