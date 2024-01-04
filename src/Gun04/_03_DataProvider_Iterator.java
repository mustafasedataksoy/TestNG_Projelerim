package Gun04;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.Iterator;

public class _03_DataProvider_Iterator {

    
    @Test(dataProvider = "getData") // benim data sağlayıcım getData fonksiyonudur.
    void SearchTest(String searchText){
        System.out.println("searchText = " + searchText);
    }



    @DataProvider
    public Iterator <Object> getData(){

        ArrayList <Object> data=new ArrayList<>();
          data.add("Mac");
          data.add("Samsung");
          data.add("Huawei");
          
        return data.iterator();
    }

    /****************************************************************/

    @Test(dataProvider = "getData2") // benim data sağlayıcım getData fonksiyonudur.
    void LoginTest(String username , String password){

        System.out.println("username = " + username + " password = " + password);
    }



    @DataProvider
    public Iterator <Object[]> getData2(){

        ArrayList <Object[]> logins=new ArrayList<>();
        logins.add(new Object[]{"mahmut","sadsfssg"});
        logins.add(new Object[]{"mehmet","sdddfr"});
        logins.add(new Object[]{"ali","styuıop"});

        return logins.iterator();
    }






}
