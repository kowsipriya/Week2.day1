package Week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();

driver.findElement(By.linkText("Leads")).click();

driver.findElement(By.linkText("Create Lead")).click();

driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Testing1");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Testing2");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Testing22");
driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Testing3");
driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Hai");
driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("04/02/99");
driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Engineer");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Development");
driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("8");

driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1003");
driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("87331");
driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing of URl page");
driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Test of Web Page");

driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("tester");
WebElement countrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
countrycode.clear();
countrycode.sendKeys("5");


driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("60007");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543211");
driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("test1");
driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("te3t");

driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Test@gmail.com");
driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps/control/login");
driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Testor");
driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Testing@123");

driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("address line");
driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("address line");
driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600097");
driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("6655");



WebElement drpDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select drpDow = new Select(drpDown);
drpDow.selectByIndex(2);

WebElement drpDown1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select drpDow1 = new Select(drpDown1);
drpDow1.selectByVisibleText("Demo Marketing Campaign");

WebElement drpDown2 = driver.findElement(By.id("createLeadForm_currencyUomId"));
Select drpDow2 = new Select(drpDown2);
drpDow2.selectByValue("DZD");

WebElement drpDown3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
Select drpDow3 = new Select(drpDown3);
drpDow3.selectByIndex(2);

WebElement drpDown4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select drpDow4 = new Select(drpDown4);
drpDow4.selectByVisibleText("LLC/LLP");

WebElement drpDown5 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select drpDow5 = new Select(drpDown5);
drpDow5.selectByIndex(5);

WebElement drpDown6 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
Select drpDow6 = new Select(drpDown6);
drpDow6.selectByValue("DZA");


String text = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");

System.out.println("First Name : " + text);

driver.findElement(By.className("smallSubmit")).click();


String title = driver.getTitle();
String title2 = "View Lead | opentaps CRM";
if(title.equals(title2))
{
	
	System.out.println("Title MAtched : "+ title);
}
else
{
	
	System.out.println("Tiltle Mismatch : "+ title);
}

	}
	
}