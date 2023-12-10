package com.guru99.demo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.TestApp;

public class RegisterUserStepDefs {
    HomePage homePage;
    RegisterPage registerPage;
    RegisterSuccessPage registerSuccessPage;
    @Given("User is on Home Page --> Register Page")
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homePage= PageFactory.initElements(TestApp.getInstance().getDriver(), HomePage.class);
        registerPage=homePage.clickOnRegisterLink();
    }

    @Given("User enter first name as {string}")
    public void setFirstName(String firstName) {
        registerPage.setFirstName(firstName);
    }

    @And("User enter last name as {string}")
    public void setLastName(String lastName) {
        registerPage.setLastName(lastName);
    }

    @And("User enter phone number as {string}")
    public void setPhoneNumber(String phoneNumber) {
        registerPage.setPhone(phoneNumber);
    }

    @And("User enter email address as {string}")
    public void setEmailAddress(String emailAddress) {
        registerPage.setEmail("dasunjayashan123@gmail.com");
    }

    @And("User select country as {string}")
    public void setCountryName(String countryName) {
        registerPage.setCountryName(countryName);
    }

    @And("User enter user name as {string}")
    public void setUserName(String userName) {
        registerPage.setUserName(userName);
    }

    @And("User enter password as {string}")
    public void setPassword(String password) {
        registerPage.setPassword(password);
    }

    @And("User enter confirm password as {string}")
    public void setConfirmPassword(String confirmPassword) {
        registerPage.setConfirmPassword(confirmPassword);
    }

    @When("User clicks on submit")
    public void Submit() {
        registerSuccessPage=registerPage.setSubmit();
    }

    @Then("Salutation message will displays as {string}")
    public void verifySalutationMessage(String expectedMessage) {
        Assert.assertEquals(registerSuccessPage.setSalutationMessage(),expectedMessage,"Failed to Register");
    }
}
