package automationpracticeui.steps;

import automationpracticeui.objects.MainPage;
import deflogger.TestsLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPageSteps {

    private MainPage mainPage;
    protected WebDriver driver;

    public MainPageSteps(WebDriver driver) {
        this.driver = driver;
        this.mainPage = PageFactory.initElements(driver, MainPage.class);

    }
    public void search(String searchQuery) {
        TestsLogger.logStep();
        mainPage.getSearchInput().clear();
        mainPage.getSearchInput().sendKeys(searchQuery);
        mainPage.getSearchSubmitButton().click();
    }

    public LoginPageSteps clickSigninButton(){
        mainPage.getSigninButton().click();
        return new LoginPageSteps(driver);
    }


}
