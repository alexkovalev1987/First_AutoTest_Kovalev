package automationpracticeui.objects.login;

import automationpracticeui.objects.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMainPage extends MainPage {


    public LoginMainPage(WebDriver driver) {
        super(driver);
    }

        @FindBy (id= "email_create")
        private WebElement emailAddressRegitrationInput;

        @FindBy (id= "SubmitCreate")
        private WebElement emailAddressRegistrationButton;

        @FindBy (id= "email")
        private WebElement emailLoginInput;

        @FindBy (id= "passwd")
        private WebElement passwordLogininput;

        @FindBy (id= "SubmitLogin")
        private WebElement submitLoginButton;


    public WebElement getEmailAddressRegitrationInput() {
        return emailAddressRegitrationInput;
    }

    public WebElement getEmailAddressRegistrationButton() {
        return emailAddressRegistrationButton;
    }

    public WebElement getEmailLoginInput() {
        return emailLoginInput;
    }

    public WebElement getPasswordLogininput() {
        return passwordLogininput;
    }

    public WebElement getSubmitLoginButton() {
        return submitLoginButton;
    }
}
