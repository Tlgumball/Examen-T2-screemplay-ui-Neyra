package edu.pe.cibertec.stepdefinitios;

import edu.pe.cibertec.Tasks.BuscarProductt;
import edu.pe.cibertec.UI.BusquedaPage;
import edu.pe.cibertec.questions.ResultadosDeBusqueda;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.hasItem;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class BusquedaStepDefinitions {

    @Given("the user is on the OpenCart home page")
    public void isOnHomePage() {
        theActorCalled("Estefano").attemptsTo(Open.url("https://naveenautomationlabs.com/opencart/"));
    }

    @When("the user searches for the product {string}")
    public void searchForProduct(String producto) {
        theActorInTheSpotlight().attemptsTo(BuscarProductt.conNombre(producto));
    }

    @Then("the user should see at least one result with the name {string}")
    public void verifyResults(String expectedName) {
        theActorInTheSpotlight().should(
                seeThat(ResultadosDeBusqueda.nombres(), hasItem(expectedName))
        );
    }

    @Then("the user should see the search message {string}")
    public void verifyNoResultsMessage(String expectedMessage) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(BusquedaPage.MSJ_SIN_RESULTADOS).hasTextContent(expectedMessage)
        );
}
