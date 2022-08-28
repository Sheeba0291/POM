package pages;

import org.openqa.selenium.By;

import baseclass.ProjectSpecificMethods;


public class MyLeadsPage extends ProjectSpecificMethods{

	public CreateLeadPage clickCreateLead()
	{
		getDriver().findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}
	
	public FindLeadsPage clickFindLeads()
	{
		getDriver().findElement(By.xpath("//a[text()='Find Leads']")).click();
		return new FindLeadsPage();
	}
	
	public void clickMergeLeads()
	{
		getDriver().findElement(By.xpath("//a[text()='Merge Leads']")).click();
	}
	
}
