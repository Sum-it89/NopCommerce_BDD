import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

public class HoverOverComputers extends Utils
{

    private By _hoverComputers = By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]");
    private By _hoverColor = By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]");


    public void hoverOnComputers(){
        hoverOnComputersCategory(_hoverComputers);
    }

    public void hoverOnComputer_Color(){
       hoverColor(_hoverColor);
    }

    public void checkIfTheColorCodeMatches(){
        Assert.assertEquals(hoverColor(_hoverColor), "#4ab2f1","The color doesn't match");
    }

}
