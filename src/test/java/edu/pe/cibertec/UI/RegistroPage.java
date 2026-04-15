package edu.pe.cibertec.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroPage {
    public static final Target INPUT_FIRSTNAME = Target.the("Nombrw").located(By.id("input-firstname"));
    public static final Target INPUT_LASTNAME = Target.the("Apellido").located(By.id("input-lastname"));
    public static final Target INPUT_EMAIL = Target.the("Email").located(By.id("input-email"));
    public static final Target INPUT_TELEPHONE = Target.the("Telefono").located(By.id("input-telephone"));
    public static final Target INPUT_PASSWORD = Target.the("Password").located(By.id("input-password"));
    public static final Target INPUT_CONFIRM = Target.the("confirmacion de Password").located(By.id("input-confirm"));
    public static final Target CHECK_PRIVACY = Target.the("check de privacidad").located(By.name("agree"));
    public static final Target BTN_CONTINUE = Target.the("boton continuar").located(By.xpath("//input[@value='Continue']"));
    public static final Target MSJ_CONFIRMACION = Target.the("mensaje de exito").located(By.xpath("//div[@id='content']/h1"));
}
