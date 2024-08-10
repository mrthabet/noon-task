package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class CheckOutTest extends BaseTest {

    @Test
    
    public void addToCart() throws InterruptedException {

 // إضافة المنتج إلى العربة
    	  driver.get("https://www.noon.com/egypt-ar/cart/");
      	wait = new WebDriverWait(driver, Duration.ofSeconds(5));
      	Thread.sleep(5000);
      	 driver.findElement(By.xpath("//img[contains(@src, '6ae73ece-d29e-4a81-ba41-850055d0937f.jpg')]")).click();
      	Thread.sleep(5000);
      	driver.findElement(By.xpath("//div[@class='sc-8f42f1b4-0 cLwBMW']")).click();
      	Thread.sleep(5000);
      	driver.findElement(By.xpath("//span[@class='sc-e613797-10 jvgsZp' and text()='إتمام الشراء']")).click();
      	wait = new WebDriverWait(driver, Duration.ofSeconds(5));
      	 Thread.sleep(10000);
      	//driver.findElement(By.className("sc-d13a0e88-1")).click();
    	//WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button-id")); 
       // addToCartButton.click();
        // التحقق من إضافة المنتج إلى العربة
       // WebElement cartBadge = driver.findElement(By.id("cart-badge-id")); 
       // Assert.assertTrue(cartBadge.isDisplayed(), "Product not added to cart");
    }
}
