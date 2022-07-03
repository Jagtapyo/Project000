package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotpasszero {
	@FindBy(xpath="(//input[@type='text'])[1]")private WebElement useridd ;
	@FindBy(xpath="(//input[@type='text'])[2]")private WebElement pan;
	@FindBy(xpath="(//input[@type='text'])[3]")private WebElement receive;
	@FindBy(xpath="//label[@for=\"radio-36\"]")private WebElement sms;
	//@FindBy(xpath="")private WebElement phone;
	public Forgotpasszero(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void userrid(String id)
	{
		useridd.sendKeys(id);
	}
	public void pan(String panno)
	{
		pan.sendKeys(panno);
	}
	public void received(String receivee)
	{
		receive.sendKeys(receivee);
	}
	public void smss()
	{
		sms.click();
	}
}
