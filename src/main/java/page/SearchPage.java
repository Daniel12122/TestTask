package page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends BasePage {

    @FindBy(name = "q")
    private WebElement searchNameInput;

    @FindBy(name = "btnK")
    private WebElement btnSearch;

    @FindBy(className = "LC20lb")
    private WebElement firstLink;

    public SearchPage searchWord(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(searchNameInput));
        searchNameInput.sendKeys(name);
        btnSearch.click();
        return this;
    }
    public SearchPage printFirstLinkText(){
        wait.until(ExpectedConditions.visibilityOf(firstLink));
        String firstLinkText = firstLink.getText();
        System.out.println(firstLinkText);
        return this;
    }
}
