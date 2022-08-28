package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateNewLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setUp()
	{
		excelFileName = "CreateNewLead";
	}
	
	@Test (dataProvider = "create")
	public void runLogin(String userName, String password, String companyName, String firstName, String lastName)
	{
		LoginPage lp = new LoginPage();
		lp.typeUserName(userName)
		.typePassword(password)
		.clickLogin()
		.verifyHomePage()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickCreateLead()
		.typeCompanyName(companyName)
		.typeFirstName(firstName)
		.typeLastName(lastName)
		.clickSubmit()
		.verifyFirstName(firstName);
	}

}
