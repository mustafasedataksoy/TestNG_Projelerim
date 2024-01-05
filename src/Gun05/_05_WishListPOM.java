package Gun05;

import Utulity.BaseDriver;
import Utulity.Tools;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _05_WishListPOM extends BaseDriver {

    @Test
    @Parameters("itemName")
    void addToWishList(String arananKelime)
    {
        _02_PlaceOrderElements poe=new _02_PlaceOrderElements();

        poe.searchBox.sendKeys(arananKelime);
        poe.searchButton.click();

        _06_WishListElements wle=new _06_WishListElements();

        int rndNumber= Tools.RandomNumberGenerator(wle.searchResults.size());  // sonuçların listesin size dan bir rnd numara ürettim
        String wishItemName=wle.searchResults.get(rndNumber).getText();  // ürünün text ini aldım
        wle.wishBtnList.get(rndNumber).click(); // aynı ürünün wish list ine tıklattım
        wle.btnWishList.click(); // wish list sayfasına gittim

        Tools.listContainsString(wle.wishTableNames, wishItemName);
    }

}
