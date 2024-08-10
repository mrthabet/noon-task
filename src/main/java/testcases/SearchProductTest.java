package testcases;

import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class SearchProductTest extends BaseTest {

    @Test
    public void searchProduct() {
        // البحث عن منتج
    	WebElement searchBox = driver.findElement(By.id("searchBar"));
    	searchBox.sendKeys("جالاكسي A15 ");
        searchBox.click();

       
    }
}