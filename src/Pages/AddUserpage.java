package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestCases.AddUserTest;
import common.DriveFactory;

public class AddUserpage {
	@FindBy(id="systemUser_employeeName_empName")
	private WebElement EmpName;
	@FindBy(id="systemUser_userName")
	private WebElement usename;
	@FindBy(id="systemUser_password")
	private WebElement password;
	@FindBy(id="systemUser_confirmPassword")
	private WebElement repassword;
	@FindBy(id="btnSave")
	private WebElement save;
	
	private WebDriverWait wait;
	
	public 	AddUserpage() {
		PageFactory.initElements(DriveFactory.localchrome.get(), this);
		wait=new WebDriverWait(DriveFactory.localchrome.get(), 20);
	}
	
	public AdminPage addusermethod(String emp,String user,String pass,String repass) {
		EmpName.sendKeys(emp);
		usename.sendKeys(user);
		password.sendKeys(pass);
		repassword.sendKeys(repass);
		save.click();
		return new AdminPage().isPageLoaded();
	}
	
	
	public AddUserpage isPageLoaded() {
		wait.until(ExpectedConditions.visibilityOf(EmpName));
		return this;
	}

}

