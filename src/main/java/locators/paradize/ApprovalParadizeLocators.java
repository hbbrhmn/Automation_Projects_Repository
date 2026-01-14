package locators.paradize;

import org.openqa.selenium.By;

public class ApprovalParadizeLocators {
    //Cek Fisik
    public static final By listCekFisik = By.xpath("//td[text()='Automated Draft']/..//i[@title='View']");
    public static final By btnApprove = By.cssSelector(".btn.btn-success.rounded");
    public static final By btnRevise = By.cssSelector(".btn.btn-warning.rounded");
    public static final By clmnRemark = By.id("approval-form-remark");
}
