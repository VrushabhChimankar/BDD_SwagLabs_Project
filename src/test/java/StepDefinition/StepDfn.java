package StepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.LoginPage_POM;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class StepDfn extends BaseClass {

	@Before
	public void setUp() {
		System.out.println("Set up method executed");
		driver = new ChromeDriver();
	}

	@Given("user launches chrome browser")
	public void user_launches_chrome_browser() {

		driver = new ChromeDriver();
		loginpg = new LoginPage_POM(driver);

	}

	@When("user opens URL {string}")
	public void user_opens_url(String url) {

		driver.get(url);

	}

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String user, String pass) {

		loginpg.enter_user(user);
		loginpg.enter_pass(pass);

	}

	@When("Click on login button")
	public void click_on_login_button() {
		loginpg.click_login();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expected_title) {

		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
	}

	@Then("user click on open menu and logout button")
	public void user_click_on_open_menu_and_logout_button() {

		loginpg.click_openmenu();
		loginpg.click_logout_button();

	}

	@Then("user can view homepage as {string}")
	public void user_can_view_homepage_as(String expected_title) {
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
	}

	@Then("close browser")
	public void close_browser() {

		System.out.println("Execution finished");
		driver.quit();
	}
	
	

}
