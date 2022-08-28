package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.ProjectSpecificMethods;
import pages.LoginPage;

public class EditLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setUp()
	{
		excelFileName = "DeleteLead";
	}
	
	@Test (dataProvider = "create")
	public void runLogin(String userName, String password, String companyName, String firstName) throws InterruptedException
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
		.clickEditButton()
		.updateCompanyName(companyName)
		.clickUpdate()
		.verifyCompanyName(companyName);
				
	}

}
