package cucumber.features;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinitions {
	
	WebDriver driver;
	
	@Given("^Open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
	   
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enter_valid_and_valid(String uname, String pass) throws Throwable {
	   driver.findElement(By.id("email")).sendKeys(uname);
	   driver.findElement(By.id("pass")).sendKeys(pass);
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	   driver.findElement(By.id("loginbutton")).click();
	}

	@Then("^application should be closed$")
	public void application_should_be_closed() throws Throwable {
	  driver.close();
	  driver.quit();
	}



}