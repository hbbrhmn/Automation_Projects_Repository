package pages;

import base.BasePage;
import locators.LoginLocators;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void clickLoginPage() {
        click(LoginLocators.btnLoginPRZ);
    }
    public void enterEmail(String email) {
        type(LoginLocators.email, email);
        waitForSeconds(5);
    }
    public void enterPassword(String password) {
        type(LoginLocators.password, password);
    }
    public void verifyCaptcha() {
        click(LoginLocators.verifyCaptcha);
    }
    public void clickLogin() {
        click(LoginLocators.loginBtn);
    }
}
