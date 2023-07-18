package com.luma.sw.pages;

import com.luma.sw.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WomenPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement womenMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
     WebElement tops;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')")
     WebElement jacket;
    @CacheLookup
    @FindBy(xpath = "//select[@id='sorter'])[1]")
     WebElement productFilter;

    @CacheLookup
    @FindBy(xpath = "//select[@id='sorter'])[1])")
     WebElement productPrice;


    public void mouseHoverOnWomenMenu(){
        mouseHoverToElement(womenMenu);
    }
    public void mouseHoverOnTops(){
        mouseHoverToElement(tops);
    }
    public void clickOnJacket(){
        mouseHoverToElementAndClick(jacket);
    }
    public void selectProduct(){
        selectByVisibleTextFromDropDown(productFilter,"Product Name");
    }
   public void  selectProductPrice(){
        selectByVisibleTextFromDropDown(productPrice,"Price");
   }



}
