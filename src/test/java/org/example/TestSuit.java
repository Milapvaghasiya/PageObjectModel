package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();
    Registration registration = new Registration();
    RagitrationResultPage ragitrationResultPage = new RagitrationResultPage();
    DesktopResult desktopResult = new DesktopResult();
    NewesCommentPage newesCommentPage = new NewesCommentPage();
    ComputerPage computerPage = new ComputerPage();
    NewsCommentResult newsCommentResult = new NewsCommentResult();
    Desktop desktop = new Desktop();
    BuildYourComputer buildYourComputer = new BuildYourComputer();
    EmailAfriendPage emailAfriendPage = new EmailAfriendPage();
    ReferProductToFriend referProductToFriend = new ReferProductToFriend();








    @Test
    public void userRegistrationSuccessfully() {
        homePage.clickOnTheRegister();
        registration.enterRegitrationDetails();
        ragitrationResultPage.registrationResult();
    }
        @Test
        public void usershouldBeToAddThecommentSuccessfully() {
            homePage.clickOnTheNewsComment();
            newesCommentPage.newsCommentAdd();
            newsCommentResult.verifyUserHAsSuccessFullyCommentAdded();

    }


    @Test
public void verifyusershouldBeAbleToNavigateToDesktopPage() {
        homePage.clickOnElementComputers();
       computerPage.ClickOnTheDesktopButton();
       desktopResult.veryfyUserNavigatestoDesktopPage();
    }

    @Test
public void verifyUsershouldReferaProductToFriend() {
        homePage.clickOnTheRegister();
        registration.enterRegitrationDetails();
        ragitrationResultPage.registrationResult();


        computerPage.ClickOnTheDesktopButton();

        desktop.clickOnBuildYourOwnButton();
        buildYourComputer.veryfyuserisonbuildyourComputerpage();
        emailAfriendPage.DetailstoAddForReferProduct();
        referProductToFriend.usershouldBeAnletoSendemailtoFfiendSuccessfully();

    }
}
