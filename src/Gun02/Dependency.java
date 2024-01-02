package Gun02;


import org.testng.annotations.Test;

public class Dependency {

    // ARABANIN HAREKETLERİ : START , DRİVE, PARK , STOP  HAREKET SIRASI

    @Test
    void startCar()
    {
        System.out.println("startCar");
        //Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"}) // bu testin çalışması startCar ın hatasız çalışmasına bağlı
    void driveCar()
    {
        System.out.println("driveCar");
        //Assert.fail();
    }


    @Test(dependsOnMethods = {"startCar","driveCar"})
    void parkCar()

    {
        System.out.println("parkCar");
    }



    @Test(dependsOnMethods = {"parkCar"},alwaysRun = true) // alwaysRun = True ,bağımlılıkları var ama hata çıkarsa da yine çalıştır.
    void stopCar()
    {
        System.out.println("stopCar");

    }

    // AYNI SEVİYEDEKİ TESTLER İÇİN PRİORİTY VERİLEBİLİR.
    // BAĞIMLI TESTLER,DİREK METODUNDAN ÇALIŞTIRDIĞINIZDA BAĞIMLI OLDUĞU METOD ZİNCİRİNDE 2 ÜSTE KADAR OTOMATİK CAĞIRIP ÇALIŞABİLİR.

}
