import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class RegistrationPage  {

WebDriver driver;
    @FindBy(how = How.ID, using = "name_3_firstname")
    WebElement name;

    @FindBy(how = How.ID, using = "name_3_lastname")
    WebElement lastName;

    @FindBy(how = How.ID, using = "dropdown_7")
    WebElement country;

    @FindBy(how = How.ID, using = "mm_date_8")
    WebElement month;

    @FindBy(how = How.ID, using = "dd_date_8")
    WebElement day;

    @FindBy(how = How.ID, using = "phone_9")
    WebElement phoneNumber;

    @FindBy(how = How.ID, using = "username")
    WebElement username;

    @FindBy(how = How.ID, using = "email_1")
    WebElement email;

    @FindBy(how = How.ID, using = "description")
    WebElement description;

    @FindBy(how = How.ID, using = "password-2")
    WebElement password;

    @FindBy(how = How.ID, using = "confirm_password_password-2")
    WebElement confirmPassword;

    public void typeFirstName() {
        name.sendKeys();
    }

    public void typeLastName() {
        lastName.sendKeys();
    }


    public void chooseCountry() {
    Select value = new Select(driver.findElement(By.id("dropdown_7")));
    value.selectByValue("Poland");
}

    public void chooseMonth() {
        new Select(driver.findElement(By.id("mm_date_8"))).selectByVisibleText("January");
    }

    public void chooseDay() {
        new Select(driver.findElement(By.id("dd_date_8"))).selectByVisibleText("1");
    }

}

