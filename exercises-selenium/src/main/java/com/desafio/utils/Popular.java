package com.desafio.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Popular {

	List<Categoria> categorias = new ArrayList<Categoria>();
	
	public Popular() {
		
		categorias.add(new Categoria("Desenvolvimento", 
				new ArrayList<Subcategoria>(
						Arrays.asList(
								new Subcategoria("Todos em Desenvolvimento", Arrays.asList("")),
								new Subcategoria("Desenvolvimento web", 
										Arrays.asList("Todos em Desenvolvimento web",
														"JavaScript",
														"React",
														"Angular",
														"CSS",
														"PHP",
														"Node.Js",
														"Python",
														"WordPress")),
								new Subcategoria("Data Science", 
										Arrays.asList("Todos em Data Science",
														"Python",
														"Machine Learning",
														"Aprendizado profundo",
														"An�lise de dados",
														"Intelig�ncia artificial",
														"R",
														"TensorFlow",
														"Redes neurais artificiais")),
								new Subcategoria("Aplicativos m�veis", 
										Arrays.asList("Todos em Aplicativos m�veis", 
														"Desenvolvimento para Android",
														"Desenvolvimento em iOS",
														"Google Flutter",
														"Swift", 
														"React Native",
														"Linguagem de programa��o Dart",
														"Desenvolvimento m�vel",
														"Kotlin",
														"Redux Framework")),
								new Subcategoria("Linguagens de programa��o", 
										Arrays.asList("Todos em Linguagens de programa��o",
														"Python",
														"Java",
														"C#",
														"C++",
														"React",
														"JavaScript",
														"C",
														"Framework Spring",
														"Linguagem de programa��o Go")),
								new Subcategoria("Desenvolvimento de games", 
										Arrays.asList("Todos em Desenvolvimento de games",
														"Unity",
														"C#",
														"Fundamentos do desenvolvimento de games", 
														"Unreal Engine", 
														"Desenvolvimento de games 3D", 
														"C++",
														"Desenvolvimento de games 2D",
														"Blender",
														"Anima��o em 3D")),
								new Subcategoria("Bancos de dados", 
										Arrays.asList("Todos em Bancos de dados",
														"SQL",
														"MySQL", 
														"Oracle SQL", 
														"Certifica��o em Oracle", 
														"MongoDB",
														"Apache Kafka", 
														"SQL Server",
														"Gest�o de banco de dados", 
														"PostgreSQL")),
								new Subcategoria("Teste de software", 
										Arrays.asList("Todos em Teste de software", 
														"Selenium WebDriver",
														"Java",
														"Selenium Testing Framework",
														"Testes de automa��o", 
														"Teste de API", 
														"REST Assured",
														"Python",
														"Automa��o")),
								new Subcategoria("Engenharia de software", 
										Arrays.asList("Todos em Engenharia de software", 
														"Certifica��o em AWS",
														"AWS Certified Developer � Associate", 
														"Coding Interview",
														"Kubernetes",
														"Agile", 
														"Python", 
														"Microsservi�os", 
														"Professional Scrum Master (PSM)", 
														"Big Data")),
								new Subcategoria("Ferramentas de desenvolvimento", 
										Arrays.asList("Todos em Ferramentas de desenvolvimento", 
														"Docker", 
														"Kubernetes",
														"Git", 
														"DevOps", 
														"Jenkins", 
														"JIRA",
														"Certifica��o em AWS,",
														"AWS Certified Developer � Associate", 
														"Confluence")),
								new Subcategoria("e-Commerce", 
										Arrays.asList("Todos em e-Commerce",
														".NET", 
														"WooCommerce",
														"WordPress para com�rcio eletr�nico", 
														"Shopify", 
														"Dropshipping",
														"WordPress", 
														"Neg�cios online", 
														"Magento"))
					
						))));
		
		categorias.add(new Categoria("Fotografia", 
				new ArrayList<Subcategoria>(
						Arrays.asList(
								new Subcategoria("Todos em Fotografia", Arrays.asList("")),
								new Subcategoria("Fotografia digital", 
										Arrays.asList("Todos em Fotografia digital", 
														"Fotografia", 
														"Fotografia com iPhone", 
														"DSLR",
														"Adobe Lightroom", 
														"Affinity Photo", 
														"Photoshop", 
														"Fotografia noturna", 
														"Retrato fotogr�fico")),
								new Subcategoria("Fundamentos da fotografia", 
										Arrays.asList("Todos em Fundamentos da fotografia", 
														"Fotografia",
														"Affinity Photo", 
														"Composi��o fotogr�fica",
														"Fotografia digital", 
														"DSLR",
														"Cinema",
														"Fotografia de paisagem", 
														"Ilumina��o para fotografia",
														"GIMP")),
								new Subcategoria("Retratos", 
										Arrays.asList("Todos em Retratos", 
														"Retrato fotogr�fico", 
														"T�cnicas de pose", 
														"Retoques no Photoshop", 
														"Ilumina��o para fotografia", 
														"Retrato fotogr�fico familiar", 
														"Fotografia",
														"Photoshop", 
														"C�meras", 
														"Adobe Lightroom"))
						
						))));
			
		categorias.add(new Categoria("M�sica", 
				new ArrayList<Subcategoria>(
						Arrays.asList(
								new Subcategoria("Todos em M�sica", Arrays.asList("")),
								new Subcategoria("Instrumentos", 
										Arrays.asList("Todos em Instrumentos", 
														"Piano",
														"Viol�o",
														"Instrumento de teclas", 
														"Ukulele",
														"Guitarra Fingerstyle",
														"Gaita",
														"Bateria", 
														"Baixo", 
														"Violino")),
								new Subcategoria("Produ��o", 
										Arrays.asList("Todos em Produ��o" + 
														"Produ��o musical", 
														"Logic Pro X", 
														"Ableton Live", 
														"Mixagem de m�sicas", 
														"FL Studio",
														"Produ��o de �udio", 
														"Composi��o instrumental", 
														"M�sica para jogos",
														"Design de sons")),
								new Subcategoria("Fundamentos da m�sica", 
										Arrays.asList("Todos em Fundamentos da m�sica", 
														"Teoria da m�sica",
														"M�sica eletr�nica", 
														"Composi��o instrumental", 
														"Composi��o musical", 
														"Leitura de m�sica",
														"Acordes de piano",
														"Guitarra blues", 
														"ABRSM",
														"Piano"))
						))));
		
		
		// template
//		categorias.add(new Categoria("", 
//				new ArrayList<Subcategoria>(
//						Arrays.asList(
//								new Subcategoria("", null),
//								new Subcategoria("", Arrays.asList())
//						
//						))));
	}
	
	public List<Categoria> getCategorias(){
		return categorias;
	}
}