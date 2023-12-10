package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.TestApp;

public class RegisterSuccessPage {
    @FindBy(xpath = "//*[contains(text(),\"Dear \")]")
    private WebElement salutationMessageElement;
    public String setSalutationMessage(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath("//*[contains(text(),\"Dear \")]"),5);
        return salutationMessageElement.getText();
    }
}
