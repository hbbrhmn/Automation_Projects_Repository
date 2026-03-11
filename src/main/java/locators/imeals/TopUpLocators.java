package locators.imeals;

import org.openqa.selenium.By;

public class TopUpLocators {
    public static final By btnTopUp = By.id("btnTopUpSaldo");
    public static final By btnYes = By.cssSelector("button[class='swal2-confirm swal2-styled']");
    public static final By btnSubmitTopUp = By.id("btnSubmitRequestorFunction");

    public static final By chooseSource = By.cssSelector("input[aria-label='Search']");

    public static final By selectCategory = By.cssSelector("span[class='select2-selection select2-selection--single']");
    public static final By chooseFile = By.id("topupFile");

}
