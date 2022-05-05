package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class GenderPage extends PageBase{

    public GenderPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "trendyol.com:id/buttonDismiss")
    MobileElement notSelectGender;
    @AndroidFindBy(id ="trendyol.com:id/buttonSelectGenderWoman")
    MobileElement selectGenderWoman;
    @AndroidFindBy(id = "trendyol.com:id/buttonSelectGenderMan")
    MobileElement selectGenderMan;

    public void setnotSelectGender(){
        click(notSelectGender);
    }
    public void setSelectGenderWoman(){
        click(selectGenderWoman);
    }
    public void setSelectGenderMan(){
        click(selectGenderMan);
    }

}