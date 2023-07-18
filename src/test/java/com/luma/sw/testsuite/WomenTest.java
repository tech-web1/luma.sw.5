package com.luma.sw.testsuite;

import com.luma.sw.pages.WomenPage;
import com.luma.sw.testbase.BastTest;
import org.testng.annotations.Test;

public class WomenTest extends BastTest {
    WomenPage womenPage=new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter(){
        //* Mouse Hover on Women Menu
        womenPage.mouseHoverOnWomenMenu();

        //* Mouse Hover on Tops
        womenPage.mouseHoverOnTops();

        //* Click on Jackets
        womenPage.clickOnJacket();

        //* Select Sort By filter “Product Name”
        womenPage.selectProduct();

        //* Verify the products name display in alphabetical order
    }
    @Test
    public void verifyTheSortByPriceFilter(){
        //* Mouse Hover on Women Menu
        womenPage.mouseHoverOnWomenMenu();

        //* Mouse Hover on Tops
        womenPage.mouseHoverOnTops();

        //* Click on Jackets
        womenPage.clickOnJacket();

        //Select sort By filter Price
        womenPage.selectProductPrice();


    }

}
