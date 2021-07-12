package com.desafio.pages;

import com.desafio.base.UdemyPage;

public class UdemyCursosPage extends UdemyPage {

	public String obterTextoTitulo() {
		// passa o xpath para o elemento que vai ser lido
		return obterTexto("//div[contains(@class,'container')]//h1").replaceAll("Todos em ", "");
	}
	
	public void clicarCategoriaRelacionadas(String texto) {
		// passa o xpath para o elemento que vai ser clicado
		clicarItem("//*[contains(@class, 'related-categories')][.='"+texto+"']");
	}
	
	public void clicarCategoriaLinkBar(String texto) {
		// passa o xpath para o elemento que vai ser clicado
		clicarItem("//a[contains(@class, 'link-bar')][.='"+texto+"']");
	}
	
	public void clicarTopicoTemasPolulares(String texto) {
		// passa o xpath para o elemento que vai ser clicado
		clicarItem("//div[contains(@class,'unit-title')]/..//*[text()='"+texto+"']");
	}
	
	public String obterTextoInfelizmente() {
		return obterTexto("//h1[contains(@class,'udlite-heading')]");
	}
	
	public boolean verificarResultadoPesquisa() {
		return isElementoExiste("//span[contains(@class, 'filter-panel--item-count')]");
	}
	
	public boolean verificarSePossuiCursos() {
		rolarAteMetade();
		return isElementoExiste("//*[contains(@class, 'course-card--container')]");
	}

}
