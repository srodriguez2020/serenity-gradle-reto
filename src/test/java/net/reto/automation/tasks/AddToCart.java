package net.reto.automation.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;


import net.reto.automation.ui.Product;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.thucydides.core.annotations.Step;

//Esta clase Adicionaa un producto al listado
public class AddToCart implements Task {

	@Step("Add Product to Cart")
    public static AddToCart productSetupAdd( ) {
        return instrumented(AddToCart.class);
    }

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(Product.PRODUCT_ADD));
		
	}
}
