package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * 1. Write down the following test into WomenTestclass
 * 1. verifyTheSortByProductNameFilter
 * Mouse Hover on Women Menu
 * Mouse Hover on Tops
 * Click on Jackets
 * Select Sort By filter “Product Name”
 * Verify the products name display in
 * alphabetical order
 * 2. verifyTheSortByPriceFilter
 * Mouse Hover on Women Menu
 * Mouse Hover on Tops
 * Click on Jackets
 * Select Sort By filter “Price”
 * Verify the products price display in
 * Low to High
 */
public class WomenTest extends TestBase {

    HomePage homePage = new HomePage();
    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        //Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();
        //Mouse Hover on Tops
        homePage.mouseHoverOntopMenu();
        //Click on Jackets
        homePage.clickOnJacketLink();
        List<String> actualText = womenPage.storeProductNamesInAscendingOrder();
        womenPage.selectFilterSortByNames();
        Thread.sleep(2000);
        List<String> expextedText = womenPage.storeProductNamesAfterFilterName();
        Assert.assertEquals(actualText, expextedText);
    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        //Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();
        //Mouse Hover on Tops
        homePage.mouseHoverOntopMenu();
        //Click on Jackets
        homePage.clickOnJacketLink();
        List<Double> actualText = womenPage.storeProductsNamesByPriceinAscendingOrder();
        womenPage.selectFilterSortByPriceLowToHigh();
        Thread.sleep(2000);
        List<Double> expextedText = womenPage.storeProductsNamesByPriceAfterFilterPriceLowToHigh();
        Assert.assertEquals(actualText, expextedText);
    }

    }
