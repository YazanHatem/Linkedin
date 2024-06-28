import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.example.*;


import java.time.Duration;

public class SearchResultPageTest {
    private WebDriver driver ;

    @BeforeMethod
    public void Setup() {
        driver = new ChromeDriver();
        new Main(driver).Setup();
    }

    @Test(description = "Verify searching for the exist account")
    public void SearchExistingAccount(){
                 AccontPage ResultPage = new LoginPage(driver)
                .LoginWithValidCredentials("yazan_r_y@hotmail.com","123yazan@123")
                .ClickOnLogInBtn()
                .SearchExistingAccount("Emran Alheeh")
                .NavigateToAccountPage();

        Assert.assertTrue(ResultPage.ConnectWithAccount());


    }
    @AfterMethod
    public void Teardown() {
        driver.quit();
    }

}
