package com.desafio.pages;

import com.desafio.base.UdemyPage;

public class UdemyHomePage extends UdemyPage {
	
	public UdemyCursosPage clicarCategoriaPrincipais(String texto) {
		// passa o xpath para o elemento que vai ser clicado
		clicarItem("//div[contains(@class,'category')]//a[.='"+texto+"']/../..");
		return new UdemyCursosPage();
	}
	
	public void clicarCategoriaBotaoTab(String texto) {
		// passa o xpath para o elemento que vai ser clicado
		clicarItem("//button[contains(., '"+texto+"')]");
	}

	public boolean checarTabSelecionada(String texto) {		
		// busca pelo xpath que é marcado como true quando a tab é selecionada
		return isElementoExiste("//button[contains(@class, 'active') and contains(., '"+texto+"')]");
	}
	
}
