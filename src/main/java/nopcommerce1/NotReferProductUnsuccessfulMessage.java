package nopcommerce1;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NotReferProductUnsuccessfulMessage extends Utils {
    private By _emailErrorMessageIfTriesWithoutRegistration = By.xpath("//span[@id='YourEmailAddress-error']");

    public void verifyUserShouldNotAbleToSendEmailWithoutRegistration()
    {
        Assert.assertEquals(getTextFromLocator(_emailErrorMessageIfTriesWithoutRegistration),"Enter your email");
    }
}
