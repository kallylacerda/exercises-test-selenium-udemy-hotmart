package com.desafio.pages;

import com.desafio.base.UdemyPage;

public class UdemyHeaderPage extends UdemyPage {
	
	public void acessarItemDropdown(String texto) {
		moverCursorDropdown("//*[contains(@class,'header')]//*[text()='"+texto+"']/..");
	}
	
	public UdemyCursosPage clicarItemDropdown(String texto) {
		clicarItem("//*[contains(@class,'header')]//*[text()='"+texto+"']/..");
		return new UdemyCursosPage();
	}
	
	public void escreverPesquisa(String texto) {
		escreverTexto(texto, "//div[contains(@class,'header')]//input[contains(@id, 'search')]");
	}
	
	public UdemyCursosPage pressionarEnter() {
		pressionarEnter("//div[contains(@class,'header')]//input[contains(@id, 'search')]");
		return new UdemyCursosPage();
	}
	
	public UdemyCursosPage clicarLupa() {
		clicarItem("//div[contains(@class, 'header')]//button[@type='submit']");
		return new UdemyCursosPage();
	}
	
	public String escolherSugestaoPesquisa() {
		if(obterHtmlLang().equals("en-us"))
			return escolherAleatorioNaLista("//a//*[name()='svg']//*[contains(@*,'icon-search')]/../following-sibling::span/div");
		else {
			return escolherAleatorioNaLista("//li//span[contains(@class, 'udi-search')]/following-sibling::span");
		}
	}
	
	public UdemyCursosPage clicarSugestaoPesquisa(String texto) {
		if(obterHtmlLang().equals("en-us"))
			clicarItem("//*[contains(@*,'icon-search')]/../../span//div[.='"+texto+"']/../..");
		else
			clicarItem("//span[contains(@class, 'udi-search')]/../*[.='"+texto+"']/../..");
		return new UdemyCursosPage();
	}

}
