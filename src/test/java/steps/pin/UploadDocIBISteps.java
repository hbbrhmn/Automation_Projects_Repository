package steps.pin;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.pin.IBIPage;
import utils.DriverManager;
import utils.JsonDataReader;
import utils.TestData;

public class UploadDocIBISteps {
    WebDriver driver = DriverManager.initializeDriver();
    IBIPage uploadDoc = new IBIPage(driver);

    // Ambil data dari testdata.json
    TestData.DraftCekFisik draft = JsonDataReader.getDraftCekFisik();

    @When("access menu international business intelligence")
    public void accessmenuIBI() {
        uploadDoc.accessIBI();
    }
}
