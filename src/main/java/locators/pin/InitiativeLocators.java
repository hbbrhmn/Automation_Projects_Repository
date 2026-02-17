package locators.pin;

import org.openqa.selenium.By;

public class InitiativeLocators {
    public static final By menuInitiative = By.xpath("//a[@href='/pin/Initiative']");
    public static final By addInitiative = By.id("btnCreate");
    public static final By selectSource = By.cssSelector("span[class='select2-selection select2-selection--single form-control form-select form-select-solid form-select-lg']");
    public static final By colInitiativeTitle = By.id("judulInisiasiInput");
    public static final By colDescription = By.id("catatanTambahanInput");
    public static final By colPartner = By.id("partnerInput");
    public static final By colPotentialRevenue = By.id("potentialRevenueInput");
    public static final By colProjectCost = By.id("projectCostInput");
    public static final By colProjectLocation = By.id("lokasiProyekInput");

    public static final By chooseSource = By.cssSelector("input[aria-label='Search']");

    public static final By selectStream = By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > span:nth-child(5) > span:nth-child(1) > span:nth-child(1)");
    public static final By selectInitiativeStatus = By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > span:nth-child(4) > span:nth-child(1) > span:nth-child(1)");
    public static final By selectHub = By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(8) > span:nth-child(4) > span:nth-child(1) > span:nth-child(1)");
    public static final By selectMinistry = By.cssSelector(".select2-selection.select2-selection--multiple.form-control.form-select.form-select-solid.form-select-lg");
    public static final By selectCountry = By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(11) > span:nth-child(3) > span:nth-child(1) > span:nth-child(1)");
    public static final By selectEntities = By.cssSelector("div[class='col-md-10'] span[role='combobox']");
    public static final By selectTimelineInitial = By.id("initiativeMilestoneTargetDateInput_0");
    public static final By selectTimelineMeeting = By.id("initiativeMilestoneTargetDateInput_1");
    public static final By selectTimelineDiscussion = By.id("initiativeMilestoneTargetDateInput_2");
    public static final By selectTimelineFinal = By.id("initiativeMilestoneTargetDateInput_3");
    public static final By selectTimelineSigning = By.id("initiativeMilestoneTargetDateInput_4");
    public static final By selectDateDefinitive = By.id("targetDefinitiveInput");
    public static final By selectPartnerContactPerson = By.cssSelector("div[class='fv-row form-group row'] div[class='col-3'] span[role='combobox']");
    public static final By selectPICLead = By.cssSelector("span[class='select2-selection select2-selection--single form-select form-select-solid form-select-md fw-semibold']");
    public static final By selectPICMember = By.cssSelector(".select2-selection.select2-selection--single.form-select.form-select-solid.form-select-md.fw-semibold.fungsiPicMember");

    public static final By btnSubmit = By.id("InitiativeSubmit");
}
