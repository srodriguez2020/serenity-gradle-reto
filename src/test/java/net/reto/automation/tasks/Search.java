package net.reto.automation.tasks;

import net.reto.automation.ui.SearchBox;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;


//Esta clase va a buscar en el campo especificado el termino, pasado por parametro
public class Search implements Task {

    private final String searchTerm;

    protected Search(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    @Step("Search for #searchTerm")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(searchTerm)
                     .into(SearchBox.SEARCH_FIELD)
        );
    }


    public static Search forTheTerm(String searchTerm) {
        return instrumented(Search.class, searchTerm);
    }

}
