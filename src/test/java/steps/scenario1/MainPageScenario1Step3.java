package steps.scenario1;

import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import pages.MainPage;

import java.util.ArrayList;
import java.util.List;

public class MainPageScenario1Step3 {
    MainPage mainPage = new MainPage();

    @And("Submenu the Auto button has a specific structure")
    public void checkSubmenuAuto() {
        List<String> price = new ArrayList<>();
        price.add("Новые авто");
        price.add("С пробегом");
        price.add("Цена с НДС");
        price.add("Авто до 4000 р.");
        price.add("Авто до 10 000 р.");
        price.add("Авто до 20 000 р.");
        List<String> actualPrice = mainPage.getMainPrices();

        Assertions.assertEquals(price.size(), actualPrice.size(), String.format("Expected:%s,but actual:%s", price, actualPrice));

        for (int i = 0; i < price.size(); i++) {
            Assertions.assertTrue(price.get(i).contains(actualPrice.get(i)), String.format("Expected:%s,but actual:%s", price.get(i), actualPrice.get(i)));
        }

        List<String> city = new ArrayList<>();
        city.add("Минск");
        city.add("Гомель");
        city.add("Могилев");
        city.add("Витебск");
        city.add("Гродно");
        city.add("Брест");
        List<String> actualCity = mainPage.getMainCities();

        Assertions.assertEquals(city.size(), actualCity.size(), String.format("Expected:%s,but actual:%s", city, actualCity));

        for (int i = 0; i < city.size(); i++) {
            Assertions.assertTrue(city.get(i).contains(actualCity.get(i)), String.format("Expected:%s,but actual:%s", city.get(i), actualCity.get(i)));
        }

        List<String> model = new ArrayList<>();
        model.add("Audi");
        model.add("BMW");
        model.add("Citroen");
        model.add("Ford");
        model.add("Mazda");
        model.add("Mercedes-Benz");
        List<String> actualModel = mainPage.getMainModel();

        Assertions.assertEquals(model.size(), actualModel.size(), String.format("Expected:%s,but actual:%s", model, actualModel));

        for (int i = 0; i < model.size(); i++) {
            Assertions.assertTrue(model.get(i).contains(actualModel.get(i)), String.format("Expected:%s,but actual:%s", model.get(i), actualModel.get(i)));
        }
    }
}
