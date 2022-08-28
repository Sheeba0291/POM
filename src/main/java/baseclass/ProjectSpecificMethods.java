package baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class ProjectSpecificMethods {

	private static final ThreadLocal<RemoteWebDriver> webDriver = new ThreadLocal<RemoteWebDriver>();
	// public static ChromeDriver driver;
	public String excelFileName = "";
	public static String leadID = "";
	/*	public String companyName;
	public String firstName;
	public String lastName; */
	// public int i=1;

	public void setDriver()
	{
		webDriver.set(new ChromeDriver());
	}

	public RemoteWebDriver getDriver()
	{
		return webDriver.get();
	}


	@BeforeMethod
	public void init() 
	{
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("-disable-notifications");
		WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver(options);
		setDriver();
		getDriver().get("http://leaftaps.com/opentaps/control/login");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterMethod
	public void tearDown()
	{
		/*	// Capture Screenshot
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/salesforce/CreateAccounts.png");
		FileUtils.copyFile(src, desc);

		System.out.println("Screenshot captured."); */
		getDriver().close();
	} 

	@DataProvider(name = "create")
	public String[][] fetchData() throws IOException
	{

		String[][] data = ReadExcel.readData(excelFileName);

		return data;
	}
}
