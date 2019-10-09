package nopcommerce1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSelector extends Utils{
    LoadProps loadProps=new LoadProps();
    public void setUpBrowser() {
        String browser = loadProps.getProperty("browser");
        if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
        System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver();
    }else if(browser.equalsIgnoreCase("Ie")) {
        }else if (browser.equalsIgnoreCase("Internet Explorer")){
        System.setProperty("webdriver.internet explorer.driver","src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
        driver=new InternetExplorerDriver();
        }

        {
            System.out.println("Browser name is empty or typed wrong "+ browser);}
        }
        }






