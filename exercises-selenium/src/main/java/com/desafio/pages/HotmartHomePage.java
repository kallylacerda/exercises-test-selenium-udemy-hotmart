package com.desafio.pages;

import java.util.List;

import com.desafio.base.HotmartPage;

public class HotmartHomePage extends HotmartPage {

	public void clicarCadatrar() {
		if(isElementoVisivel("//div[@class='header__navigation-plattaform']")) {
			clicarBotao("//div[@class='header__navigation-plattaform']//a[@class='button button--primary']");
		} else {
			clicarBotao("//div[@class='header__toggle-sidebar']//a");
			clicarBotao("//a[@class='button button--secondary']//span[contains(text(),'Cadastre-se')]");
		}
		irParaNovaAba();
	}
	
	public void escreverNome(String texto) {
		escreverTexto(texto, "//input[contains(@class, 'hot-form-control')][@type='text']");
	}
	
	public void escreverEmail(String texto) {
		escreverTexto(texto, "//input[contains(@class, 'hot-form-control')][@type='email']");
	}
	
	public void escreverSenha(String texto) {
		escreverTexto(texto, "//input[contains(@class, 'hot-form-control')][@type='password']");
	}
	
	public void selecionarVender() {
		clicarBotao("//label[contains(@class,'auth__profile-label')][@for='seller']");
	}
	
	public void selecionarComprar() {
		clicarBotao("//label[contains(@class,'auth__profile-label')][@for='buyer']");
	}
	
	public void marcarTermos() {
		clicarBotao("//input[@class='hot-custom-control__input terms-of-use']");
	}
	
	public void clicarContinuar() {
		clicarBotao("//button[contains(@class,'auth__submit')]");
	}
	
	public List<String> obterErros() {
		return obterTextos("//div[@class='invalid-feedback']");
	}
	
	public String obterErroTermos() {
		String xpath = "//div[@class='s-alert-box-inner']";
		if(isElementoExiste(xpath)) 
			return obterTexto(xpath);
		
		return "";
	}
}
