package Gun01;

import Utulity.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Enable {

    @Test
    void Test1()
    {
        System.out.println("Test 1");
    }

    @Test(enabled = false) // bu testi  çalıştırma
    void Test2()
    {
        System.out.println("Test 2");
    }

    @Test
    void Test3()
    {
        System.out.println("Test 3");
    }
    public static WebDriver driver;


    public static WebDriverWait wait;


    @BeforeClass
    void baslangicIslemleri()
    {
        System.out.println("Baslangıç islemleri");
        //ilk adımda çalışan kod kısmı
        Logger logger= Logger.getLogger(""); // sisteme ait bütün logları üreten objeye/servise ulaştım ""
        logger.setLevel(Level.SEVERE); // Sadece errorları göster

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");  // ChromeServici sessiz modda çalıştır
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();   // web sayfasını kontrol eden görevli
        //driver.manage().window().setPosition(new Point(-1650,130));

        //driver.manage().window().maximize();  // Ekranı max yapıyor.
        driver.manage().deleteAllCookies();  // sitenin senin bilgisayarında yaptığı ayarlar siliniyor, sayfa başlangıç ayarlarına dönüyor

        Duration dr=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr); // Sadece tüm sayfanın kodlarının bilgisyarınıza inmesi süresiyle ilgili
        //bu eklenmezse Selenium sayfa yüklenene kadar (sonsuza) bekler.: 30 sn süresince sayfanın yüklenmesini bekle yüklenmezse hata ver
        // eğer 2 sn yüklerse 30 sn. beklemez.

        driver.manage().timeouts().implicitlyWait(dr); // Bütün weblementlerin element bazında, elemente özel işlem yapılmadan önce
        // hazır hale gelmesi verilen mühlet yani süre. // eğer 2 sn yüklerse 30 sn. beklemez.

        wait=new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    @AfterClass
    void bitisIslemleri()
    {
        System.out.println("Bitis islemleri");
        Tools.Bekle(3);
        driver.quit();

    }



}
