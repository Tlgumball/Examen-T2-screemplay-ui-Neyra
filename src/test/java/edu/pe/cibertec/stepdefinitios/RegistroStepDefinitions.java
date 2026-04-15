package edu.pe.cibertec.stepdefinitios;

import edu.pe.cibertec.Tasks.Registrar;
import edu.pe.cibertec.UI.RegistroPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the user navigates to the register page")
    public void navigateToRegister() {
        theActorCalled("Estefano").attemptsTo(
                Open.url("https://naveenautomationlabs.com/opencart/index.php?route=account/register")
        );
    }

    @When("the user fills the form with first name {string}, last name {string}, email {string}, phone {string} and password {string}")
    public void fillForm(String firstName, String lastName, String email, String telephone, String password) {
        theActorInTheSpotlight().attemptsTo(
                Registrar.conLosDatos(firstName, lastName, email, telephone, password)
        );
    }

    @And("accepts the privacy policy")
    public void accepts_the_privacy_policy() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(RegistroPage.CHECK_PRIVACY)
        );
    }

    @And("clicks on continue")
    public void clicks_on_continue() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(RegistroPage.BTN_CONTINUE)
        );
    }

    @Then("the user should see the message {string}")
    public void verifyMessage(String expectedMessage) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RegistroPage.MSJ_CONFIRMACION).hasText(expectedMessage)
        );
    }
}
