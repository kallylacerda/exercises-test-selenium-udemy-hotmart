package com.desafio.utils;

import java.util.List;

public class Categoria {

	private String nome;
	private List<Subcategoria> subcategorias;
	
	public Categoria(String nome, List<Subcategoria> subcategorias) {
		this.nome = nome;
		this.subcategorias = subcategorias;
	}
	
	public List<Subcategoria> getSubcategorias() {
		return subcategorias;
	}
	
	public String getNomeCategoria() {
		return nome;
	}
}
