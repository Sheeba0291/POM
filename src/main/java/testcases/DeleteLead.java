package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.ProjectSpecificMethods;
import pages.LoginPage;

public class DeleteLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setUp()
	{
		excelFileName = "DeleteLead";
	}
	
	@Test (dataProvider = "create")
	public void runLogin(String userName, String password, String phoneNumber) throws InterruptedException
	{
		LoginPage lp = new LoginPage();
		lp.typeUserName(userName)
		.typePassword(password)
		.clickLogin()
		.verifyHomePage()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickFindLeads()
		.clickPhoneTab()
		.enterPhoneNumber(phoneNumber)
		.clickFindLeadsButton()
		.captureLeadID()
		.clickFirstResult()
		.clickDeleteButton()
		.clickFindLeads()
		.enterCapturedLeadID()
		.clickFindLeadsButton()
		.verifyDeletionMessage();
		
	/*	.enterFirstName(firstName)
		.clickFindLeadsButton()
		.clickFirstResult()
		.clickEditButton()
		.updateCompanyName(companyName)
		.clickUpdate()
		.verifyCompanyName(companyName); */
		
	}

}
