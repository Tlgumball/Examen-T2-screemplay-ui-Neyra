package edu.pe.cibertec.Tasks;

import edu.pe.cibertec.UI.BusquedaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarProductt implements Task{

    private final String producto;

    public BuscarProductt(String producto) {
        this.producto = producto;
    }

    public static BuscarProductt conNombre(String producto) {
        return instrumented(BuscarProductt.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(producto).into(BusquedaPage.INPUT_BUSQUEDA),
                Click.on(BusquedaPage.BTN_BUSCAR)
        );
    }
}
