package locators.pin;

import org.openqa.selenium.By;

public class AgreementLocators {
    public static final By menuAgreement = By.xpath("//a[@href='/pin/Agreement']");
    public static final By addAgreement = By.id("btnCreate");
    public static final By selectSource = By.cssSelector("span[class='select2 select2-container select2-container--bootstrap5 select2-container--below'] span[role='combobox']");
    public static final By chooseSource = By.cssSelector("input[aria-label='Search']");
    public static final By colAgreementTitle = By.id("judulPerjanjianInput");
    public static final By colLocationProject = By.id("lokasiProyekInput");
    public static final By colPartners = By.id("partnerInput");
    public static final By colRevenue = By.id("transactionValueInput");
    public static final By colProjectCost = By.id("projectCostInput");
    public static final By colValuation = By.id("nilaiProyekInput");
    public static final By colSupportGovernment = By.id("dukunganPemerintahInput");
    public static final By colScope = By.id("scopeProjectInput");
    public static final By colProgress = By.id("progressInput");
    public static final By colClasDesc = By.id("deskripsiKendalaInput");
    public static final By colFollowUp = By.id("tindakLanjutInput");
    public static final By colEscalation = By.id("potensialEskalasiInput");
    public static final By ColAdNote = By.id("catatanTambahanInput");

    public static final By selectAgreementType = By.cssSelector("span[class='select2-selection select2-selection--single form-control form-select form-select-solid form-select-lg']");
    public static final By selectHoldingSubHolding = By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > span:nth-child(4) > span:nth-child(1) > span:nth-child(1)");
    public static final By selectPICLead = By.cssSelector("span[class='select2-selection select2-selection--single form-select form-select-solid form-select-md fw-semibold']");
    public static final By selectPICMember = By.cssSelector(".select2-selection.select2-selection--single.form-select.form-select-solid.form-select-md.fw-semibold.fungsiPicMember");
    public static final By selectMinistry = By.cssSelector("div[class='col-lg-6'] div[class='app-content flex-column-fluid'] div[class='fv-row mb-10'] span[role='combobox']");
    public static final By selectPartnerRegion = By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(4) > span:nth-child(1) > span:nth-child(1)");
    public static final By selectSignatureDate = By.id("rangeTanggalTtdInput");
    public static final By selectEndDate = By.id("rangeTanggalBerakhirInput");
    public static final By selectDiscussionStatus = By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > span:nth-child(4) > span:nth-child(1) > span:nth-child(1)");



}
