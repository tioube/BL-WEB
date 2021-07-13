package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class addToChart extends PageObject {


    @FindBy(css = "#v-omnisearch__input")
    private WebElement search;

    @FindBy(css = ".bl-flex-item:nth-child(1) .bl-product-card__description-name .bl-link")
    private WebElement product;

    @FindBy(css = "#section-main-product")
    private WebElement productDetail;

    @FindBy(css = ".c-main-product__action__cart")
    private WebElement addCart;

    @FindBy(css = ".c-dialog__content")
    private WebElement wrapperCart;

    @FindBy(css=".c-cart-dialog__item__name")
    private WebElement wrapperDetailName;

    @FindBy(css=".c-cart-dialog__cart-button")
    private WebElement wrapperGoToCartDetail;

    public addToChart(WebDriver driver) {
        super(driver);
    }

//    @FindBy(css = "[data-testid=submit-button]")
//    private WebElement alertSuccess;

//    public Login(WebDriver driver) {
//        super(driver);
//    }

    public void searchProduct(){
        WebDriverWait wait = new WebDriverWait(driver,30);
//        wait.until(this.search.isDisplayed());
        this.search.isDisplayed();
        this.search.click();
        this.search.sendKeys("redmi 9A");
        this.search.sendKeys(Keys.ENTER);
    }

    public void addProduct(){
        String product = this.product.getText();
        System.out.println(product);
        this.product.click();
    }

    public void SetAddCart(){
        this.productDetail.isDisplayed();
        this.addCart.click();
        this.wrapperCart.isDisplayed();
//        this.wrapperDetailName.equals(this.product.getText());
        this.wrapperGoToCartDetail.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

}
