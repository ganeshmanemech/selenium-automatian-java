package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.LoginPage;
import common.IInvoked;

@Listeners(IInvoked.class)
public class LoginTest {
	@Test
	public void VerifyLoginSuccesfullwithValidUsernamePassword() {
		LoginPage lp=new LoginPage();
		lp.loginMethod("Admin", "admin123")
		.display();	
		
			
	}



	 @Test
	public void VerifyLoginUnSuccesfullwithInvalidUsername() {
		new LoginPage()
			.loginFailedMethod("Admina", "admin123")
			.loginWorning("Invalid credentials");

	
	}


	@Test
	public void VerifyLoginUnSuccesfullwithBlankUserId() {
		 LoginPage lp=new LoginPage();
			lp.loginFailedMethod("", "admin123")
			.loginWorning("Username cannot be empty");
		
	}

}
