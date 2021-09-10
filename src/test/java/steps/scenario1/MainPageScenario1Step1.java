package steps.scenario1;

import io.cucumber.java.en.Then;
import pages.MainPage;

public class MainPageScenario1Step1 {
    MainPage mainPage = new MainPage();

    @Then("Hover over the Auto button")
    public void hoverOverButtonAuto() {
        mainPage.hoverOverButtonAuto();
    }
}
