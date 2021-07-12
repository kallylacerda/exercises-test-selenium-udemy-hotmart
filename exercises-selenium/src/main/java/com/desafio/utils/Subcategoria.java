package com.desafio.utils;

import java.util.List;

public class Subcategoria {

	private String nome;
	private List<String> topicos;
	
	public Subcategoria(String nome, List<String> topicos) {
		this.nome = nome;
		this.topicos = topicos;
	}
	
	public String getNomeSubcategoria() {
		return nome;
	}
	
	public List<String> getTopicos() {
		return topicos;
	}
}
