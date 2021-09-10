package steps.scenario2;

import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pages.MainPage;

import java.util.ArrayList;
import java.util.List;

public class MainPageScenario2Step3 {
    MainPage mainPage = new MainPage();

    @And("Submenu the HousesAndFlats button has a specific structure")
    public void checkSubmenuHousesAndFlats() {
        List<String> city = new ArrayList<>();
        city.add("Минск");
        city.add("Брест");
        city.add("Витебск");
        city.add("Гомель");
        city.add("Гродно");
        city.add("Могилев");
        List<String> actualCity = mainPage.getMainTown();

        Assertions.assertEquals(city.size(), actualCity.size(), String.format("Expected:%s,but actual:%s", city, actualCity));

        for (int i = 0; i < city.size(); i++) {
            Assertions.assertTrue(city.get(i).contains(actualCity.get(i)), String.format("Expected:%s,but actual:%s", city.get(i), actualCity.get(i)));
        }

        List<String> rooms = new ArrayList<>();
        rooms.add("1-комнатные");
        rooms.add("2-комнатные");
        rooms.add("3-комнатные");
        rooms.add("4+-комнатные");
        List<String> actualRooms = mainPage.getMainRooms();

        Assertions.assertEquals(rooms.size(), actualRooms.size(), String.format("Expected:%s,but actual:%s", rooms, actualRooms));

        for (int i = 0; i < rooms.size(); i++) {
            Assertions.assertTrue(rooms.get(i).contains(actualRooms.get(i)), String.format("Expected:%s,but actual:%s", rooms.get(i), actualRooms.get(i)));
        }

        List<String> price = new ArrayList<>();
        price.add("До 30 000 $");
        price.add("30 000–80 000 $");
        price.add("От 80 000 $");
        List<String> actualPrice = mainPage.getMainPriceHouse();

        Assertions.assertEquals(price.size(), actualPrice.size(), String.format("Expected:%s,but actual:%s", price, actualPrice));

        for (int i = 0; i < price.size(); i++) {
            Assertions.assertTrue(price.get(i).contains(actualPrice.get(i)), String.format("Expected:%s,but actual:%s", price.get(i), actualPrice.get(i)));
        }
    }
}
