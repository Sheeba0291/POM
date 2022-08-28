package pages;

import org.openqa.selenium.By;

import baseclass.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods{
	
	// public String leadID = "";

	public FindLeadsPage enterFirstName(String firstName)
	{
		getDriver().findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstName);
		return this;
	}

	public FindLeadsPage clickFindLeadsButton() throws InterruptedException
	{
		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		return this;
	}

	public ViewLeadPage clickFirstResult()
	{
		getDriver().findElement(By.xpath("//table[@class='x-grid3-row-table']//a[1]")).click();
		return new ViewLeadPage();
	}

	public FindLeadsPage clickPhoneTab()
	{
		getDriver().findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}

	public FindLeadsPage enterPhoneNumber(String phoneNumber)
	{
		getDriver().findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
		return this;
	}
	
	public FindLeadsPage captureLeadID()
	{
		leadID = getDriver().findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).getText();

		leadID = leadID.replaceAll("[a-zA-Z()\\s]", "");

		System.out.println("Lead ID "+leadID+" is Captured.");
		return this;
	}
	
	public FindLeadsPage enterCapturedLeadID()
	{
		getDriver().findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;
	}
	
	/*
	 * Verify message "No records to display" in the Lead List. 
	 * This message confirms the successful deletion
	 */
	public FindLeadsPage verifyDeletionMessage()
	{
		String actualText = getDriver().findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();

		if (actualText.equals("No records to display"))
		{
			System.out.println(leadID + " is deleted successfully");
		}
		else
		{
			System.out.println(leadID + " is NOT deleted");
		}
		return this;
	}
	
}
