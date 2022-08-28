package pages;

import org.openqa.selenium.By;

import baseclass.ProjectSpecificMethods;

public class UpdateLeadPage extends ProjectSpecificMethods{

	public UpdateLeadPage updateCompanyName(String newCompany)
	{
		getDriver().findElement(By.id("updateLeadForm_companyName")).clear();
		getDriver().findElement(By.id("updateLeadForm_companyName")).sendKeys(newCompany);
		return this;

	}

	public ViewLeadPage clickUpdate()
	{
		getDriver().findElement(By.xpath("//input[@value='Update']")).click();
		return new ViewLeadPage();
	}


}
