package edu.pe.cibertec.stepdefinitios;

import edu.pe.cibertec.Tasks.IniciarSesion;
import edu.pe.cibertec.UI.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {

    @Given("the user navigates to the login page")
    public void navigateToLogin() {
        theActorCalled("Estefano").attemptsTo(
                Open.url("https://naveenautomationlabs.com/opencart/index.php?route=account/login")
        );
    }

    @When("the user enters email {string} and password {string}")
    public void enterCredentials(String email, String password) {
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.conCredenciales(email, password)
        );
    }

    @And("clicks on the login button")
    public void clickLogin() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(LoginPage.BTN_LOGIN)
        );
    }

    @Then("the user should see the name {string} in the page header")
    public void verifyHeaderName(String expectedName) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(LoginPage.LBL_MY_ACCOUNT).isDisplayed()
        );
    }

    @Then("the user should see the login message {string}")
    public void verifyErrorMessage(String expectedMessage) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(LoginPage.MSJ_ERROR).hasTextContent(expectedMessage)
        );
    }
}
