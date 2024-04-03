package BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseTest {

        private static final Logger logger = LogManager.getLogger(BaseTest.class);

        protected WebDriver driver;

        @BeforeTest
        @Parameters({"browser"})
        public void beforeTest(@Optional("chrome") String browser) {
            logger.info("Initializing WebDriver...");
            logger.info("Selected browser: {}", browser);

            if (browser.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else {
                logger.error("Unsupported browser: {}", browser);
                throw new IllegalArgumentException("Unsupported browser: " + browser);
            }

            logger.info("WebDriver initialized successfully.");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            logger.info("Browser maximized.");
        }

        @AfterTest
        public void shutsDownTheBrowser() {
            if (driver != null) {
                logger.info("Shutting down the browser...");
                driver.quit();
                logger.info("Browser closed.");
            }
        }
    }


