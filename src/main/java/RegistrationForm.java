import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class RegistrationForm {

    @Test
            public void registerWebsite () {


        WebDriver driver = new ChromeDriver();
        driver.get("http://demoqa.com/");
        driver.manage().window().maximize();

        SideBar sideBar = PageFactory.initElements(driver,SideBar.class);
        sideBar.clickRegistration();

        RegistrationPage registrationPage = PageFactory.initElements(driver,RegistrationPage.class);
        registrationPage.chooseCountry();


    }
}
