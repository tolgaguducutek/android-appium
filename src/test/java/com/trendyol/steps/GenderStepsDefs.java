package com.trendyol.steps;

import com.trendyol.Base.TestBase;
import Pages.GenderPage;
import io.cucumber.java.en.Then;

public class GenderStepsDefs extends TestBase {
    GenderPage genderPage;

    @Then("Cinsiyet secimi yapilmadan devam edilir")
    public void cinsiyetSecimiYapilmadanDevamEdilir() {
        genderPage = new GenderPage(driver);
        genderPage.setnotSelectGender();
    }

}
