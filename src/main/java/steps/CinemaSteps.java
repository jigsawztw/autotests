package steps;
import pages.CinemaPage;
import org.junit.*;
import io.qameta.allure.Step;

public class CinemaSteps {

    @Step("заголовок страницы Кино равен {expectedTitle}")
    public void checkTitle(String expectedTitle) {
        String xpath = "//h1[text()='" + expectedTitle + "']";
        String actualValue = new CinemaPage().title.getText();
        Assert.assertEquals("Ожидаемый результат не совпадает с фактическим ", expectedTitle, actualValue);
    }

    @Step("выполнено нажатие на кнопку выбора даты")
    public void pushDateButton(){
        new CinemaPage().dateBtn.click();
    }
    @Step("выбрана дата - {date}")
    public void selectDate(String date){
        new CinemaPage().selectDate(date);
    }
    @Step("выбрали фильм с рейтингом больше или равным - {rating}")
    public void findAndSaveFilmFromRating(String rating){ new CinemaPage().findAndSaveFilmFromRating(rating); }





}
