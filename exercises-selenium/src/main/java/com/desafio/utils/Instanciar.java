package com.desafio.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Instanciar {

	List<Categoria> categorias = new ArrayList<Categoria>();
	
	private String categoria;
	private String subcategoria;
	private String topico;
	private int indiceCategoria;
	private int indiceSubcategoria;
	
	public Instanciar(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	
	public String getCategoriaAleatorio() {
		Random random = new Random();
		indiceCategoria = random.nextInt(categorias.size());
		Categoria categoria = categorias.get(indiceCategoria);
		this.categoria = categoria.getNomeCategoria();
		
		return this.categoria;
	}
	
	public String getSubcategoriaAleatorio() {
		Random random = new Random();
		List<Subcategoria> subcategorias = categorias.get(indiceCategoria).getSubcategorias();
		indiceSubcategoria = random.nextInt(subcategorias.size());
		Subcategoria subcategoria = subcategorias.get(indiceSubcategoria);
		this.subcategoria = subcategoria.getNomeSubcategoria();
		return this.subcategoria;

	}
	
	public String getTopicoAleatorio() {
		Random random = new Random();
		List<Subcategoria> subcategorias = categorias.get(indiceCategoria).getSubcategorias();
		Subcategoria subcategoria = subcategorias.get(indiceSubcategoria);
		List<String> topicos = subcategoria.getTopicos();
		this.topico = topicos.get(random.nextInt(topicos.size()));
		return this.topico;
	}
}
