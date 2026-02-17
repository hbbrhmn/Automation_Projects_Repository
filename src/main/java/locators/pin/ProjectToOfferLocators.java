package locators.pin;

import org.openqa.selenium.By;

public class ProjectToOfferLocators {
    public static final By menuProjectToOffer = By.xpath("//a[@href='/pin/ProjectToOffers']");
    public static final By addProjectToOffer = By.id("btnCreate");
    public static final By colTitle = By.id("namaProyekInput");
    public static final By  colDeliverable = By.id("deliverableInput");
    public static final By  colPartner = By.id("partnerInput");
    public static final By  colRevenue = By.id("partnerInput");
    public static final By  colCapex = By.id("capexInput");
    public static final By  colTimeline = By.id("timelineInput");
    public static final By  colTypePartner = By.id("timeOfPartnerNeeded");
    public static final By  colProjectLocation = By.id("lokasiProyekProvInput");
    public static final By  colProjectProfile = By.id("projectProfileInput");
    public static final By  colProgress = By.id("progressInput");
    public static final By  colNote = By.id("catatanTambahanInput");
    public static final By  colFollowUp = By.id("tindakLanjutInput");

    public static final By chooseSource = By.cssSelector("input[aria-label='Search']");

    public static final By selectStreamBusiness = By.cssSelector("div[class='flex-row-fluid'] div[class='fv-row mb-10 fv-plugins-icon-container'] span[role='combobox']");
    public static final By selectProjectArea = By.cssSelector(".select2-selection.select2-selection--multiple.form-select.form-select-solid.form-select-md.fw-semibold.form-control");
    public static final By selectEntity = By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(7) > span:nth-child(5) > span:nth-child(1) > span:nth-child(1)");
    public static final By selectPICLead = By.cssSelector("div[class='fv-row col-lg-5'] span[role='combobox']");
    public static final By selectPICMember = By.cssSelector(".select2-selection.select2-selection--single.form-select.form-select-solid.form-select-md.fw-semibold.fungsiPicMember");
    public static final By selectProjectReadiness = By.cssSelector("div[class='input-group-prepend'] span[role='combobox']");
    public static final By selectCollaboration = By.cssSelector("div[class='input-group-prepend'] span[role='combobox']");

    public static final By btnSubmit = By.id("ProgramDevelopmentSubmit");

}
