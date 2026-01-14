package locators.paradize;

import org.openqa.selenium.By;

public class DraftParadizeLocators {

    //Cek Fisik
    public static final By btnSubmitCF = By.cssSelector(".fa-solid.fa-circle-plus.fs-2");
    //-Step 1-
    public static final By colJudul = By.id("titleInput");
    public static final By colLokasiCF = By.id("lokasiCekFisik");
    public static final By listDirektorat = By.cssSelector("#select2-ddlDirektorat-container");
    public static final By listSearchDirektorat = By.cssSelector("input[aria-label='Search']");
    public static final By listCostCenter = By.cssSelector("#select2-inputAssetHolderCostCenter-container");

    public static final By btnAddCF = By.cssSelector(".btn.btn-lg.btn-dark.rounded-0");
    public static final By btnSAN = By.cssSelector(".btn.btn-success.rounded");
    public static final By colAssetNumber = By.id("searchAssetNumber");
    public static final By btnCheckItem = By.id("btnCheckItem");
    public static final By colKlasifikasi = By.cssSelector("[aria-labelledby='select2-ddlKlasifikasiAsset-container']");
    public static final By optKlasifikasi = By.cssSelector(".select2-results__option.select2-results__option--selectable");
    public static final By colStatusCek = By.cssSelector("[aria-labelledby='select2-ddlStatusCekFisik-container']");
    public static final By colKet = By.id("keterangan");
    public static final By uploadDoc = By.id("uploadDocument");
    public static final By btnSaveAsset = By.id("btnAddItem");
    public static final By listAH = By.cssSelector("[aria-labelledby='select2-ASSET_HOLDER-container']");
    public static final By ahResults = By.cssSelector("[aria-controls='select2-ASSET_HOLDER-results']");
    public static final By listKU = By.cssSelector("[aria-labelledby='select2-KEUANGAN-container']");
    public static final By keuanganResults = By.cssSelector("[aria-controls='select2-KEUANGAN-results']");
    public static final By listHSSESafetyAndSecurity = By.cssSelector("[aria-labelledby='select2-HSSE_SAFETY_SECURITY-container']");
    public static final By hsseSafetyAndSecurityResults = By.cssSelector("input[aria-controls='select2-HSSE_SAFETY_SECURITY-results']");
    public static final By listAhli = By.cssSelector("[aria-labelledby='select2-AHLI-container']");
    public static final By ahliResults = By.cssSelector("[aria-controls='select2-AHLI-results']");
    public static final By listAHO = By.cssSelector("[aria-labelledby='select2-OWNER_ASSET_HOLDER-container']");
    public static final By ownerAssetHolderResults = By.cssSelector("[aria-controls='select2-OWNER_ASSET_HOLDER-results']");
}
