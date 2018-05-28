package modelagemUniversoStarWars;

public class Cla {
	private String nome;
	private Ser treinador;
	private long dataFundacao;
	private long dataExtincao;
	
	public Cla(String nome, Ser treinador, long dataFundacao, long dataExtincao) {
		this.nome = nome;
		this.treinador = treinador;
		this.dataFundacao = dataFundacao;
		this.dataExtincao = dataExtincao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Ser getTreinador() {
		return treinador;
	}

	public void setTreinador(Ser treinador) {
		this.treinador = treinador;
	}

	public long getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(long dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public long getDataExtincao() {
		return dataExtincao;
	}

	public void setDataExtincao(long dataExtincao) {
		this.dataExtincao = dataExtincao;
	}
	
	
}
