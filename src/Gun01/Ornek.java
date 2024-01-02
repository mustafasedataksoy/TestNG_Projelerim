package Gun01;

import Utulity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ornek extends BaseDriver {

    @Test
    void loginTest()
    {
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        System.out.println("login test");


        WebElement inputEmail=driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("mahmut@hotmail.com");


        WebElement password=driver.findElement(By.id("input-password"));
        password.sendKeys("123456789");

        WebElement loginBtn=driver.findElement(By.cssSelector("input[type='submit']"));
        loginBtn.click();

        Assert.assertEquals(driver.getTitle(),"My Account","login başarısız");


    }

}
