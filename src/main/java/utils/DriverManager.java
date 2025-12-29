package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverManager {

    private static WebDriver driver;

    public static WebDriver initializeDriver()
    {
        if (driver == null)
        {
            String browser = System.getProperty("browser", "chrome").toLowerCase();
            switch (browser)
            {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--start-maximized");
                    options.addArguments("--disable-notifications");
                    options.addArguments("--ignore-certificate-errors");//Mengabaikan semua sertifikat kesalahan
                    options.addArguments("--allow-running-insecure-content");//Mengizinkan konten yang tidak aman
                    driver = new ChromeDriver(options);
            }
                // Set implicit wait global
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                driver.manage().window().maximize();
                //driver.manage().window().setSize(new Dimension(1440, 900)); //Ukuran layar untuk case lcms

        }
        return driver;
    }
    // 🔹 Tutup browser setelah test
    public static void quitDriver()
    {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
