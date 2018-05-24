package Classes;

public class Conselho extends Academia {
	private String nomeConselho;
	private Ser[] seres;
	
	public Conselho(String nome, Planeta sede, Ordem ordem, String nomeConselho, Ser[] seres) {
		super(nome, sede, ordem);
		this.nomeConselho = nomeConselho;
		this.seres = seres;
	}

	public String getNomeConselho() {
		return nomeConselho;
	}

	public void setNomeConselho(String nomeConselho) {
		this.nomeConselho = nomeConselho;
	}

	public Ser[] getSeres() {
		return seres;
	}

	public void setSeres(Ser[] seres) {
		this.seres = seres;
	}
	
	
	
}
