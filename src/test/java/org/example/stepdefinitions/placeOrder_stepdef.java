package org.example.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.example.pages.loginpage;
import org.example.pages.cartPage;
import org.example.pages.checkoutPage;
import org.example.pages.checkout2Page;
import org.example.pages.checkoutCompletePage;
import org.example.pages.productsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class placeOrder_stepdef {
    private WebDriver driver;
    private loginpage login;
    private cartPage cartPage;
    private checkoutPage checkoutPage;
    private productsPage productsPage;
    private checkout2Page checkout2Page;
    private checkoutCompletePage checkoutCompletePage;

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

    @Given("I am logged in to Swag Labs")
    public void i_am_on_the_swag_labs_loginpage(){
        driver.get("https://www.saucedemo.com/");
        login = new loginpage(driver);
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLoginButton();
    }

    @When("I have added item to cart and checkout")
    public void i_have_added_item_to_cart_and_checkout(){
        productsPage = new productsPage(driver);
        productsPage.ClickBikeLightAddToCart();
        productsPage.ClickCartButton();
        cartPage = new cartPage(driver);
        cartPage.ClickCheckoutButton();
    }

    @And("I have added user information and clicked continue")
    public void i_have_added_user_information_and_clicked_continue(){
        checkoutPage = new checkoutPage(driver);
        checkoutPage.enterFirstName("Muhammad");
        checkoutPage.enterLastName("Arsalan");
        checkoutPage.enterPostalCode("75050");
        checkoutPage.clickContinueButton();
        checkout2Page = new checkout2Page(driver);
        checkout2Page.ClickFinishButton();
    }
    @Then("My Order placed successfully")
    public void my_order_placed_successfully(){
        checkoutCompletePage = new checkoutCompletePage(driver);
        Assert.assertEquals(checkoutCompletePage.verifyConfirmText(),"Thank you for your order!");
    }

}
