package com.one.ui.automation.steps;

import com.one.ui.automation.steps.serenity.EndUserStepHomePage;
import com.one.ui.automation.steps.serenity.EndUserStepRestaurantPage;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class SearchRestaurantSteps {

    @Steps
    EndUserStepHomePage endUserStepHomePage;

    @Steps
    EndUserStepRestaurantPage endUserStepRestaurantPage;

    @Given("[UI] user Open Zomato home page")
    public void userOpenZomatoHomePage(){
        endUserStepHomePage.openPage();
    }

    @When("[UI] user type restaurant name '$restaurantName' on searchbar")
    public void userTypeRestaurantNameOnSearchbar(String restaurantName){
        endUserStepHomePage.inputSearchRestaurant(restaurantName);
    }

    @When("[UI] user click search")
    public void userClickSearch(){
        endUserStepHomePage.clickSearch();
    }

    @Then("[UI] user should redirected to restaurant detail page")
    public void userShouldRedirectedToRestaurantDetailPage(){
        endUserStepRestaurantPage.isOnRestaurantPage();
    }

    @Then("[API] comparing data from ui with api data")
    public void comparingDataFromUiWithApiData(){
        endUserStepRestaurantPage.compareData();
    }

}
