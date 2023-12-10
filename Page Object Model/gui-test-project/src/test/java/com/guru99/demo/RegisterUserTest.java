package com.guru99.demo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class RegisterUserTest {
    HomePage homePage;
    RegisterPage registerPage;
    RegisterSuccessPage registerSuccessPage;
    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToUrl();
        homePage=new HomePage();
        registerPage=homePage.setClickOnRegister();
    }

    @Test
    public void testRegisterNewUser() {
        registerSuccessPage=registerPage.setFirstName("Dasun").setLastName("Jayashan").setPhoneNumber("0778592055").setEmailAddress("dasunjayashan123@gmail.com").setCountryName("ARGENTINA").setUserName("DasunJayashan").setPassword("Dasun@123").setConfirmPassword("Dasun@123").setClickOnSubmit();
        Assert.assertEquals(registerSuccessPage.setSalutationMessage(),"Dear Dasun Jayashan,","Failed to Register");
    }

    @AfterMethod
    public void tearDown() {
        TestApp.getInstance().closeBrowser();

    }
}
