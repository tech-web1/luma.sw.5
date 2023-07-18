package com.luma.sw.testsuite;

import com.luma.sw.customlisteners.CustomListeners;
import com.luma.sw.pages.GearPage;
import com.luma.sw.testbase.BastTest;
import org.testng.annotations.Listeners;

@Listeners(CustomListeners.class)
public class GearTest extends BastTest {
     GearPage gearPage=new GearPage();

    public void userShouldAddProductSuccessFullyToShoppingCart(){
        //Mouse Hover on Gear Menu
        gearPage.mouseHoverOnGearMenu();
        //* Click on Bags
        gearPage.mouseHoverToElementAndClick();
        //* Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnProduct();

        //* Verify the text ‘Overnight Duffle’
        //* Change Qty 3
        //* Click on ‘Add to Cart’ Button.
        gearPage.addToCartButton();
        //* Verify the text
        //‘You added Overnight Duffle to your shopping cart.’
        //* Click on ‘shopping cart’ Link into message
        gearPage.shoppingCartLink();
        //* Verify the product name ‘Cronus Yoga Pant’
        //* Verify the Qty is ‘3’
        //* Verify the product price ‘$135.00’
        //* Change Qty to ‘5’
        //* Click on ‘Update Shopping Cart’ button
        //* Verify the product price ‘$225.0
    }
}
