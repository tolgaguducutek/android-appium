package com.trendyol.steps;

import com.trendyol.Base.TestBase;
import Pages.AccountPage;
import io.cucumber.java.en.Then;

public class AccountStepsDefs extends TestBase {
    AccountPage accountPage;


    @Then("Rootbarda tiklama islemi yapilir")
    public void rootbardaTiklamaIslemiYapilir() throws InterruptedException {
        accountPage = new AccountPage(driver);
        accountPage.setRootBar();
    }

    @Then("{string} Email bilgisi kontrol edilir")
    public void emailBilgisiKontrolEdilir(String email) {
        accountPage.setGetEmailText(email);
    }
}
