package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkoutPage {

    private WebDriver driver;

    public checkoutPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCode = By.id("postal-code");
    private By continueButton = By.id("continue");

    public void enterFirstName(String firstName){
        WebElement enterFirstNameField = driver.findElement(firstNameField);
        enterFirstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        WebElement enterLastNameField = driver.findElement(lastNameField);
        enterLastNameField.sendKeys(lastName);
    }

    public void enterPostalCode(String postal){
        WebElement enterPostalCode = driver.findElement(postalCode);
        enterPostalCode.sendKeys(postal);
    }

    public void clickContinueButton(){
        WebElement clickContinueButton = driver.findElement(continueButton);
        clickContinueButton.click();
    }

    public void placeOrder(String firstName,String lastName,String postal){
        enterFirstName(firstName);
        enterLastName(lastName);
        enterPostalCode(postal);
        clickContinueButton();
    }
}
