import Menus.SideBar;
import Pages.RegistrationPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class RegistrationForm extends FunctionalTestDemoqa {

    @Test
    public void registerWebsite() {

        driver = new ChromeDriver();
        driver.get("http://demoqa.com/");
        driver.manage().window().maximize();

        SideBar sideBar = PageFactory.initElements(driver, SideBar.class);
        sideBar.clickRegistration();


        RegistrationPage registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
        registrationPage.typeFirstName("Jan");
        registrationPage.typeLastName("Kowalski");
        //registrationPage.selectMaritalStatus();
        registrationPage.selectDance();
        registrationPage.chooseCountry();
        registrationPage.chooseMonth();
        registrationPage.chooseDay();
        registrationPage.chooseYear();
        registrationPage.typePhoneNumber("0700700700");
        registrationPage.typeUsername("Janek99");
        registrationPage.typeMail("janek99@ahoj.pl");
        registrationPage.typeDescription("Wesoly, usmiechniety, uczy sie Javy");
        registrationPage.typePassword("Janek999");
        registrationPage.typeConfirmPassword("Janek999");
        registrationPage.clickSubmitnButton();

        //registrationPage.displayRegistrationMessage();
        registrationPage.displayErrorMessage();




    }
}
