package steps.scenario1;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.MainPage;


public class MainPageScenario1Step2 {
    MainPage mainPage = new MainPage();

    @Then("Check frame the Auto button is visible")
    public void checkIsDisplayedSubmenuAuto() {
        Assertions.assertTrue(mainPage.isDisplayedFrameAuto());
    }
}
