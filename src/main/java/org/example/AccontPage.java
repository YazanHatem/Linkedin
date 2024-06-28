package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccontPage {
    private WebDriver driver ;
    private By Connect = By.xpath("//button[contains(@aria-label,'Emran Alheeh']");
    private By IsConnected = By.xpath("//button[contains(@aria-label,'Emran Alheeh')]/child::span");

    public AccontPage(WebDriver driver) {
        this.driver = driver;
    }
    public Boolean ConnectWithAccount(){
        if (driver.findElement(this.IsConnected).getText() == "Connect") {
            driver.findElement(this.Connect).click();
        }
        return true ;
    }
}
