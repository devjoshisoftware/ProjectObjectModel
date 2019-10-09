package nopcommerce1;

import org.openqa.selenium.By;

public class ReferProduct extends Utils {
    LoadProps loadProps = new LoadProps();

    private By _clickOnEmail = By.xpath("//input[@value='Email a friend']");
    private By _typeEmailAddress = By.id("FriendEmail");
    private By _personalMessageInEmail = By.name("PersonalMessage");
    private By _clickOnSend = By.name("send-email");

    public void referProductToFriend()
    {
        clickOnElement(_clickOnEmail);
        sendText(_typeEmailAddress,"testtest123456@test.com");
        sendText(_personalMessageInEmail,"This is very good deal, if you are interested");
        clickOnElement(_clickOnSend);
    }
}
