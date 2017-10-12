import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SideBar {

    @FindBy (how = How.ID,using= "menu-item-374")
    WebElement registration;

    public void clickRegistration (){
        registration.click();
    }
}
