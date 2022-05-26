package StepsForBackgroundColor;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SkyBlueBackground;
import pages.SkyWhiteBackground;
import util.BrowserFactory;

public class BackgroundColorSteps {
	WebDriver driver;
	SkyBlueBackground blue;
	SkyWhiteBackground white;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		blue = PageFactory.initElements(driver, SkyBlueBackground.class);
		white = PageFactory.initElements(driver, SkyWhiteBackground.class);
	}

	@Given("Set SkyBlue Background button exists")
	public void set_SkyBlue_Background_button_exists() {
		Assert.assertTrue("Skyblue button not displayed!", blue.waitForBackgroundColorButton());
	}

	@When("user click on the skyblue button")
	public void user_click_on_the_skyblue_button() throws InterruptedException {
		blue.click_background_Color_button();
	}

	@Then("the background color will change to sky blue")
	public void the_background_color_will_change_to_sky_blue() {
		Assert.assertTrue("Background color not SkyBlue!", blue.isBackGroundColorBlue());
	}

	@Given("Set SkyWhite Background button exists")
	public void set_SkyWhite_Background_button_exists() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue("SkyWhite button not displayed!", white.waitForBackgroundColorButton());
	}

	@When("user click on the skywhite button")
	public void user_click_on_the_skywhite_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		white.click_background_Color_button();
	}

	@Then("the background color will change to sky white")
	public void the_background_color_will_change_to_sky_white() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue("Background color not WHITE!", white.isBackGroundColorBlue());
	}

	@After
	public void afterRun() {
//		todoPage.close();
		driver.close();
	}
}
