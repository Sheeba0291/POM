package pages;

import org.openqa.selenium.By;
import baseclass.ProjectSpecificMethods;


public class CreateLeadPage extends ProjectSpecificMethods{
			
		
		public CreateLeadPage typeCompanyName(String companyName)
		{
			getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
			return this;
		}
		
		
		public CreateLeadPage typeFirstName(String firstName)
		{
			getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
			return this;
		}
		
		
		public CreateLeadPage typeLastName(String lastName)
		{
			getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
			return this;
		}
		
		
		public ViewLeadPage clickSubmit()
		{
			getDriver().findElement(By.className("smallSubmit")).click();
			return new ViewLeadPage();
		}
		

}
