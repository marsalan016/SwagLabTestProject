package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkout2Page {
    private WebDriver driver;

    public checkout2Page(WebDriver driver)
    {
        this.driver = driver;
    }

    private By finishButton = By.id("finish");

    public void ClickFinishButton(){
        WebElement clickFinishButton = driver.findElement(finishButton);
        clickFinishButton.click();
    }
}
