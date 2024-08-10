package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        // إعداد WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
      //  driver.manage().window().maximize();
        driver.get("https://www.noon.com/egypt-ar/"); 

        // إعداد WebDriverWait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // انتظار حتى 10 ثواني
    }

   // @AfterClass
    public void tearDown() {
        // إغلاق المتصفح
        if (driver != null) {
            driver.quit();
        }
    }
}