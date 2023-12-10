package com.guru99.demo;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class RegisterUserTest {
    HomeFactoryPage homePage;
    RegisterFactoryPage registerPage;
    RegisterSuccessFactoryPage registerSuccessPage;
    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToUrl();
        homePage= PageFactory.initElements(TestApp.getInstance().getDriver(), HomeFactoryPage.class);
        registerPage=homePage.clickOnRegisterLink();

    }

    @Test
    public void testRegisterNewUser() {
        registerSuccessPage=registerPage.setFirstName("Dasun").setLastName("Jayashan").setPhoneNumber("0778592055").setEmailAddress("dasunjayashan123@gmail.com").setCountryName("SRI LANKA").setUserName("DasunJayashan").setPassword("Dasun@123").setConfirmPassword("Dasun@123").setSubmit();
    }

    @AfterMethod
    public void tearDown() {
        TestApp.getInstance().closeBrowser();
    }
}
