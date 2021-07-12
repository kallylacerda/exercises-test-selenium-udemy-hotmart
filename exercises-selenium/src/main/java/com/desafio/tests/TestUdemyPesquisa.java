package com.desafio.tests;

import static com.desafio.core.DriverFactory.getDriver;
import static com.desafio.core.Propriedades.siteUdemy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.desafio.base.BaseTest;
import com.desafio.pages.UdemyCursosPage;
import com.desafio.pages.UdemyHeaderPage;

public class TestUdemyPesquisa extends BaseTest {
	
	private UdemyHeaderPage headerPage;
	
	@Before
	public void setUp() {
		getDriver().manage().deleteAllCookies();
		getDriver().get(siteUdemy);
		headerPage = new UdemyHeaderPage();
	}
	
	@Test
	public void testPesquisarEnterSucesso() {
		headerPage.escreverPesquisa("desenvolvimento");
		UdemyCursosPage cursosPage = headerPage.pressionarEnter();
		assertTrue(cursosPage.verificarResultadoPesquisa());
	}
	
	@Test
	public void testPesquisarLupaSucesso() {
		headerPage.escreverPesquisa("desenvolvimento");
		UdemyCursosPage cursosPage = headerPage.clicarLupa();
		assertTrue(cursosPage.verificarResultadoPesquisa());
	}
	
	@Test
	public void testPesquisarSugestao() {
		headerPage.escreverPesquisa("desenvolvimento");
		String sugestao = headerPage.escolherSugestaoPesquisa();
		UdemyCursosPage cursosPage = headerPage.clicarSugestaoPesquisa(sugestao);
		assertTrue(cursosPage.verificarResultadoPesquisa());
	}
	
	@Test
	public void testPesquisarEnterNaoEncontrado() {
		String pesquisa = "dasijdauihu12yih4uyi23nb";
		headerPage.escreverPesquisa(pesquisa);
		UdemyCursosPage cursosPage = headerPage.pressionarEnter();
		assertEquals("Infelizmente, não encontramos resultados para " + pesquisa, 
					cursosPage.obterTextoInfelizmente());
	}
	
}
