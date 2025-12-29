package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.ConfigReader;
import utils.DriverManager;
import utils.JsonDataReader;
import utils.TestData;

public class LoginSteps {
    WebDriver driver = DriverManager.initializeDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("user open {string} site")
    public void user_open_site(String environment) {
        String url = ConfigReader.getEnvUrl(environment);
        driver.get(url);
        System.out.println("🌍 Opened site: " + url);
    }

    @When("user login as {string}")
    public void user_login_as(String role) {
        // Ambil email & password dari testdata.json
        TestData.User user = JsonDataReader.getUser(role);
        System.out.println("🔐 Login as " + role + " | Email: " + user.email + " | Password: " + user.password);

        // Jalankan login step-by-step
        loginPage.clickLoginPage();
        loginPage.enterEmail(user.email);
        loginPage.verifyCaptcha();
        loginPage.enterPassword(user.password);
        loginPage.clickLogin();
    }

}
