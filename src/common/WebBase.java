package common;

import org.testng.annotations.DataProvider;

public class WebBase {
	@DataProvider(name="Data Login")
	public String [][] getloginData(){
		String[][] LoginData= {{"Admin", "admin123" },
						  {"ess", "ess123"}};
		return LoginData;
	}

}
