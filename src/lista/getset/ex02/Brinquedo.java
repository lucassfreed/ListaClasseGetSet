package lista.getset.ex02;

public class Brinquedo {
	
	private String nome, marca, modelo, descricao;
	private float preco;
	private int codigo;
	private long codigoDeBarras;
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public float getPreco() {
		return this.preco;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigoDeBarras(long codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}
	
	public long getCodigoDeBarras() {
		return this.codigoDeBarras;
	}

}
