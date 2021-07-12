package com.desafio.base;

import java.util.List;

import com.desafio.core.DSL;

public class HotmartPage {

	private DSL dsl;
	
	public HotmartPage() {
		dsl = new DSL();
	}

	protected void clicarBotao(String xpath) {
		dsl.waitClickableElement(xpath, 10);
		dsl.clickButton(xpath);
	}
	
	protected void escreverTexto(String texto, String xpath) {
		dsl.waitPresenceElement(xpath, 20);
		dsl.setText(texto, xpath);
	}
	
	protected List<String> obterTextos(String xpath) {
		return dsl.getListText(xpath);
	}
	
	protected String obterTexto(String xpath) {
		return dsl.getText(xpath);
	}
	
	protected boolean isElementoVisivel(String xpath) {
		dsl.waitPresenceElement(xpath, 10);
		return dsl.isElementDisplayed(xpath);
	}
	
	protected boolean isElementoExiste(String xpath) {
		return dsl.isElementExists(xpath);
	}
	
	protected void irParaNovaAba() {
		dsl.switchTab();
	}
}
