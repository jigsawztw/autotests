package pages;
import org.openqa.selenium.support.*;
import java.util.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import steps.BaseSteps;


public class CinemaPage extends BasePage{

    @FindBy(xpath = "//h1")
    public WebElement title;


    @FindBy(xpath = "//button[contains(@class,'filter-date')]")
    public WebElement dateBtn;

    @FindBy(xpath = "//ul[contains(@class,'presets-list')]/li/div/span")
    public List<WebElement> dates;


    @FindBy(xpath = "//div[contains(@class,'events-list__list')]/div")
    public List<WebElement> films;




    public CinemaPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectDate(String date){
        selectCollectionItem(date, dates);
    }

    public void findAndSaveFilmFromRating(String rating){
            for (WebElement item : films ) {
                if (Float.parseFloat(item.findElement(By.xpath("//div[@class='event-rating__value']")).getText()) >= Float.parseFloat(rating)) {
                   savedTitle = item.findElement(By.xpath("//h2")).getText();
                   savedCount= item.findElement(By.xpath("//span[@class='event__place-name']")).getText();
                    item.click();
                    return;
                }
            }
            Assert.fail("Фильм с рейтингом " + rating + " не найден на странице");
        }


    }





