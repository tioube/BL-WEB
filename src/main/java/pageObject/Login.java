package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login extends PageObject {

    private final String USERNAME = "tyoube93@gmail.com";
    private final String PASSWORD = "tyoube99";

    @FindBy(id = "user_session_username")
    private WebElement username;

    @FindBy(id = "user_session_password")
    private WebElement password;

    @FindBy(css = "[data-testid=submit-button]")
    private WebElement submit_button;

    @FindBy(css = ".hubungkan-dana")
    private WebElement LogoDana;

//    @FindBy(css = "[data-testid=submit-button]")
//    private WebElement alertSuccess;

    public Login(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(){
        this.username.sendKeys(USERNAME);
    }

    public void enterLastName(){
        this.password.sendKeys(PASSWORD);
    }

    public void pressSubmitButton(){
        this.submit_button.click();
    }

    public void verifyLoginSuccess(){
        WebDriverWait wait = new WebDriverWait(driver,30);
//        wait.until(this.LogoDana.isDisplayed());
        this.LogoDana.isDisplayed();

    }
}