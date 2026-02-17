package locators.pin;

import org.openqa.selenium.By;

public class ProgramDevelopmentLocators {
    public static final By menuProgramDevelopment = By.xpath("//a[@href='/pin/ProgramDevelopment']");
    public static final By addProgramDevelopment = By.id("btnCreate");
    public static final By selectSource = By.cssSelector("span[class='select2-selection select2-selection--single form-control form-select form-select-solid form-select-lg']");
    public static final By selectTitle = By.cssSelector("span[class='select2 select2-container select2-container--bootstrap5 select2-container--below select2-container--focus'] span[role='combobox']");
    public static final By colProgramDevelopmentTitle = By.id("judulInisiasiInput");
    public static final By colDescription = By.id("descriptionInput");
    public static final By colPotentialRevenue = By.id("potentialRevenueInput");
    public static final By colProjectCost = By.id("projectCostInput");

    public static final By chooseSource = By.cssSelector("input[aria-label='Search']");

    public static final By selectProgramDevelopmentStatus = By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > span:nth-child(6) > span:nth-child(1) > span:nth-child(1)");
    public static final By selectTimelineProjectCharter = By.id("initiativeMilestoneTargetDateInput_0");
    public static final By selectTimelineFDefinitiveAgreement = By.id("initiativeMilestoneTargetDateInput_1");

    public static final By btnSubmit = By.id("ProgramDevelopmentSubmit");
}
