package automationpracticeui.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    protected WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

        @FindBy(id = "search_query_top")
        private WebElement searchInput;

        @FindBy(name = "submit_search")
        private WebElement searchSubmitButton;

        @FindBy(className = "login")
        private WebElement signinButton;

        public WebElement getSearchInput () {
            return searchInput;
        }

        public WebElement getSearchSubmitButton () {
            return searchSubmitButton;
        }

        public WebElement getSigninButton () {
            return signinButton;
        }
}
