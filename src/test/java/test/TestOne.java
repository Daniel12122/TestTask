package test;

import base.BaseTest;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import page.SearchPage;

public class TestOne extends BaseTest {

    @Test
    public void printFirstLinkTitleFromSearchResultTest() {
        new SearchPage()
                .searchWord(RandomStringUtils.randomAlphabetic(5))
                .printFirstLinkText();
    }
}
