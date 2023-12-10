package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.PropertyFileReader;
import utils.TestApp;

public class RegisterPage {
    PropertyFileReader prop=new PropertyFileReader();
    String firstNameElement=prop.getProperty("RegisterPage","first.name.element");
    String lastNameElement=prop.getProperty("RegisterPage","last.name.element");
    String phoneNumberElement=prop.getProperty("RegisterPage","phone.number.element");
    String emailAddressElement= prop.getProperty("RegisterPage","email.address.element");
    String countryNameElement=prop.getProperty("RegisterPage","country.name.element");
    String userNameElement= prop.getProperty("RegisterPage","user.name.element");
    String passwordElement=prop.getProperty("RegisterPage","password.element");
    String confirmPasswordElement=prop.getProperty("RegisterPage","confirm.password.element");
    String submitElement=prop.getProperty("RegisterPage","submit.element");
    WebDriver driver= TestApp.getInstance().getDriver();
    public RegisterPage setFirstName(String firstName){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(firstNameElement),5);
        driver.findElement(By.name(firstNameElement)).sendKeys(firstName);
        return this;
    }
    public RegisterPage setLastName(String lastName){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(lastNameElement),5);
        driver.findElement(By.name(lastNameElement)).sendKeys(lastName);
        return this;
    }
    public RegisterPage setPhoneNumber(String phoneNumber){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(phoneNumberElement),5);
        driver.findElement(By.name(phoneNumberElement)).sendKeys(phoneNumber);
        return this;
    }
    public RegisterPage setEmailAddress(String emailAddress){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(emailAddressElement),5);
        driver.findElement(By.id(emailAddressElement)).sendKeys(emailAddress);
        return this;
    }
    public RegisterPage setCountryName(String countryName){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(countryNameElement),5);
        Select dropDownCountryMenu=new Select(driver.findElement(By.name(countryNameElement)));
        dropDownCountryMenu.selectByVisibleText(countryName);
        return this;
    }
    public RegisterPage setUserName(String userName){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(userNameElement),5);
        driver.findElement(By.id(userNameElement)).sendKeys(userName);
        return this;
    }
    public RegisterPage setPassword(String password){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(passwordElement),5);
        driver.findElement(By.name(passwordElement)).sendKeys(password);
        return this;
    }
    public RegisterPage setConfirmPassword(String confirmPassword){
        TestApp.getInstance().waitUntilNextElementAppears(By.name(confirmPasswordElement),5);
        driver.findElement(By.name(confirmPasswordElement)).sendKeys(confirmPassword);
        return this;
    }
    public RegisterSuccessPage setClickOnSubmit(){
        driver.findElement(By.name("submit")).click();
        return new RegisterSuccessPage();
    }
}
