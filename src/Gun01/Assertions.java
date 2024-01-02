package Gun01;

import Utulity.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions extends BaseDriver {

    @Test
    void EqualOrnek()
    {
        String s1="Merhaba";
        String s2="Merhaba";

                       // actual(oluşan ) ,Expected(Beklenen) ,Mesaj(opsiyonel)
        Assert.assertEquals(s1,s2,"Karşılaştırma sonucu "); // hard assertion ,soft assertion
        // Actual - Expected - Message ( A E M) sırasını alfabetik sıraya göre hatırlayabiliriz



    }
    @Test
    void NotEqualOrnek()
    {
        String s1="Merhaba";
        String s2="Merhaba";

        Assert.assertNotEquals(s1,s2,"Karşılaştırma sonucu");


    }

    @Test
    void TrueOrnek()
    {
       int s1 =55;
       int s2=66;

        Assert.assertTrue(s1==s2,"Karşılaştırma sonucu");


    }
    @Test
    void NullOrnek()
    {
       String s1="sedat";


        Assert.assertNull(s1,"Karşılaştırma sonucu");


    }
    @Test
    void direktFail()
    {
        int a=55;

        if (a==55)
            Assert.fail();




    }

}
