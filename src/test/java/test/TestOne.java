package test;

import base.BaseTest;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import page.SearchPage;

public class TestOne extends BaseTest {
    private String randomWord = RandomStringUtils.randomAlphabetic(5);
    @Test
    public void punchInOutTest() {
        SearchPage searchPage = new SearchPage();
        searchPage
                .searchWord(randomWord)
                .printFirstLinkText();
    }
}
