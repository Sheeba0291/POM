package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.ProjectSpecificMethods;
import pages.LoginPage;

public class LoginVerification extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setUp()
	{
		excelFileName = "UserCredentials";
	}
	
	@Test (dataProvider = "create")
	public void runLogin(String userName, String password)
	{
		LoginPage lp = new LoginPage();
		lp.typeUserName(userName)
		.typePassword(password)
		.clickLogin()
		.verifyHomePage();
	}

}
