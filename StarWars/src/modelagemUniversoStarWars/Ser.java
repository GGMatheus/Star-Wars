package Classes;

public class Ser {
	private String nome;
	private long nascimento;
	private long morte;
	private String especie;
	private String genero;
	private Planeta planetaOrigem;
	
	public Ser(String nome, long nascimento, long morte, String especie, String genero, Planeta origem) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.morte = morte;
		this.especie = especie;
		this.genero = genero;
		planetaOrigem = origem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getNascimento() {
		return nascimento;
	}

	public void setNascimento(long nascimento) {
		this.nascimento = nascimento;
	}

	public long getMorte() {
		return morte;
	}

	public void setMorte(long morte) {
		this.morte = morte;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Planeta getPlanetaOrigem() {
		return planetaOrigem;
	}

	public void setPlanetaOrigem(Planeta planetaOrigem) {
		this.planetaOrigem = planetaOrigem;
	}
}
