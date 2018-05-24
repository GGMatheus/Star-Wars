package Classes;

public class RegimePolitico {
	private String nome;
	private long anoCriacao;
	private long anoDissolucao;
	private Planeta capital;
	private Planeta[] planetas;
	
	public RegimePolitico(String nome, long anoCriacao, long anoDissolucao, Planeta capital, Planeta[] planetas) {
		super();
		this.nome = nome;
		this.anoCriacao = anoCriacao;
		this.anoDissolucao = anoDissolucao;
		this.capital = capital;
		this.planetas = planetas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getAnoCriacao() {
		return anoCriacao;
	}

	public void setAnoCriacao(long anoCriacao) {
		this.anoCriacao = anoCriacao;
	}

	public long getAnoDissolucao() {
		return anoDissolucao;
	}

	public void setAnoDissolucao(long anoDissolucao) {
		this.anoDissolucao = anoDissolucao;
	}

	public Planeta getCapital() {
		return capital;
	}

	public void setCapital(Planeta capital) {
		this.capital = capital;
	}

	public Planeta[] getPlanetas() {
		return planetas;
	}

	public void setPlanetas(Planeta[] planetas) {
		this.planetas = planetas;
	}
}
