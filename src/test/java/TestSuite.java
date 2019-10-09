import nopcommerce1.*;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest{
   HomePage homePage = new HomePage();
   RegistrationPage registrationPage = new RegistrationPage();
   RegistrationResultPage registrationResultPage = new RegistrationResultPage();
   ReferProduct referProduct = new ReferProduct();
   ReferProductResultPage referProductResultPage = new ReferProductResultPage();
   ShoppingShoes shoppingShoes = new ShoppingShoes();
   ShoppingShoesResultPage shoppingShoesResultPage = new ShoppingShoesResultPage();
   GuestUserShoppingShoes guestUserShoppingShoes = new GuestUserShoppingShoes();

   @Test (priority = 1)
   public void userShouldAbleToRegisterSuccessfully()
   {
      homePage.clickOnRegisterButton();
      registrationResultPage.verifyUserIsOnRegistrationPage();
      registrationPage.userEntersRegistrationDetails();
      //registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
      registrationResultPage.verifyUserIsOnHomePage();
   }
   @Test (priority = 2)
   public void userShouldAbleToReferProductToFriend()
   {
      homePage.clickOnRegisterButton();
      registrationResultPage.verifyUserIsOnRegistrationPage();
      registrationPage.userEntersRegistrationDetails();
      //registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
      registrationResultPage.verifyUserIsOnHomePage();
      homePage.clickOnFeaturedProductMacBookPro();
      referProductResultPage.verifyUserIsOnAppleMacBookProPage();
      referProduct.referProductToFriend();
      referProductResultPage.verifyEmailHasBeenSentSuccessfully();
   }
   @Test (priority = 3)
   public void userShouldNotAbleToReferProductToFriendWithoutRegistration()
   {
      homePage.clickOnFeaturedProductMacBookPro();
      referProductResultPage.verifyUserIsOnAppleMacBookProPage();
      referProduct.referProductToFriend();
      referProductResultPage.verifyUserIsOnEmailAFriendPage();
      referProductResultPage.verifyUserShouldNotAbleToSendEmailWithoutRegistration();
   }
   @Test (priority = 4)
   public void registeredUserShouldBuyProductSuccessfully()
   {
      homePage.clickOnRegisterButton();
      registrationResultPage.verifyUserIsOnRegistrationPage();
      registrationPage.userEntersRegistrationDetails();
      registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
      registrationResultPage.verifyUserIsOnHomePage();
      homePage.clickOnApparelLink();
      shoppingShoes.userShopsShoes();
      shoppingShoesResultPage.verifyUserSeeSuccessfulOrderMessage();
   }
   @Test (priority = 5)
   public void guestUserShouldAbleToBuyProduct()
   {
      homePage.clickOnApparelLink();
      guestUserShoppingShoes.guestShopsShoes();
      shoppingShoesResultPage.verifyUserSeeSuccessfulOrderMessage();
   }


}
