import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyStepDef
{

    Registration_Page registrationPage = new Registration_Page();
    HomePage homePage = new HomePage();
    Registration_Result registration_result = new Registration_Result();
    HoverOverComputers hoverOverComputers = new HoverOverComputers();
    Leave_Comment leaveComment = new Leave_Comment();

    @Given("I am on NopCommerce Homepage")
    public void i_am_on_nop_commerce_homepage() {
        homePage.waitUntilUserisInHomepage();
    }
    @When("I click on the register button")
    public void i_click_on_the_register_button()
    {
        homePage.clickOnRegisterLink();
    }
    @When("I am able to navigate to register page")
    public void i_am_able_to_navigate_to_register_page() {registrationPage.verifyPageURL();}
    @When("I am able to fill the registration form")
    public void i_am_able_to_fill_the_registration_form() {
       registrationPage.userSubmitRegistrationFormSuccessfully();
    }
    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {
        registration_result.waitsForSubmitButtonToDisappear();
        registration_result.verifiesTheRegisteredMessageIsCorrect();
    }

    @Given("I am on Homepage")
    public void iAmOnHomepage() {
        homePage.waitUntilUserisInHomepage();
    }
    @When("I can see the Computers text is black color")
    public void i_can_see_the_computers_text_is_black_color() {
       hoverOverComputers.hoverOnComputer_Color();
    }

    @When("I move my mouse over Computers category")
    public void i_move_my_mouse_over_computers_category() {
      hoverOverComputers.hoverOnComputers();
    }

    @Then("I should be able to see the Computer category color change from black to blue")
    public void i_should_be_able_to_see_the_computer_category_color_change_from_black_to_blue() {
    hoverOverComputers.hoverOnComputer_Color();
    }

    @Then("I should be able to check if the color code is as expected")
    public void iShouldBeAbleToCheckIfTheColorCodeIsAsExpected() {
        hoverOverComputers.checkIfTheColorCodeMatches();
    }



    @Given("I am on Homepage of Nop Commerce")
    public void i_am_on_homepage_of_nop_commerce() {
        homePage.waitUntilUserisInHomepage();
    }
    @When("I click on the details button of News Release")
    public void i_click_on_the_details_button_of_news_release() {
      homePage.clickOnNewsReleaseDetails();
    }
    @When("I am able to navigate to Nop Commerce News Release page")
    public void i_am_able_to_navigate_to_nop_commerce_news_release_page() {
       leaveComment.waitsUntilPageIsVisible();
    }
    @When("I am able to fill the comment title")
    public void i_am_able_to_fill_the_comment_title() {
      leaveComment.typeCommentTitle();
    }
    @When("I am able to fill the comment box")
    public void i_am_able_to_fill_the_comment_box() {
        leaveComment.typeComment();
    }
    @When("I am able to click on the New comment button")
    public void i_am_able_to_click_on_the_new_comment_button() {
      leaveComment.clickOnNewCommentButton();
    }
    @When("I should be able to see comment added successfully message")
    public void i_should_be_able_to_see_comment_added_successfully_message() {
       leaveComment.verifyThecommentAddedMessage();
    }
    @Then("I should able to check if the comment is at the end of the list")
    public void i_should_able_to_check_if_the_comment_is_at_the_end_of_the_list() {
       leaveComment.verifyCommentAddedAtLast();
    }







}
