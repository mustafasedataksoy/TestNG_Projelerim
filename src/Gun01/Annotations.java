package Gun01;

import org.testng.annotations.*;

public class Annotations {

    @BeforeClass
    void beforeClass()
    {
        System.out.println("Her classtan ÖNCE çalışacak");
    }

    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("her metoddan Önce çalışacak");
    }

    @AfterMethod
    void afterMetod()
    {
        System.out.println("her metoddan Sonra çalışacak");
    }
    @AfterClass
    void afterClass()
    {
        System.out.println("her classtan  sonra çalışacak");
    }
    @Test
    void Test1()
    {
        System.out.println("test 1 çalıştı");
    }
    @Test
    void Test2()
    {
        System.out.println("Test2 çalıştı");
    }


}
