package steps.pin;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.pin.IBIPage;
import utils.DriverManager;
import utils.JsonDataReader;
import utils.TestData;

public class ValidateAuthorizeStepsIBI {

    WebDriver driver = DriverManager.initializeDriver();
    IBIPage validate = new IBIPage(driver);

    @Then("check visibility button edit on document {string}")
    public void checkVisibilityButtonEditOnDocument(String arg0) {

    }
}
