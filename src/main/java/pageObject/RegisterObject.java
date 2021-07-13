package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import sun.jvm.hotspot.debugger.Page;

public class RegisterObject extends PageObject {
    @FindBy(css = ".bl-text-field")
    private WebElement emailField;

    @FindBy(css = ".bl-text-field.is-focused")
    private WebElement sendEmail;

    @FindBy(css = ".mv-48")
    private WebElement title;

    @FindBy(css = ".bl-button--primary")
    private WebElement regiser_button;

    @FindBy(css = ".bl-modal__wrapper")
    private WebElement wrapperVerif;

    @FindBy(css = ".mb-8")
    private WebElement buttonVerif;

    @FindBy(css = ".bl-overlay__content")
    private WebElement wrapperValidate;

    @FindBy(css = ".is-gutter-32 > .bl-flex-item:nth-child(1)")
    private WebElement registerValidate;


//    @FindBy(css = "[data-testid=submit-button]")
//    private WebElement alertSuccess;

    public RegisterObject(WebDriver driver) {
        super(driver);
    }

    public void getTitle(){
        String product = this.title.getText();
        System.out.println(product);
    }

    public void registar() throws InterruptedException {
        this.emailField.click();
//        this.sendEmail.sendKeys("tyoube93@gmail.com");
        new Actions(driver).moveToElement(this.sendEmail).click().perform();
        new Actions(driver).moveToElement(this.sendEmail).sendKeys("tyoube93@gmail.com").perform();
        this.regiser_button.click();
        this.wrapperVerif.isDisplayed();
        this.buttonVerif.click();
        Thread.sleep(5000);
        this.wrapperValidate.isDisplayed();
       String Validate = this.registerValidate.getText();
        System.out.println(Validate);

    }

}
