package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AccountPage extends PageBase{
    public AccountPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "trendyol.com:id/action_bar_root")
    MobileElement rootBar;

    @AndroidFindBy(id = "trendyol.com:id/textViewWelcoming")
    MobileElement getEmailText;

    public void setRootBar() throws InterruptedException {
        Thread.sleep(2000);
        click(rootBar);
    }

    public void setGetEmailText(String exceptText){
        String gmailTextAttr = getAttribute(getEmailText,"text");
        assertEqual(gmailTextAttr,exceptText);
    }
}
