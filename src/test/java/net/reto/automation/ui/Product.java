package net.reto.automation.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Product {
	
	public static Target PRODUCT_LINK = Target.the("Select Product").located(By.className("SuggestionItem__productLink"));
	public static Target PRODUCT_ADD = Target.the("Add Product").located(By.id("ProductCard__add-to-cart"));

}
