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
    }
}
