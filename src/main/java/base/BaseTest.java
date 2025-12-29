package base;

import org.openqa.selenium.WebDriver;
import utils.DriverManager;

public abstract class BaseTest {

    protected WebDriver driver;

    public void setUp() {
        driver = DriverManager.initializeDriver();
    }

    public void tearDown() {
        DriverManager.quitDriver();
    }
}
