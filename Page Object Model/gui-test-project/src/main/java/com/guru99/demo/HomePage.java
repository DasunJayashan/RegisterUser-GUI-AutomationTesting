package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.TestApp;

public class HomePage {
    PropertyFileReader prop=new PropertyFileReader();
    String registerElement=prop.getProperty("HomePage","register.element");
    WebDriver driver= TestApp.getInstance().getDriver();
    public RegisterPage setClickOnRegister(){
        TestApp.getInstance().waitUntilNextElementAppears(By.linkText(registerElement),10);
        driver.findElement(By.linkText(registerElement)).click();
        return new RegisterPage();    }
}
