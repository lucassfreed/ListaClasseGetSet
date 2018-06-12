package lista.getset.ex01;

public class Filme {

	private String titulo, tituloOriginal, genero, diretor;
	private short anoLancamento;
	private double valorFaturamento, valorOrcamento;
	private long espectadores;
	private String classficacao;
	private double mediaPreco;
	private int dataLancamentoBrasi;
	private String idioma;

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}
	
	public String getTituloOriginal() {
		return this.tituloOriginal;
	}

	public void setGenero(String genero){
		this.genero = genero;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	public String getDiretor() {
		return this.diretor;
	}
	
	public void setAnoLancamento(short anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	public short getAnoLancamento() {
		return this.anoLancamento;
	}
	
	public void setValorFaturamento(double valorFaturamento) {
		this.valorFaturamento = valorFaturamento;
	}
	
	public double getValorFaturamento() {
		return this.valorFaturamento;
	}
	
	public void setValorOrcamento(double valorOrcamento) {
		this.valorOrcamento = valorOrcamento;
	}
	
	public double getValorOrcamento() {
		return this.valorOrcamento;
	}
	
	public void setEspectadores(long espectadores) {
		this.espectadores = espectadores;
	}
	
	public long getEspectadores() {
		return this.espectadores;
	}
	
	public void setClassificacao(String classificacao) {
		this.classficacao = classificacao;
	}
	
	public String getClassificacao() {
		return this.classficacao;
	}
	
	public void setMediaPreco(double mediaPreco) {
		this.mediaPreco = mediaPreco;
	}
	
	public double getMediaPreco() {
		return this.mediaPreco;
	}
	
	public void setDataLancamentoBrasi(int dataLancamentoBrasi) {
		this.dataLancamentoBrasi = dataLancamentoBrasi;
	}
	
	public int getDataLancamentoBrasi() {
		return this.dataLancamentoBrasi;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public String getIdioma(){
		return this.idioma;
	}
	
}
