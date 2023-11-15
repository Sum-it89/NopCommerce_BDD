import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Registration_Page extends Utils
{
    static String email = "simpsonhomer"+ Utils.timeStamp()+"@outlook.co.uk";
    private int waitSec = 5;
    private By clickonGender = By.xpath("//input[@id=\"gender-male\"]");
    private By firstName = By.xpath("//input[@type=\"text\" and @id=\"FirstName\"]");
    private By lastName = By.xpath("//input[@type=\"text\" and @id=\"LastName\"]");
    private By birthDay = By.name("DateOfBirthDay");
    private By birthMonth = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private By birthYear = By.xpath("//select[@name=\"DateOfBirthYear\"]");
    private By enterEmail = By.xpath("//input[@type=\"email\" and @id=\"Email\"]");
    private By newsLetter = By.xpath("//input[@type=\"checkbox\" and @id=\"Newsletter\"]");
    private By enterPassword = By.id("Password");
    private By confirmPassword = By.id("ConfirmPassword");
    private By registerButton = By.id("register-button");

    LoadProp loadProp = new LoadProp();



    public void verifyPageURL() {
        waitforUrltobe(waitSec);
    }
    public void userSubmitRegistrationFormSuccessfully() {

        //selects male radio button and clicks in the registration form.....

        clickonElements(clickonGender);

        //selects first name text box and inputs given name in the box.......
        TypetextofElements(firstName, loadProp.getProperty("firstName"));

        //selects last name text box and inputs given last name in the box.......
        TypetextofElements(lastName, loadProp.getProperty("lastName"));

        //selects the Birth day from the dropdown menu......
        SelectElement(birthDay, loadProp.getProperty("birthDay"));

        //Selects the Birth Month from dropdown menu......
        SelectbyIndex(birthMonth, Integer.parseInt(loadProp.getProperty("birthMonth")));

        // Selects the birth year from the dropdown menu....
        SelectByValue(birthYear, loadProp.getProperty("birthYear"));

        //selects email text box and inputs given email address in the box.......
        TypetextofElements(enterEmail, email);

        //selects check box button and unchecks the Newsletter button......
        clickonElements(newsLetter);

        //selects Password text box and inputs given Password in the box.......
        TypetextofElements(enterPassword, loadProp.getProperty("password"));

        //selects Confirm password text box and inputs given Password in the box second time.......
        TypetextofElements(confirmPassword, loadProp.getProperty("password"));

        //wait until the element is visible....
        waituntilvisible(registerButton, waitSec);

        //selects REGISTER submit button and clicks the button.......
        clickonElements(registerButton);


    }
}
