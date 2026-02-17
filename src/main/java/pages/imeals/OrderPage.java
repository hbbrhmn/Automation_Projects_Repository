package pages.imeals;

import base.BasePage;
import locators.imeals.OrderLocators;
import org.openqa.selenium.WebDriver;

public class OrderPage extends BasePage {
    public OrderPage(WebDriver driver) {
        super(driver);
    }

    public void accessMenuOrder(){
        click(OrderLocators.menuOrder);
        waitForSeconds(2);
    }
    public void fillContactNumber(String Contact){
        type(OrderLocators.contactNumber,Contact);
    }
    public void clickBtnNext(){
        click(OrderLocators.btnNext);
        waitForSeconds(2);
    }
    public void fillNamaKegiatan(String Kegiatan){
        type(OrderLocators.colNamaKegiatan, Kegiatan);
    }
    public void fillJumlahHari(String Hari){
        type(OrderLocators.colJumlahHari, Hari);
    }
    public void fillJumlahPeserta(String Peserta){
        type(OrderLocators.colJumlahPeserta, Peserta);
    }
    public void chooseDate(String Date){
        type(OrderLocators.selectDate, Date);
    }
    public void chooseJamAwal(String Awal){
        click(OrderLocators.selectJamAwal);
        type(OrderLocators.colTime,Awal);
    }
    public void chooseJamAkhir(String Akhir){
        click(OrderLocators.selectJamAkhir);
        type(OrderLocators.colTime,Akhir);
        pressEnter();
    }
    public void jenisKegiatan(String JenisKegiatan){
        click(OrderLocators.selectJenisKegiatan);
        type(OrderLocators.chooseSource, JenisKegiatan);
        waitForSeconds(2);
        pressEnter();
    }
    public void pesertaKegiatan(String PesertaKegiatan){
        click(OrderLocators.selectPesertaKegiatan);
        type(OrderLocators.chooseSource, PesertaKegiatan);
        waitForSeconds(2);
        pressEnter();
    }
    public void levelJabatan(String LevelJabatan){
        click(OrderLocators.selectLevelJabatan);
        type(OrderLocators.chooseSource, LevelJabatan);
        waitForSeconds(2);
        pressEnter();
    }
    public void pilihGedung(String Gedung){
        click(OrderLocators.selectGedung);
        type(OrderLocators.chooseSource, Gedung);
        waitForSeconds(2);
        pressEnter();
    }
    public void pilihLantai(String Lantai){
        click(OrderLocators.selectLantai);
        type(OrderLocators.chooseSource, Lantai);
        waitForSeconds(2);
        pressEnter();
    }
    public void pilihRuangan(String Ruangan){
        click(OrderLocators.selectRuangan);
        type(OrderLocators.chooseSource, Ruangan);
        waitForSeconds(2);
        pressEnter();
    }
    public void clickBtnJenisKonsumsi(){
        click(OrderLocators.btnAddJenisKonsumsi);
    }
    public void addJenisKonsumsi(String JenisKonsumsi){
        click(OrderLocators.selectJenisKonsumsi);
        type(OrderLocators.chooseSource, JenisKonsumsi);
        waitForSeconds(2);
        pressEnter();
    }
    public void fillJamPengantaran(String JamPengantaran){
        click(OrderLocators.colJamPengantaran);
        type(OrderLocators.colTime, JamPengantaran);
        pressEnter();
    }
    public void clickBtnSubmitJenis(){
        click(OrderLocators.btnSubmitJenis);
        waitForSeconds(2);
    }
    public void clickBtnMenuKonsumsi(){
        click(OrderLocators.btnAddMenuKonsumsi);
    }
    public void addMenuKonsumsi(String MenuKonsumsi){
        click(OrderLocators.selectMenuKonsumsi);
        type(OrderLocators.chooseSource, MenuKonsumsi);
        waitForSeconds(2);
        pressEnter();
    }
    public void fillJumlahMenu(String JumlahMenu){
        type(OrderLocators.colJumlahMenu, JumlahMenu);
    }
    public void clickBtnSubmitMenu(){
        click(OrderLocators.btnSubmitMenu);
        waitForSeconds(2);
    }
    public void clickBtnSubmitRequest(){
        click(OrderLocators.btnSubmitRequest);
        waitForSeconds(2);
    }
    public void chooseYes(){
        click(OrderLocators.btnChooseYes);
        waitForSeconds(5);
    }
    public void clickBtnOK(){
        click(OrderLocators.btnOk);
    }
    //Assertion Approver Name
    public String getApproverName() {
        return driver
                .findElement(OrderLocators.approverName)
                .getAttribute("value");
    }
    public String getConfirmationBoxText() {
        return driver
                .findElement(OrderLocators.successBoxText)
                .getAttribute("value");
    }
}
