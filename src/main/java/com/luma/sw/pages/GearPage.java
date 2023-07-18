package com.luma.sw.pages;

import com.luma.sw.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GearPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement GearMenu;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement Bags;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle")
    WebElement Duffle;
    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
     WebElement Cart;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement ShoppingCart;









    public void mouseHoverOnGearMenu(){
        mouseHoverToElement(GearMenu);
    }
    public void mouseHoverToElementAndClick(){
        mouseHoverToElementAndClick(Bags);
    }

    public void clickOnProduct(){
        clickOnElement(Duffle);
    }
    public void addToCartButton(){
        clickOnElement(Cart);
    }
    public void shoppingCartLink(){
        clickOnElement(ShoppingCart);
    }
}
