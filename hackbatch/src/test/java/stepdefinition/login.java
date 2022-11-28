


	package stepdefinition;

	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import pageobject.loginpage;
	import utility.helper;

	public class login extends Baseclass{
		
		@Given("User is on the browser")
		public void user_is_on_the_browser() {
		    
		   lp=new loginpage(helper.getDriver());
		}

		
		@When("User opens the LMS Website URL {string}")
		public void user_opens_the_lms_website_url(String url) {
			helper.openPage(url);
			
		}
		@Then("User should see the Login page.")
		public void user_should_see_the_login_page() throws InterruptedException {
		    lp.loginpage();
		    //Thread.sleep(1000);
		    
		}

		@When("user clicks the login page without entering Username and Password")
		public void user_clicks_the_login_page_without_entering_username_and_password() throws InterruptedException {
		    lp.login();
			//lp.emptyusnpass();
		    //Thread.sleep(1000);
		}

		
		/*@Then("It should display the error message Invalid username and password Please try again")
		public void it_should_display_the_error_message_invalid_username_and_password_please_try_again() throws InterruptedException {
			//lp.emptyusnpass();
			lp.emptyusnpass();
			Thread.sleep(1000);
		}

		/*@When("user fills the username as {string} and not password")
		public void user_fills_the_username_as_and_not_password(String usname) throws InterruptedException {
		    lp.Setusername(usname);
		    Thread.sleep(1000);
		}

		@Then("user clicks the login button it should display error message")
		public void user_clicks_the_login_button_it_should_display_error_message() throws InterruptedException {
		    //lp.login();
			lp.validationmessagepasswrd();
			Thread.sleep(1000);
		}

		@When("user fills the password  as {string} and not username")
		public void user_fills_the_password_as_and_not_username(String pwd) {
		    lp.Setpassword(pwd);
		}

		
		@Then("user clicks the login button it should display error message Invalid username and password Please try again")
		public void user_clicks_the_login_button_it_should_display_error_message_invalid_username_and_password_please_try_again() {
			lp.validationmessageusern();
		}
	*/
		@When("User clicks the Login button after entering valid username as {string} and password as {string}")
		public void user_clicks_the_login_button_after_entering_valid_username_as_and_password_as(String usname, String pwd) throws InterruptedException {
		    lp.Setusername(usname);
		    lp.Setpassword(pwd);
		    Thread.sleep(4000);
		}

		@Then("user clicks the login button")
		public void user_clicks_the_login_button() {
		   lp.login();
		}

		@Then("User should see the LMS Home page")
		public void user_should_see_the_lms_home_page() {
		    lp.loginpage();
		}



	}



