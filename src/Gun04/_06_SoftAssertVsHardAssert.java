package Gun04;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _06_SoftAssertVsHardAssert {

    @Test
    void HardAssert()
    {
         String s1="Merhaba";

        System.out.println("Hard Assert kontrol oncesi");
        Assert.assertEquals("Merhaba 123",s1, "HardAssert sonucu ");
        System.out.println("Hard Assert kontrol sonrası");

    }

    @Test
    void softAssert()
    {
        String strHomePage="www.facebook.com/homepage";
        String strCartPage="www.facebook.com/cartpage";
        String strEditAccount="www.facebook.com/editaccountpage";

        SoftAssert _softAssert = new SoftAssert();

        _softAssert.assertEquals("www.facebook.com/homepage",strHomePage); // true
        System.out.println("assert 1");

        _softAssert.assertEquals("www.facebook.com/profile",strCartPage); // false
        System.out.println("assert 2");

        _softAssert.assertEquals("www.facebook.com/settings",strEditAccount); // false
        System.out.println("assert 3");

        _softAssert.assertAll(); // bütün assert sonuçlarını işleme koyuyor.
        System.out.println("Aktiflik sonrası ");




    }
}
