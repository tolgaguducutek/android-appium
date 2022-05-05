package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends PageBase{
    public LoginPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "trendyol.com:id/editTextEmail")
    MobileElement email;
    @AndroidFindBy(id = "trendyol.com:id/editTextPassword")
    MobileElement password;
    @AndroidFindBy(id = "trendyol.com:id/buttonLogin")
    MobileElement submitButton;
    @AndroidFindBy(id = "trendyol.com:id/snackbar_text")
    MobileElement errorText;

    public void setEmailText(String emailText){
        sendText(email,emailText);
    }
    public void setPasswordText(String passwordText){
        sendText(password,passwordText);
    }
    public void setSubmitButton(){
        click(submitButton);
    }
    public void setErrorText(String errorMessage){
        String loginErrorMessage = getAttribute(errorText,"text");
        assertEqual(loginErrorMessage,errorMessage);
    }

}
