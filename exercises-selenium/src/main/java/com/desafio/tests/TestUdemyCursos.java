package com.desafio.tests;

import static com.desafio.core.DriverFactory.getDriver;
import static com.desafio.core.Propriedades.siteUdemy;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.desafio.base.BaseTest;
import com.desafio.pages.UdemyCursosPage;
import com.desafio.pages.UdemyHeaderPage;

public class TestUdemyCursos extends BaseTest {

	private UdemyHeaderPage headerPage;
	private UdemyCursosPage cursosPage;
	
	private String textoTitulo = "Cursos de ";
	
	@Before
	public void setUp() {
		getDriver().manage().deleteAllCookies();
		getDriver().get(siteUdemy);
		headerPage = new UdemyHeaderPage();
		cursosPage = new UdemyCursosPage();
	}
		
	// testa a navega��o para uma subcategoria pela link bar 
	// (para acessar a link bar, deve estar na p�gina dos cursos de uma categoria ou subcategoria)
	@Test
	public void testAcessarCategoriaLinkBar() {
		String acessar = "Neg�cios";
		headerPage.acessarItemDropdown("Categorias");
		headerPage.acessarItemDropdown("Neg�cios");
		headerPage.clicarItemDropdown("Finan�as");
		cursosPage.clicarCategoriaLinkBar(acessar);
		assertEquals(textoTitulo + acessar, cursosPage.obterTextoTitulo());
	}
	
	// testa a navega��o para uma subcategoria pela link bar 
	// (para acessar a link bar, deve estar na p�gina dos cursos de uma categoria ou subcategoria)
	@Test
	public void testAcessarSubcategoriaLinkBar() {
		String acessar = "Desenvolvimento web";
		headerPage.acessarItemDropdown("Categorias");
		headerPage.clicarItemDropdown("Desenvolvimento");
		cursosPage.clicarCategoriaLinkBar(acessar);
		assertEquals(textoTitulo + acessar, cursosPage.obterTextoTitulo());
	}
	
	// testa se estando em uma categoria e clicar na mesma categoria pela link bar
	// continua na mesma categoria
	// (para acessar a link bar, deve estar na p�gina dos cursos de uma categoria ou subcategoria)
	@Test
	public void testAcessarCategoriaAtualLinkBar() {
		headerPage.acessarItemDropdown("Categorias");
		headerPage.clicarItemDropdown("Desenvolvimento");
		String tituloCategoria = cursosPage.obterTextoTitulo();
		cursosPage.clicarCategoriaLinkBar("Desenvolvimento");
		assertEquals(tituloCategoria, cursosPage.obterTextoTitulo());
	}
	
	// testa se estando em uma subcategoria e clicar na mesma subcategoria pela link bar
	// continua na mesma subcategoria
	// (para acessar a link bar, deve estar na p�gina dos cursos de uma categoria ou subcategoria)
	@Test
	public void testAcessarSubcategoriaAtualLinkBar() {
		headerPage.acessarItemDropdown("Categorias");
		headerPage.acessarItemDropdown("Neg�cios");
		headerPage.clicarItemDropdown("Finan�as");
		String tituloSubcategoria = cursosPage.obterTextoTitulo();
		cursosPage.clicarCategoriaLinkBar("Finan�as");
		assertEquals(tituloSubcategoria, cursosPage.obterTextoTitulo());
	}
	
	// testa a navega��o para uma categoria relacionada ao t�pico
	// (para acessar a categoria relacionada, deve estar na p�gina dos cursos de um t�pico)
	@Test
	public void testAcessarCategoriaRelacionadaAoTopico() {
		String acessar = "Moda";
		headerPage.acessarItemDropdown("Categorias");
		headerPage.acessarItemDropdown("Design");
		headerPage.acessarItemDropdown("Moda");
		headerPage.clicarItemDropdown("Costura");
		cursosPage.clicarCategoriaRelacionadas(acessar);
		assertEquals(textoTitulo + acessar, cursosPage.obterTextoTitulo());
	}
		
	// testa a navega��o para um t�pico popular
	// (para acessar o t�pico popular, deve estar na p�gina dos cursos de um t�pico)
	@Test
	public void testAcessarTopicoTemasPopulares() {
		String acessar = "An�lise financeira";
		headerPage.acessarItemDropdown("Categorias");
		headerPage.acessarItemDropdown("Neg�cios");
		headerPage.clicarItemDropdown("Finan�as");
		cursosPage.clicarTopicoTemasPolulares(acessar);
		assertEquals(textoTitulo + acessar, cursosPage.obterTextoTitulo());
	}
}
