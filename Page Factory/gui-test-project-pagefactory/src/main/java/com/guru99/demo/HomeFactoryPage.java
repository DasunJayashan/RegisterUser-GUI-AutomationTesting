package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

public class HomeFactoryPage {
    @FindBy(linkText = "REGISTER")
    private WebElement registerMenuElement;
    public RegisterFactoryPage clickOnRegisterLink(){
        TestApp.getInstance().waitUntilNextElementAppears(By.linkText("REGISTER"),10);
        registerMenuElement.click();
        return PageFactory.initElements(TestApp.getInstance().getDriver(), RegisterFactoryPage.class);
    }
}
