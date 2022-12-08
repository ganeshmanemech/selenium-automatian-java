package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvoked implements IInvokedMethodListener {

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		DriveFactory.localchrome
.get()
.quit();

	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumJava\\chromedriver.exe");
		DriveFactory.localchrome.set(new ChromeDriver());
		DriveFactory.localchrome.get().manage().window().maximize();
		DriveFactory.localchrome.get().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		DriveFactory.localchrome.get().get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		

	}
	
	
	

}
