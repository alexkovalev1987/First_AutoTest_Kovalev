package uitest.login;

import automationpracticeui.steps.LoginPageSteps;
import automationpracticeui.steps.SignUpPageSteps;
import org.testng.annotations.Test;
import uitest.BaseTest;

public class TestSignUp extends BaseTest {

        @Test()
        void testSignUp (){
            LoginPageSteps loginPageSteps = mainPageSteps.clickSigninButton();
            SignUpPageSteps signUpPageSteps = loginPageSteps.performEmailRegistration("wefwef@gmail.com");
        }

}
