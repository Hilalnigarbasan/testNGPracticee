package utilities;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;
    /*
        METHODU DEVREYE SOKABİLMEK İÇİN FİLEINPUTSTREAM İLE DOSYA YOLUNU BELİRTMEMİZ GEREKİR
    METHODDAN ÖNCE ÇALIŞMASI İÇİN STATIC BLOC İÇERİSİNE FİLEINPUTSTREAM'I OLUŞTURMAMIZ GEREKİR.
     */
    static {
        String dosyaYolu = "config.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties = new Properties(); //objeyi oluşturduk ve değer atamasını yaptık
            properties.load(fis);//fis'in okuduğu bilgileri properties'e yükler
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String Key){
        /*
            Test method'undan gönderdiğimiz string key değerini alıp Properties class'ından
         getProperty() methodunu kullanarak bu key'e ait value'u bize getirir.
         */

        return  properties.getProperty(Key);
    }
}
