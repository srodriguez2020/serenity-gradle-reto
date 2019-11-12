package net.reto.automation.tasks;


import static org.assertj.core.api.Assertions.assertThat;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

//Esta clase Validara si el Producto fue adicionado al carrito
public class CartProductResult implements Question<String>{


	@Step("Validate!")
	@Override
	public String answeredBy(Actor actor) {
		String valueComponent = "";
		try {
			Thread.sleep(1500);
		valueComponent = BrowseTheWeb.as(actor).find(By.className("cart__number")).getText();
		assertThat(valueComponent).contains("1");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return valueComponent;
	}

	
    public static Question<String> resultCart() {
        return new CartProductResult();
    }


}
