package Pack1;

import com.trendyol.Base.TestBase;
import Pages.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AndroidLoginTest extends TestBase {
    SplashPage splashPage;
    GenderPage genderPage;
    NavBarPage navBarPage;
    LoginPage loginPage;
    AccountPage accountPage;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        androidSetup();
    }

    @Test(priority = 1)
    public void androidSuccessLogin() throws InterruptedException {
    splashPage = new SplashPage(driver);
    genderPage = new GenderPage(driver);
    navBarPage = new NavBarPage(driver);
    loginPage = new LoginPage(driver);
    accountPage = new AccountPage(driver);

    splashPage.setTurkeyButton();
    genderPage.setnotSelectGender();
    navBarPage.setAccount();
    loginPage.setEmailText("tolga.test@yandex.com");
    loginPage.setPasswordText("123123Tek");
    loginPage.setSubmitButton();
    accountPage.setRootBar();
    accountPage.setGetEmailText("tolga.test@yandex.com");


    }

    @AfterTest
    public void closeApp(){
        tearDown();
    }

}
