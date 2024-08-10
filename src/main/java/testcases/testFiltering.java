package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class testFiltering extends BaseTest {
	   @Test
	    public void addToCart() throws InterruptedException {
	     driver.get("https://www.noon.com/egypt-ar/cart/");
	     wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	      Thread.sleep(5000);
	   // الضغط على زر "جميع الفئات" (تعديل هذا المحدد حسب هيكل الصفحة)
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='جميع الفئات']"))).click();
	        Thread.sleep(5000);
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='الإلكترونيات']"))).click();
	        driver.navigate().back();
	        Thread.sleep(5000);
	        // الضغط على خيار "الشحن بواسطة" (تعديل هذا المحدد حسب هيكل الصفحة)
	        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='الشحن بواسطة']"))).click();
	        
	        // اختيار خيار "اكسبريس" (تعديل هذا المحدد حسب هيكل الصفحة)
	       // wait.until(ExpectedConditions.elementToBeClickable(By.id("expressShippingOption"))).click();

	        // الضغط على فلتر "العلامة التجارية" (تعديل هذا المحدد حسب هيكل الصفحة)
	       // wait.until(ExpectedConditions.elementToBeClickable(By.id("brandFilterButton"))).click();

	        // ... باقي الخطوات للتحقق من النتائج

	       // driver.quit();

}}
