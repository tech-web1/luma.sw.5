package com.luma.sw.testsuite;

import com.luma.sw.customlisteners.CustomListeners;
import com.luma.sw.pages.MenPage;
import com.luma.sw.testbase.BastTest;
import org.testng.annotations.Listeners;

@Listeners(CustomListeners.class)
public class MenTest extends BastTest {

    MenPage menPage=new MenPage();

    public void userShouldAddProductSuccessFullyToShoppingCart(){
        //* Mouse Hover on Men Menu
        menPage.mouseHoverOnMenMenu();
        //* Mouse Hover on Bottoms
        menPage.mouseHoverOnMenBottoms();
        //* Click on Pants
        menPage.clickOnPants();
        //* Mouse Hover on product name
        menPage.mouseHoverAndClick();
        //‘Cronus Yoga Pant’ and click on size 32.
        menPage.clickOnSize();
        //* Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
        menPage.clickOnColour();
        //* Mouse Hover on product name Cronus Yoga Pant and click on Add To Cart Button.
        menPage.addToCartButton();
        //* Verify the text
        //‘You added Cronus Yoga Pant to your shopping cart.’
        //* Click on ‘shopping cart’ Link into
        menPage.clickOnShoppingCart();

        //message
        //* Verify the text ‘Shopping Cart.’
        //* Verify the product name ‘Cronus Yoga Pant’
        //* Verify the product size ‘32’
        //* Verify the product colour ‘Black’

    }
}
