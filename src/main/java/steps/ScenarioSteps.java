package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class ScenarioSteps {
    MainPageSteps mainPageSteps = new MainPageSteps();
    AfishaSteps afishaSteps = new AfishaSteps();
    CinemaSteps cinemaSteps = new CinemaSteps();
    FilmItemSteps filmItemSteps = new FilmItemSteps();

    @When("^выбран пункт меню \"(.+)\"$")
    public void selectMainMenuItem(String itemName){
        mainPageSteps.selectMainMenuItem(itemName);
    }

    @When("^выбран пункт меню афиши \"(.+)\"$")
    public void selectAfishaMenuItem(String itemName){
        afishaSteps.selectAfishaMenuItem(itemName);
    }

    @Then("^заголовок страницы - Кино равен \"(.+)\"$")
    public void checkTitle(String title){
        cinemaSteps.checkTitle(title);
    }
    @When("^нажали на кнопку выбора даты$")
    public void pushDateButton(){
       cinemaSteps.pushDateButton();
    }
    @When("^выбрали в выпадающем меню кнопку -\"(.+)\"$")
    public void selectDate(String date){
        cinemaSteps.selectDate(date);
    }
    @When("^нашли фильм с рейтингом -\"(.+)\" сохранили название и количество кинотеатров$")
    public void findAndSaveFilmFromRating(String rating){
        cinemaSteps.findAndSaveFilmFromRating(rating);
    }
    @Then("^проверили сохраненное название фильма и количество кинотеатров")
    public void check(){
        filmItemSteps.check();
    }



}
