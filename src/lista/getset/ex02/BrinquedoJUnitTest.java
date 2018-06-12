package lista.getset.ex02;

import static org.junit.Assert.*;

import org.junit.Test;

public class BrinquedoJUnitTest {

	@Test
	public void testeDefinirEObterNome() {
		Brinquedo piao = new Brinquedo();
		piao.setNome("Pião");
		assertEquals("Pião", piao.getNome());
	}

	@Test
	public void testeDefinirEObterMarca() {
		Brinquedo pipa = new Brinquedo();
		pipa.setMarca("Jardel Pipas");
		assertEquals("Jardel Pipas", pipa.getMarca());
	}

	@Test
	public void testeDefinirEObterModelo() {
		Brinquedo bambole = new Brinquedo();
		bambole.setModelo("CardioBam PRO Fitness");
		assertEquals("CardioBam PRO Fitness", bambole.getModelo());
	}

	@Test
	public void testeDefinirEObterPreco() {
		Brinquedo molaMaluca = new Brinquedo();
		molaMaluca.setPreco(1.60f);
		assertEquals(1.60f, molaMaluca.getPreco(), 0);
	}

	@Test
	public void testeDefinirEObterCodigo() {
		Brinquedo bolaDeVinil = new Brinquedo();
		bolaDeVinil.setCodigo((byte) 47);
		assertEquals(47, bolaDeVinil.getCodigo());
	}

	@Test
	public void testeDefinirEObterCodigoBarras() {
		Brinquedo bolinhasDeSabao = new Brinquedo();
		bolinhasDeSabao.setCodigoDeBarras(200000000000000000l);
		assertEquals(200000000000000000l, bolinhasDeSabao.getCodigoDeBarras());
	}

	@Test
	public void testeDefinirEObterDescricao() {
		Brinquedo peteca = new Brinquedo();
		peteca.setDescricao(
				"Há registros que contam que a peteca é uma criação dos índios brasileiros. Os portugueses se surpreenderam ao ver a brincadeira com as trouxinhas de folhas cheias de pedras, amarradas a espigas de milho");
		assertEquals(
				"Há registros que contam que a peteca é uma criação dos índios brasileiros. Os portugueses se surpreenderam ao ver a brincadeira com as trouxinhas de folhas cheias de pedras, amarradas a espigas de milho",
				peteca.getDescricao());
	}

}
