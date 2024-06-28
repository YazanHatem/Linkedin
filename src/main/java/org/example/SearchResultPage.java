package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
    private WebDriver driver;
    private By SearchResult = By.xpath("//span[normalize-space()='Emran Alheeh']");

    public SearchResultPage(WebDriver driver){
        this.driver = driver ;
    }

    public AccontPage NavigateToAccountPage(){
        driver.findElement(this.SearchResult).click();
        return new AccontPage(driver) ;
    }
}
