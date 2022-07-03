package Test;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pojo.Browser1;
import Pom.Buysellzerodha;
import Pom.PinPage;
import Pom.ZerodhaLoginpage;
import Utility.Parameterization;
import Utility.Screenshot;

public class ZerodhaHometest {
	WebDriver driver;
	@BeforeMethod
	public void open()
	{
		driver=Browser1.openbrowser();
	}
@Test
public void loginn() throws EncryptedDocumentException, IOException, InterruptedException
{
	ZerodhaLoginpage zerodhaloginpage = new ZerodhaLoginpage(driver);
	
	SoftAssert softassert=new SoftAssert();
	String actualtext= driver.getTitle();
	String expectedtext= "Kite - Zerodha's fast and elegant flagship trading platform";
	softassert.assertEquals(actualtext,expectedtext,"Title matched");
	
	String giventext= driver.findElement(By.xpath("//h2[text()='Login to Kite']")).getText();
	String expectedtextvalue= "Login to Kite";
	Assert.assertEquals(giventext, expectedtextvalue,"matched");
	
	String user2=Parameterization.getData(0, 1);
	zerodhaloginpage.enteruserid(user2);
	String pass2 =Parameterization.getData(1, 1);
	zerodhaloginpage.enterpass(pass2);
	zerodhaloginpage.clickonlogin();
	
	PinPage pinpageobj= new PinPage(driver);
	String pin03=Parameterization.getData(2, 1);
	pinpageobj.enterpin(pin03, driver);
	pinpageobj.clicksubmit();
	

	Buysellzerodha buysellobj=new Buysellzerodha(driver);
//	Actions obj3=new Actions(driver);
//	WebElement radio1= driver.findElement(By.xpath("//input[@type='text']"));//can do directly by using click() on the element widout mouse actions
//	obj3.moveToElement(radio1);
//	obj3.click(radio1);
//	obj3.perform();//////////can do widout mouse action also
	String companyy=Parameterization.getData(7, 1);
	buysellobj.hunt(companyy);
	buysellobj.nsee();


	buysellobj.purchase(driver);
	Screenshot.getscreenshot(driver,"buy");
	
	buysellobj.hitbuy(driver);//explicit wait
	
	
	buysellobj.cancel1(driver);
	
	//buysellobj.rejectedbuy();
	

	buysellobj.vend(driver);
	Screenshot.getscreenshot(driver, "sell");
	buysellobj.hitsell(driver);
	buysellobj.sellcancel(driver);
	softassert.assertAll();
}
	@AfterMethod
	public void closewindow() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
}


