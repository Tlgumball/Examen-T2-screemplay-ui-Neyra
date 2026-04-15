package edu.pe.cibertec.Tasks;

import edu.pe.cibertec.UI.RegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Registrar implements Task {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String telephone;
    private final String password;

    public Registrar(String firstName, String lastName, String email, String telephone, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
    }

    public static Registrar conLosDatos(String firstName, String lastName, String email, String telephone, String password) {
        return instrumented(Registrar.class, firstName, lastName, email, telephone, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(RegistroPage.INPUT_FIRSTNAME),
                Enter.theValue(lastName).into(RegistroPage.INPUT_LASTNAME),
                Enter.theValue(email).into(RegistroPage.INPUT_EMAIL),
                Enter.theValue(telephone).into(RegistroPage.INPUT_TELEPHONE),
                Enter.theValue(password).into(RegistroPage.INPUT_PASSWORD),
                Enter.theValue(password).into(RegistroPage.INPUT_CONFIRM),
                Click.on(RegistroPage.CHECK_PRIVACY),
                Click.on(RegistroPage.BTN_CONTINUE)
        );
    }
}