package swaglabs;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class demo {
	WebDriver driver;
	static PageObject locator;
	@BeforeClass
	public void beforeclass() throws IOException {
		String browserName=Prop.readProp();
		switch(browserName){
		case "CHROME":
			driver=new ChromeDriver();
			break;
		case "FIREFOX":
			driver=new FirefoxDriver();
			break;
		default:
			driver=new ChromeDriver();
		}
		locator=new PageObject(driver);
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void afterclass() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	@Test(priority = 1)
	public void script(){

		locator.enterUsername();

		locator.enterPass();
		locator.loginButton();
			}
	@Test(priority = 2)
	public void Cart() {
		locator.addCart();
		locator.cartLink();
	}
	@Test(priority = 5)
	public void Logout() throws InterruptedException {
		locator.openMenu();
		Thread.sleep(2000);
		locator.logoutClick();
	}
	@Test(priority = 3)
	public void Checkout() {
		locator.checkOut();
	}
	@Test(priority = 4)
	public void Information() throws InterruptedException {
		locator.enterFirstname();
		locator.enterLastname();
		locator.enterPincode();
		Thread.sleep(2000);
		locator.Continue();
		Thread.sleep(2000);
		locator.finishButton();
	}
	
}