package page;

import base.BasePage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Slf4j
public class SearchPage extends BasePage {

    @FindBy(css = ".gLFyf")
    private WebElement searchNameInput;

    @FindBy(css = ".gNO89b")
    private WebElement btnSearch;

    @FindBy(css = ".LC20lb")
    private WebElement firstLink;

    public SearchPage searchWord(String name) {
        log.info("Open Google");
        wait.until(ExpectedConditions.elementToBeClickable(searchNameInput));
        searchNameInput.sendKeys(name);
        log.info("Enter random word");
        wait.until(ExpectedConditions.elementToBeClickable(btnSearch));
        btnSearch.click();
        log.info("Search random word");
        return this;
    }
    public SearchPage printFirstLinkText(){
        wait.until(ExpectedConditions.visibilityOf(firstLink));
        String firstLinkText = firstLink.getText();
        log.info("First link name is: " + firstLinkText);
        return this;
    }

    @Override
    public boolean isLoaded() {
        if(searchNameInput.isDisplayed()){
            return true;
        }else {
            return false;
        }
    }
}
