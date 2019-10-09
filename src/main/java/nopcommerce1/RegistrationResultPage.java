package nopcommerce1;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResultPage extends Utils {
    private By _registerPage = By.xpath("//h1['Register']");
    private By _registerSuccessMessage = By.xpath("//div[@class='result']");
    //private By _homePage = By.xpath("//img[@alt='nopCommerce demo store']");
    //private String _homePage = driver.getCurrentUrl();

    public void verifyUserIsOnRegistrationPage()
    {
        Assert.assertEquals(getTextFromLocator(_registerPage),"Register");
    }
    public void verifyUserSeeRegistrationSuccessMessage()
    {
        //Assert.assertEquals(getTextFromLocator(_registerSuccessMessage), "Your registration completed");
    }
    public void verifyUserIsOnHomePage()
    {
        //Assert.assertEquals(_homePage,"https://demo.nopcommerce.com/");
    }
}
