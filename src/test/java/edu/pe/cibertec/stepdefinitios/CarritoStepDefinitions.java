package edu.pe.cibertec.stepdefinitios;

import edu.pe.cibertec.Tasks.AgregarAlCarrito;
import edu.pe.cibertec.UI.CarritoPage;
import edu.pe.cibertec.questions.ContadorDelCarrito;
import edu.pe.cibertec.questions.ResultadosDeBusqueda;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.hasItem;

public class CarritoStepDefinitions {


    @When("the user adds the product {string} to the cart")
    public void addProductToCart(String producto) {
        theActorInTheSpotlight().attemptsTo(AgregarAlCarrito.elProducto(producto));
    }


    @Then("the cart should show {string}")
    public void verifyCartCount(String expectedCount) {
        theActorInTheSpotlight().should(
                seeThat(ContadorDelCarrito.valor(), containsString(expectedCount))
        );
    }


    @And("navigates to the cart")
    public void navigateToCart() {
        theActorInTheSpotlight().attemptsTo(Click.on(CarritoPage.LINK_SHOPPING_CART));
    }


    @Then("the user should see the product {string} in the cart list")
    public void verifyProductInList(String productName) {
        theActorInTheSpotlight().should(
                seeThat(ResultadosDeBusqueda.nombres(), hasItem(productName))
        );
    }

}
