package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.ProjectSpecificMethods;
import pages.LoginPage;

public class DuplicateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setUp()
	{
		excelFileName = "DuplicateLead";
	}
	
	@Test (dataProvider = "create")
	public void runLogin(String userName, String password, String firstName) throws InterruptedException
	{
		LoginPage lp = new LoginPage();
		lp.typeUserName(userName)
		.typePassword(password)
		.clickLogin()
		.verifyHomePage()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickFindLeads()
		.enterFirstName(firstName)
		.clickFindLeadsButton()
		.clickFirstResult()
		.clickDuplicateLeadButton()
		.clickSubmit()
		.verifyFirstName(firstName);
				
	}

}
