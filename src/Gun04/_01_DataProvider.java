package Gun04;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProvider {

    @Test(dataProvider = "getData") // BENİM DATA SAĞLAYICIM GETDATA FONKSİYONUDUR.
    void SearchTest(String searchText){

        System.out.println("dataprovider = " + searchText);
    }

    @DataProvider // BU METODA DATAPROVIDER GÖREVİ VERİLDİ
    public Object[] getData(){  // DATAPROVIDER OLARAK KULLANILACAK METODUN TİPİ OBJECT OLMAK ZORUNDA

        Object[] data={"Mac","Samsung","Huawei","Iphone","pc","Xaomi"};

        return data;
    }


    /*********************************************************************/

    @Test(dataProvider = "aranacaklar")
    void SearchTest2(String searchText){

        System.out.println("searchText = " + searchText);
    }

    @DataProvider(name = "aranacaklar") // name olarakta yazabilirim.
    public Object[] getData2(){

        Object[] data={"Mac","Samsung","Huawei","Iphone","pc","Xaomi"};

        return data;
    }






}
