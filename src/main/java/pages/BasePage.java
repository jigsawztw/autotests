package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;
import  org.junit.*;
import java.util.*;

public class BasePage {
    public static String savedTitle;
    public static String savedCount;
    public BasePage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }



    public static void inserting(WebElement x, String str){
        x.clear();
        x.sendKeys(str);
    }



    public void selectCollectionItem(String itemName, List<WebElement> collection){
        for (WebElement item : collection ){
            if (item.getText().equalsIgnoreCase(itemName)){
                item.click();
                return;
            }
        }
       Assert.fail("Не найден элмент коллеции - " + itemName);
    }



}
