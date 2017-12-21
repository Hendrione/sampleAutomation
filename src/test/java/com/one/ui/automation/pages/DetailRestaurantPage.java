package com.one.ui.automation.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class DetailRestaurantPage extends PageObject {

    public static final String RESTAURANT_NAME = "//a[contains(@class,'large header')]";


    public boolean restaurantNameCheck(){
        WebElementFacade element = find(By.xpath(RESTAURANT_NAME));
        return element.isCurrentlyVisible();
    }

    public String getRestaurantName(){
        WebElementFacade element = find(By.xpath(RESTAURANT_NAME));
        return element.getText();
    }
}
