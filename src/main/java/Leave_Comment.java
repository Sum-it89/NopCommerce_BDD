import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Leave_Comment extends Utils
{

    String comment_Title = "Best Online Store to Buy Computer Components"+timeStamp();
    private By waitForTitle = By.className("page-title");
    private int waitSec = 5;
    private By commentTitleBox = By.id("AddNewComment_CommentTitle");
    private By commentBox = By.id("AddNewComment_CommentText");
    private By commentButton = By.name("add-comment");
    private By commentResult = By.xpath("//div[@class=\"result\"]");
    private By comment_List = By.xpath("//div[@class='comments']/div/div[2]/div[2]");


    LoadProp loadProp = new LoadProp();



    public void waitsUntilPageIsVisible(){
        waituntilvisible(waitForTitle, waitSec);
    }

    public void typeCommentTitle(){
        TypetextofElements(commentTitleBox, comment_Title);
    }

    public void typeComment(){
        TypetextofElements(commentBox, loadProp.getProperty("commentBox"));
    }

    public void clickOnNewCommentButton(){
        clickonElements(commentButton);
    }

    public void verifyThecommentAddedMessage() {
        Assert.assertEquals(getTextElement(commentResult), "News comment is successfully added.", "The message doesn't match the actual");
    }

    public void verifyCommentAddedAtLast(){

        List<WebElement> commentListEle = driver.findElements(comment_List);
        System.out.println(commentListEle.size());

        int commnets =commentListEle.size();
        System.out.println(commentListEle.get(commnets-1).getText());

        Assert.assertEquals(commentListEle.get(commnets-1).getText(),comment_Title,"comment is not added at last");

    }
}
