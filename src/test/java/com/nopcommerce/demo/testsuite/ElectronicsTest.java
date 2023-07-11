package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Electronics;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {


    Electronics electronics = new Electronics();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        electronics.mouseHoverOnElectronics();
        electronics.mouseHoverAndClickOnCellPhones();
        electronics.GetTextCellPhones();

        String expectedText = "Cell phones";
        String actualText = electronics.GetTextCellPhones();
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        electronics.mouseHoverOnElectronics();
        electronics.mouseHoverAndClickOnCellPhones();
        electronics.GetTextCellPhones();

        String expectedText = "Cell phones";
        String actualText = electronics.GetTextCellPhones();
        Assert.assertEquals(actualText, expectedText);

        electronics.clickOnListViewTab();
        Thread.sleep(1000);
        electronics.clickOnNokiaLumia1020();

        String expectedTextNokiaLumia = "Nokia Lumia 1020";
        String actualTextNokiaLumia = electronics.getTextNokiaLumia1020();
        Assert.assertEquals(expectedTextNokiaLumia, actualTextNokiaLumia);

        String expectedPrice = "$349.00";
        String actualPrice = electronics.getToVerifyThePrice();
        Assert.assertEquals(expectedPrice, actualPrice);

        electronics.changeQuantityTo2();

        electronics.clickAddToCart();

        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = electronics.getToVerifyTheMessage();
        Assert.assertEquals(expectedMessage, actualMessage);

        electronics.closeTheBarClickingOnTheCrossButton();

        electronics.mouseHoverShoppingCart();
        electronics.clickToGoCart();

        String expectedShoppingCartText = "Shopping cart";
        String actualShoppingCartText = electronics.getShoppingCartMessage();
        Assert.assertEquals(expectedShoppingCartText, actualShoppingCartText);

        Thread.sleep(1000);
        //   String expectedShoppingCartQuantity = "2";
        //  String actualShoppingCartQuantity = electronics.getVerifyTheQuantity();
        //  Assert.assertEquals(expectedShoppingCartQuantity, actualShoppingCartQuantity);

        String expectedTotalValue = "$698.00";
        String actualTotalValue = electronics.getToVerifyTheTotal();
        Assert.assertEquals(expectedTotalValue, actualTotalValue);

        electronics.clickToCheckBox();
        electronics.clickToCheckOut();

        String expectedWelcomeMessage = "Welcome, Please Sign In!";
        String actualWelcomeMessage  = electronics.getToVerifyWelcomeMessage();
        Assert.assertEquals(expectedWelcomeMessage,actualWelcomeMessage);

        electronics.clickOnRegister();

        String expectedRegisterMessage = "Register";
        String actualRegisterMessage  = electronics.getToVerifyRegisterText();
        Assert.assertEquals(expectedRegisterMessage,actualRegisterMessage);

        electronics.clickOnGenderField();
        electronics.firstNameField();
        electronics.lastNameField();
        electronics.emailField();
        electronics.passwordField();
        electronics.confirmPasswordField();
        electronics.clickOnRegisterTab();

        electronics.getToVerifyRegisteraionComplete();

        electronics.clickOnContinueAfterRegistration();

        // Login again because cart is empty
        electronics.clickOnLoginAbove();
        electronics.inputOnEmailLoginField();
        electronics.inputOnPasswordLoginField();
        electronics.clickOnLoginButton();


        String expectedShoppingCartMessage = "Shopping cart";
        String actualShoppingCartMessage = electronics.getToVerifyShoppingCartText();
        Assert.assertEquals(expectedShoppingCartMessage, actualShoppingCartMessage);

        electronics.clickOnCheckBox();
        electronics.clickOnFinalCheckOut();
        // 2.27 Fill the Mandatory fields
        electronics.selectCountryField();
        electronics.selectStateField();
        electronics.inputOnCityField();
        electronics.inputOnAddressField();
        electronics.inputOnPostalField();
        electronics.inputOnPhoneNumber();

        electronics.clickOnContinueAfterAllMandatoryfields();
        electronics.clickOnShipping2Option();
        electronics.clickOnContinueButtonAfterSelectingShippingOption();
        // 2.31 Select Radio Button “Credit Card”
        electronics.clickOnRadioButton();
        electronics.continueAfterCreditCard() ;

        electronics.selectCreditCardType();
        electronics.inputCardHolderName();
        electronics.inputCardNumberField();
        electronics.selectExpiryDateField();
        electronics.selectExpiryYearField();
        electronics.inputCreditCardCode();
        //2.34 Click on “CONTINUE”
        electronics.continueAftersSuccessfullyProcessed();
        //2.35 Verify “Payment Method” is “Credit Card”
        String expectedPaymentMethodMessage = "Payment Method: Credit Card";
        String actualPaymentMethodMessage = electronics.getToVerifyPaymentMethodByCard();
        Assert.assertEquals(expectedPaymentMethodMessage, actualPaymentMethodMessage);

        //2.36 Verify “Shipping Method” is “2nd Day Air”
        String expectedShippingMethodMessage = "Shipping Method: 2nd Day Air";
        String actualShippingMethodMessage = electronics.getToVerifyShippingMethod();
        Assert.assertEquals(expectedShippingMethodMessage, actualShippingMethodMessage);

        //2.37 Verify Total is “$698.00”

        String expectedTotalFinalPayment = "$698.00";
        String actualTotalFinalPayment = electronics.getToVerifyTotalFinalAmount();
        Assert.assertEquals(expectedTotalFinalPayment, actualTotalFinalPayment);
        Thread.sleep(1000);
        //2.38 Click on “CONFIRM”
        electronics.clickOnConfirmAfterPayment();

        //2.39 Verify the Text “Thank You”
        Thread.sleep(1000);
        String expectedThankYouMessage = "Thank you";
        String actualThankYouMessage = electronics.getToVerifyThankYouMessage();
        Assert.assertEquals(expectedThankYouMessage, actualThankYouMessage);



        //2.40 Verify the message “Your order has been successfully processed!”
        String expectedSuccessfullyProcessed = "Your order has been successfully processed!";
        String actualSuccessfullyProcessed = electronics.getToVerifySuccessfullyProcessedMessage();
        Assert.assertEquals(expectedSuccessfullyProcessed, actualSuccessfullyProcessed);


        //2.41 Click on “CONTINUE”
        electronics.clickOnContinueAfterSuccessfullyMessage();

        //2.42 Verify the text “Welcome to our store”
        String expectedWelcomeToOurStoreMessage = "Welcome to our store";
        String actualWelcomeToOurStoreMessage= electronics.getToVerifyWelcomeToOurStoreMessage();
        Assert.assertEquals(expectedWelcomeToOurStoreMessage,actualWelcomeToOurStoreMessage);


        //2.43 Click on “Logout” link
        electronics.clickOnLogOut();


        //2.44 Verify the URL is “https://demo.nopcommerce.com/
        //   String currentUrl = electronics.checkTheCurrentUrl();
        //   String expectedUrl2 = "https://demo.nopcommerce.com/";
        //   Assert.assertEquals("Url not verified", expectedUrl2, currentUrl);



}


}


