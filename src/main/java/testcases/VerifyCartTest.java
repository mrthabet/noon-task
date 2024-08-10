package testcases;

import static org.testng.AssertJUnit.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class VerifyCartTest extends BaseTest {

    @Test
    public void verifyCart() throws InterruptedException {
        // الذهاب إلى صفحة العربة
    	driver.get("https://www.noon.com/egypt-ar/cart/");
    	wait = new WebDriverWait(driver, Duration.ofSeconds(5));
      	Thread.sleep(5000);
    	WebElement cartButton = driver.findElement(By.xpath("//span[text()='عربة التسوق']"));
        cartButton.click();

        // التحقق من إجمالي الأسعار والخصومات
        //WebElement totalPriceElement = driver.findElement(By.id("total-price-id")); // استبدل "total-price-id" بمعرف السعر الإجمالي
      //  WebElement discountElement = driver.findElement(By.id("discount-id")); // استبدل "discount-id" بمعرف الخصم

       // double totalPrice = Double.parseDouble(totalPriceElement.getText().replace("$", ""));
        //double discount = Double.parseDouble(discountElement.getText().replace("$", ""));

       // Assert.assertTrue(totalPrice >= 0, "Total price calculation is incorrect");
      //  Assert.assertTrue(discount >= 0, "Discount calculation is incorrect");

        // تطبيق كود ترويجي
       // WebElement promoCodeInput = driver.findElement(By.id("promo-code-input-id")); // استبدل "promo-code-input-id" بمعرف حقل كود الترويجي
        //WebElement applyPromoButton = driver.findElement(By.id("apply-promo-button-id")); // استبدل "apply-promo-button-id" بمعرف زر تطبيق الكود
        //promoCodeInput.sendKeys("PROMO2024");
      //  applyPromoButton.click();

        // التحقق من تحديث السعر بعد الخصم
       // WebElement discountedPriceElement = driver.findElement(By.id("discounted-price-id")); // استبدل "discounted-price-id" بمعرف السعر بعد الخصم
       // double discountedPrice = Double.parseDouble(discountedPriceElement.getText().replace("$", ""));
      //  Assert.assertTrue(discountedPrice < totalPrice, "Promo code discount not applied correctly");
    }
}
