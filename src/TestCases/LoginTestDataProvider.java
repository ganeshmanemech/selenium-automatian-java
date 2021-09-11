package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.LoginPage;
import common.IInvoked;
import common.WebBase;

@Listeners(IInvoked.class)
public class LoginTestDataProvider extends WebBase {
	@Test(dataProvider="Data Login")
	public void vrifyLoginSucessful(String userid, String password) {
		
		LoginPage lp=new LoginPage();
		lp.loginMethod(userid, password);
	}
	

}
