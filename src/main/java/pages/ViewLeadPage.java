package pages;

import org.openqa.selenium.By;

import baseclass.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	
	public UpdateLeadPage clickEditButton()
	{
		getDriver().findElement(By.xpath("//a[text()='Edit']")).click();
		return new UpdateLeadPage();
	}
	
	public MyLeadsPage clickDeleteButton()
	{
		getDriver().findElement(By.xpath("//a[text()='Delete']")).click();
		return new MyLeadsPage();
	}
	
	public CreateLeadPage clickDuplicateLeadButton()
	{
		getDriver().findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		return new CreateLeadPage();
	}
	
	public void verifyCompanyName(String companyName)
	{
		if (getDriver().findElement(By.id("viewLead_companyName_sp")).getText().contains(companyName))
		{
			System.out.println("Company name is updated as "+companyName);
		}
		else
		{
			System.out.println("Company name NOT is updated");
		}
	}
	
	public void verifyFirstName(String firstName)
	{
		if (getDriver().findElement(By.id("viewLead_firstName_sp")).getText().contains(firstName))
		{
			System.out.println("First name is updated as "+firstName);
		}
		else
		{
			System.out.println("First name NOT is updated");
		}
	}

}
