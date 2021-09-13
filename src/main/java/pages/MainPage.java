package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement buttonAuto = $x("(//a[@class='b-main-navigation__link'])[3]");
    private final SelenideElement buttonHousesAndFlats = $x("(//a[@class='b-main-navigation__link'])[4]");
    private final SelenideElement iframeButtonAuto = $x("//div[@class='b-main-navigation__dropdown-column b-main-navigation__dropdown-column_75']");
    private final SelenideElement iframeButtonHousesAndFlats = $x("(//div[@class='b-main-navigation__dropdown'])[3]");
    private final ElementsCollection elementsPriceAuto = $$x("((//div[@class='b-main-navigation__dropdown-column'])[1])//span[@class='b-main-navigation__dropdown-advert-sign']");
    private final ElementsCollection elementsCityAuto = $$x("((//div[@class='b-main-navigation__dropdown-column'])[2])//span[@class='b-main-navigation__dropdown-advert-sign']");
    private final ElementsCollection elementsModelAuto = $$x("((//div[@class='b-main-navigation__dropdown-column'])[3])//span[@class='b-main-navigation__dropdown-advert-sign']");
    private final ElementsCollection elementsCityHouse = $$x("//div[@class='b-main-navigation__dropdown-column b-main-navigation__dropdown-column_50'][1]//div[@class='b-main-navigation__dropdown-column'][1]//span[@class='b-main-navigation__dropdown-advert-sign']");
    private final ElementsCollection elementsRooms = $$x("//div[@class='b-main-navigation__dropdown-column b-main-navigation__dropdown-column_50'][1]//div[@class='b-main-navigation__dropdown-column'][2]//span[@class='b-main-navigation__dropdown-advert-sign']");
    private final ElementsCollection elementsPriceHouse = $$x("//div[@class='b-main-navigation__dropdown-column b-main-navigation__dropdown-column_50'][1]//div[@class='b-main-navigation__dropdown-column'][3]//span[@class='b-main-navigation__dropdown-advert-sign']");


    public MainPage hoverOverButtonAuto() {
        buttonAuto.hover();
        return this;
    }

    public MainPage clickOnButtonHousesAndFlats() {
        buttonHousesAndFlats.hover();
        return this;
    }

    public Boolean isDisplayedFrameAuto() {
        iframeButtonAuto.isDisplayed();
        return true;
    }

    public Boolean isDisplayedFrameHousesAndFlats() {
        iframeButtonHousesAndFlats.isDisplayed();
        return true;
    }

    public List<String> getMainPrices() {
//        return elementsPriceAuto.stream()
//                .filter(w -> !w.getText().trim().isEmpty())
//                .map(q -> q.getText())
//                .collect(Collectors.toList());
        List<String> price = null;
        for (int i = 0; i < elementsPriceAuto.size(); i++) {
            price = elementsPriceAuto.stream()
                    .filter(w -> !w.getText().trim().isEmpty())
                    .map(q -> q.getText())
                    .collect(Collectors.toList());
        }
        return price;
    }

    public List<String> getMainCities() {
        List<String> city = null;
        for (int i = 0; i < elementsCityAuto.size(); i++) {
            city = elementsCityAuto.stream()
                    .filter(w -> !w.getText().trim().isEmpty())
                    .map(q -> q.getText())
                    .collect(Collectors.toList());
        }
        return city;
    }

    public List<String> getMainModel() {
        List<String> model = null;
        for (int i = 0; i < elementsModelAuto.size(); i++) {
            model = elementsModelAuto.stream()
                    .filter(w -> !w.getText().trim().isEmpty())
                    .map(q -> q.getText())
                    .collect(Collectors.toList());
        }
        return model;
    }

    public List<String> getMainTown() {
        List<String> town = null;
        for (int i = 0; i < elementsCityHouse.size(); i++) {
            town = elementsCityHouse.stream()
                    .filter(w -> !w.getText().trim().isEmpty())
                    .map(q -> q.getText())
                    .collect(Collectors.toList());
        }
        return town;
    }

    public List<String> getMainRooms() {
        List<String> rooms = null;
        for (int i = 0; i < elementsRooms.size(); i++) {
            rooms = elementsRooms.stream()
                    .filter(w -> !w.getText().trim().isEmpty())
                    .map(q -> q.getText())
                    .collect(Collectors.toList());
        }
        return rooms;
    }

    public List<String> getMainPriceHouse() {
        List<String> priceHouse = null;
        for (int i = 0; i < elementsPriceHouse.size(); i++) {
            priceHouse = elementsPriceHouse.stream()
                    .filter(w -> !w.getText().trim().isEmpty())
                    .map(q -> q.getText())
                    .collect(Collectors.toList());
        }
        return priceHouse;
    }
}
