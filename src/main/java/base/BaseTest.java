package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import manager.DriverManager;


public class BaseTest{

    public WebDriver driver = DriverManager.getInstance().getDriver();
    private String baseURL = "https://www.google.com.ua";

    @BeforeTest
    public void openSearchPage() {
        driver.get(baseURL);
    }

    @AfterTest
    public void  close(){
        try {
            if (driver!= null){
            driver.quit();
            }
        }finally{
            driver = null;
        }
    }
}
