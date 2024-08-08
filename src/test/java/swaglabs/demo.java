package swaglabs;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class demo {
	WebDriver driver;
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
		
		WebElement user=driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		user.sendKeys(Keys.ENTER);
		user.sendKeys("standard_user");
		WebElement pass=driver.findElement(By.xpath("//*[contains(@name,'password')]"));
		pass.sendKeys(Keys.ENTER);
		pass.sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeAsyncScript("window.scrollBy(0,500);");
		
			}
	@Test(priority = 2)
	public void Cart() {
		WebElement order=driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')][1]"));
		order.click();
		driver.findElement(By.xpath("//*[@class=\"shopping_cart_link fa-layers fa-fw\"]")).click();
	}
	@Test(priority = 5)
	public void Logout() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class=\"btn_action cart_button\"]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Open Menu')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
	}
	@Test(priority = 3)
	public void Checkout() {
		driver.findElement(By.xpath("//*[@class=\"btn_action checkout_button\"]")).click();
	}
	@Test(priority = 4)
	public void Information() {
		driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys("Madesh");
		driver.findElement(By.cssSelector("input[id=\"last-name\"]")).sendKeys("Maddy");
		driver.findElement(By.xpath("//input[@id=\"postal-code\"]")).sendKeys("123456");

		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	}
	
}