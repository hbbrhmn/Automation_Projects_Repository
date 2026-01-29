package pages.pin;

import base.BasePage;
import locators.pin.IBILocators;
import org.openqa.selenium.WebDriver;

public class IBIPage extends BasePage {
    public IBIPage(WebDriver driver) {
        super(driver);
    }
    public void accessIBI(){
        click(IBILocators.btnIBI);
        waitForSeconds(2);
        click(IBILocators.closePopUP);
    }
    public void uploadDocument(){
        click(IBILocators.btnUploadDoc);
    }

    //Upload Document
    public void fillColumn(String Title, String Description){
        type(IBILocators.columnTitle,Title);
        type(IBILocators.columnDescription,Description);
    }
    public void chooseAuthors(String Authors){
            click(IBILocators.columnAuthors);
            type(IBILocators.columnListAuthors, Authors);
            waitForSeconds(2);
            pressEnter();
    }
    public void chooseCountries(String Countries){
        click(IBILocators.columnCountries);
        type(IBILocators.columnListCountries, Countries);
        waitForSeconds(2);
        pressEnter();
    }
    public void chooseSB(String SB){
        click(IBILocators.columnSB);
        type(IBILocators.columnListSB, SB);
        waitForSeconds(2);
        pressEnter();
    }
    public void chooseTypeOfStudy(String tos){
        click(IBILocators.columnTOS);
        type(IBILocators.columnListTOS, tos);
        waitForSeconds(2);
        pressEnter();
    }
    public void chooseDate(){
        click(IBILocators.columnDate);
        pressEnter();
    }
    public void chooseEntity(String entity){
        click(IBILocators.columnEntity);
        type(IBILocators.columnListEntity, entity);
        waitForSeconds(2);
        pressEnter();
    }
    public void chooseConfidentiality(String conf){
        click(IBILocators.columnConfidentiality);
        type(IBILocators.columnListConfidentiality, conf);
        waitForSeconds(2);
        pressEnter();
    }
    public void uploadDocIBI(String filePath){
        click(IBILocators.columnUpload);
        waitForSeconds(5);
        //typeFile(IBILocators.columnUpload, filePath);
    }
    public void submitDocument(){
        click(IBILocators.btnSubmit);
    }

    //Validate Authorize
    public void checkVisibilityButtonEdit(){

    }
}
