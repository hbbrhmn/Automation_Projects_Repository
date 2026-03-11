package locators.imeals;

import org.openqa.selenium.By;

public class ApprovalLocators {
    public static final By menuMyApproval = By.xpath("//span[normalize-space()='My Approval']");
    public static final By subMenuRequest = By.xpath("//span[normalize-space()='Request']");
    public static final By btnApproveRequestConsumption = By.id("btnApprove");
    public static final By btnReviseRequestConsumption = By.id("btnRevise");
    public static final By btnRejecteRequestConsumption = By.id("btnReject");

    public static final By columnReasonRevsie = By.id("inputReason");
    public static By listRequestKonsumsi(String requestNumber) {return By.xpath("//a[contains(@class,'budget-code-link') and normalize-space(text())='" + requestNumber + "']");}

}
