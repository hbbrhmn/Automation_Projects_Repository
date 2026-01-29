package locators.pin;

import org.openqa.selenium.By;

public class IBILocators {
    public static final By btnIBI = By.xpath("//a[@href='/pin/InternationalBusinessIntelligence']");
    public static final By closePopUP = By.cssSelector("button[aria-label='Close']");
    public static final By btnUploadDoc = By.cssSelector(".btn.btn-primary.btn-sm.bg-dark");
    public static final By columnTitle = By.id("titleInput");
    public static final By columnDescription = By.id("descriptionInput");
    public static final By columnAuthors = By.cssSelector(".select2-selection.select2-selection--single.form-select.form-select-solid.form-select-lg.pic-fungsi-select.fw-semibold");
    public static final By columnListAuthors = By.cssSelector("input[aria-label='Search']");
    public static final By columnCountries = By.cssSelector(".select2-selection.select2-selection--multiple.form-control.form-select.form-select-solid.form-select-lg.bg-white");
    public static final By columnListCountries = By.cssSelector("span[class='select2-selection select2-selection--multiple form-control form-select form-select-solid form-select-lg bg-white'] textarea[placeholder='Negara Mitra']");
    public static final By columnSB = By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > span:nth-child(4) > span:nth-child(1) > span:nth-child(1)");
    public static final By columnListSB = By.cssSelector("input[aria-label='Search']");
    public static final By columnTOS = By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(4) > span:nth-child(1) > span:nth-child(1)");
    public static final By columnListTOS = By.cssSelector("input[aria-label='Search']");
    public static final By columnDate = By.id("dateOfResearchInput");
    public static final By columnEntity = By.cssSelector("div[class='col-md-6 pt-5'] div[class='fv-row form-group pt-5'] span[role='combobox']");
    public static final By columnListEntity = By.cssSelector("input[aria-label='Search']");
    public static final By columnConfidentiality = By.cssSelector("div[class='fv-row orm-group pt-5 fv-plugins-icon-container'] span[role='combobox']");
    public static final By columnListConfidentiality = By.cssSelector("input[aria-label='Search']");
    public static final By columnUpload = By.id("dropzone");
    public static final By btnSubmit = By.id("btnSubmitIBI");

    //Validate Authorize

}
