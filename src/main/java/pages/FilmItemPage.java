package pages;
import org.openqa.selenium.support.*;
import java.util.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import steps.BaseSteps;

public class FilmItemPage extends BasePage{

    @FindBy(xpath = "//h1[@class='event-heading__title']")
    public WebElement filmTitle;

    @FindBy(xpath = "//span[@class='event-heading__place']")
    public WebElement countOfCinemas;

    public void check(){
       if(filmTitle.getText().equals(savedTitle)&&countOfCinemas.getText().equals(savedCount)){
           return;
        }
        Assert.fail("Сохраненные значения не соответствуют фактическим");
    }





}
