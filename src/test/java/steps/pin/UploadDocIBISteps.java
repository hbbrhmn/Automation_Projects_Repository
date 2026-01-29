package steps.pin;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
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
    TestData.UploadIBI upload = JsonDataReader.getUploadIBI();

    @When("access menu international business intelligence")
    public void accessmenuIBI() {
        uploadDoc.accessIBI();
    }

    @Then("user click button upload document")
    public void userClickButtonUploadDocument() {
        uploadDoc.uploadDocument();
    }

    @Then("user fill column")
    public void userFillColumn() {
        uploadDoc.fillColumn(upload.titleIBI,upload.descIBI);
    }

    @Then("user choose authors")
    public void userChooseAuthors() {
        uploadDoc.chooseAuthors(upload.authors);
    }

    @Then("user choose countries")
    public void userChooseCountries() {
        uploadDoc.chooseCountries(upload.countries);
    }

    @Then("user choose stream")
    public void userChooseStream() {
        uploadDoc.chooseSB(upload.stream);
    }

    @Then("user choose type of study")
    public void userChooseTypeOfStudy() {
        uploadDoc.chooseTypeOfStudy(upload.tos);
    }

    @Then("user choose date research")
    public void userChooseDateResearch() {
        uploadDoc.chooseDate();
    }

    @Then("user choose entity")
    public void userChooseEntity() {
        uploadDoc.chooseEntity(upload.entity);
    }

    @Then("user choose confidentiality")
    public void userChooseConfidentiality() {
        uploadDoc.chooseConfidentiality(upload.confidentiality);
    }

    @Then("user upload doc")
    public void userUploadDoc() {
        uploadDoc.uploadDocIBI(upload.pathfile);
    }

    @And("submit document")
    public void submitDocument() {
        uploadDoc.submitDocument();
    }
}
