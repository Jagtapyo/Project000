package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class PinPage {
	
	@FindBy(xpath="//input[@type='password']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//a[text()='Forgot 2FA?']")private WebElement lost;
	
 public PinPage(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }
 public void enterpin(String pinn,WebDriver ddriver)
 {	
	 FluentWait<WebDriver> wait= new FluentWait<WebDriver>(ddriver);
	 wait.withTimeout(Duration.ofMillis(50000));//total time of wait
	 wait.pollingEvery(Duration.ofMillis(500));//rechecking time
	 wait.ignoring(Exception.class);//to ignore the exception
	 wait.until(ExpectedConditions.visibilityOf(pin));
	 
	 pin.sendKeys(pinn);
 }
 public void clicksubmit()
 {
	 submit.click();
 }
 public void lostt()
 {
	 lost.click();
 }

}
