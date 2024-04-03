package testSuite;

import BaseTest.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.InteractWithInputAndButtonFieldsPage;

public class TestInteractWithInputAndButtonFieldsSuite extends BaseTest {


    private InteractWithInputAndButtonFieldsPage interactWithInputAndButtonFieldsPage;

    @BeforeClass
    public void beforeTest() {
        this.interactWithInputAndButtonFieldsPage = PageFactory.initElements(driver, InteractWithInputAndButtonFieldsPage.class);
    }


    @Test
public void openLetCodePage(){
        interactWithInputAndButtonFieldsPage.open();
        Assert.assertTrue(interactWithInputAndButtonFieldsPage.getOpenedTextRoomPage("Practice and become pro in test automation"), "Letcode page isn't opened");
    }

    @Test
 public void openInputPage(){
        interactWithInputAndButtonFieldsPage.open();
        interactWithInputAndButtonFieldsPage.clickOnTheEditButton("Edit");
        Assert.assertTrue(interactWithInputAndButtonFieldsPage.getOpenedTextRoomPage(" Input"), " Input page isn't opened");

    }

    @Test
public void InteractWithInputPage(){
        interactWithInputAndButtonFieldsPage.open();
        interactWithInputAndButtonFieldsPage.clickOnTheEditButton("Edit");
        interactWithInputAndButtonFieldsPage.enterTextInTheFullNameField("Teddy Bowman");
        interactWithInputAndButtonFieldsPage.enterTextInTheAppendField("person");
        interactWithInputAndButtonFieldsPage.whatIsInsideTheBox();
        interactWithInputAndButtonFieldsPage.clearTheField();
        interactWithInputAndButtonFieldsPage.checkThatfieldIsEnabled();
        interactWithInputAndButtonFieldsPage.checkThatFieldIsReadOnly();
    }


    @Test
public void openButtonPage(){
        interactWithInputAndButtonFieldsPage.open();
        interactWithInputAndButtonFieldsPage.clickOnTheEditButton("Click");
        Assert.assertTrue(interactWithInputAndButtonFieldsPage.getOpenedTextRoomPage(" Button"), " Button page isn't opened");

    }

    @Test
public void InteractWithButtonPage(){
        interactWithInputAndButtonFieldsPage.open();
        interactWithInputAndButtonFieldsPage.clickOnTheEditButton("Click");
        interactWithInputAndButtonFieldsPage.gotoHomeAndComeBackHereUsingDriverCommand();
        interactWithInputAndButtonFieldsPage.findTheColorOfTheButton();
        Assert.assertTrue(interactWithInputAndButtonFieldsPage.confirmButtonIsDisabled(), "Кнопка должна быть включена");

    }
}
