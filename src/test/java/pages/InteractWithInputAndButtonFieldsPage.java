package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static pages.Locators.*;
import static pages.Locators2.*;

public class InteractWithInputAndButtonFieldsPage extends BasePage {

    private static final String LETCODE_URL = "https://letcode.in/test";

    public InteractWithInputAndButtonFieldsPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
    driver.get(LETCODE_URL);
    }

    public boolean getOpenedTextRoomPage(String replacementText) {
        String modifiedXPath = UNIVERSAL_OPEN_PAGE_XPATH.replace("$1", replacementText);
        return driver.findElement(By.xpath(modifiedXPath)).isDisplayed();
    }


    public void clickOnTheEditButton(String replacementText) {
     String modifiedXPath = UNIVERSAL_CLICK_PAGE_XPATH.replace("$1",replacementText);
    driver.findElement(By.xpath(modifiedXPath)).click();
    }

    public void enterTextInTheFullNameField(String text) {
        WebElement element =driver.findElement(INPUT_FIELD);
        element.sendKeys(text);

    }

    public void enterTextInTheAppendField(String text) {
     driver.findElement(APPEND_FIELD).sendKeys(text,Keys.TAB);

    }

    public void whatIsInsideTheBox() {
    String myValue = driver.findElement(GET_ME_FIELD).getAttribute("value");
    System.out.println(myValue);
    }

    public void clearTheField() {
    driver.findElement(CLEAR_ME_FIELD).clear();
    }

    public void checkThatfieldIsEnabled() {
    driver.findElement(ENABLED_FIELD).isEnabled();
    }

    public void checkThatFieldIsReadOnly() {
    String s =driver.findElement(READONLY_FIELD).getAttribute("readonly");
    System.out.println(s);
    }

    public void gotoHomeAndComeBackHereUsingDriverCommand() {
    driver.findElement(GO_TO_HOME_BUTTON).click();
        WebDriver.Navigation navigation = driver.navigate();
        navigation.back();

    }

    public void findTheColorOfTheButton() {
   String myColorIs = driver.findElement(WHAT_IS_BUTTON_COLOR).getCssValue("background-color");
    System.out.println(myColorIs);
    }

    public boolean confirmButtonIsDisabled() {
        WebElement button = driver.findElement(BUTTON_IS_DISABLED);
      return!button.isEnabled();
    }
}
