package edu.pe.cibertec.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class CarritoPage {

    public static final Target BTN_ADD_TO_CART = Target.the("botón agregar al carrito")
            .locatedBy("//h4[a[text()='{0}']]/following-sibling::div[@class='button-group']/button[1]");

    public static final Target LBL_CONTADOR_CARRITO = Target.the("contador del carrito")
            .located(By.id("cart-total"));

    public static final Target LINK_SHOPPING_CART = Target.the("enlace shopping cart")
            .located(By.xpath("//a[@title='Shopping Cart']"));

    public static final Target PRODUCTOS_EN_LISTA = Target.the("lista de productos en carrito")
            .located(By.xpath("//div[@class='table-responsive']//td[@class='text-left']/a"));
}
