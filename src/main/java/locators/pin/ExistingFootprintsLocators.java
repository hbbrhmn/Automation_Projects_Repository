package locators.pin;

import org.openqa.selenium.By;

public class ExistingFootprintsLocators {
    public static final By menuExistingFootprints = By.xpath("//a[@href='/pin/ExistingFootprints']");
    public static final By addExistingFootprints = By.id("btnCreate");
    public static final By colPartner = By.id("partnerInput");
    public static final By colPartnerLocation = By.id("partnerLocation");
    public static final By colRevenue = By.id("revenueOperatingMetrics0");
    public static final By colTotalAssets = By.id("totalAssetOperatingMetrics0");
    public static final By colEbitda = By.id("ebitdaOperatingMetrics0");
    public static final By btnOperatingMatrics = By.cssSelector("div[id='addOperatingMetrics'] a[class='btn font-weight-bold btn-warning']");

    public static final By chooseSource = By.cssSelector("input[aria-label='Search']");

    public static final By selectStreamBusiness = By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(5) > span:nth-child(1) > span:nth-child(1)");
    public static final By selectEntity = By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > span:nth-child(5) > span:nth-child(1) > span:nth-child(1)");
    public static final By selectRegion = By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > span:nth-child(5) > span:nth-child(1) > span:nth-child(1)");
    public static final By selectHub = By.cssSelector("div[class='headInput fv-row mb-10 fv-plugins-icon-container'] span[role='combobox']");
    public static final By selectPICLead = By.cssSelector("div[class='fv-row col-lg-5'] span[role='combobox']");
    public static final By selectPICMember = By.cssSelector(".select2-selection.select2-selection--single.form-select.form-select-solid.form-select-md.fw-semibold.fungsiPicMember");
    public static final By selectYear = By.cssSelector(".select2-selection.select2-selection--single.form-control.yearOM");

    public static final By btnSubmit = By.id("CreateSubmitExistingFootprints");
}
