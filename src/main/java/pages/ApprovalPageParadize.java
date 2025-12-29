package pages;

import base.BasePage;
import locators.ApprovalParadizeLocators;
import org.openqa.selenium.WebDriver;


public class ApprovalPageParadize extends BasePage {

    public ApprovalPageParadize(WebDriver driver) {
        super(driver);
    }

    public void chooseList(){
        click(ApprovalParadizeLocators.listCekFisik);
    }
    public void clickApprove(){
        click(ApprovalParadizeLocators.btnApprove);
    }
    public void fillRemark(String approveremark){
        type(ApprovalParadizeLocators.clmnRemark,approveremark);
    }
    public void confirmApprove(){
        click(ApprovalParadizeLocators.btnApprove);
    }

}
