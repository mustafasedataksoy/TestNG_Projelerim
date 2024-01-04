package Gun04;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider_CokBoyutlu {

    @Test(dataProvider = "getData")
    void LoginTest(String username , String password)
    {

        System.out.println("username =" + username+ " password ="+ password);

    }

    @DataProvider
    public Object[][] getData()
    {
         Object[][] logins={

                 {"sedat","2345689"},
                 {"betül","weweee23"},
                 {"şakir","pookmmd889"},
                 {"mahmut","edcrft566"}
         };
         return logins;
    }


}
