package StepDefinitions;

import Pages.DialogContent;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _02_ContacktUsSteps {

    DialogContent dialogContent = new DialogContent();


    @Then("^Navigate to CuntactUs page$")
    public void navigate_to_CuntactUs_page() {

        dialogContent.findElementAndClickFunction("contactUs");

    }

    @When("^Select Subject Heading$")
    public void select_Subject_Heading() {

      dialogContent.findElementSelectFunction("selectSubject","2");

    }

    @Then("^Enter your message as \"([^\"]*)\" and click send button$")
    public void enter_your_message_as_and_click_send_button(String message) {

        dialogContent.findElementAndSendKeysFunction("messageInput",message);

        dialogContent.findElementAndClickFunction("submitMessage");



    }

    @Then("^Success message should be displayed$")
    public void success_message_should_be_displayed() {

        dialogContent.findElementAndVerifyContainsText("SuccessMessage","successfully");

    }
}
