package steps;
import pages.CinemaPage;
import org.junit.*;
import pages.AfishaPage;
import io.qameta.allure.Step;

public class AfishaSteps {

    @Step("выбрали меню {itemname}")
    public void selectAfishaMenuItem(String itemName){new AfishaPage().selectAfishaMenuItem(itemName);}


}
