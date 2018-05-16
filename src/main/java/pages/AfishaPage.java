package pages;
import org.openqa.selenium.support.*;
import org.openqa.selenium.WebElement;
import steps.BaseSteps;
import java.util.*;
public class AfishaPage extends BasePage{


    @FindBy(xpath = "//ul[@role='menu']/li")
    public List<WebElement> afishaMenuItems;


    public void selectAfishaMenuItem(String itemName){
        selectCollectionItem(itemName, afishaMenuItems);
    }




}
