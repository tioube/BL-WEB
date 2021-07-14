package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


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

    @FindBy(css =".sigil-header__nav:nth-child(1)")
    private WebElement favorite;

    @FindBy(css =".bl-flex-item:nth-child(2) .sigil-header__nav:nth-child(2)")
    private WebElement transaksi;

    @FindBy(css =".bl-flex-item:nth-child(2) .sigil-header__nav:nth-child(3)")
    private WebElement pesan;

    @FindBy(css =".notification-menu")
    private WebElement notifikasi;

    @FindBy(css=".sigil-header__nav:nth-child(5)")
    private WebElement keranjang;

    @FindBy(css=".sigil-header__nav:nth-child(6)")
    private WebElement profile;


//    @FindBy(css = "[data-testid=submit-button]")
//    private WebElement alertSuccess;

    public Login(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(){
        Assert.assertTrue(this.submit_button.isDisplayed());
        this.username.sendKeys(USERNAME);
    }

    public void enterLastName(){
        Assert.assertTrue(this.submit_button.isDisplayed());
        this.password.sendKeys(PASSWORD);
    }

    public void pressSubmitButton(){
        Assert.assertTrue(this.submit_button.isDisplayed());
        this.submit_button.click();
    }



    public void verifyLoginSuccess(){
//        WebDriverWait wait = new WebDriverWait(driver,30);
//        wait.until(this.LogoDana.isDisplayed());
        Assert.assertTrue(this.LogoDana.isDisplayed());
        this.LogoDana.isDisplayed();
        Assert.assertTrue(this.favorite.isDisplayed());
        Assert.assertTrue(this.transaksi.isDisplayed());
        Assert.assertTrue(this.pesan.isDisplayed());
        Assert.assertTrue(this.notifikasi.isDisplayed());
        Assert.assertTrue(this.keranjang.isDisplayed());
        Assert.assertTrue(this.profile.isDisplayed());

    }
}