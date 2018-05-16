package pages;
import org.openqa.selenium.support.*;
import java.util.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import steps.BaseSteps;
import org.openqa.selenium.support.ui.*;


public class CinemaPage extends BasePage{


    @FindBy(xpath = "//h1")
    public WebElement title;


    @FindBy(xpath = "//button[contains(@class,'filter-date')]")
    public WebElement dateBtn;
    @FindBy(xpath = "//div[contains(@class,'controls_type_email')]//button[contains(@class,'close')]")
    public WebElement popup1CloseBtn;
    @FindBy(xpath = "//div[@class='tutorial-modal__close']")
    public WebElement popup2CloseBtn;

    @FindBy(xpath = "//ul[contains(@class,'presets-list')]/li/div/span[@class='presets-list__title']")
    public List<WebElement> dates;


    @FindBy(xpath = "//div[contains(@class,'events-list__list')]/div")
    public List<WebElement> films;


    public void pushButtonDate(){

        wait.until(ExpectedConditions.elementToBeClickable(popup1CloseBtn)).click();
        wait.until(ExpectedConditions.visibilityOf(dateBtn));
        wait.until(ExpectedConditions.elementToBeClickable(dateBtn)).click();

        dateBtn.click();
    }


    public void selectDate(String date){

        selectCollectionItem(date, dates);
        wait.until(ExpectedConditions.visibilityOf(popup2CloseBtn));
        try{
            popup2CloseBtn.click();
        }catch (WebDriverException e){
            JavascriptExecutor executor = (JavascriptExecutor)BaseSteps.getDriver();
            executor.executeScript("arguments[0].click()", popup2CloseBtn);

        }
    }

    public void findAndSaveFilmFromRating(String rating){
            for (WebElement item : films ) {
                if (Float.parseFloat(item.findElement(By.xpath(".//div[@class='event-rating__value']")).getText()) >= Float.parseFloat(rating)) {
                   savedTitle = item.findElement(By.xpath(".//h2")).getText();
                   savedCount= item.findElement(By.xpath(".//span[@class='event__place-name']")).getText();
                    item.click();
                    return;
                }
            }
            Assert.fail("Фильм с рейтингом " + rating + " не найден на странице");
        }


    }





