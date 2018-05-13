package pages;
import org.openqa.selenium.support.*;
import java.util.*;
import org.openqa.selenium.WebElement;
import steps.BaseSteps;

public class MainPage extends BasePage{
    @FindBy(xpath = "//div[contains(@class,'widget_id')]//h1/a[contains(@class,'home-link_blue')]") //////div[@class='yJ y7_O3_qn U4__row so__yJ so__yJ_Oh_Wz']//h1
    public List<WebElement> widgetItems;

    public void selectMainMenuItem(String itemName){
        selectCollectionItem(itemName, widgetItems);
    }


}
