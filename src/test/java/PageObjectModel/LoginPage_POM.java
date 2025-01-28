package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_POM {

	
	WebDriver driver;
	//constructor
	public LoginPage_POM(WebDriver d) {
	
	       driver=d;
	     PageFactory.initElements(driver, this);
	
	}
	
	//WebElements
	@FindBy (id = "user-name") WebElement username;
	@FindBy(id = "password") WebElement password;
	@FindBy(id = "login-button") WebElement login_btn;
	@FindBy(xpath = "//button[text()='Open Menu']") WebElement openmenu;
	@FindBy (id = "logout_sidebar_link") WebElement logout_btn;
	
	
	//page actions
	public void enter_user(String user) {
		username.sendKeys(user);
	}
	public void enter_pass(String pass) {
		password.sendKeys(pass);
	}
	public void click_login() {
		
		login_btn.click();
		
	}
	public void click_openmenu() {
		
//		Actions action = new Actions(driver);
//		action.moveToElement(openmenu).build().perform();
		openmenu.click();
	}
	public void click_logout_button() {
		logout_btn.click();
	}
	
	
	
}
