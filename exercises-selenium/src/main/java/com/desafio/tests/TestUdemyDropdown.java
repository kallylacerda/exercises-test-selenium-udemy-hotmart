package com.desafio.tests;

import static com.desafio.core.DriverFactory.getDriver;
import static com.desafio.core.Propriedades.siteUdemy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.desafio.base.BaseTest;
import com.desafio.pages.UdemyCursosPage;
import com.desafio.pages.UdemyHeaderPage;
import com.desafio.utils.Instanciar;
import com.desafio.utils.Popular;

@RunWith(Parameterized.class)
public class TestUdemyDropdown extends BaseTest {

	private UdemyHeaderPage headerPage;
	private UdemyCursosPage cursosPage;
	private static Popular pop = new Popular();
	private static Instanciar dados = new Instanciar(pop.getCategorias());
	
	@Parameter(value=0)
	public String categoria;
	@Parameter(value=1)
	public String subcategoria;
	@Parameter(value=2)
	public String topico;
	
	private String textoTitulo = "Cursos de ";
	
	@Before
	public void setUp() {
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().get(siteUdemy);
		headerPage = new UdemyHeaderPage();
	}
	
	@Parameters
	public static Collection<Object[]> getCollection(){
		
		return Arrays.asList(new Object[][] {
			{dados.getCategoriaAleatorio(), "", ""},
			{dados.getCategoriaAleatorio(), dados.getSubcategoriaAleatorio(), ""},
			{dados.getCategoriaAleatorio(), dados.getSubcategoriaAleatorio(), dados.getTopicoAleatorio()}
		});
	}
	
	@Test
	public void testDropdownMenu() {
		
		// acesso ao dropdown
		headerPage.acessarItemDropdown("Categorias");
		if(!categoria.isEmpty() && !subcategoria.isEmpty()) 
			headerPage.acessarItemDropdown(categoria);
		if(!subcategoria.isEmpty() && !topico.isEmpty()) 
			headerPage.acessarItemDropdown(subcategoria);
		
		// clica no item do dropdown
		if(!topico.isEmpty()) {
			cursosPage = headerPage.clicarItemDropdown(topico);
			if(cursosPage.verificarSePossuiCursos()) {
				assertEquals(textoTitulo + topico.replaceAll("Todos em ", ""), cursosPage.obterTextoTitulo());
				return;
			}
		} else if(!subcategoria.isEmpty()){
			cursosPage = headerPage.clicarItemDropdown(subcategoria);
			if(cursosPage.verificarSePossuiCursos()) {
				assertEquals(textoTitulo + subcategoria.replaceAll("Todos em ", ""), cursosPage.obterTextoTitulo());
				return;
			}
		} else if(!categoria.isEmpty()) {
			cursosPage = headerPage.clicarItemDropdown(categoria);
			if(cursosPage.verificarSePossuiCursos()) {
				assertEquals(textoTitulo + categoria, cursosPage.obterTextoTitulo());
				return;
			}
		}
		
		// se a categoria ou tópico clicado não tiver curso, vai retornar falso
		assertFalse(cursosPage.verificarSePossuiCursos());

	}
}