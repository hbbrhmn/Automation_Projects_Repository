package steps.imeals;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.imeals.TopUpPage;
import utils.DriverManager;
import utils.JsonDataReader;
import utils.TestData;

public class TopUpSteps {
    WebDriver driver = DriverManager.initializeDriver();
    TopUpPage newTopup = new TopUpPage(driver);

    // Ambil data dari testdata.json
    TestData.TopUpSaldo topup = JsonDataReader.getTopUpSaldo();

    @When("user click button top up saldo")
    public void userClickButtonTopUpSaldo() {
       newTopup.clickButtonTopUp();
    }
    @Then("user choose kategori")
    public void userChooseKategori() {
        newTopup.chooseKategoriTopUp(topup.kategoriSaldo);
    }
    @Then("user upload attachment")
    public void userUploadAttachment() {
       newTopup.uploadAttachment(topup.directoryFile);
    }
    @Then("user click button submit top up")
    public void userClickButtonSubmitTopUp() {
       newTopup.clickButtonSubmit();
    }
    @And("user choose yes top up")
    public void userChooseYesTopUp() {
        newTopup.chooseYes();
    }
}
