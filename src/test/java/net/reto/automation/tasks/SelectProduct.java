package net.reto.automation.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.reto.automation.ui.Product;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

//Esta clase seleccionara un producto
public class SelectProduct implements Task{
	
	
	@Step("Select a Product")
    public static SelectProduct goProduct( ) {
        return instrumented(SelectProduct.class);
    }

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(Product.PRODUCT_LINK));
		
	}

}
