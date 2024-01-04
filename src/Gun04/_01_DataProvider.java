package Gun04;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProvider {

    @Test(dataProvider = "getData")
    void SearchTest(String searchText){

        System.out.println("searchText = " + searchText);
    }

    @DataProvider
    public Object[] getData(){

        Object[] data={"Mac","Samsung","Huawei","Iphone","pc","Xaomi"};

        return data;
    }


    /*********************************************************************/

    @Test(dataProvider = "aranacaklar")
    void SearchTest2(String searchText){

        System.out.println("searchText = " + searchText);
    }

    @DataProvider(name = "aranacaklar")
    public Object[] getData2(){

        Object[] data={"Mac","Samsung","Huawei","Iphone","pc","Xaomi"};

        return data;
    }






}
