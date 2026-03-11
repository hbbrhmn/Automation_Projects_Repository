package pages.imeals;

import base.BasePage;
import locators.imeals.TopUpLocators;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopUpPage extends BasePage {
    public TopUpPage(WebDriver driver) {
        super(driver);
    }

    public void clickButtonTopUp() {
        WebElement btn = driver.findElement(TopUpLocators.btnTopUp);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
                "arguments[0].dispatchEvent(new MouseEvent('click', {bubbles:true, cancelable:true}));",
                btn
        );
    }

    public void chooseKategoriTopUp(String KategoriTopUp){
        click(TopUpLocators.selectCategory);
        type(TopUpLocators.chooseSource,KategoriTopUp);
        pressEnter();
    }
    public void uploadAttachment(String DirectoryFile){
        type(TopUpLocators.chooseFile,DirectoryFile);

    }
    public void clickButtonSubmit(){
        click(TopUpLocators.btnSubmitTopUp);
        waitForSeconds(2);
    }
    public void chooseYes(){
        click(TopUpLocators.btnYes);
        waitForSeconds(2);
    }

}
