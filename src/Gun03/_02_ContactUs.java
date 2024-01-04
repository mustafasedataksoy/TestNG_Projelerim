package Gun03;

import Utulity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _02_ContactUs extends BaseDriver {

    @Test
    @Parameters("mesaj") // XML deki ile parametre adı aynı olmak zorunda
    void contactUs(String gelenMesaj){ // metod için gerekli tanımlama aynı olmak zorunda değil.

        WebElement contactUsButton=driver.findElement(By.linkText("Contact Us"));
        contactUsButton.click();

        WebElement enquiryArea= driver.findElement(By.id("input-enquiry"));
        enquiryArea.sendKeys(gelenMesaj);

        WebElement submitButton=driver.findElement(By.cssSelector("input[class='btn btn-primary']"));
        submitButton.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("success"));







    }
}
