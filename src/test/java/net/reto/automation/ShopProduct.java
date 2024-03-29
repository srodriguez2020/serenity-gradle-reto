/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package net.reto.automation;

import net.reto.automation.tasks.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.core.StringContains;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;

@RunWith(SerenityRunner.class)
public class ShopProduct {


    //Actor a ejecutar las pruebas
    Actor sandra = Actor.named("Sandra");

    //Injectando Pagina para abrir
    @Steps
    OpenTheApplication openTheApplication;


    //Driver
    @Managed
    WebDriver herBrowser;


    //Permitir que el Usuario (Sandra) pueda abrir el navegador
    @Before
    public void sandraCanBrowseTheWeb() {
        sandra.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void addProductToCart() {

        //Given
        givenThat(sandra).wasAbleTo(openTheApplication);

        //When
        when(sandra).attemptsTo(Search.forTheTerm("Televisores"));
        and(sandra).attemptsTo(SelectProduct.goProduct());
        and(sandra).attemptsTo(AddToCart.productSetupAdd());

        //Then
        then(sandra).should(seeThat(CartProductResult.resultCart(), StringContains.containsString("1")));
    }

    //Cerrar Conexion Drver Chrome
    @After
    public void closeTest() {
        herBrowser.close();
    }
}
