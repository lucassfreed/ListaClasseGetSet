package lista.getset.ex03;

public class Janela {
	
	private float comprimento, largura, preco;
	private String marca;
	private boolean insulfilm;
	
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	
	public float getComprimento() {
		return this.comprimento;
	}
	
	public void setLargura(float largura) {
		this.largura = largura;
	}
	
	public float getLargura() {
		return this.largura;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public float getPreco() {
		return this.preco;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setInsulfilm(boolean insulfilm) {
		this.insulfilm = insulfilm;
	}
	
	public boolean getInsulfilm() {
		return this.insulfilm;
	}
}
