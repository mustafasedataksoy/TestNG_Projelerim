package Utulity;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;



    @BeforeClass
    public void baslangicIslemleri(){
        System.out.println("Baslangic islemleri");
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE); // Sadece Errorları göster


        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");// Chrome sessiz çalışşsın consolda yazmasın.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // driver.manage().window().setPosition(new Point(-1650,130));

        //driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        Duration dr=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);

        driver.manage().timeouts().implicitlyWait(dr);

        wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        loginTest();


    }

    void loginTest() // aynı sayfayı test edicem sürekli login olmak icin before class a ekledim.
    {
        driver.get("https://opencart.abstracta.us/index.php?route=account/account");

        System.out.println("login test");


        WebElement inputEmail=driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("mahmut@hotmail.com");


        WebElement password=driver.findElement(By.id("input-password"));
        password.sendKeys("123456789");

        WebElement loginBtn=driver.findElement(By.cssSelector("input[type='submit']"));
        loginBtn.click();

        Assert.assertEquals(driver.getTitle(),"My Account","Login başarısız");


    }



    @AfterClass(enabled = true)
    public void bitisIslemleri()
    {
        System.out.println("Bitis islemleri ");
        Tools.Bekle(2);
        driver.quit();
    }

}
