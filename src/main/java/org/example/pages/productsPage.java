package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productsPage {

    private WebDriver driver;

    private By bikeLightAddToCart = By.id("add-to-cart-sauce-labs-bike-light");
    private By cartButton = By.id("shopping_cart_container");
    public productsPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void ClickBikeLightAddToCart(){
        WebElement ClickBikeLightAddToCart = driver.findElement(bikeLightAddToCart);
        ClickBikeLightAddToCart.click();
    }

    public void ClickCartButton(){
        WebElement ClickCartButton = driver.findElement(cartButton);
        ClickCartButton.click();
    }


}
