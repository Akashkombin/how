package org1.example1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class kid {

    @Test
    public void setUpTest() {
        // Optional: set the path to chromedriver.exe if not in system PATH
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver dr = new ChromeDriver();
        dr.manage().window().maximize();
        dr.get("https://www.google.com/");
        dr.quit();
    }
}
