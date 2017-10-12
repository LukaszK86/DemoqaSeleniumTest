import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;

public class FunctionalTestDemoqa {


    protected static WebDriver driver;


    @After
    public void cleanUp() {
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }

}

