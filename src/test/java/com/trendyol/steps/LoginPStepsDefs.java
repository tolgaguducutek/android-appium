package com.trendyol.steps;

import com.trendyol.Base.TestBase;
import Pages.LoginPage;
import io.cucumber.java.en.Then;

public class LoginPStepsDefs extends TestBase {
    LoginPage loginPage;

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
}
