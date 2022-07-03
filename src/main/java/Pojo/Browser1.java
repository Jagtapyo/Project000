package Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser1 {
	
	public static WebDriver openbrowser()
	{	
		
		System.setProperty("webdriver.chrome.driver", "F:\\Yoclasssjava\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		return driver;
		
	}

}
