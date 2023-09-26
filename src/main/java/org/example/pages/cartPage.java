package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartPage {

    private WebDriver driver;

    private By checkoutButton = By.id("checkout");
    public cartPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void ClickCheckoutButton(){
        WebElement ClickCheckoutButton = driver.findElement(checkoutButton);
        ClickCheckoutButton.click();
    }


}
