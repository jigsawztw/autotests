package steps;
import pages.CinemaPage;
import org.junit.*;
import io.qameta.allure.Step;
import pages.BasePage;

public class CinemaSteps {


    @Step("заголовок страницы Кино равен {expectedTitle}")
    public void checkTitle(String expectedTitle) {
        String xpath = "//h1[text()='" + expectedTitle + "']";
        String actualValue = new CinemaPage().title.getText();
        Assert.assertEquals("Ожидаемый результат не совпадает с фактическим ", expectedTitle, actualValue);
    }

    @Step("нажали на кнопку выбора даты")
    public void pushButtonDate(){
        new CinemaPage().pushButtonDate();
    }
    @Step("выбрали в выпадающем меню кнопку  - {date}")
    public void selectDate(String date){
        new CinemaPage().selectDate(date);
    }
    @Step("нашли фильм с рейтингом {rating} сохранили название и количество кинотеатров")
    public void findAndSaveFilmFromRating(String rating){ new CinemaPage().findAndSaveFilmFromRating(rating); }





}
