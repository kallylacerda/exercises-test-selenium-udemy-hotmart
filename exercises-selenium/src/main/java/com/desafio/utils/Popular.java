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
														"Análise de dados",
														"Inteligência artificial",
														"R",
														"TensorFlow",
														"Redes neurais artificiais")),
								new Subcategoria("Aplicativos móveis", 
										Arrays.asList("Todos em Aplicativos móveis", 
														"Desenvolvimento para Android",
														"Desenvolvimento em iOS",
														"Google Flutter",
														"Swift", 
														"React Native",
														"Linguagem de programação Dart",
														"Desenvolvimento móvel",
														"Kotlin",
														"Redux Framework")),
								new Subcategoria("Linguagens de programação", 
										Arrays.asList("Todos em Linguagens de programação",
														"Python",
														"Java",
														"C#",
														"C++",
														"React",
														"JavaScript",
														"C",
														"Framework Spring",
														"Linguagem de programação Go")),
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
														"Animação em 3D")),
								new Subcategoria("Bancos de dados", 
										Arrays.asList("Todos em Bancos de dados",
														"SQL",
														"MySQL", 
														"Oracle SQL", 
														"Certificação em Oracle", 
														"MongoDB",
														"Apache Kafka", 
														"SQL Server",
														"Gestão de banco de dados", 
														"PostgreSQL")),
								new Subcategoria("Teste de software", 
										Arrays.asList("Todos em Teste de software", 
														"Selenium WebDriver",
														"Java",
														"Selenium Testing Framework",
														"Testes de automação", 
														"Teste de API", 
														"REST Assured",
														"Python",
														"Automação")),
								new Subcategoria("Engenharia de software", 
										Arrays.asList("Todos em Engenharia de software", 
														"Certificação em AWS",
														"AWS Certified Developer – Associate", 
														"Coding Interview",
														"Kubernetes",
														"Agile", 
														"Python", 
														"Microsserviços", 
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
														"Certificação em AWS,",
														"AWS Certified Developer – Associate", 
														"Confluence")),
								new Subcategoria("e-Commerce", 
										Arrays.asList("Todos em e-Commerce",
														".NET", 
														"WooCommerce",
														"WordPress para comércio eletrônico", 
														"Shopify", 
														"Dropshipping",
														"WordPress", 
														"Negócios online", 
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
														"Retrato fotográfico")),
								new Subcategoria("Fundamentos da fotografia", 
										Arrays.asList("Todos em Fundamentos da fotografia", 
														"Fotografia",
														"Affinity Photo", 
														"Composição fotográfica",
														"Fotografia digital", 
														"DSLR",
														"Cinema",
														"Fotografia de paisagem", 
														"Iluminação para fotografia",
														"GIMP")),
								new Subcategoria("Retratos", 
										Arrays.asList("Todos em Retratos", 
														"Retrato fotográfico", 
														"Técnicas de pose", 
														"Retoques no Photoshop", 
														"Iluminação para fotografia", 
														"Retrato fotográfico familiar", 
														"Fotografia",
														"Photoshop", 
														"Câmeras", 
														"Adobe Lightroom"))
						
						))));
			
		categorias.add(new Categoria("Música", 
				new ArrayList<Subcategoria>(
						Arrays.asList(
								new Subcategoria("Todos em Música", Arrays.asList("")),
								new Subcategoria("Instrumentos", 
										Arrays.asList("Todos em Instrumentos", 
														"Piano",
														"Violão",
														"Instrumento de teclas", 
														"Ukulele",
														"Guitarra Fingerstyle",
														"Gaita",
														"Bateria", 
														"Baixo", 
														"Violino")),
								new Subcategoria("Produção", 
										Arrays.asList("Todos em Produção" + 
														"Produção musical", 
														"Logic Pro X", 
														"Ableton Live", 
														"Mixagem de músicas", 
														"FL Studio",
														"Produção de áudio", 
														"Composição instrumental", 
														"Música para jogos",
														"Design de sons")),
								new Subcategoria("Fundamentos da música", 
										Arrays.asList("Todos em Fundamentos da música", 
														"Teoria da música",
														"Música eletrônica", 
														"Composição instrumental", 
														"Composição musical", 
														"Leitura de música",
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