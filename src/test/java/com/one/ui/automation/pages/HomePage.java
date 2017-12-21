package com.one.ui.automation.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static final String SEARCH_BAR = "//input[@id='keywords_input']";
    public static final String SEARCH_BUTTON = "//*[@id='search_button']";

    public void searchBarType(String keyword){
        WebElementFacade element = find(By.xpath(SEARCH_BAR));
        element.type(keyword);
    }

    public void searchBarClick(){
        getDriver().navigate().refresh();
        WebElementFacade element = find(By.xpath(SEARCH_BAR));
        element.click();
    }

    public void searchButtonClick(){
        WebElementFacade element = find(By.xpath(SEARCH_BUTTON));
        element.click();
    }
}
