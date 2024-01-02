package Gun01;

import Utulity.BaseDriver;
import Utulity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe işlemini abone lunuz(YES)
  3- Newsletter  Subscribe işlemini  abonelikten çıkınız (NO)
  4-Newsletter  Subscribe durumunu kontrol ediniz Yes ise No,No ise Yes yapnız
 */

public class SubscribeNewsLetter extends BaseDriver {


    By link=By.linkText("Newsletter");

    By yes=By.cssSelector("[type='radio'][value='1']");

    By no=By.cssSelector("(//input[@type='radio'])[2]");

    By cnt=By.cssSelector("[value='Continue']"); // [type='submit'][value='Continue']




   @Test(priority = 1) // sıralı çalışşınlar diye priority veriyorum.
    void subsribeFunctionYes()
   {

       WebElement newsLetterLink=driver.findElement(link);
       newsLetterLink.click();

       WebElement subscribeYes=driver.findElement(yes);
       subscribeYes.click();

       WebElement continueButton=driver.findElement(cnt);
       continueButton.click();

       Tools.successMessageValidation();



   }
    @Test(priority = 2)
    void subsribeFunctionNo()
    {

        WebElement newsLetterLink=driver.findElement(link); // a tag li olanlara linktex kullanıyoruz
        newsLetterLink.click();

        WebElement subscribeNo=driver.findElement(no);
        subscribeNo.click();

        WebElement continueBtn=driver.findElement(cnt);
        continueBtn.click();

        Tools.successMessageValidation();



    }

    @Test(priority = 3)
    void subsribeFunctionForBoth()
    {

        WebElement newsLetterLink=driver.findElement(link); // a tag li olanlara linktex kullanıyoruz
        newsLetterLink.click();

        WebElement subscribeNo=driver.findElement(no);
        subscribeNo.click();

        WebElement subscribeYes=driver.findElement(cnt);
        subscribeYes.click();

        if (subscribeYes.isSelected()) // yes tiki şeçili ise
            subscribeNo.click(); // no ya tik at
        else
            subscribeYes.click();// değilse yes tik at

        WebElement continueBtn=driver.findElement(cnt);
        continueBtn.click();


        Tools.successMessageValidation();


    }

}
