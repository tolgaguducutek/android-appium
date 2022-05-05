package steps;

import Base.TestBase;
import Pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class LoginStepDefs extends TestBase {
    SplashPage splashPage;
    GenderPage genderPage;
    NavBarPage navBarPage;
    LoginPage loginPage;
    AccountPage accountPage;

    /*
    @Given("Android uygulamasi baslatilir")
    public void androidUygulamasiBaslatilir() throws MalformedURLException {
        browserStackSetup();
    }

     */

    @When("Splash Ekranindan Turkiye secilir")
    public void splashEkranindanTurkiyeSecilir() {
        splashPage = new SplashPage(driver);
        splashPage.setTurkeyButton();

    }

    @Then("Cinsiyet secimi yapilmadan devam edilir")
    public void cinsiyetSecimiYapilmadanDevamEdilir() {
        genderPage = new GenderPage(driver);
        genderPage.setnotSelectGender();
    }

    @Then("Navigation Bar alanindan hesabim butonuna tiklanir")
    public void navigationBarAlanindanHesabimButonunaTiklanir() {
        navBarPage = new NavBarPage(driver);
        navBarPage.setAccount();
    }

    @Then("{string} User email bilgisi yazilir")
    public void userEmailBilgisiYazilir(String email) {
        loginPage = new LoginPage(driver);
        loginPage.setEmailText(email);
    }

    @Then("{string} User password bilgisi yazilir")
    public void userPasswordBilgisiYazilir(String password) {
        loginPage.setPasswordText(password);
    }

    @Then("Submit butonuna basilir")
    public void submitButonunaBasilir() {
        loginPage.setSubmitButton();
    }

    @Then("Rootbarda tiklama islemi yapilir")
    public void rootbardaTiklamaIslemiYapilir() throws InterruptedException {
        accountPage = new AccountPage(driver);
        accountPage.setRootBar();
    }

    @Then("{string} Email bilgisi kontrol edilir")
    public void emailBilgisiKontrolEdilir(String email) {
        accountPage.setGetEmailText(email);
    }

    @Then("Uygulama kapatilir")
    public void uygulamaKapatilir() {
        tearDown();
    }
}
