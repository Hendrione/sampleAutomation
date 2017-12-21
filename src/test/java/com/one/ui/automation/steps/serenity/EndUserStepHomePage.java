package com.one.ui.automation.steps.serenity;

import com.one.ui.automation.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class EndUserStepHomePage extends ScenarioSteps {

    HomePage homePage;


    @Step
    public void openPage(){
        homePage.openAt("https://www.zomato.com/jakarta");
    }

    @Step
    public void inputSearchRestaurant(String restaurantName){
        homePage.searchBarClick();
        homePage.searchBarType(restaurantName);
    }

    @Step
    public void clickSearch(){
        homePage.searchButtonClick();
    }

}
