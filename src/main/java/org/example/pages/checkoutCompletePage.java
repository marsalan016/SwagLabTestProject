package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkoutCompletePage {
    private WebDriver driver;

    public checkoutCompletePage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By confirmText = By.className("complete-header");

    public String verifyConfirmText(){
        WebElement verifyConfirmText = driver.findElement(confirmText);
        return verifyConfirmText.getText();
    }

}
