package com.demoqa.step_definitions;

import static org.junit.Assert.assertEquals;

import com.demoqa.pages.LoginPage;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDefs {
	LoginPage loginPage = new LoginPage();

	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	} 

	@When("the user enters username and password")
	public void the_user_enters_usernam_and_password() {
		loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
		loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
		loginPage.loginButton.click();
	}

	@Then("verify home page title {string}")
	public void verify_home_page_title(String title) {
		
		String actual = Driver.getDriver().getTitle();
		assertEquals(title, actual);
	}
}
