package Test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerss implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+"Test Started");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(result.getName()+"Test success");
	}
	
}
