package tests.Cross;
import org.testng.annotations.Test;
import utilities.TestBaseCross;
public class CrossTest01 extends TestBaseCross {
    @Test
    public void test01() {
        driver.get("https://amazon.com");
        driver.get("https://facebook.com");
    }
}
