package Gun01;

import org.testng.annotations.Test;

public class Giris {

    @Test(priority = 1)
     void webSitesiiniAc()
    {
        System.out.println("driver tanımlandı ve web sitesi açıldı");
    }

    @Test(priority = 2)
    void loginİsleminiYap()
    {
        System.out.println("login test işlemlerii yapıldı");
    }

    @Test(priority = 3)
    void driverKapat()
    {
        System.out.println("driver kapatıldı ve çıkıldı");
    }


}
