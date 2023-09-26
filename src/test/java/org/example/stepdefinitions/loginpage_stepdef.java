package org.example.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.example.pages.loginpage;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage_stepdef {

    private WebDriver driver;
    private loginpage login;

    @Before
    public void setup(){
        driver = new ChromeDriver();
    }

    @After
    public void cleanup(){
        if(driver!=null){
            driver.quit();
        }
    }

    @Given("I am on the Swag Labs login page")
    public void i_am_on_the_swag_labs_loginpage(){
        driver.get("https://www.saucedemo.com/");
        login = new loginpage(driver);
    }

    @Given("I have entered a valid username and password")
    public void i_have_entered_valid_username_and_password(){
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
    }

    @Given("I have entered invalid {string} and {string}")
    public void i_have_entered_invalid(String username,String password){
        login.enterUsername(username);
        login.enterPassword(password);
    }

    @When("I clicked on Login Button")
    public void i_clicked_on_login_button(){
        login.clickLoginButton();
    }

    @Then("I logged in successfully to the Swag Labs")
    public void i_logged_in_successfully_to_the_swag_labs(){
        Assert.assertTrue(login.loginSuccessful());
    }

    @Then("It showed me {string}")
    public void credentialsErrorVerify(String errormessage){
        Assert.assertEquals(login.invalidCredentialsErrorMessage(),errormessage);
    }
}
