package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.TestApp;

public class RegisterSuccessPage {
    PropertyFileReader prop=new PropertyFileReader();
    String salutationMessageElement= prop.getProperty("RegisterSuccessPage","salutation.message.element");
    WebDriver driver= TestApp.getInstance().getDriver();
    public String setSalutationMessage(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(salutationMessageElement),5);
        return driver.findElement(By.xpath(salutationMessageElement)).getText();
    }
}
