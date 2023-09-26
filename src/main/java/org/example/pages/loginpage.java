package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {

    private WebDriver driver;

    private By userNameInputLocator = By.id("user-name");
    private By passwordInputLocator = By.id("password");
    private By loginButtonLocator = By.id("login-button");

    private By loggedInSuccessful = By.className("title");
    private By invalidCredentialsErrors = By.cssSelector("h3");

    public loginpage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterUsername(String username)
    {
        WebElement usernameInput = driver.findElement(userNameInputLocator);
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password)
    {
        WebElement passwordInput = driver.findElement(passwordInputLocator);
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton()
    {
        WebElement loginButtonClick = driver.findElement(loginButtonLocator);
        loginButtonClick.click();
    }

    public void login(String username,String password)
    {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }

    public boolean loginSuccessful(){
        return driver.findElement(loggedInSuccessful).isDisplayed();
    }

    public String invalidCredentialsErrorMessage(){
        WebElement invalidCredentialsCheck = driver.findElement(invalidCredentialsErrors);
        return invalidCredentialsCheck.getText();
    }
}
