package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.TopMenu;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    TopMenu topMenu = new TopMenu();

    @Test
    public void verifyPageNavigation() {
        topMenu.clickOnComputerMenu();
        String actualResult = topMenu.getComputerText();
        String expectedText = "Computers";
        Assert.assertEquals(actualResult, expectedText);
    }





}



