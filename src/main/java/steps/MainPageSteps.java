package steps;
import io.qameta.allure.Step;
import pages.MainPage;

public class MainPageSteps {

    @Step("выбран пункт меню {itemName}")

    public void selectMainMenuItem(String itemName){
        new MainPage().selectMainMenuItem(itemName);
    }
}
