package edu.pe.cibertec.UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class BusquedaPage {

    public static final Target INPUT_BUSQUEDA = Target.the("barra de búsqueda").located(By.name("search"));
    public static final Target BTN_BUSCAR = Target.the("botón de búsqueda").located(By.cssSelector(".btn-default.btn-lg"));

    public static final Target NOMBRES_PRODUCTOS = Target.the("nombres de productos").located(By.cssSelector("h4 a"));

    public static final Target MSJ_SIN_RESULTADOS = Target.the("mensaje sin resultados").located(By.xpath("//p[contains(text(),'There is no product')]"));
}
