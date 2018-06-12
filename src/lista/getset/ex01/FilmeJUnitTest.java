package lista.getset.ex01;

import static org.junit.Assert.*;

import org.junit.Test;

public class FilmeJUnitTest {
	
	@Test
	public void testeDefinirEObterTitulo() {
		Filme poderosoChefao = new Filme();
		poderosoChefao.setTitulo("O Poderoso Chefão");
		assertEquals("O Poderoso Chefão", poderosoChefao.getTitulo());
	}
	
	@Test
	public void testeDefinirEObterTituloOriginal() {
		Filme magicoDeOz = new Filme();
		magicoDeOz.setTituloOriginal("Wizard of Oz");
		assertEquals("Wizard of Oz", magicoDeOz.getTituloOriginal());
	}
	
	@Test
	public void testeDefinirEObterGenero() {
		Filme cidadaoKane = new Filme();
		cidadaoKane.setGenero("Drama");
		assertEquals("Drama", cidadaoKane.getGenero());
	}
	
	@Test
	public void testeDefinirEObterDiretor() {
		Filme umSonhoDeLiberdade = new Filme();
		umSonhoDeLiberdade.setDiretor("Frank Darabont");
		assertEquals("Frank Darabont", umSonhoDeLiberdade.getDiretor());
	}
	
	@Test
	public void testeDefinirEObterAnoLancamento() {
		Filme pulpFiction = new Filme();
		pulpFiction.setAnoLancamento((short) 1995);
		assertEquals(1995, pulpFiction.getAnoLancamento());
	}
	
	@SuppressWarnings("all")
	@Test
	public void testeDefinirEObterValorFaturamento() {
		Filme casaBlanca = new Filme();
		casaBlanca.setValorFaturamento(964000.00);
		assertEquals(964000.00, casaBlanca.getValorFaturamento(), 0);
	}
	
	@SuppressWarnings("all")
	@Test
	public void testeDefinirEObterValorOrcamento() {
		Filme poderosoChefao2 = new Filme();
		poderosoChefao2.setValorOrcamento(2890000.0);
		assertEquals(2890000.0, poderosoChefao2.getValorOrcamento(), 0);
	}
	
	@SuppressWarnings("all")
	@Test
	public void testeDefinirEObteEspectadores() {
		Filme tubarao = new Filme();
		tubarao.setEspectadores(3232323232l);
		assertEquals(3232323232l, tubarao.getEspectadores(), 0);
	}
	
	@Test
	public void testeDefinirEObterClassificao() {
		Filme clubeDosCinco = new Filme();
		clubeDosCinco.setClassificacao("14 anos");
		assertEquals("14 anos", clubeDosCinco.getClassificacao());
	}
	
	@SuppressWarnings("all")
	@Test
	public void testeDefinirEObterMediaPreco() {
		Filme fargo = new Filme();
		fargo.setMediaPreco(20.0);
		assertEquals(20.0, fargo.getMediaPreco(), 0);
	}
	
	@Test
	public void testeDefinirEObterDataLancamentoBrasil() {
		Filme matrix = new Filme();
		matrix.setDataLancamentoBrasi(1999);
		assertEquals(1999, matrix.getDataLancamentoBrasi());
	}
	
	@Test
	public void testeDefinirEObterIdioma() {
		Filme osSuspeitos = new Filme();
		osSuspeitos.setIdioma("Língua inglesa");
		assertEquals("Língua inglesa", osSuspeitos.getIdioma());
	}

}
