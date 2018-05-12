package steps;
import pages.CinemaPage;
import org.junit.*;
import pages.FilmItemPage;
import io.qameta.allure.Step;

public class FilmItemSteps {

    @Step("проверили сохраненное название фильма и количество кинотеатров")
    public void check(){ new FilmItemPage().check(); }
}
