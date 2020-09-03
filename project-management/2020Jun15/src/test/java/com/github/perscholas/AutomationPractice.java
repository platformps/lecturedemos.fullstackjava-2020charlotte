package com.github.perscholas;

/**
 * Created by leon on 6/15/2020.
 */

import com.git_leon.leonium.browsertools.WebPage;
import com.git_leon.leonium.browsertools.With;
import com.git_leon.leonium.browsertools.browserhandler.BrowserHandler;
import com.git_leon.leonium.browsertools.browserhandler.BrowserHandlerInterface;
import com.git_leon.leonium.browsertools.factories.BrowserHandlerFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author leonhunter
 * @created 04/30/2020 - 8:51 AM
 */
public class AutomationPractice {
    @Test
    public void testRun() { // TODO
        // Given
        By inputSearch = By.id("search_query_top");
        By submitSearchButton = By.name("submit_search");
        By buttonWomanCategory = With.tagAttributeValue("li", "title", "Women");
        By buttonDressesCategory = With.tagAttributeValue("li", "title", "Dresses");
        By buttonShirtCategory = With.tagAttributeValue("li", "title", "T-shirts");

        // when
        BrowserHandler browserHandler = BrowserHandlerFactory.CHROME.getBrowserHandler();
        browserHandler.navigateTo("http://automationpractice.com/index.php");
        browserHandler.sendKeys(inputSearch, "The quick brown fox jumps");

        // then
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        browserHandler.close();
    }
}
