import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Baslangic extends BaseDriver {

     By aranilanFrame=By.xpath("//*[@class='EJIframeV3 EJOverlayV3']");


    @Test
    void Test1() {
        WebElement ebook = driver.findElement(By.xpath("//*[text()='Ebook']"));
        ebook.click();
        WebElement addToCart = driver.findElement(By.xpath("//*[@class='view_product']"));
        addToCart.click();
        WebElement frame1=driver.findElement(aranilanFrame);
        driver.switchTo().frame(frame1);
        Tools.Bekle(3);
        WebElement promoCode = driver.findElement(By.xpath("//*[text()='Add Promo Code']"));
        promoCode.click();
        WebElement promoCodeTxt = driver.findElement(By.xpath("//*[@class='Promo-Code-Value']"));
        promoCodeTxt.sendKeys("asdasdasdasd");
        WebElement promoCodeApply = driver.findElement(By.xpath("//button[@class='Promo-Apply']"));
        promoCodeApply.click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='SnackBar']")));
        WebElement alert = driver.findElement(By.xpath("//*[@id='SnackBar']"));
        Assert.assertTrue(alert.isDisplayed(),"Başarışız oldu");
    }
    @Test
    void Test2(){


    }
}
