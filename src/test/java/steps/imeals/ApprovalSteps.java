package steps.imeals;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.imeals.ApprovalPage;
import utils.DriverManager;

public class ApprovalSteps {
    WebDriver driver = DriverManager.initializeDriver();
    ApprovalPage listApprove = new ApprovalPage(driver);

    @When("access menu my approval")
    public void accessMenuMyApproval() {
        listApprove.accessMenuMyApproval();
    }
    @And("access submenu request")
    public void accessSubMenuRequest() {
        listApprove.accessSubMenuRequest();
    }
    @Then("user choose request consumption number {string}")
    public void userChooseRequestConsumptionNumber(String RequestNumber) {
        listApprove.chooseRequestConsumptionNumber(RequestNumber);
    }
    @Then("user click button approve")
    public void userClickButtonApprove() {
        listApprove.btnApproveRequestConsumption();
    }
}
