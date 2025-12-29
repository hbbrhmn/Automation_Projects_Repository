package locators;

import org.openqa.selenium.By;

public class LoginLocators {
    public static final By btnLoginPRZ = By.cssSelector("button.form-control.btn.btn-primary.submit");
    public static final By email = By.xpath("//input[@id='email']");
    public static final By password = By.xpath("//input[@id='password']");
    public static final By verifyCaptcha = By.xpath("//button[@id='action-next']");
    public static final By loginBtn = By.xpath("//button[normalize-space()='Login']");

}
