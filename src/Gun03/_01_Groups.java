package Gun03;

import org.testng.annotations.Test;

public class _01_Groups {


    @Test(groups = "Smoke Test")
    void Test1(){System.out.println("Test  1 Smoke Test");}

    @Test(groups = "Regression")
    void Test3(){System.out.println("Test  3 Regression");}

    @Test(groups = "Regression")
    void Test5(){System.out.println("Test  5 Regression");}

    @Test(groups = "Regression")
    void Test2(){System.out.println("Test  2 Regression");}

    @Test(groups = "Smoke Test")
    void Test4(){System.out.println("Test  4 Smoke Test");}

    @Test(groups = "Smoke Test")
    void Test6(){System.out.println("Test  6 Smoke Test");}

    @Test
    void Test7(){System.out.println("Test 7");}











}
