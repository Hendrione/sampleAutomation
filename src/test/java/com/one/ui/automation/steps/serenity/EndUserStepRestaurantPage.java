package com.one.ui.automation.steps.serenity;

import com.one.ui.automation.api.RestaurantApi;
import com.one.ui.automation.pages.DetailRestaurantPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class EndUserStepRestaurantPage extends ScenarioSteps {

    DetailRestaurantPage detailRestaurantPage;
    RestaurantApi restaurantApi;

    @Step
    public void compareData() {
        String resultUI = detailRestaurantPage.getRestaurantName();
        System.out.println(resultUI);
        String resultAPI = restaurantApi.getRestaurantDetails().getName();
        assertThat("api and ui is not same", resultUI.trim(), equalTo(resultAPI.trim()));
    }

    @Step
    public void isOnRestaurantPage() {
        Boolean result = detailRestaurantPage.restaurantNameCheck();
        assertThat("Not in restaurant page", result, equalTo(true));
    }
}
