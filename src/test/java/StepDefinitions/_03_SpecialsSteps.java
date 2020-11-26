package StepDefinitions;

import Pages.DialogContent;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class _03_SpecialsSteps {

    DialogContent dialogContent = new DialogContent();

    @Then("^Navigate to Specials page$")
    public void navigate_to_Specials_page(){

        dialogContent.findElementAndClickFunction("specialsLink");


    }

    @Then("^Comparison of discounted products$")
    public void comparison_of_discounted_products() {

        Assert.assertTrue(dialogContent.dressName.size()==dialogContent.prices.size());

    }



}
