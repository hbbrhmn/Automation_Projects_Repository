package locators.imeals;

import org.openqa.selenium.By;

public class OrderLocators {
    public static final By menuOrder = By.xpath("//span[normalize-space()='New Request']");
    public static final By contactNumber = By.id("ContactNumber");
    public static final By colNamaKegiatan = By.id("ActivityName");
    public static final By colJumlahHari = By.id("txtJumlahHariKegiatan");
    public static final By colJumlahPeserta = By.id("NumberOfParticipant");
    public static final By colJamPengantaran = By.id("pengantaran");
    public static final By colJumlahMenu = By.id("JumlahMenu");
    public static final By colTime = By.cssSelector("div[class='flatpickr-calendar hasTime noCalendar animate open arrowTop arrowLeft'] input[aria-label='Hour']");

    public static final By btnOk = By.xpath("//button[normalize-space()='OK']");
    public static final By btnChooseYes = By.cssSelector("button[class='swal2-confirm swal2-styled']");
    public static final By btnSubmitRequest = By.cssSelector(".kt-btn.kt-btn-success.btn-action-order");
    public static final By btnSubmitJenis = By.id("buttonSubmitJenis");
    public static final By btnSubmitMenu = By.id("buttonSubmitMenu");
    public static final By btnNext = By.id("btn-next-step-order");
    public static final By btnAddJenisKonsumsi = By.cssSelector(".kt-btn.kt-btn-xs.kt-btn-outline");
    public static final By btnAddMenuKonsumsi = By.xpath("//button[normalize-space()='Menu Konsumsi']");
    public static final By chooseSource = By.cssSelector("input[aria-label='Search']");

    public static final By selectDate = By.cssSelector("input[type='date']");
    public static final By selectJamAwal = By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > main:nth-child(3) > form:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > input:nth-child(4)");
    public static final By selectJamAkhir = By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > main:nth-child(3) > form:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > input:nth-child(6)");
    public static final By selectJenisKegiatan = By.cssSelector("#select2-JenisKegiatanSelect-container");
    public static final By selectPesertaKegiatan = By.cssSelector("#select2-PesertaKegiatanSelect-container");
    public static final By selectLevelJabatan = By.cssSelector("#select2-LevelJabatanSelect-container");
    public static final By selectGedung = By.cssSelector("#select2-BuildingSelect-container");
    public static final By selectLantai = By.cssSelector("#select2-FloorSelect-container");
    public static final By selectRuangan = By.cssSelector("#select2-RoomSelect-container");
    public static final By selectJenisKonsumsi = By.cssSelector("#select2-KategoriSelect-container");
    public static final By selectMenuKonsumsi = By.cssSelector("form[id='orderMenuDetail'] span[role='combobox']");

    public static final By approverName = By.id("swal-approver-name");
    public static final By successBoxText = By.id("swal2-html-container");

}
