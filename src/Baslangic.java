import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Baslangic extends BaseDriver {


    @Test
    void Test1() {
        WebElement ebook = driver.findElement(By.xpath("//*[text()='Ebook']"));

        ebook.click();
        WebElement addToCart = driver.findElement(By.xpath("//*[@class='view_product']"));
        addToCart.click();
        driver.switchTo().frame(6);
        WebElement promoCode = driver.findElement(By.xpath("//*[text()='Add Promo Code']"));
        promoCode.click();
        WebElement promoCodeTxt = driver.findElement(By.xpath("//*[@class='Promo-Code-Value']"));
        promoCodeTxt.sendKeys("asdasdasdasd");
        WebElement promoCodeApply = driver.findElement(By.xpath("//button[@class='Promo-Apply']"));
        promoCodeApply.click();
        WebElement alert = driver.findElement(By.xpath("//*[@id='SnackBar']"));
        Assert.assertTrue(alert.isDisplayed(), "Başarılı oldu");
    }
}
