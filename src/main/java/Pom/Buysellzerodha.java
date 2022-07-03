package Pom;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buysellzerodha {
	
	@FindBy(xpath="//input[@type='text']")private WebElement searchh;
	@FindBy(xpath="//button[@class='button-blue buy']")private WebElement buy;
	@FindBy(xpath="//button[@class='button-orange sell']")private WebElement sell;
	@FindBy(xpath="//span[text()='TATAMOTORS']")private WebElement nse;
	@FindBy(xpath="(//span[text()='Buy'])[2]")private WebElement clickbuy;
	@FindBy(xpath="//span[@class='icon icon-times close']")private WebElement closerejectedbuy;
	
	@FindBy(xpath="//button[@class='button-outline cancel']")private WebElement cancelbuy;
	@FindBy(xpath="(//span[text()='Sell'])[2]") private WebElement clicksell;
	@FindBy(xpath="//button[@class='button-outline cancel']")private WebElement cancelsell;
	
	
	
	public Buysellzerodha(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void hunt(String look)
	{
		searchh.click();
		searchh.sendKeys(look);
	}
	public void nsee()
	{
		nse.click();
	
	}
	public void purchase(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(4000));//explicit wait
		wait.until(ExpectedConditions.visibilityOf(buy));
		Actions obj3=new Actions(driver);
		WebElement radiobuy1= driver.findElement(By.xpath("//span[text()='TATAMOTORS']"));//can do directly by using click() on the element widout mouse actions
		obj3.moveToElement(radiobuy1);
		obj3.click(radiobuy1);
		obj3.perform();
		buy.click();
	}
	public void vend(WebDriver driver)
	{
		Actions obj4=new Actions(driver);
	WebElement radiosell1= driver.findElement(By.xpath("//span[text()='TATAMOTORS']"));//can do directly by using click() on the element widout mouse actions
	obj4.moveToElement(radiosell1);
		obj4.click(radiosell1);
		obj4.perform();	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(4000));//explicit wait
		wait.until(ExpectedConditions.visibilityOf(sell));//will always recheck within 500ms
	
		sell.click();
	}
	public void hitbuy(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(4000));//explicit wait
	wait.until(ExpectedConditions.visibilityOf(clickbuy));//will always recheck within 500ms
		clickbuy.click();
	}
//	public void rejectedbuy()
//	{
//		closerejectedbuy.click();
//	}
	
	public void cancel1(WebDriver driver)
	{
		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(50000));//total time of wait
		 wait.pollingEvery(Duration.ofMillis(5000));//rechecking time
		 wait.ignoring(Exception.class);//to ignore the exception
		 wait.until(ExpectedConditions.visibilityOf(cancelbuy));
		cancelbuy.click();
	}
	public void hitsell(WebDriver driver)
	{ 
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(4000));//explicit wait
		wait.until(ExpectedConditions.visibilityOf(clicksell));
		clicksell.click();
	}
	public void sellcancel(WebDriver driver)
	{
		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(50000));//total time of wait
		 wait.pollingEvery(Duration.ofMillis(5000));//rechecking time
		 wait.ignoring(Exception.class);//to ignore the exception
		 wait.until(ExpectedConditions.visibilityOf(cancelsell));
		cancelsell.click();
	}
	
}
