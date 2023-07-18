package com.luma.sw.pages;

import com.luma.sw.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement MenMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement Bottoms;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement Pants;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement YogaPant;
    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-option text'])[1]")
    WebElement Size;
    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-option color'])[1]")
    WebElement Colour;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
     WebElement Cart;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
     WebElement ShoppingCart;








    public void mouseHoverOnMenMenu(){

        mouseHoverToElement(MenMenu);
    }
    public void mouseHoverOnMenBottoms(){
        mouseHoverToElement(Bottoms);
    }
    public void clickOnPants(){
        mouseHoverToElementAndClick(Pants);
    }
    public void mouseHoverAndClick(){
        mouseHoverToElementAndClick(YogaPant);
    }
    public void clickOnSize(){
        clickOnElement(Size);
    }
    public void clickOnColour(){
        clickOnElement(Colour);
    }
    public  void addToCartButton(){
        mouseHoverToElement(Cart);
    }
    public void clickOnShoppingCart(){
        clickOnElement(ShoppingCart);
    }
}
