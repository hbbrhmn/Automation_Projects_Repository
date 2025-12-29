package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import utils.DriverManager;

public class Hooks {
    @Before
    public void setup() {
        DriverManager.initializeDriver(); // membuka browser
    }

//    @After
//    public void tearDown() {
//        DriverManager.quitDriver(); // menutup browser
//    }
}
