package net.reto.automation.tasks;

import net.reto.automation.ui.PlazaVeaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;


public class OpenTheApplication implements Task {

	PlazaVeaPage plazaVeaPage;

    //Este metodo abrira la pagina declarada en la clase PlazaVeaPage
    @Step("Open the application")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(plazaVeaPage)
        );
    }
}
