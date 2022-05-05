package com.trendyol.hooks;

import com.trendyol.Base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.JavascriptExecutor;

import java.net.MalformedURLException;

public class BaseStepsDefs extends TestBase {

    @Before
    public void setUpDefs(Scenario scenario) throws MalformedURLException {
        String platformName = String.valueOf(scenario.getSourceTagNames());
        if (platformName.contains("Android")){
            androidSetup();
        }else if (platformName.contains("BrowserStack")){
            browserStackSetup(scenario);
        }else{
            System.out.println("Platform tag name error");
        }
    }

    @After
    public void closeApp(Scenario scenario){
        String platformName = String.valueOf(scenario.getSourceTagNames());
        if (platformName.contains("Android")) {
            tearDown();
        }else {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            if (scenario.isFailed()) {
                jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"failed\", \"reason\": \"FAIL!\"}}");
            } else {
                jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"PASS!\"}}");
            }

            tearDown();
        }
    }


}

