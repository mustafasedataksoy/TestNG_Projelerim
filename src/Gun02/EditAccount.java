package Gun02;

import Utulity.BaseDriver;
import Utulity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
  Senaryo
  1- Siteyi açınız.
  2- Edit Account sayfasına ulaşınız
  3- ad ve soyadı değiştirip tekrar kaydediniz.
 */
public class EditAccount extends BaseDriver {


    By editAccount= By.linkText("Edit Account");
    By firstName=By.id("input-firstname");
    By lastName=By.id("input-lastname");
    By submitButton=By.cssSelector("input[type='submit']");


    @Test
    void editAccount(){
        editAccountTest("ismet2","temur2");
        Tools.Bekle(2);
        editAccountTest("mahmut","şensoy");
    }




    void editAccountTest(String ad,String soyad)
    {
        WebElement edit=driver.findElement(editAccount);
        edit.click();

        WebElement txtFirstname=driver.findElement(firstName);
        txtFirstname.clear();
        txtFirstname.sendKeys(ad);

        WebElement txtLastName=driver.findElement(lastName);
        txtLastName.clear();
        txtLastName.sendKeys(soyad);

        WebElement sbtButton=driver.findElement(submitButton);
        sbtButton.click();

        Tools.successMessageValidation();

    }


    {

    }

}
