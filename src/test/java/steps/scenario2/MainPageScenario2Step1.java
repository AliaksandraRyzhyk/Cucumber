package steps.scenario2;

import io.cucumber.java.en.Then;
import pages.MainPage;

public class MainPageScenario2Step1 {
    MainPage mainPage = new MainPage();

    @Then("Hover over the HousesAndFlats button")
    public void clickOnButtonHousesAndFlats() {
        mainPage.clickOnButtonHousesAndFlats();
    }
}
