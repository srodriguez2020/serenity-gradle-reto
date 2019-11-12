package net.reto.automation.steps;

//import static org.assertj.core.api.Assertions.assertThat;

import net.reto.automation.ui.CurrentPage;
import net.reto.automation.ui.PlazaVeaPage;

import net.thucydides.core.annotations.Step;

public class NavigationUser {

	PlazaVeaPage plazaVeaPage;
	CurrentPage currentPage ;
	
	@Step
	public void openStartPage() {
		plazaVeaPage.open();		
		
	}

/*public void isHomePage(String title) {
		assertThat(currentPage.getTitle()).containsIgnoringCase(title);
	}*/

}
