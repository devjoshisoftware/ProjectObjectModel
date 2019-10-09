package nopcommerce1;

import org.openqa.selenium.By;
import org.testng.Assert;

import static nopcommerce1.Utils.getTextFromLocator;

public class ReferProductResultPage {
    private By _macBookProPage = By.xpath("//h1[@itemprop='name']");
    private By _emailAFriendPage = By.xpath("//h1['Email a friend']");
    private By _emailSuccessfulMessage = By.xpath("//div[@class='result']");
    private By _emailErrorMessageIfTriesWithoutRegistration = By.xpath("//span[@id='YourEmailAddress-error']");

    public void verifyUserIsOnAppleMacBookProPage()
    {
        Assert.assertEquals(getTextFromLocator(_macBookProPage),"Apple MacBook Pro 13-inch");
    }

    public void verifyUserIsOnEmailAFriendPage()
    {
        Assert.assertEquals(getTextFromLocator(_emailAFriendPage),"Email a friend");
    }

    public void verifyEmailHasBeenSentSuccessfully()
    {
        Assert.assertEquals(getTextFromLocator(_emailSuccessfulMessage),"Your message has been sent.");
    }
    public void verifyUserShouldNotAbleToSendEmailWithoutRegistration()
    {
        Assert.assertEquals(getTextFromLocator(_emailErrorMessageIfTriesWithoutRegistration),"Enter your email");
    }
}
