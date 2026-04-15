package edu.pe.cibertec.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target INPUT_EMAIL = Target.the("Email").located(By.id("input-email"));
    public static final Target INPUT_PASSWORD = Target.the("Password").located(By.id("input-password"));
    public static final Target BTN_LOGIN = Target.the("BotonLogin").located(By.xpath("//input[@value='Login']"));

    public static final Target LBL_MY_ACCOUNT = Target.the("título mi cuenta").located(By.xpath("//div[@id='content']/h2[1]"));

    public static final Target MSJ_ERROR = Target.the("mensaje de error").located(By.cssSelector(".alert-danger"));
}
