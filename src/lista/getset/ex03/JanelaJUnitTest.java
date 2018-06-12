package lista.getset.ex03;

import static org.junit.Assert.*;

import org.junit.Test;

public class JanelaJUnitTest {
	
	@Test
	public void testeDefinirEObterComprimento() {
		Janela veneziana = new Janela();
		veneziana.setComprimento(1.86f);
		assertEquals(1.86f, veneziana.getComprimento(), 0);
	}
	
	@Test
	public void testeDefinirEObterLargura() {
		Janela deCorrer = new Janela();
		deCorrer.setLargura(0.76f);
		assertEquals(0.76f, deCorrer.getLargura(), 0);
	}
	
	@Test
	public void testeDefinirEObterPreco() {
		Janela projetante = new Janela();
		projetante.setPreco(1800);
		assertEquals(1800, projetante.getPreco(), 0);
	}
	
	@Test
	public void testeDefinirEObterMarca() {
		Janela guilhotina = new Janela();
		guilhotina.setMarca("Alcoa");
		assertEquals("Alcoa", guilhotina.getMarca());
	}
	
	@Test
	public void testeDefinirEObterInsulfilm() {
		Janela pivotante = new Janela();
		pivotante.setInsulfilm(true);
		assertEquals(true, pivotante.getInsulfilm());
	}
	

}
