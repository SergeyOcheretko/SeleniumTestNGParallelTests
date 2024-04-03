package pages;

import org.openqa.selenium.By;

public class Locators {
    public static final By INPUT_FIELD = By.xpath("//input[@id='fullName']");

    public static final By APPEND_FIELD = By.xpath("//input[@id='join']");

    public static final By GET_ME_FIELD = By.xpath("//input[@id='getMe']");

    public static final By CLEAR_ME_FIELD = By.xpath("//input[@id='clearMe']");

    public static final By ENABLED_FIELD = By.xpath("(//input[@id='noEdit'])[1]");
    public static final By READONLY_FIELD = By.xpath("//input[@id='dontwrite']");
    public static final By GO_TO_HOME_BUTTON= By.xpath("//button[@id='home']");
    public static final By WHAT_IS_BUTTON_COLOR = By.xpath("//button[@id='color']");
    public static final By BUTTON_IS_DISABLED = By.xpath("//button[contains(.,'Disabled')]");

}