package com.desafio.utils;

import java.util.Locale;

import com.github.javafaker.Faker;

public class JavaFakerAPI {
	
	Faker faker = new Faker(new Locale("pt-BR"));

	public String getPrimeiroNome() {
		return faker.name().firstName().strip();
	}

	public String getNomeCompleto() {
		return faker.name().fullName();
	}

	public String getEmailInvalido() {
		return faker.lorem().word();
	}
	
	public String getEmailValido() {
		return faker.internet().emailAddress();
	}

	public String getSenhaInvalida() {
		return faker.internet().password(1, 6);
	}
	
	public String getSenhaValida() {
		return faker.internet().password(7, 20, true);
	}
}
