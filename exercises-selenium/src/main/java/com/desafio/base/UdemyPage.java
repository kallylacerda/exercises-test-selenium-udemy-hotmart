package com.desafio.base;

import org.openqa.selenium.TimeoutException;

import com.desafio.core.DSL;

public class UdemyPage {

	private DSL dsl;
	
	public UdemyPage() {
		dsl = new DSL();
	}
	
	protected void moverCursorDropdown(String xpath) {
		dsl.waitPresenceElement(xpath, 10);
		dsl.hoverDropdown(xpath);
	}
	
	protected String obterTexto(String xpath) {
		dsl.waitPresenceElement(xpath, 10);
		return dsl.getText(xpath);
	}
	
	protected boolean isElementoExiste(String xpath) {
		try {
			dsl.waitPresenceElement(xpath, 10);
			return dsl.isElementExists(xpath);
		}catch(TimeoutException t) {
			return false;
		}
	}
	
	protected boolean isElementoPresente(String xpath) {
		try {
			dsl.waitPresenceElement(xpath, 10);
			return dsl.isElementExists(xpath);
		}catch(TimeoutException t) {
			return false;
		}
	}
	
	protected void clicarItem(String xpath) {
		dsl.waitPresenceElement(xpath, 10);
		dsl.searchAndClickElement(xpath);
	}
	
	protected void escreverTexto(String texto, String xpath) {
		dsl.waitPresenceElement(xpath, 10);
		dsl.setText(texto, xpath);
	}
	
	protected void pressionarEnter(String xpath) {
		dsl.pressEnter(xpath);
	}
	
	protected String escolherAleatorioNaLista(String xpath) {
		dsl.waitPresenceElement(xpath, 10);
		return dsl.getRandomElementInList(xpath);
	}
	
	protected String obterHtmlLang() {
		return dsl.getHtmlLang();
	}
	
	public void rolarAteMetade() {
		dsl.executeJS("window.scrollTo(0, window.innerHeight/2)");
	}
}
