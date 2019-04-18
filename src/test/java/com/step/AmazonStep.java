package com.step;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pages.AmazonHomePgae;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonStep extends AmazonHomePgae {

	@Given("^user open browser and launch amazon application$")
	public void user_open_browser_and_launch_amazon_application() throws InterruptedException {
		OpenAmazon();
		Thread.sleep(1200);
	}

	@When("^user click on login page$")
	public void user_click_on_login_page() {
		click();
	}

	@Then("^amazon login page displayed$")
	public void amazon_login_page_displayed() throws Throwable {
		Assert.assertEquals(true, amazomPage());
	}

	// scenario 2

	@Given("^user selects ([^\"]*)$")
	public void user_selects_Books(String dropdown) {
		dropDownValueSelect(dropdown);
	}

	@Given("^user enter ([^\\\"]*)$")
	public void user_enter_freedom(String searchvalue) {
		sendValue(searchvalue);
		//driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(searchvalue);
	}

	@When("^user click on submit button of amazon$")
	public void user_click_on_submit_button_of_amazon() {
		clickOnSubmitButton();
	}

	@Then("^application display ([^\\\"]*) result for search$")
	public void application_display_search_result_for_search(String searchvalue) {
		Assert.assertTrue(displaySearchResult(searchvalue));
	}
	

	@Then("^close amazon site$")
	public void close_amazon_site() {
		driver.close();
	}

	

}
