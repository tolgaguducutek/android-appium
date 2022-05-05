package com.trendyol.steps;

import com.trendyol.Base.TestBase;
import Pages.SplashPage;
import io.cucumber.java.en.When;

public class SplashStepsDefs extends TestBase {
    SplashPage splashPage;

    @When("Splash Ekranindan Turkiye secilir")
    public void splashEkranindanTurkiyeSecilir() {
        splashPage = new SplashPage(driver);
        splashPage.setTurkeyButton();

    }
}
