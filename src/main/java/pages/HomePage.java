package pages;

import org.openqa.selenium.By;
import baseclass.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{

	public MyHomePage clickCRMSFA()
	{
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}
	
	public HomePage verifyHomePage()
	{
		String text = getDriver().findElement(By.tagName("h2")).getText();
		if(text.contains("Welcome"))
			System.out.println("Home Page is Verified");
		else
			System.out.println("Home Page is NOT VERIFIED");
		return this;
	}
}
