package pages.imeals;

import base.BasePage;
import locators.imeals.ApprovalLocators;
import org.openqa.selenium.WebDriver;

public class ApprovalPage extends BasePage {
    public ApprovalPage(WebDriver driver) {
        super(driver);
    }

    public void accessMenuMyApproval(){
        click(ApprovalLocators.menuMyApproval);
    }
    public void accessSubMenuRequest(){
        click(ApprovalLocators.subMenuRequest);
    }
    public void chooseRequestConsumptionNumber(String requestNumber) {
        click(ApprovalLocators.listRequestKonsumsi(requestNumber));
    }
    public void btnApproveRequestConsumption(){
        click(ApprovalLocators.btnApproveRequestConsumption);
    }
    public void fillColumnReasonRevise(String reason){
        type(ApprovalLocators.columnReasonRevsie,reason);
    }
    public void btnReviseRequestConsumption(){
        click(ApprovalLocators.btnReviseRequestConsumption);
    }
    public void btnRejectRequestConsumption(){
        click(ApprovalLocators.btnRejecteRequestConsumption);
    }

}
