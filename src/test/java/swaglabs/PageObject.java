package swaglabs;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class PageObject {
	PageObject(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//input[@id=\"user-name\"]")
	public static WebElement username;
	
	@FindBy(xpath = "//*[contains(@name,'password')]")
	public static WebElement password;
	
	@FindBy(id = "login-button")
	public static WebElement login;
	
	@FindBy(xpath = "//button[contains(text(),'ADD TO CART')][1]")
	public static WebElement addcart;
	
	@FindBy(xpath = "//*[@class=\"shopping_cart_link fa-layers fa-fw\"]")
	public static WebElement cartlink;
	
	@FindBy(xpath = "//*[@class=\"btn_action checkout_button\"]")
	public static WebElement checkout;
	
	@FindBy(xpath = "//input[@id=\"first-name\"]")
	public static WebElement firstname;
	
	@FindBy(xpath = "//input[@id=\"last-name\"]")
	public static WebElement lastname;
	
	@FindBy(xpath = "//input[@id=\"postal-code\"]")
	public static WebElement pincode;
	

	@FindBy(xpath = "//a[@class=\"btn_action cart_button\"]")
	public static WebElement finish;
	
	@FindBy(xpath = "//input[@class=\"btn_primary cart_button\"]")
	public static WebElement continuenext;
    
	@FindBy(xpath = "//button[contains(text(),'Open Menu')]")
	public static WebElement openmenu;
	
	@FindBy(xpath = "//*[@id=\"logout_sidebar_link\"]")
	public static WebElement logout;
	
	public void enterUsername() {
		username.sendKeys(Keys.ENTER);
		username.sendKeys("standard_user");
	}
	public void enterPass() {
		password.sendKeys(Keys.ENTER);
		password.sendKeys("secret_sauce");
	}
	public void loginButton(){
		login.click();
	}
	public void addCart(){
		addcart.click();
	}
	public void cartLink(){
		cartlink.click();
	}
	public void checkOut() {
		checkout.click();
	}
	public void enterFirstname(){
		firstname.sendKeys("Madesh");
	}
	public void enterLastname(){
		lastname.sendKeys("Maddy");
	}
	public void enterPincode(){
	     pincode.sendKeys("621216");
	}
	public void Continue() {
		continuenext.click();
	}
	public void finishButton(){
		finish.click();
	}
	public void openMenu(){
		openmenu.click();
	}
	public void logoutClick() {
		logout.click();
	}

}
