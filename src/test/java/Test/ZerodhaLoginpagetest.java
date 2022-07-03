package Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pojo.Browser1;
import Pom.Forgotpasszero;
import Pom.PinPage;
import Pom.Signupzero;
import Pom.ZerodhaLoginpage;
import Utility.Parameterization;
import Utility.Screenshot;



public class ZerodhaLoginpagetest {
	WebDriver driver;
	@BeforeMethod
	public void open()
	{
		driver=Browser1.openbrowser();
	}
	@Test(priority=1)
	public void loginwithvalidcredentials() throws EncryptedDocumentException, IOException, InterruptedException
	{
		ZerodhaLoginpage zerodhaloginpage= new ZerodhaLoginpage(driver);
		String username = Parameterization.getData( 0, 1);
		String password = Parameterization.getData( 1, 1);
		zerodhaloginpage.enteruserid(username);
		zerodhaloginpage.enterpass(password);
		Screenshot.getscreenshot(driver,"kite");
		zerodhaloginpage.clickonlogin();		
		Thread.sleep(3000);
		PinPage p9=new PinPage(driver);
			String p8=Parameterization.getData(2, 1);
			p9.enterpin(p8, driver);
			p9.clicksubmit();
			}
	@Test(priority=2)
	public void forgotpass() throws InterruptedException, EncryptedDocumentException, IOException
	{
		ZerodhaLoginpage zerodhaloginpage= new ZerodhaLoginpage(driver);
		zerodhaloginpage.forgott();
		Thread.sleep(2000);
		Forgotpasszero forgotpass = new Forgotpasszero(driver);
		String iddd= Parameterization.getData(4, 1);
		forgotpass.userrid(iddd);
		String pan1 = Parameterization.getData(5, 1);
		forgotpass.pan(pan1);
		String mail= Parameterization.getData(6, 1);
		forgotpass.received(mail);
		Thread.sleep(4000);
		Actions obj=new Actions(driver);
		WebElement radio= driver.findElement(By.xpath("//label[@for='radio-31']"));//can do directly by using click() on the element widout mouse actions
		obj.moveToElement(radio);
		obj.click(radio);
		obj.perform();
		
	}
	@Test(priority=3)
	public void signupp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		ZerodhaLoginpage zerodhaloginpage= new ZerodhaLoginpage(driver);
		zerodhaloginpage.signupp();
		Signupzero signupzero = new Signupzero(driver);
		
	ArrayList<String>list = new ArrayList<String>(driver.getWindowHandles());
	list.get(0);
	driver.switchTo().window(list.get(1));
	
	
	String no = Parameterization.getData(3, 1);
	signupzero.mobilenum(no);
	Thread.sleep(3000);
	signupzero.done();
	
	}
	@AfterMethod
	public void closee() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	}
	
	
	
	
	
	
	
	