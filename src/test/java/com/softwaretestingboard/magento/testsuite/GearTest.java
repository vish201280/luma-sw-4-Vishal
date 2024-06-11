package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/** 6.Write down the following test into ‘GearTest’ class
 1. userShouldAddProductSuccessFullyTo
 ShoppinCart()
 * Mouse Hover on Gear Menu
 * Click on Bags
 * Click on Product Name ‘Overnight Duffle’
 * Verify the text ‘Overnight Duffle’
 * Change Qty 3
 * Click on ‘Add to Cart’ Button.
 * Verify the text
 ‘You added Overnight Duffle to your shopping cart.’
 * Click on ‘shopping cart’ Link into
 message
 * Verify the product name ‘Cronus Yoga Pant’
 * Verify the Qty is ‘3’
 * Verify the product price ‘$135.00’
 * Change Qty to ‘5’
 * Click on ‘Update Shopping Cart’ button
 * Verify the product price ‘$225.00
 *
 */

public class GearTest extends TestBase {

    HomePage homePage = new HomePage();
    GearPage gearPage = new GearPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        //Mouse Hover on Gear Menu
        homePage.mouseHoverOnGearMenu();
        //Click on Bags
        homePage.clickOnBagsLink();
        //Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnOvernightDuffle();
        //Verify the text ‘Overnight Duffle’
        String expectedText = "Overnight Duffle";
        String actualText = gearPage.getOverNightDuffleText();
        Assert.assertEquals(actualText, expectedText);
        //Change Qty 3
        gearPage.changeQtyTo3();
        //Click on ‘Add to Cart’ Button.
        gearPage.clickOnAddToCartButton();
        //Verify the text 'You added Overnight Duffle to your shopping cart.’
        expectedText = "You added Overnight Duffle to your shopping cart.";
        actualText = gearPage.getAddToShoppingCartText();
        Assert.assertEquals(actualText, expectedText);
        //Click on ‘shopping cart’ Link into message
        gearPage.clickOnShoppingCartLink();
        //Verify the product name ‘Overnight Duffle’
        expectedText = "Overnight Duffle";
        actualText = gearPage.getOverNightDufText();
        Assert.assertEquals(actualText, expectedText);
        //Verify the Qty is ‘3’
        expectedText = "3";
        actualText = gearPage.getAttributeForQty3();
        Assert.assertEquals(actualText, expectedText);
        //Verify the product price ‘$135.00’
        expectedText = "$135.00";
        actualText = gearPage.getProductPrice();
        Assert.assertEquals(actualText, expectedText);
        //Change Qty to ‘5’
        gearPage.changeQtyTo5();
        //Click on ‘Update Shopping Cart’ button
        gearPage.clickOnUpdateShoppingCartButton();
        //Verify the product price ‘$225.00
        expectedText = "$225.00";
        actualText = gearPage.getUpdatedPrice();
        Assert.assertEquals(actualText, expectedText);
    }


}
