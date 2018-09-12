package automationpracticeui.steps;

import automationpracticeui.objects.login.LoginMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPageSteps extends MainPageSteps {
    private LoginMainPage loginMainPage;

    public LoginPageSteps(WebDriver driver) {
        super(driver);
        loginMainPage = PageFactory.initElements(driver, LoginMainPage.class);
    }


    public SignUpPageSteps performEmailRegistration (String email) {
        loginMainPage.getEmailAddressRegitrationInput().clear();
        loginMainPage.getEmailAddressRegitrationInput().sendKeys(email);
        loginMainPage.getEmailAddressRegistrationButton().click();
        return new SignUpPageSteps(driver);
    }
}
