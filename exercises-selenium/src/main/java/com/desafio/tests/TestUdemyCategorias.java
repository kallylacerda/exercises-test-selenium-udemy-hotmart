package com.desafio.tests;

import static com.desafio.core.DriverFactory.getDriver;
import static com.desafio.core.Propriedades.siteUdemy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.desafio.base.BaseTest;
import com.desafio.pages.UdemyCursosPage;
import com.desafio.pages.UdemyHomePage;

public class TestUdemyCategorias extends BaseTest {

	private UdemyHomePage homePage;
	
	@Before
	public void setUp() {
		getDriver().manage().deleteAllCookies();
		getDriver().get(siteUdemy);
		homePage = new UdemyHomePage();
	}
	
	// testa se ao clicar para alternar entre as tabs de categorias, a tab clicada fica marcada
	@Test
	public void testAcessarCategoriaBotaoTab() {
		String acessar = "Desenvolvimento";
		homePage.clicarCategoriaBotaoTab(acessar);
		assertTrue(homePage.checarTabSelecionada(acessar));
	}
	
	// testa o acesso à página dos cursos da categoria principal selecionada
	@Test
	public void testAcessarCategoriaPrincipais() {
		String acessar = "Design";
		UdemyCursosPage cursosPage = homePage.clicarCategoriaPrincipais(acessar);
		assertEquals("Cursos de " + acessar, cursosPage.obterTextoTitulo());
		assertTrue(cursosPage.verificarSePossuiCursos());
	}
	
}
