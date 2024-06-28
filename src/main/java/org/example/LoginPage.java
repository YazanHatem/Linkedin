package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private  WebDriver driver;
    private final By Email = By.xpath("//input[@id='username']");
    private final By Password = By.xpath("//input[@id='password']");
    private final By LoginBtn = By.xpath("//button[normalize-space()='Sign in']");
    private final By ErrorMessage = By.xpath("//div[@id='error-for-password']");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public LoginPage LoginWithValidCredentials(String Email , String Password){

        driver.findElement(this.Email).sendKeys(Email);
        driver.findElement(this.Password).sendKeys(Password);
        return this;
    }

    public LoginPage LoginWithInValidCredentials(String Email , String Password){
        driver.findElement(this.Email).sendKeys(Email);
        driver.findElement(this.Password).sendKeys(Password);
        return this;
    }
    public String ErrorMessage(){
        return driver.findElement(this.ErrorMessage).getText();
    }

    public HomePage ClickOnLogInBtn() {
        driver.findElement(this.LoginBtn).click();
        return new HomePage(driver);
    }

}
