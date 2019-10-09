package nopcommerce1;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    String test = "venus";

    private By _registerLink = By.xpath("//a[@class='ico-register']");
    private By _computerLink = By.linkText("Computer");
    private By _apparelLink = By.linkText("Apparel");
    private By _digitalDownloadLink = By.linkText("Digital download");
    private By _appleMacBookPro = By.xpath("//img[@title='Show details for Apple MacBook Pro 13-inch']");

    public void clickOnRegisterButton()
    {
        clickOnElement(_registerLink);
    }
    public void clickOnComputerLink()
    {
        clickOnElement(_computerLink);
    }
    public void clickOnApparelLink()
    {
        clickOnElement(_apparelLink);
    }
    public void clickOnDigitalDownLoadLink()
    {
        clickOnElement(_digitalDownloadLink);
    }
    public void clickOnFeaturedProductMacBookPro()
    {
        clickOnElement(_appleMacBookPro);
    }
}
