package locators;

import org.openqa.selenium.By;

public class LoginLocators {
    public static final By btnLoginMainMenu = By.xpath("//button[normalize-space(.)='Login' or .//span[normalize-space()='Login']]"); //dikarnakan ada 2 element yang berbeda maka digunakan or
    public static final By email = By.xpath("//input[@id='email']");
    public static final By password = By.xpath("//input[@id='password']");
    public static final By verifyCaptcha = By.xpath("//button[@id='action-next']");
    public static final By loginBtn = By.xpath("//button[normalize-space()='Login']");

}
