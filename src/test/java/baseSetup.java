import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class baseSetup {
    protected WebDriver driver;

    public baseSetup(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
