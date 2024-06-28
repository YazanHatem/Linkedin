import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.example.*;

import java.time.Duration;

public class LoginPageTest {
    private WebDriver driver ;


    //public static void main(String[] args) {
    @BeforeMethod
    public void Setup() {
        driver = new ChromeDriver();
         new Main(driver).Setup();
    }

    @Test(description = "Verify Log-in with valid credentials")
    public void LoginWithValidCredentials() {
             new LoginPage(driver)
                .LoginWithValidCredentials("yazan_r_y@hotmail.com", "123yazan@123")
                .ClickOnLogInBtn();
        Assert.assertTrue(driver.getTitle().contains("LinkedIn"));
    }
    @Test(description = "Verify Log-in with Invalid credentials")
    public void LoginWithInValidCredentials() {
             new LoginPage(driver)
                .LoginWithInValidCredentials("yazan_r_y22@hotmail.com", "123456")
                .ClickOnLogInBtn();
        Assert.assertTrue(new LoginPage(driver).ErrorMessage().contains("Wrong email or password"));
    }

    @AfterMethod
    public void Teardown() {
       driver.quit();
    }

}