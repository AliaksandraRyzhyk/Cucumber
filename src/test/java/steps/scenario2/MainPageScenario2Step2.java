package steps.scenario2;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.MainPage;

public class MainPageScenario2Step2 {
    MainPage mainPage = new MainPage();

    @Then("Check submenu the HousesAndFlats button is visible")
    public void checkIsDisplayedSubmenuHousesAndFlats() {
        Assertions.assertTrue(mainPage.isDisplayedFrameHousesAndFlats());
    }
}
