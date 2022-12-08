package common;

import org.openqa.selenium.WebDriver;

public class DriveFactory {
	
//	public WebDriver chrome;
	public static ThreadLocal<WebDriver>localchrome=new ThreadLocal<>();

}
