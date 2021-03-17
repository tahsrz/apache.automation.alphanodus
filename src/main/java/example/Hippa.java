package example;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hippa {
WebDriver driver;
public By hippabutton = By.xpath("//label[@for='chkHipaaPrivacy']");

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Tahsin\\Desktop\\chromedriver88\\chromedriver.exe");
		driver = new ChromeDriver();
		

	}

	@AfterClass
	public void afterClass() {
		 driver.quit();
		
	}
	
	@Test
	public void clickHippa() {
	
	driver.get("https://exa.ddi-web.com/ddi/login");
	driver.findElement(hippabutton).click();
	
	File f = ((TakesScreenshot) driver)										
										.getScreenshotAs(OutputType.FILE);
try {
FileHandler.copy(f, new File("C:/Users/Tahsin/Desktop/Screenshots/screenshot01.png"));
} catch (IOException e) {
System.out.println(e.getMessage());
}

	
}}
