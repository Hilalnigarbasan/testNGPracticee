package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    //İlk yapmamız gereken bir tane constructor oluşturmak
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath="(//*[@class='a-section a-spacing-small a-spacing-top-small'])[1]")
    public WebElement sonucYazisi;





}
