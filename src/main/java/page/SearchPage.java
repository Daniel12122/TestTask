package page;

import base.BasePage;
import Loggers.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends BasePage {

//    private static final Logger log = Logger.getLogger(SearchPage.class);
    Log myLog = new Log("log.txt");

    @FindBy(css = ".gLFyf")
    private WebElement searchNameInput;

    @FindBy(css = ".gNO89b")
    private WebElement btnSearch;

    @FindBy(css = ".LC20lb")
    private WebElement firstLink;

    public SearchPage searchWord(String name) {
        myLog.logger.info("Open Google");
        wait.until(ExpectedConditions.elementToBeClickable(searchNameInput));
        searchNameInput.sendKeys(name);
        myLog.logger.info("Enter random word");
        wait.until(ExpectedConditions.elementToBeClickable(btnSearch));
        btnSearch.click();
        myLog.logger.info("Search random word");
        return this;
    }
    public SearchPage printFirstLinkText(){
        wait.until(ExpectedConditions.visibilityOf(firstLink));
        String firstLinkText = firstLink.getText();
        myLog.logger.info("First link name is: " + firstLinkText);
        return this;
    }
}
