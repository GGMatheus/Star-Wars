package modelagemUniversoStarWars;

public class Planeta {
	private String nome;
	private String cor;
	private String sistema;
	private double diametro;
	
	public Planeta(String nome, String cor, String sistema, double diametro) {
		this.nome = nome;
		this.cor = cor;
		this.sistema = sistema;
		this.diametro = diametro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
}
