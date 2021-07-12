package com.desafio.tests;

import static com.desafio.core.DriverFactory.getDriver;
import static com.desafio.core.Propriedades.siteHotmart;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.desafio.base.BaseTest;
import com.desafio.pages.HotmartHomePage;
import com.desafio.utils.JavaFakerAPI;

@RunWith(Parameterized.class)
public class TestHotmartCadastroRegras extends BaseTest {
	
	HotmartHomePage homePage;
	static JavaFakerAPI fake = new JavaFakerAPI();
	
	@Parameter(value=0)
	public String nome;
	@Parameter(value=1)
	public String email;
	@Parameter(value=2)
	public String senha;
	@Parameter(value=3)
	public Boolean marcarTermos;
	@Parameter(value=4)
	public String msgNome;
	@Parameter(value=5)
	public String msgEmail;
	@Parameter(value=6)
	public String msgSenha;
	@Parameter(value=7)
	public String msgTermos;
	
	@Before
	public void setUp() {
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().get(siteHotmart);
		homePage = new HotmartHomePage();
	}
	
	static String erroNomeObrigatorio = "Nome Completo é obrigatório";
	static String erroEmailObrigatorio = "Email é obrigatório";
	static String erroEmailInvalido = "Digite um endereço de Email válido";
	static String erroSenhaObrigatorio = "Senha é obrigatório";
	static String erroSenhaMinimo = "No mínimo 7 caracteres, com ao menos uma letra e um número.";
	static String erroTermos = "Aceite os Termos de Uso da Hotmart para continuar.";
	
	@Parameters
	public static Collection<Object[]> getCollection(){
		return (Arrays.asList(new Object[][] {
//			{"" , "", "", false, erroNomeObrigatorio, erroEmailObrigatorio, erroSenhaObrigatorio, ""},
//			{fake.getPrimeiroNome() , "", "", false, erroNomeObrigatorio, erroEmailObrigatorio, erroSenhaObrigatorio, ""},
//			{fake.getNomeCompleto() , "", "", false, "", erroEmailObrigatorio, erroSenhaObrigatorio, ""},
//			{fake.getPrimeiroNome() , fake.getEmailInvalido(), "", false, erroNomeObrigatorio, erroEmailInvalido, erroSenhaObrigatorio, ""},
//			{fake.getNomeCompleto() , fake.getEmailInvalido(), "", false, "", erroEmailInvalido, erroSenhaObrigatorio, ""},
//			{fake.getPrimeiroNome()	, fake.getEmailValido(), "", false, erroNomeObrigatorio, "", erroSenhaObrigatorio, ""},
//			{fake.getNomeCompleto()	, fake.getEmailValido(), "", false, "", "", erroSenhaObrigatorio, ""},
//			{fake.getPrimeiroNome()	, fake.getEmailValido(), fake.getSenhaInvalida(), false, erroNomeObrigatorio, "", erroSenhaMinimo, ""},
//			{fake.getNomeCompleto()	, fake.getEmailValido(), fake.getSenhaInvalida(), false, "", "", erroSenhaMinimo, ""},
//			{fake.getNomeCompleto()	, fake.getEmailInvalido(), fake.getSenhaInvalida(), false, "", erroEmailInvalido, erroSenhaMinimo, ""},
//			{fake.getNomeCompleto()	, fake.getEmailInvalido(), fake.getSenhaInvalida(), false, "", erroEmailInvalido, erroSenhaMinimo, ""},
			{fake.getNomeCompleto()	, fake.getEmailValido(), fake.getSenhaValida(), false, "", "", "", erroTermos}
		}));
	}
	
	@Test
	public void testRegrasCadastro() {
		homePage.clicarCadatrar();
		homePage.escreverNome(nome);
		homePage.escreverEmail(email);
		homePage.escreverSenha(senha);
		if(marcarTermos) homePage.marcarTermos();
		homePage.clicarContinuar();
		assertEquals(msgNome, homePage.obterErros().get(0));
		assertEquals(msgEmail, homePage.obterErros().get(1));
		assertEquals(msgSenha, homePage.obterErros().get(2));
		assertEquals(msgTermos, homePage.obterErroTermos());
	}

}
