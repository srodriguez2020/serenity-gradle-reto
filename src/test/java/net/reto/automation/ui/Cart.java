package net.reto.automation.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Cart {
	
	public static Target CART_ITEM = Target.the("Cart Item").located(By.className("cart__number"));

}
