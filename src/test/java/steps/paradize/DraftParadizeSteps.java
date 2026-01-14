package steps.paradize;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.paradize.DraftPageParadize;
import utils.DriverManager;
import utils.JsonDataReader;
import utils.TestData;

public class DraftParadizeSteps {

    WebDriver driver = DriverManager.initializeDriver();
    DraftPageParadize draftPage = new DraftPageParadize(driver);

    // Ambil data dari testdata.json
    TestData.DraftCekFisik draft = JsonDataReader.getDraftCekFisik();

    @When("access cek fisik")
    public void accessCekFisik() {
        draftPage.accessCekFisik();
    }
    @Then("user fill in draft header")
    public void user_fill_in_draft_header() {
        draftPage.fillHeader(draft.title,draft.location);
        draftPage.chooseDirektorat(draft.direktorat);
        draftPage.chooseCostCenter(draft.costcenter);
    }
    @When("click next")
    public void clickNext() {
        draftPage.nextstep();
    }
    @Then("choose asset number")
    public void chooseAssetNumber() {
        draftPage.chooseasset(draft.assetnumber);
    }
    @And("choose klasifikasi asset")
    public void chooseKlasifikasiAsset() {
        draftPage.chooseClasifiactionasset();
    }
    @And("choose status cek fisik")
    public void chooseStatusCekFisik() {
        draftPage.chooseStatuscekfisik();
    }
    @And("fill keterangan")
    public void fillKeterangan() {
        draftPage.fillKeterangan(draft.keterangan);
    }
    @And("upload document")
    public void uploadDocument() {
        draftPage.uploadDocument(draft.filepath);
    }
    @Then("add asset")
    public void addAsset() {
        draftPage.addAsset();
    }
    @Then("choose approver")
    public void chooseApprover() {
        draftPage.chooseapprover(draft.assetholder,draft.keuangan,draft.hssesafetyandsecurity,draft.ahli,draft.assetholderowner);
    }
    @Then("submit request")
    public void submitRequest() {
        draftPage.submitRequest();

    }
}
