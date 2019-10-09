import nopcommerce1.BrowserSelector;
import nopcommerce1.LoadProps;
import nopcommerce1.Utils;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();
    static String timeStamp = new SimpleDateFormat("dd.MM.yy.HH.mm.ss").format(new Date());

    @BeforeTest
    public void openBrowser()
    {
        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        getUrl("https://demo.nopcommerce.com/");
    }
    @AfterTest
    public void tearDown()
    {

        driver.quit();
    }
}
