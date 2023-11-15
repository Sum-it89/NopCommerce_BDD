import org.openqa.selenium.By;
import org.testng.Assert;

public class Registration_Result extends Utils
{
    private By _registerButton = By.id("register-button");
    private By _registrationResult = By.className("result");

    public void waitsForSubmitButtonToDisappear() {
        waitforinvisible(_registerButton, (5));
    }
    public void verifiesTheRegisteredMessageIsCorrect() {
        //Verifies the registered message is correct or not............................
       Assert.assertEquals(getTextElement(_registrationResult), "You registration completed", "Expected message does not match the actual");

    }
}
