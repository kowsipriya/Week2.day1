package Week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Step 6: Click on Create New Account button
		driver.findElement(By.linkText("Create New Account")).click();
		// Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("megala");
		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Banu");
		// Step 9: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("9688025433");
		// Step 10: Enterthe password
		driver.findElement(By.id("password_step_input")).sendKeys("xyzz@123");
		// Step 11: Handle all the three drop downs
		WebElement date = driver.findElement(By.id("day"));
		Select day = new Select(date);
		day.selectByValue("6");

		WebElement month = driver.findElement(By.id("month"));
		Select monthval = new Select(month);
		monthval.selectByIndex(6);

		WebElement year = driver.findElement(By.id("year"));
		Select yearval = new Select(year);
		yearval.selectByValue("1998");
		// Step 12: Select the radio button "Female"
		driver.findElement(By.name("sex")).click();
		System.out.println("Completed");
	}
}
