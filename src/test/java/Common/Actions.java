package Common;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Actions{

public static WebDriver driver;
	
	@BeforeTest()
	public  void initiate_driver() throws MalformedURLException {
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("browserName", "chrome");
		Actions.driver = new RemoteWebDriver(new URL("http://chrome:4444/wd/hub"),caps);
		driver.get("https://www.cisco.com");
		
	}
	
	public static WebElement find_element(By by) {
		try {
			return driver.findElement(by);
		}
		catch (Exception e) {
			System.out.println("Exception occured" + e);
			return null;
		}
	}
	
	public static void enter_text(By by,String Value) {
		try {
			driver.findElement(by).sendKeys(Value);
		}
		catch (Exception e) {
			System.out.println("Exception occured" + e);
		}
			 
	}
	
	public static void click_element(By by) {
		try {
			driver.findElement(by).click();
		}
		catch (Exception e) {
			System.out.println("Exception occured" + e);
		}
	}
	
	public static void sleep() {
		try {
			driver.wait(20);
		}
		catch(Exception e) {
			System.out.println("Exception occured" + e);
		}
	}
	
//	@AfterTest()
//	public static void quit() {
//		driver.quit();
//	}

}
