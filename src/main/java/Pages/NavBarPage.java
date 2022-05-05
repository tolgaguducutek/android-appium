package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NavBarPage extends PageBase {

    public NavBarPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "trendyol.com:id/tab_account")
    MobileElement account;

    @AndroidFindBy(id = "trendyol.com:id/tab_home")
    MobileElement home;

    @AndroidFindBy(id = "trendyol.com:id/tab_basket")
    MobileElement basket;

    @AndroidFindBy(id = "trendyol.com:id/tab_favorites")
    MobileElement favorites;

    public void setAccount() {
        click(account);
    }

    public void setHome(){
        click(home);
    }
    public void setFavorites(){
        click(favorites);
    }
    public void setBasket(){
        click(basket);
    }
}
