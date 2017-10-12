package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class RegistrationPage {


    WebDriver driver;
    @FindBy(how = How.ID, using = "name_3_firstname")
    WebElement firstName;

    @FindBy(how = How.ID, using = "name_3_lastname")
    WebElement lastName;

    @FindBy(how = How.ID, using = "dropdown_7")
    WebElement country;

    @FindBy(how = How.ID, using = "mm_date_8")
    WebElement month;

    @FindBy(how = How.ID, using = "dd_date_8")
    WebElement day;

    @FindBy(how = How.ID, using = "yy_date_8")
    WebElement year;

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

    public enum Hobby {
        DANCE, READING, CRICKET
    }

    public enum MaritalStatus {
        SINGLE, MARRIED, DIVORCED
    }

    public void typeFirstName(String name) {
        firstName.sendKeys(name);
    }

    public void typeLastName(String surname) {
        lastName.sendKeys(surname);
    }

    public void chooseCountry() {

        Select valueCountry = new Select(country);
        valueCountry.selectByValue("Poland");
    }

    public void chooseMonth() {
        Select valueMonth = new Select(month);
        valueMonth.selectByValue("January");
    }

    public void chooseDay() {
        Select valueMonth = new Select(day);
        valueMonth.selectByValue("1");
    }

    public void chooseYear() {
        Select valueMonth = new Select(year);
        valueMonth.selectByValue("1980");
    }

    public void typePhoneNumber(String number) {
        phoneNumber.sendKeys(number);
    }

    public void typeUsername(String userName) {
        username.sendKeys(userName);
    }

    public void typeMail(String mailName) {
        username.sendKeys(mailName);
    }

    public void typeDescription(String describe) {
        description.sendKeys(describe);
    }

    public void typePassword(String passwordName) {
        password.sendKeys(passwordName);
    }

    public void typeConfirmPassword(String confirmPasswordName) {
        confirmPassword.sendKeys(confirmPasswordName);
    }

    public void selectHobby(Hobby[] hobbies) {
        for (Hobby listHobby : hobbies) {
            driver.findElement(By.id(listHobby.toString().toLowerCase())).click();
        }
    }

    public void selectMaritalStatus(MaritalStatus[] maritalStatuses) {
        for (MaritalStatus listMarital : maritalStatuses) {
            driver.findElement(By.id(listMarital.toString().toLowerCase())).click();
        }

    }
}





