package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.TestApp;

public class RegisterFactoryPage {
    @FindBy(name = "firstName")
    private WebElement firstNameElement;
    @FindBy(name = "lastName")
    private WebElement lastNameElement;
    @FindBy(name = "phone")
    private WebElement phoneNoElement;
    @FindBy(id = "userName")
    private WebElement emailAddressElement;
    @FindBy(name = "country")
    private WebElement countryNameElement;
    @FindBy(id = "email")
    private WebElement userNameElement;
    @FindBy(name = "password")
    private WebElement passwordElement;
    @FindBy(name = "confirmPassword")
    private WebElement confirmPasswordElement;
    @FindBy(name = "submit")
    private WebElement submitElement;
    public RegisterFactoryPage setFirstName(String firstName){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("firstName"),5);
        firstNameElement.sendKeys(firstName);
        return this;
    }
    public RegisterFactoryPage setLastName(String lastName){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("lastName"),5);
        lastNameElement.sendKeys(lastName);
        return this;
    }
    public RegisterFactoryPage setPhoneNumber(String phoneNumber){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("phone"),5);
        phoneNoElement.sendKeys(phoneNumber);
        return this;
    }
    public RegisterFactoryPage setEmailAddress(String emailAddress){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("userName"),5);
        emailAddressElement.sendKeys(emailAddress);
        return this;
    }
    public RegisterFactoryPage setCountryName(String countryName){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("country"),5);
        Select dropDownCountryMenu=new Select(countryNameElement);
        dropDownCountryMenu.selectByVisibleText(countryName);
        return this;
    }
    public RegisterFactoryPage setUserName(String userName){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("email"),5);
        userNameElement.sendKeys(userName);
        return this;
    }
    public RegisterFactoryPage setPassword(String password){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("password"),5);
        passwordElement.sendKeys(password);
        return this;
    }
    public RegisterFactoryPage setConfirmPassword(String confirmPassword){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("confirmPassword"),5);
        confirmPasswordElement.sendKeys(confirmPassword);
        return this;
    }
    public RegisterSuccessFactoryPage setSubmit(){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("submit"),5);
        submitElement.click();
        return PageFactory.initElements(TestApp.getInstance().getDriver(), RegisterSuccessFactoryPage.class);
    }
}
