package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Cisco_Login_page_object {
	public static By userIcon = By.xpath(".//button[@id='fwt-profile-button']");
	public static By loginButton = By.xpath(".//a[contains(@class,'login-url')]");
	public static By userName = By.xpath(".//input[@id='userInput']");
	public static By nextButton = By.xpath(".//input[@id='login-button']");
//	public static By passWord = By.xpath(".//input[@id='passwordInput']");
//	public static By login = By.xpath(".//a[contains(@class,'login-url')]");

}
