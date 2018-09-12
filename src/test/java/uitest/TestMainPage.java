package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestMainPage extends BaseTest {

    @Test (description = "90")
    void testSearch (){

        mainPageSteps.search("Cool dress");


    }
}
