package modelagemUniversoStarWars;

public class Academia extends Ordem {
	private String nome;
	private Planeta sede;
	private Ordem ordem;
	
	public Academia(String nome, Planeta sede, Ordem ordem) {
		this.nome = nome;
		this.sede = sede;
		this.ordem = ordem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Planeta getSede() {
		return sede;
	}

	public void setSede(Planeta sede) {
		this.sede = sede;
	}

	public Ordem getOrdem() {
		return ordem;
	}

	public void setOrdem(Ordem ordem) {
		this.ordem = ordem;
	}
	
	
}
