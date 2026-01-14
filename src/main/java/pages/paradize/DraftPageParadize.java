package pages.paradize;

import base.BasePage;
import locators.paradize.DraftParadizeLocators;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DraftPageParadize extends BasePage {

    public DraftPageParadize(WebDriver driver) {
        super(driver);
    }

    //Draft cek fisik
    public void fillHeader(String title, String address) {
        type(DraftParadizeLocators.colJudul, title);
        type(DraftParadizeLocators.colLokasiCF, address);
    }
    public void chooseDirektorat(String direktorat) {
        click(DraftParadizeLocators.listDirektorat);
        click(DraftParadizeLocators.listSearchDirektorat);
        type(DraftParadizeLocators.listSearchDirektorat, direktorat);
        waitForSeconds(2);
        pressEnter();
    }
    public void chooseCostCenter(String costcenter) {
        click(DraftParadizeLocators.listCostCenter);
        click(DraftParadizeLocators.listSearchDirektorat);
        type(DraftParadizeLocators.listSearchDirektorat, costcenter);
        waitForSeconds(2);
        pressEnter();
    }

    public void accessCekFisik(){
        click(DraftParadizeLocators.btnSubmitCF);
    }
    public void nextstep(){
        click(DraftParadizeLocators.btnSAN);
    }
    public void chooseasset(String assetnumber){
        click(DraftParadizeLocators.btnAddCF);
        type(DraftParadizeLocators.colAssetNumber, assetnumber);
        click(DraftParadizeLocators.btnCheckItem);
        waitForSeconds(5);
    }
    public void chooseClasifiactionasset(){
        click((DraftParadizeLocators.colKlasifikasi));
        click((DraftParadizeLocators.optKlasifikasi));
    }
    public void chooseStatuscekfisik(){
        click((DraftParadizeLocators.colStatusCek));
        click((DraftParadizeLocators.optKlasifikasi));
    }
    public void fillKeterangan(String keterangan){
        type(DraftParadizeLocators.colKet,keterangan);
    }
    public void uploadDocument(String filePath){
        WebElement fileInput = waitForPresence(DraftParadizeLocators.uploadDoc);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.display='block';", fileInput);
        typeFile(DraftParadizeLocators.uploadDoc, filePath);
    }
    public void addAsset(){
        click(DraftParadizeLocators.btnSaveAsset);
    }
    public void chooseapprover(String assetholder,String keuangan,String hssesafetyandsecurity,String ahli,String assetholderowner ){
        click(DraftParadizeLocators.listAH);
        type(DraftParadizeLocators.ahResults,assetholder);
        waitForSeconds(5);
        pressEnter();
        click(DraftParadizeLocators.listKU);
        type(DraftParadizeLocators.keuanganResults,keuangan);
        waitForSeconds(5);
        pressEnter();
        click(DraftParadizeLocators.listHSSESafetyAndSecurity);
        type(DraftParadizeLocators.hsseSafetyAndSecurityResults,hssesafetyandsecurity);
        waitForSeconds(5);
        pressEnter();
        click(DraftParadizeLocators.listAhli);
        type(DraftParadizeLocators.ahliResults,ahli);
        waitForSeconds(5);
        pressEnter();
        click(DraftParadizeLocators.listAHO);
        type(DraftParadizeLocators.ownerAssetHolderResults,assetholderowner);
        waitForSeconds(5);
        pressEnter();
    }
    public void submitRequest(){
        click(DraftParadizeLocators.btnSAN);
    }
}
