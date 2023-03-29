package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class PageKullanimi {
    @Test(groups = "gp1")
    public void testName() {

        AmazonPage amazonPage = new AmazonPage();
        //amazona gidelim
        Driver.getDriver().get("https://amazon.com");

        //iphone aratalım
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);

        //sonuc yazısının iphone içerdiğini test edelim
        String actualSonuc = amazonPage.sonucYazisi.getText();
        String arananKelime = "iphone";
        assert actualSonuc.contains(arananKelime);
        Driver.closeDriver();

    }

}
