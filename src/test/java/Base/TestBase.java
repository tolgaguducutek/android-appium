package Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Scenario;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    public static AppiumDriver driver;

    public static void androidSetup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformVersion", "11");
        caps.setCapability("deviceName", "sdk_gphone_x86");
        caps.setCapability("platfromName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app", System.getProperty("user.dir") + "/apps/trendyol.apk");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
    }

    public static void browserStackSetup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserstack.user", "tolgaotomasyon_RoBdp8");
        caps.setCapability("browserstack.key", "HCkwUsoonBqH3w2Zpspe");
        caps.setCapability("platformVersion", "11.0");
        caps.setCapability("deviceName", "Samsung Galaxy S21");
        caps.setCapability("platfromName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app","bs://6e523ec20afd7bf7b5ebe9969f543f50a69f3125");
        caps.setCapability("project", "Tolga Android Trendyol");
        caps.setCapability("build", "Android Trendyol Build");
        caps.setCapability("name","first_test");
        driver = new AndroidDriver(new URL("http://hub.browserstack.com/wd/hub"), caps);
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
