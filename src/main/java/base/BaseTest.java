package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import manager.DriverManager;
import page.SearchPage;

public class BaseTest {

    public WebDriver driver = DriverManager.getInstance().getDriver();

    @BeforeTest
    public SearchPage openSearchPage() {
        driver.get("https://www.google.com.ua");
        return new SearchPage();
    }

    @AfterTest
    public void  close(){
        try {if (driver!= null){
            driver.quit();
        }
        }finally {
            driver = null;
        }
    }
}
