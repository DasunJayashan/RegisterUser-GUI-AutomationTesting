package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.TestApp;

public class RegisterPage {
    @FindBy(name = "firstName")
    private WebElement firstNameElement;
    @FindBy(name = "lastName")
    private WebElement lastNameElement;
    @FindBy(name = "phone")
    private WebElement phoneElement;
    @FindBy(id = "userName")
    private WebElement emailElement;
    @FindBy(name = "country")
    private WebElement countryNameElement;
    @FindBy(id="email")
    private WebElement userNameElement;
    @FindBy(name = "password")
    private WebElement passwordElement;
    @FindBy(name = "confirmPassword")
    private WebElement confirmPasswordElement;
    @FindBy(name = "submit")
    private WebElement submitElement;
    public RegisterPage setFirstName(String firstName){
        firstNameElement.sendKeys(firstName);
        return this;
    }
    public RegisterPage setLastName(String lastName){
        lastNameElement.sendKeys(lastName);
        return this;
    }
    public RegisterPage setPhone(String phoneNo){
        phoneElement.sendKeys(phoneNo);
        return this;
    }
    public RegisterPage setEmail(String emailAddress){
        emailElement.sendKeys(emailAddress);
        return this;
    }
    public RegisterPage setCountryName(String countryName){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("country"),5);
        Select dropDownCountryMenu=new Select(countryNameElement);
        dropDownCountryMenu.selectByVisibleText(countryName);
        return this;
    }
    public RegisterPage setUserName(String userName){
        userNameElement.sendKeys(userName);
        return this;
    }
    public RegisterPage setPassword(String password){
        passwordElement.sendKeys(password);
        return this;
    }
    public RegisterPage setConfirmPassword(String confirmPassword){
        confirmPasswordElement.sendKeys(confirmPassword);
        return this;
    }
    public RegisterSuccessPage setSubmit(){
        submitElement.click();
        return PageFactory.initElements(TestApp.getInstance().getDriver(), RegisterSuccessPage.class);
    }
}
