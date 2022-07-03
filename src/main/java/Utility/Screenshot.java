package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	 public static String getscreenshot(WebDriver driver,String name) throws IOException {
		 	DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");
		 	LocalDateTime currenttime= LocalDateTime.now();
		 	String d= dft.format(currenttime);
			File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File Destination= new File("F:\\Yoclasssjava\\maven1\\screenshots\\" +d + name +".jpeg");
			FileHandler.copy(source, Destination);
			return d;

}
}
