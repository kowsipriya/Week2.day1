package Week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL
		// https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Step 6: Fill in all the text boxes
		driver.findElement(By.name("UserFirstName")).sendKeys("Kriyaa");
		driver.findElement(By.name("UserLastName")).sendKeys("raj");
		driver.findElement(By.name("UserEmail")).sendKeys("kriya@tetsleaf.com");
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		driver.findElement(By.name("UserPhone")).sendKeys("954006697");
		// Step 7: Handle all the dropdowns
		WebElement job = driver.findElement(By.name("UserTitle"));
		Select jobTitle = new Select(job);
		jobTitle.selectByIndex(4);

		WebElement compEmploy = driver.findElement(By.name("CompanyEmployees"));
		Select companyEmp = new Select(compEmploy);
		companyEmp.selectByValue("350");

		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select countryname = new Select(country);
		countryname.selectByVisibleText("India");
		// Step 8: Click the check box
		//WebElement checkbox = driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]"));
		//checkbox.click();
		// Step 9: Close the browser
		//driver.close();
	}
}
