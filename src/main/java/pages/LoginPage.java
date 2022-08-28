package pages;

import org.openqa.selenium.By;
import baseclass.ProjectSpecificMethods;


public class LoginPage extends ProjectSpecificMethods{

	public LoginPage typeUserName(String userName)
	{
		getDriver().findElement(By.id("username")).sendKeys(userName);
		return this;
	}

	public LoginPage typePassword(String pwd)
	{
		getDriver().findElement(By.id("password")).sendKeys(pwd);
		return this;
	}

	public HomePage clickLogin()
	{
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}

}
