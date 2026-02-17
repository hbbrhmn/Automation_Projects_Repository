package steps.imeals;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.imeals.OrderPage;
import utils.DriverManager;
import utils.JsonDataReader;
import utils.TestData;
import static org.junit.Assert.assertEquals;

public class OrderSteps {
    WebDriver driver = DriverManager.initializeDriver();
    OrderPage newOrder = new OrderPage(driver);

    // Ambil data dari testdata.json
    TestData.OrderConsumption order = JsonDataReader.getOrderConsumption();

    @When("access menu new request")
    public void accessMenuNewRequest() {
        newOrder.accessMenuOrder();
    }

    @Then("user fill column contact number")
    public void userFillColumnContactNumber() {
        newOrder.fillContactNumber(order.contactNumber);
    }
    @And("user click button next")
    public void userClickButtonNext() {
        newOrder.clickBtnNext();
    }
    @And("user skip upload attachment")
    public void userSkipUploadAttachment() {
        newOrder.clickBtnNext();
    }
    @Then("user fill column nama kegiatan")
    public void userFillColumnNamaKegiatan() {
        newOrder.fillNamaKegiatan(order.namaKegiatan);
    }
    @Then("user fill column jumlah hari")
    public void userFillColumnJumlahHari() {
        newOrder.fillJumlahHari(order.jumlahHari);
    }
    @Then("user fill column jumlah peserta")
    public void userFillColumnJumlahPeserta() {
        newOrder.fillJumlahPeserta(order.jumlahPeserta);
    }
    @Then("user choose tanggal")
    public void userChooseTanggal() {
        newOrder.chooseDate(order.tanggalKegiatan);
    }
    @Then("user choose jam awal")
    public void userChooseJamAwal() {
        newOrder.chooseJamAwal(order.jamAwal);
    }
    @Then("user choose jam akhir")
    public void userChooseJamAkhir() {
        newOrder.chooseJamAkhir(order.jamAkhir);
    }
    @Then("user choose jenis kegiatan")
    public void userChooseJenisKegiatan() {
        newOrder.jenisKegiatan(order.jenisKegiatan);
    }
    @Then("user choose peserta kegiatan")
    public void userChoosePesertaKegiatan() {
        newOrder.pesertaKegiatan(order.pesertaKegiatan);
    }
    @Then("user choose level jabatan")
    public void userChooseLevelJabatan() {
       newOrder.levelJabatan(order.levelJabatan);
    }
    @Then("user choose gedung")
    public void userChooseGedung() {
        newOrder.pilihGedung(order.gedung);
    }
    @Then("user choose lantai")
    public void userChooseLantai() {
        newOrder.pilihLantai(order.lantai);
    }
    @Then("user choose ruangan")
    public void userChooseRuangan() {
        newOrder.pilihRuangan(order.ruangan);
    }
    @Then("user click button add jenis konsumsi")
    public void userClickButtonAddJenisKonsumsi() {
        newOrder.clickBtnJenisKonsumsi();
    }
    @Then("user choose jenis konsumsi")
    public void userChooseJenisKonsumsi() {
        newOrder.addJenisKonsumsi(order.jenisKonsumsi);
    }
    @Then("user fill column pengantaran")
    public void userFillColumnPengantaran() {
        newOrder.fillJamPengantaran(order.jamPengantaran);
    }
    @And("user click button submit jenis")
    public void userClickButtonSubmitJenis() {
        newOrder.clickBtnSubmitJenis();
    }
    @And("user click button add menu")
    public void userClickButtonAddMenu() {
        newOrder.clickBtnMenuKonsumsi();
    }
    @Then("user choose menu")
    public void userChooseMenu() {
        newOrder.addMenuKonsumsi(order.menuKonsumsi);
    }
    @Then("user fill column jumlah menu")
    public void userFillColumnJumlahMenu() {
        newOrder.fillJumlahMenu(order.jumlahMenu);
    }
    @And("user click button submit menu")
    public void userClickButtonSubmitMenu() {
       newOrder.clickBtnSubmitMenu();
    }
    @Then("user click button submit request")
    public void userClickButtonSubmitRequest() {
        newOrder.clickBtnSubmitRequest();
    }
    @Then("approver name should be {string}")
    public void approverNameShouldBe(String expectedName) {
        String actualName = newOrder.getApproverName();
        assertEquals(expectedName, actualName);
    }
    @And("user choose yes")
    public void userChooseYes() {
        newOrder.chooseYes();
    }
    @Then("pop up success box text should be {string}")
    public void popUpSuccessBoxTextShouldBe(String successBoxText) {
        String actualText = newOrder.getConfirmationBoxText();
        assertEquals(successBoxText, actualText);
    }
    @And("user click tombol ok")
    public void userClickTombolOk() {
        newOrder.clickBtnOK();
    }
}
