package dashboard.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class DeshStepDef {
	WebDriver driver;
	DashboardPage dashpage;

	@Given("^user go to Orange HRM home page$")
	public void user_go_to_Orange_HRM_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();

	}

	@When("^user enter valid username and passward$")
	public void user_enter_valid_username_and_passward() throws Throwable {
		dashpage = new DashboardPage(driver);
		dashpage.enterUsernameAndPassword();

	}

	@When("^user click the log in button$")
	public void user_click_the_log_in_button() throws Throwable {
		dashpage.clickOnloginButton();
	}

	@Then("^user navigate to the welcome page$")
	public void navigate_to_the_welcome_page() throws Throwable {
		dashpage.verifyWelcomeWord();

	}

	@Then("^user verify page title as \"([^\"]*)\"$")
	public void user_verify_page_title_as(String arg1) throws Throwable {
		String expected = arg1;
		String actual = driver.getTitle();
		Assert.assertTrue("Title does not match", actual.contains(expected));

	}

	@Then("^user verify user name is displays at top right$")
	public void user_verify_user_name_is_displays_at_top_right() throws Throwable {
		dashpage.verifyUserName();

	}

	@Then("^user log out$")
	public void usr_log_out() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dashpage.logOut();

	}

	@Then("^user close browser$")
	public void user_close_browser() throws Throwable {
		driver.close();
		driver.quit();

	}
}
