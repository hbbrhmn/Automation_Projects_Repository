package steps.paradize;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.paradize.ApprovalPageParadize;
import utils.DriverManager;
import utils.JsonDataReader;
import utils.TestData;

public class ApprovalPardizeSteps {

    WebDriver driver = DriverManager.initializeDriver();
    ApprovalPageParadize approvalPage = new ApprovalPageParadize(driver);

    // Ambil data dari testdata.json
    TestData.ApprovalRemark remark = JsonDataReader.getApprovalRemark();

    @Then("choose list with status request")
    public void chooselist(){
        approvalPage.chooseList();
    }

    @Then("click approve")
    public void clickApprove() {
        approvalPage.clickApprove();
    }

    @And("fill column remark")
    public void fillColumnRemark() {
        approvalPage.fillRemark(remark.approveremark);
    }

    @Then("approve request")
    public void approveRequest() {
        approvalPage.confirmApprove();
    }
}
