package base;

import manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertTrue;

public class BasePage extends LoadableComponent {

    public final WebDriverWait wait;
    public WebDriver driver = DriverManager.getInstance().getDriver();
    private String baseURL = "https://www.google.com.ua";

    public  BasePage(){
        PageFactory.initElements(DriverManager.getInstance().getDriver(), this);
        wait = new WebDriverWait(DriverManager.getInstance().getDriver(), 10);
    }

    @Override
    protected void load() {
        this.driver.get(baseURL);
    }

    @Override
    protected void isLoaded() throws Error {
        assertTrue("HomePage is not loaded!", driver.getCurrentUrl().contains(baseURL));
    }
}
