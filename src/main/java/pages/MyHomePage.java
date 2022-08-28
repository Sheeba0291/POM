package pages;

import org.openqa.selenium.By;

import baseclass.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{

	public MyLeadsPage clickLeadsLink()
	{
		getDriver().findElement(By.linkText("Leads")).click();
		return new MyLeadsPage();
	}
}
