package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    private WebDriver driver ;

    public Main(WebDriver driver) {
        this.driver = driver ;
    }
// private static By SigninBtn = By.xpath("//a[contains(text(),'Sign in')]");

        public void Setup() {
          //  driver = new ChromeDriver();
            driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
       // public static WebDriver Getdriver(){
        //    return driver;
        //}

        public void TearDown(){
            driver.quit();


    }
}